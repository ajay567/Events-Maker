package com.example.groupproject


import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_video.*
import kotlinx.android.synthetic.main.fragment_video.view.*


class video : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_video, container, false)


        val arrayChecked = booleanArrayOf(false,false,false,false,false,false,false,false,false,false)
        val movie1list = arrayOf<String>("Jumanji","Dora and the Lost City of Gold","The Jungle Book","Tomb Raider","Skyscraper","The Mummy","Kong: Skull Island","The Legend of Tarzan","Guardians of the Galaxy")
        val movie2list = arrayOf<String>("Green Book","Wonder","Parasite","Togo","A Dog's Purpose","The Shape of Water","Fifty Shades Freed","A Street Cat Named Bob","The Blind Side")
        val movie3list = arrayOf<String>("Rampage","The Fate of the Furious","Deadpool 2","Mission: Impossible – Fallout","Kingsman: The Golden Circle","John Wick: Chapter 2","Now You See Me 2","Polar","Wonder Woman")
        val movie4list = arrayOf<String>("Me Before You","Crazy Rich Asians","Flipped","Beauty and the Beast","The Age of Adaline","The Great Gatsby","Love, Rosie","The Terminal","Becoming Jane")
        val movie5list = arrayOf<String>("Venom","Avengers: Infinity War","Alita: Battle Angel","Ready Player One","Thor: Ragnarok","Black Panther","What Happened to Monday","Pacific Rim Uprising","Transformers: The Last Knight")
        val movie6list = arrayOf<String>("Aquaman","Aladdin","Fantastic Beasts","Mistress of Evil","The Last Witch Hunter","Bright","Underworld: Blood Wars","Dracula Untold","The Huntsman")
        val movie7list = arrayOf<String>("2012","San Andreas","The Day After Tomorrow","The Impossible","Knowing","Geostorm","Train to Busan","Crawl","Poseidon")
        val movie8list = arrayOf<String>("The Intern","Pokémon Detective","Beverly Hills Chihuahua","Kingsman","Nine Lives","Peter Rabbit","Game Night","Monster Trucks","Paddington 2")
        val movie9list = arrayOf<String>("The Invisible Guest","Knives Out","Battle of Memories","A Simple Favor","The Good Liar","At the End of the Tunnel","Gogol. Viy","The Limehouse Golem","Crooked House")
                                                            //epCg2RbyF80,xi-1NchUqMA,N7QnN4BvlcM,rAqMlh0b2HU,U2xDIe01fFY,fPc0SQyD-ac,537rmn8EzII,P8EJAyk01kk,LGT9yjvApa0
        var title = "null"
        v.title1.setOnClickListener{
            val bunbuilder = AlertDialog.Builder(this.requireContext())
            bunbuilder.setTitle("Free Youtube Movies:")
            bunbuilder.setMultiChoiceItems(movie1list, arrayChecked, {dialog,which,isChecked->
                arrayChecked[which] = isChecked
            })
            bunbuilder.setCancelable(true)
            bunbuilder.setPositiveButton("OK"){ dialog, which ->
                var counter = 0
                var pos=0

                for (movItem in arrayChecked) {
                    if(movItem == true){
                        counter++
                        title = movie1list.get(pos)
                    }
                    pos++
                }
                if(counter==1){
                    val intent= Intent(requireActivity(),moviedetail::class.java)
                    intent.putExtra("title", title)
                    startActivityForResult(intent, 2);
                }
            }
            var dialog = bunbuilder.create()
            dialog.show()
            dialog.closeOptionsMenu()
        }




        v.title2.setOnClickListener{
            val bunbuilder = AlertDialog.Builder(this.requireContext())
            bunbuilder.setTitle("Free Youtube Movies:")
            bunbuilder.setMultiChoiceItems(movie2list, arrayChecked, {dialog,which,isChecked->
                arrayChecked[which] = isChecked
            })
            bunbuilder.setCancelable(true)
            bunbuilder.setPositiveButton("OK"){ dialog, which ->
                var counter = 0
                var pos=0

                for (movItem in arrayChecked) {
                    if(movItem == true){
                        counter++
                        title = movie2list.get(pos)
                    }
                    pos++
                }
                if(counter==1){
                    val intent= Intent(requireActivity(),moviedetail::class.java)
                    intent.putExtra("title", title)
                    startActivityForResult(intent, 2);
                }
            }
            var dialog = bunbuilder.create()
            dialog.show()
            dialog.closeOptionsMenu()
        }

        v.title3.setOnClickListener{
            val bunbuilder = AlertDialog.Builder(this.requireContext())
            bunbuilder.setTitle("Free Youtube Movies:")
            bunbuilder.setMultiChoiceItems(movie3list, arrayChecked, {dialog,which,isChecked->
                arrayChecked[which] = isChecked
            })
            bunbuilder.setCancelable(true)
            bunbuilder.setPositiveButton("OK"){ dialog, which ->
                var counter = 0
                var pos=0

                for (movItem in arrayChecked) {
                    if(movItem == true){
                        counter++
                        title = movie3list.get(pos)
                    }
                    pos++
                }
                if(counter==1){
                    val intent= Intent(requireActivity(),moviedetail::class.java)
                    intent.putExtra("title", title)
                    startActivityForResult(intent, 2);
                }
            }
            var dialog = bunbuilder.create()
            dialog.show()
            dialog.closeOptionsMenu()
        }

        v.title4.setOnClickListener{
            val bunbuilder = AlertDialog.Builder(this.requireContext())
            bunbuilder.setTitle("Free Youtube Movies:")
            bunbuilder.setMultiChoiceItems(movie4list, arrayChecked, {dialog,which,isChecked->
                arrayChecked[which] = isChecked
            })
            bunbuilder.setCancelable(true)
            bunbuilder.setPositiveButton("OK"){ dialog, which ->
                var counter = 0
                var pos=0

                for (movItem in arrayChecked) {
                    if(movItem == true){
                        counter++
                        title = movie4list.get(pos)
                    }
                    pos++
                }
                if(counter==1){
                    val intent= Intent(requireActivity(),moviedetail::class.java)
                    intent.putExtra("title", title)
                    startActivityForResult(intent, 2);
                }
            }
            var dialog = bunbuilder.create()
            dialog.show()
            dialog.closeOptionsMenu()
        }

        v.title5.setOnClickListener{
            val bunbuilder = AlertDialog.Builder(this.requireContext())
            bunbuilder.setTitle("Free Youtube Movies:")
            bunbuilder.setMultiChoiceItems(movie5list, arrayChecked, {dialog,which,isChecked->
                arrayChecked[which] = isChecked
            })
            bunbuilder.setCancelable(true)
            bunbuilder.setPositiveButton("OK"){ dialog, which ->
                var counter = 0
                var pos=0

                for (movItem in arrayChecked) {
                    if(movItem == true){
                        counter++
                        title = movie5list.get(pos)
                    }
                    pos++
                }
                if(counter==1){
                    val intent= Intent(requireActivity(),moviedetail::class.java)
                    intent.putExtra("title", title)
                    startActivityForResult(intent, 2);
                }
            }
            var dialog = bunbuilder.create()
            dialog.show()
            dialog.closeOptionsMenu()
        }

        v.title6.setOnClickListener{
            val bunbuilder = AlertDialog.Builder(this.requireContext())
            bunbuilder.setTitle("Free Youtube Movies:")
            bunbuilder.setMultiChoiceItems(movie6list, arrayChecked, {dialog,which,isChecked->
                arrayChecked[which] = isChecked
            })
            bunbuilder.setCancelable(true)
            bunbuilder.setPositiveButton("OK"){ dialog, which ->
                var counter = 0
                var pos=0

                for (movItem in arrayChecked) {
                    if(movItem == true){
                        counter++
                        title = movie6list.get(pos)
                    }
                    pos++
                }
                if(counter==1){
                    val intent= Intent(requireActivity(),moviedetail::class.java)
                    intent.putExtra("title", title)
                    startActivityForResult(intent, 2);
                }
            }
            var dialog = bunbuilder.create()
            dialog.show()
            dialog.closeOptionsMenu()
        }

        v.title7.setOnClickListener{
            val bunbuilder = AlertDialog.Builder(this.requireContext())
            bunbuilder.setTitle("Free Youtube Movies:")
            bunbuilder.setMultiChoiceItems(movie7list, arrayChecked, {dialog,which,isChecked->
                arrayChecked[which] = isChecked
            })
            bunbuilder.setCancelable(true)
            bunbuilder.setPositiveButton("OK"){ dialog, which ->
                var counter = 0
                var pos=0

                for (movItem in arrayChecked) {
                    if(movItem == true){
                        counter++
                        title = movie7list.get(pos)
                    }
                    pos++
                }
                if(counter==1){
                    val intent= Intent(requireActivity(),moviedetail::class.java)
                    intent.putExtra("title", title)
                    startActivityForResult(intent, 2);
                }

            }
            var dialog = bunbuilder.create()
            dialog.show()
            dialog.closeOptionsMenu()
        }

        v.title8.setOnClickListener{
            val bunbuilder = AlertDialog.Builder(this.requireContext())
            bunbuilder.setTitle("Free Youtube Movies:")
            bunbuilder.setMultiChoiceItems(movie8list, arrayChecked, {dialog,which,isChecked->
                arrayChecked[which] = isChecked
            })
            bunbuilder.setCancelable(true)
            bunbuilder.setPositiveButton("OK"){ dialog, which ->
                var counter = 0
                var pos=0

                for (movItem in arrayChecked) {
                    if(movItem == true){
                        counter++
                        title = movie8list.get(pos)
                    }
                    pos++
                }
                if(counter==1){
                    val intent= Intent(requireActivity(),moviedetail::class.java)
                    intent.putExtra("title", title)
                    startActivityForResult(intent, 2);
                }
            }
            var dialog = bunbuilder.create()
            dialog.show()
            dialog.closeOptionsMenu()
        }

        v.title9.setOnClickListener{
            val bunbuilder = AlertDialog.Builder(this.requireContext())
            bunbuilder.setTitle("Free Youtube Movies:")
            bunbuilder.setMultiChoiceItems(movie9list, arrayChecked, {dialog,which,isChecked->
                arrayChecked[which] = isChecked
            })
            bunbuilder.setCancelable(true)
            bunbuilder.setPositiveButton("OK"){ dialog, which ->
                var counter = 0
                var pos=0

                for (movItem in arrayChecked) {
                    if(movItem == true){
                        counter++
                        title = movie9list.get(pos)
                    }
                    pos++
                }
                if(counter==1){
                    val intent= Intent(requireActivity(),moviedetail::class.java)
                    intent.putExtra("title", title)
                    startActivityForResult(intent, 2);
                }
            }
            var dialog = bunbuilder.create()
            dialog.show()
            dialog.closeOptionsMenu()
        }


        return v
    }



}
