package com.example.groupproject

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread

class MyViewModel:ViewModel() {

//    private  val elapsedTime =  MutableLiveData<Long>()
    private var laps =  MutableLiveData<ArrayList<Long>>()
    private var emo =  MutableLiveData<ArrayList<String>>()
    private var event =  MutableLiveData<ArrayList<String>>()
//    private var timer : Timer = Timer()
//    private var resume = false
//    private var seconds:Long? = 0
//    private var ONE_SECOND = 1000

    init {
//        elapsedTime.value = 0
        laps.value = ArrayList()
        emo.value= ArrayList()
        event.value=ArrayList()
    }

//    /**
//     *
//     */
//    fun start(){
//        if(resume){
//            timer.cancel()
//            timer = Timer()
//            seconds = elapsedTime.value
//            startWatch()
//        }
//        else{
//            seconds = 0
//            startWatch()
//            resume = true
//        }
//    }

//    /**
//     *
//     */
//    fun pause(){
//        pauseWatch()
//    }
//    /**
//     *
//     */
//    fun reset(){
//        resetWatch()
//    }
//
//    /**
//     *
//     */
//    fun lap(){
//        createLap()
//    }
//    /**
//     *
//     */
//    private fun startWatch(){
//        timer.scheduleAtFixedRate(object : TimerTask() {
//            override fun run() {
//                seconds = seconds?.plus(1)
//                elapsedTime.postValue(seconds)
//            }
//        }, ONE_SECOND.toLong(), ONE_SECOND.toLong())
//    }

//    /**
//     *
//     */
//    private fun pauseWatch(){
//        timer.cancel()
//        timer = Timer()
//        elapsedTime.value = seconds
//        resume = true
//    }
//
//    /**
//     *
//     */
//    private fun resetWatch(){
//        timer.cancel()
//        timer = Timer()
//        seconds = 0
//        elapsedTime.value = 0
//        laps.value = ArrayList<Long>()
//        resume = false
//    }

    fun setTimer(timeInSeconds: Long) {
        val timer = object: CountDownTimer(timeInSeconds*1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {

            }
        }
        timer.start()

    }

    /**
     *
     */
    fun addToLapsList(elapsedTime: MutableLiveData<Long>){

        laps.value?.add(elapsedTime.value!!)
        laps.postValue(laps.value)

    }

    fun addToemoList(text: MutableLiveData<String>){
        emo.value?.add(text.value!!)
        emo.postValue(emo.value)

    }

    fun addToeventList(text: MutableLiveData<String>){
        event.value?.add(text.value!!)
        event.postValue(event.value)

    }

//    var b = 0;
    fun removeList(a:Long){

//        while(true){
//            if(b == 0){
//                b = 1
//    val t1 = thread {
    if(laps.value?.contains(a + 1)==true){

        var b = laps.value?.indexOf(a + 1)
        if (b != null) {
            if((a - 1).toInt() != 0){
            laps.value?.remove(a - 1)
            }
            laps.value?.removeAt(b)
            laps.value?.remove(a + 1)
            laps.value?.add(b,a)

        }
    }
    else if(laps.value?.contains(a - 1)==true){

        var b = laps.value?.indexOf(a - 1)
        if (b != null) {
            laps.value?.remove(a + 1)
            laps.value?.removeAt(b)
            laps.value?.remove(a - 1)
            laps.value?.add(b,a)
        }


    }
//    else if(laps.value?.contains(a)==true){
//        laps.value?.remove(a + 1)
//        laps.value?.remove(a - 1)
//        laps.value?.remove(a)
//        laps.value?.add(a)


//        var b = laps.value?.indexOf(a)
//        if (b != null) {
//            laps.value?.remove(a + 1)
//            laps.value?.remove(a - 1)
//            laps.value?.remove(a)
//            laps.value?.add(b,a)
//        }

//    }
    else{
        laps.value?.remove(a + 1)
        laps.value?.remove(a - 1)
//        laps.value?.remove(a)
//        laps.value?.add(a)
    }
}




    fun getLapsList(): MutableLiveData<ArrayList<Long>>{
        return laps
    }
    fun getemoList(): MutableLiveData<ArrayList<String>>{
        return emo
    }
    fun geteventList(): MutableLiveData<ArrayList<String>>{
        return event
    }
}