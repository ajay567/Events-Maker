package com.example.groupproject

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.groupproject.video
import kotlinx.android.synthetic.main.fragment_relax.*


class relax : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_relax, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        video.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_relax_to_video))

        val musicLCheck = booleanArrayOf(false,false,false)
        val musiclist = arrayOf<String>("22","Love Story","shake it")
        var title2 = "null"
        var title3 = "enter"
        val browserCheck = booleanArrayOf(false,false,false,false,false,false)
        val browserlist = arrayOf<String>("Google Search","Youtube","CNN","CNBC","The New York Times","The Washington Post")


        book.setOnClickListener{
            val bunbuilder = AlertDialog.Builder(this.requireContext())
            bunbuilder.setTitle("Browser Time:")
            bunbuilder.setMultiChoiceItems(browserlist, browserCheck, {dialog,which,isChecked->
                browserCheck[which] = isChecked
            })
            bunbuilder.setCancelable(true)
            bunbuilder.setPositiveButton("OK"){ dialog, which ->
                var counter = 0
                var pos=0
//                var pos2=0
                for (broItem in browserCheck) {
                    if(broItem == true){
                        counter++
                        title3 = browserlist.get(pos)
//                        pos2 = pos
                    }
                    pos++
                }
                if(counter==1){

                    val intent= Intent(requireActivity(),browser::class.java)

                    intent.putExtra("name", title3)

                    startActivityForResult(intent, 2);
                }
            }
            var dialog = bunbuilder.create()
            dialog.show()
            dialog.closeOptionsMenu()
        }



        music.setOnClickListener{
            val bunbuilder = AlertDialog.Builder(this.requireContext())
            bunbuilder.setTitle("Free Youtube Movies:")
            bunbuilder.setMultiChoiceItems(musiclist, musicLCheck, {dialog,which,isChecked->
                musicLCheck[which] = isChecked
            })
            bunbuilder.setCancelable(true)
            bunbuilder.setPositiveButton("OK"){ dialog, which ->
                var counter = 0
                var pos=0
                var pos2=0
                for (movItem in musicLCheck) {
                    if(movItem == true){
                        counter++
                        title2 = musiclist.get(pos)
                        pos2 = pos
                    }
                    pos++
                }
                if(counter==1){
                    val intent= Intent(requireActivity(),music2::class.java)
                    intent.putExtra("musictitle", title2)
                    intent.putExtra("position", pos2)
                    startActivityForResult(intent, 2);
                }
            }
            var dialog = bunbuilder.create()
            dialog.show()
            dialog.closeOptionsMenu()

//
//            val intent= Intent(requireActivity(),music2::class.java)
//            startActivityForResult(intent, 2);
//            println("testttttt\n")
        }



    }


}
