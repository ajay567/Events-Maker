package com.example.groupproject

import android.app.*
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_mainpage.*
import kotlinx.android.synthetic.main.fragment_relax.*
import java.util.concurrent.TimeUnit


class mainpage : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var screenView: View
    private var lapses = ArrayList<Long>()
    private var emoji = ArrayList<String>()
    private var namelist = ArrayList<String>()
    private var eventlist = ArrayList<String>()
    private var tim:Long = 0

    val model = activity?.let { ViewModelProviders.of(it).get(MyViewModel::class.java) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        getLapsList()
        getemoList()
        geteventList()
        val model = activity?.let { ViewModelProviders.of(it).get(MyViewModel::class.java) }
//



//        relax.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainpage_to_relax))
//        imageButton4.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainpage_to_timerMain2))

        screenView = inflater.inflate(R.layout.fragment_mainpage, container, false)
        recyclerView = screenView.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        println("second "+tim)
        viewAdapter = RecyclerViewAdapter(lapses, activity as MainActivity, namelist, emoji,lapses,tim)

        recyclerView.adapter = viewAdapter


        model?.getLapsList()?.observe(viewLifecycleOwner, Observer {
            (viewAdapter as RecyclerViewAdapter).updateData(it)
            viewAdapter.notifyDataSetChanged()
        })

        model?.getemoList()?.observe(viewLifecycleOwner, Observer {
            (viewAdapter as RecyclerViewAdapter).updateDatas(it)
            viewAdapter.notifyDataSetChanged()
        })

        model?.geteventList()?.observe(viewLifecycleOwner, Observer {
            (viewAdapter as RecyclerViewAdapter).updateDatass(it)
            viewAdapter.notifyDataSetChanged()
        })

        Log.d("MyString", lapses.toString())
        return screenView

        //return inflater.inflate(R.layout.fragment_mainpage, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        relax.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainpage_to_relax))
        imageButton4.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainpage_to_timerMain2))
        imageButton.setOnClickListener {
            val intent = Intent(activity, cal::class.java)
            startActivity(intent)
        }
//        imageButton.setOnClickListener{
//            geteventList22()
//            getemoList()
//            getLapsList()
//
//
//
//
//            var a = eventlist.size
//            val test: Array<String> = eventlist.toTypedArray()
//            val browserCheck = BooleanArray(a) { false }
//
//
//
//
//
//                val bunbuilder = AlertDialog.Builder(this.requireContext())
//                bunbuilder.setTitle("Event List:")
//                bunbuilder.setMultiChoiceItems(test, browserCheck, {dialog,which,isChecked->
//                    browserCheck[which] = isChecked
//                })
//                bunbuilder.setCancelable(true)
//                bunbuilder.setPositiveButton("OK"){ dialog, which ->
//                    var counter = 0
//                    var pos=0
////                var pos2=0
//                    for (broItem in browserCheck) {
//                        if(broItem == true){
//                            counter++
////                            title3 = eventlist.get(pos)
////                            val model = activity?.let { ViewModelProviders.of(it).get(MyViewModel::class.java) }
//
//                            emoji.removeAt(pos)
//                            eventlist.removeAt(pos)
//                            tim = lapses.get(pos)
//                            lapses.removeAt(pos)
//                            println("first"+tim)
//                            viewAdapter.notifyDataSetChanged()
//                            println("inside"+emoji.toString())
//                            println("inside"+eventlist.toString())
//                            println("inside"+lapses.toString())
//                        }
//                        pos++
//                    }
//                }
//                var dialog = bunbuilder.create()
//                dialog.show()
//                dialog.closeOptionsMenu()
//            println("final"+emoji.toString())
//            println("final"+eventlist.toString())
//            println("final"+lapses.toString())
//
//        }



    }


    private fun getLapsList(){
        val model = activity?.let { ViewModelProviders.of(it).get(MyViewModel::class.java) }

        lapses = model?.getLapsList()?.value!!

    }

    private fun getemoList(){
        val model = activity?.let { ViewModelProviders.of(it).get(MyViewModel::class.java) }

        emoji = model?.getemoList()?.value!!
    }

    private fun geteventList(){
        val model = activity?.let { ViewModelProviders.of(it).get(MyViewModel::class.java) }

        namelist = model?.getemoList()?.value!!
    }

    private fun geteventList22(){
        val model = activity?.let { ViewModelProviders.of(it).get(MyViewModel::class.java) }

        eventlist = model?.geteventList()?.value!!
    }


    class RecyclerViewAdapter(private var myDataset: ArrayList<Long>, private val activity: MainActivity, var st:ArrayList<String>, var pts:ArrayList<String>,var time:ArrayList<Long>,var time22:Long):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,parent,false)
