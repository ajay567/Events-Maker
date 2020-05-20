package com.example.groupproject

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.MediaController
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_music2.*
import java.util.concurrent.TimeUnit


class music2 : AppCompatActivity() , View.OnClickListener, SeekBar.OnSeekBarChangeListener {


override fun onStartTrackingTouch(seekBar: SeekBar?) {
}

override fun onStopTrackingTouch(seekBar: SeekBar?) {
    seekBar?.progress?.let { mediaPlayer.seekTo(it) }
}

override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
}

override fun onClick(v: View?) {
    when(v?.id){
        R.id.btnPlay ->{
            audioPlay(posLaguSkrg)
        }
        R.id.btnNext ->{
            audioNext()
        }
        R.id.btnPrev ->{
            audioPrev()
        }
        R.id.btnStop ->{
            audioStop()
        }
    }
}

val daftarLagu = intArrayOf(R.raw.mp322, R.raw.mp3lovestory, R.raw.mp3shakeit)
val daftarVideo = intArrayOf(R.raw.mp422, R.raw.mp4lovestory, R.raw.mp4shakeit)
//val daftarCover = intArrayOf(R.drawable.music, R.drawable.music, R.drawable.music)
val daftarJudul = arrayOf("22", "Love Story", "Shake It")

var posLaguSkrg = 0
var posVidSkrg = 0
var handler = Handler()
lateinit var mediaPlayer : MediaPlayer
lateinit var mediaController: MediaController

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_music2)
    var title = intent.getStringExtra("musictitle")
    var pos = intent.extras!!.getInt("position")
    posVidSkrg = pos
    posLaguSkrg = pos
    txJudulLagu.setText(title)
    mediaController = MediaController(this)
    mediaPlayer = MediaPlayer()
    seekSong.max=100
    seekSong.progress = 0
    seekSong.setOnSeekBarChangeListener(this)
    btnNext.setOnClickListener(this)
    btnPrev.setOnClickListener(this)
    btnStop.setOnClickListener(this)
    btnPlay.setOnClickListener(this)
    mediaController.setPrevNextListeners(nextVid,prevVid)
    mediaController.setAnchorView(videoView2)
    videoView2.setMediaController(mediaController)
    videoSet(posVidSkrg)
}

var nextVid = View.OnClickListener { v:View ->
    if(posVidSkrg<(daftarVideo.size-1)) posVidSkrg++
    else posVidSkrg = 0
    videoSet(posVidSkrg)
}

var prevVid = View.OnClickListener { v:View ->
    if(posVidSkrg>0) posVidSkrg--
    else posVidSkrg = daftarVideo.size-1
    videoSet(posVidSkrg)
}

fun videoSet(pos : Int){
    videoView2.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+daftarVideo[pos]))
}

fun milliSecondToString(ms : Int):String{
    var detik = TimeUnit.MILLISECONDS.toSeconds(ms.toLong())
    val menit = TimeUnit.SECONDS.toMinutes(detik)
    detik = detik % 60
    return "$menit : $detik"
}

fun audioPlay(pos : Int){
    mediaPlayer = MediaPlayer.create(this, daftarLagu[pos])
    seekSong.max = mediaPlayer.duration
    txMaxTime.setText(milliSecondToString(seekSong.max))
    txCrTime.setText(milliSecondToString(mediaPlayer.currentPosition))
    seekSong.progress = mediaPlayer.currentPosition
    txJudulLagu.setText(daftarJudul[pos])
    mediaPlayer.start()
    var updateSeekBarThread = UpdateSeekBarProgressThread()
    handler.postDelayed(updateSeekBarThread,50)
}

fun audioNext(){
    if(mediaPlayer.isPlaying){
        mediaPlayer.stop()
    }
    if(posLaguSkrg < 2){
        posLaguSkrg++
    }else{
        posLaguSkrg = 0
    }
    audioPlay(posLaguSkrg)
}

fun audioPrev(){
    if(mediaPlayer.isPlaying) mediaPlayer.stop()
    if(posLaguSkrg>0){
        posLaguSkrg--
    }else{
        posLaguSkrg = daftarLagu.size-1
    }
    audioPlay(posLaguSkrg)
}

fun audioStop(){
    if(mediaPlayer.isPlaying) mediaPlayer.stop()
}

inner class UpdateSeekBarProgressThread : Runnable{
    override fun run() {
        var currTime = mediaPlayer.currentPosition
        txCrTime.setText(milliSecondToString(currTime))
        seekSong.progress=currTime
        if(currTime != mediaPlayer.duration) handler.postDelayed(this,50)
    }
}

}