//            println("final"+st.toString())
//            println("final"+pts.toString())

            println("third "+time22)
            return ViewHolder(v, activity, st, pts,time,time22)
        }

        override fun getItemCount(): Int {
//            println("size:"+ myDataset.size)
            return myDataset.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                holder.bindItems(myDataset[position], position)
        }

        fun updateData(a: ArrayList<Long>) {
            this.myDataset = a
        }

        fun updateDatas(a: ArrayList<String>) {

            this.pts=a
        }

        fun updateDatass(a: ArrayList<String>) {

            this.st=a
        }


        class ViewHolder(private val view: View, private val activity: MainActivity, val str:ArrayList<String>, val pt:ArrayList<String>,val time:ArrayList<Long>,var time22:Long):RecyclerView.ViewHolder(view){


            val NOTIFICATION_CHANNEL_ID = "10001"
            fun bindItems(lap: Long, position: Int){
                println("last "+time22)
                val laps: TextView = itemView.findViewById(R.id.lap_value_text)
                var lapsNumber: TextView = itemView.findViewById(R.id.lap_number_text)
                val lapspicture: ImageView = itemView.findViewById(R.id.imageViews)
//                println("laowangdatui"+time22)
//                println("laowang"+str.toString())
//                println("${position}")
                if(pt.get("${position}".toInt()) == "p1")
                {

                    lapspicture.setImageResource(R.drawable.p1)
                }
                else if(pt.get("${position}".toInt()) == "p2")
                {
                    lapspicture.setImageResource(R.drawable.p2)
                }
                else if(pt.get("${position}".toInt()) == "p3")
                {
                    lapspicture.setImageResource(R.drawable.p3)
                }
                else if(pt.get("${position}".toInt()) == "p4")
                {
                    lapspicture.setImageResource(R.drawable.p4)
                }
                else if(pt.get("${position}".toInt()) == "p5")
                {
                    lapspicture.setImageResource(R.drawable.p5)
                }
                else if(pt.get("${position}".toInt()) == "p6")
                {
                    lapspicture.setImageResource(R.drawable.p6)
                }
                else if(pt.get("${position}".toInt()) == "p8")
                {
                    lapspicture.setImageResource(R.drawable.p8)
                }
                else if(pt.get("${position}".toInt()) == "p9")
                {
                    lapspicture.setImageResource(R.drawable.p9)
                }
                else if(pt.get("${position}".toInt()) == "p10")
                {
                    lapspicture.setImageResource(R.drawable.p10)
                }
                else if(pt.get("${position}".toInt()) == "p11")
                {
                    lapspicture.setImageResource(R.drawable.p11)
                }
                else if(pt.get("${position}".toInt()) == "p12")
                {
                    lapspicture.setImageResource(R.drawable.p12)
                }
                else if(pt.get("${position}".toInt()) == "p13")
                {
                    lapspicture.setImageResource(R.drawable.p13)
                }
                else
                {
                    lapspicture.setImageResource(R.drawable.noemoji)
                }

                lapsNumber.text = str.get("${position}".toInt())




//                println("happy"+lap.toString())
                val timer = object: CountDownTimer(lap*1000, 1000) {
                    override fun onTick(millisUntilFinished: Long) {
//                        println("sad"+millisUntilFinished.toString())
                        laps.text = "${TimeUnit.MILLISECONDS.toHours(millisUntilFinished)}:" +
                                "${TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)- TimeUnit.HOURS.
                                    toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished))}:" +
                                "${TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))}"
//                        println(laps.text)
                        val model = activity?.let { ViewModelProviders.of(it).get(MyViewModel::class.java) }

//                        println(millisUntilFinished.toString());
                        model?.removeList((millisUntilFinished/1000))

//                        model?.addToLapsList(millisUntilFinished/1000)
//                        model?.add(millisUntilFinished/1000)
                    }

                    @RequiresApi(Build.VERSION_CODES.O)
                    override fun onFinish() {
                       val intent = Intent()
                        val pendingIntent = PendingIntent.getActivity(activity, 0, intent, 0)
                        val notification = Notification.Builder(activity)
                            .setSmallIcon(R.drawable.ic_event_available_black_24dp)
                            .setContentTitle("Notification of the event")
                            .setContentText(lapsNumber.text.toString() + " is time up")
                        notification.setContentIntent(pendingIntent)

                        notification.setChannelId(NOTIFICATION_CHANNEL_ID);
                        val notificationChannel = NotificationChannel(NOTIFICATION_CHANNEL_ID, "NOTIFICATION_CHANNEL_NAME", NotificationManager.IMPORTANCE_HIGH)
                        val notificationManager =
                            activity.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

                        notificationManager.createNotificationChannel(notificationChannel);

                        notificationManager.notify(System.currentTimeMillis().toInt(), notification.build())
                        laps.text = "Finish :)"
                    }


                }.start()


                //laps.text = lap.toString()
            }

        }
    }

}
