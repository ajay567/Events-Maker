package com.example.groupproject

import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_detailpage.*


class detailpage : Fragment() {

    private  val elapsedTime =  MutableLiveData<Long>()
    private  val emoList =  MutableLiveData<String>()
    private  val eventlist = MutableLiveData<String>()
    //val mylist: ArrayList<String> = ArrayList()
    var hf100 = ""
    var hs100 = ""
    var mf100 = ""
    var ms100 = ""
    var sf100 = ""
    var ss100 = ""
    private var number:String? = "p7"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detailpage, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageButtons.setOnClickListener {
            Toast.makeText(this.activity, "choose laugh emoji", Toast.LENGTH_SHORT).show()
            number = "p1"
        }
        imageButtons2.setOnClickListener {
            Toast.makeText(this.activity, "choose sleep emoji", Toast.LENGTH_SHORT).show()
            number = "p2"
        }
        imageButtons3.setOnClickListener {
            Toast.makeText(this.activity, "choose thinking emoji", Toast.LENGTH_SHORT).show()
            number = "p3"
        }
        imageButtons4.setOnClickListener {
            Toast.makeText(this.activity, "choose crazy emoji", Toast.LENGTH_SHORT).show()
            number = "p4"
        }
        imageButtons5.setOnClickListener {
            Toast.makeText(this.activity, "choose smile emoji", Toast.LENGTH_SHORT).show()
            number = "p5"
        }
        imageButtons6.setOnClickListener {
            Toast.makeText(this.activity, "choose love emoji", Toast.LENGTH_SHORT).show()
            number = "p6"
        }
        imageButtons8.setOnClickListener {
            Toast.makeText(this.activity, "choose scary emoji", Toast.LENGTH_SHORT).show()
            number = "p8"
        }
        imageButtons9.setOnClickListener {
            Toast.makeText(this.activity, "choose cry emoji", Toast.LENGTH_SHORT).show()
            number = "p9"
        }
        imageButtons10.setOnClickListener {
            Toast.makeText(this.activity, "choose naughty emoji", Toast.LENGTH_SHORT).show()
            number = "p10"
        }
        imageButtons11.setOnClickListener {
            Toast.makeText(this.activity, "choose angry emoji", Toast.LENGTH_SHORT).show()
            number = "p11"
        }
        imageButtons12.setOnClickListener {
            Toast.makeText(this.activity, "choose kiss emoji", Toast.LENGTH_SHORT).show()
            number = "p12"
        }
        imageButtons13.setOnClickListener {
            Toast.makeText(this.activity, "choose Cool emoji", Toast.LENGTH_SHORT).show()
            number = "p13"
        }

        //finish.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_detailpage3_to_mainpage2))
        delete.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_detailpage3_to_mainpage2))


        val arrayListH = ArrayList<String>()
        val arrayListM = ArrayList<String>()
        val arrayListS = ArrayList<String>()
        val arrayListHS = ArrayList<String>()
        val arrayListMS = ArrayList<String>()
        val arrayListSS = ArrayList<String>()

        //arrayListH add the item
        arrayListH.add("0")
        arrayListH.add("1")
        arrayListH.add("2")
        arrayListH.add("3")
        arrayListH.add("4")
        arrayListH.add("5")
        arrayListH.add("6")
        arrayListH.add("7")
        arrayListH.add("8")
        arrayListH.add("9")

        arrayListHS.add("0")
        arrayListHS.add("1")
        arrayListHS.add("2")
        arrayListHS.add("3")
        arrayListHS.add("4")
        arrayListHS.add("5")
        arrayListHS.add("6")
        arrayListHS.add("7")
        arrayListHS.add("8")
        arrayListHS.add("9")

        //arrayListM add the item
        arrayListM.add("0")
        arrayListM.add("1")
        arrayListM.add("2")
        arrayListM.add("3")
        arrayListM.add("4")
        arrayListM.add("5")
        arrayListM.add("6")
        arrayListM.add("7")
        arrayListM.add("8")
        arrayListM.add("9")

        arrayListMS.add("0")
        arrayListMS.add("1")
        arrayListMS.add("2")
        arrayListMS.add("3")
        arrayListMS.add("4")
        arrayListMS.add("5")
        arrayListMS.add("6")
        arrayListMS.add("7")
        arrayListMS.add("8")
        arrayListMS.add("9")

        //arrayListS add the item
        arrayListS.add("0")
        arrayListS.add("1")
        arrayListS.add("2")
        arrayListS.add("3")
        arrayListS.add("4")
        arrayListS.add("5")
        arrayListS.add("6")
        arrayListS.add("7")
        arrayListS.add("8")
        arrayListS.add("9")

        arrayListSS.add("0")
        arrayListSS.add("1")
        arrayListSS.add("2")
        arrayListSS.add("3")
        arrayListSS.add("4")
        arrayListSS.add("5")
        arrayListSS.add("6")
        arrayListSS.add("7")
        arrayListSS.add("8")
        arrayListSS.add("9")

        //hourspinner
        val hourArrayAdapter = activity?.let {
            ArrayAdapter<String>(
                it, android.R.layout.simple_spinner_item,
                arrayListH
            )
        } //selected item will look like a spinner set from XML
        hourArrayAdapter?.setDropDownViewResource(
            android.R.layout
                .simple_spinner_dropdown_item
        )
        hourspinner.setAdapter(hourArrayAdapter)


        val hourSArrayAdapter = activity?.let {
            ArrayAdapter<String>(
                it, android.R.layout.simple_spinner_item,
                arrayListHS
            )
        }//selected item will look like a spinner set from XML
        hourSArrayAdapter?.setDropDownViewResource(
            android.R.layout
                .simple_spinner_dropdown_item
        )
        hss.setAdapter(hourSArrayAdapter)

        //minutespinner
        val minuteArrayAdapter = activity?.let {
            ArrayAdapter<String>(
                it, android.R.layout.simple_spinner_item,
                arrayListM
            )
        }//selected item will look like a spinner set from XML
        minuteArrayAdapter?.setDropDownViewResource(
            android.R.layout
                .simple_spinner_dropdown_item
        )
        minutespinner.setAdapter(minuteArrayAdapter)

        val minuteSArrayAdapter = activity?.let {
            ArrayAdapter<String>(
                it, android.R.layout.simple_spinner_item,
                arrayListMS
            )
        }//selected item will look like a spinner set from XML
        minuteSArrayAdapter?.setDropDownViewResource(
            android.R.layout
                .simple_spinner_dropdown_item
        )
        mss.setAdapter(minuteSArrayAdapter)

        //secondspinner
        val secondArrayAdapter = activity?.let {
            ArrayAdapter<String>(
                it, android.R.layout.simple_spinner_item,
                arrayListS
            )
        }//selected item will look like a spinner set from XML
        secondArrayAdapter?.setDropDownViewResource(
            android.R.layout
                .simple_spinner_dropdown_item
        )
        secondspinner.setAdapter(secondArrayAdapter)


        val secondSArrayAdapter = activity?.let {
            ArrayAdapter<String>(
                it, android.R.layout.simple_spinner_item,
                arrayListSS
            )
        }//selected item will look like a spinner set from XML
        secondSArrayAdapter?.setDropDownViewResource(
            android.R.layout
                .simple_spinner_dropdown_item
        )
        sss.setAdapter(secondSArrayAdapter)

        hourspinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val hoursF = parent?.getItemAtPosition(position).toString()
                hf100 = hoursF
            }
        }

        hss.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val hoursS = parent?.getItemAtPosition(position).toString()
                hs100 = hoursS
            }
        }

        minutespinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val minutesF = parent?.getItemAtPosition(position).toString()
                mf100 = minutesF
            }
        }

        mss.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val minutesS = parent?.getItemAtPosition(position).toString()
                ms100 = minutesS
            }
        }

        secondspinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val secondsF = parent?.getItemAtPosition(position).toString()
                sf100 = secondsF
            }
        }

        sss.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val secondsS = parent?.getItemAtPosition(position).toString()
                ss100 = secondsS
            }
        }

        editText.setHint("please enter the name of event:")
        editText.setTextColor(Color.BLUE)

        //mylist.add(R.id.editText.toString()+ "\n"+ hf100 + hs100 + ":" + mf100 + ms100 + ":" + sf100 + ss100)

        val model = activity?.let { ViewModelProviders.of(it).get(MyViewModel::class.java) }

        finish.setOnClickListener {
            object: CountDownTimer(((hf100.toLong()*10 + hs100.toLong())*60*60 + (mf100.toLong()*10 + ms100.toLong())*60 + sf100.toLong()*10 + ss100.toLong())*1000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    R.id.lap_value_text
                }

                override fun onFinish() {

                }
            }
//            timer.start()
            elapsedTime.value = (hf100.toLong()*10 + hs100.toLong())*60*60 + (mf100.toLong()*10 + ms100.toLong())*60 + sf100.toLong()*10 + ss100.toLong()
            //(hf100.toLong()*10 + hs100.toLong())*60*60 + (mf100.toLong()*10 + ms100.toLong())*60 + sf100.toLong()*10 + ss100.toLong()
//            println(elapsedTime.value!!)
            emoList.value = number
            if(editText.text.toString() == "")
            {
                editText.setText("Event")
            }
            eventlist.value = editText.text.toString()

            model?.addToLapsList(elapsedTime)
            model?.addToemoList(emoList)
            model?.addToeventList(eventlist)
//            println(elapsedTime)
            view.findNavController().navigate(R.id.action_detailpage3_to_mainpage2, bundleOf("headtext" to editText.text.toString(), "nb" to number))
            //Navigation.createNavigateOnClickListener(R.id.action_detailpage3_to_mainpage2)
            //model?.addToLapsList(hf100 + hs100 + ":" + mf100 + ms100 + ":" + sf100 + ss100)
            //Log.d("Timer Set7:", hf100 + hs100 + ":" + mf100 + ms100 + ":" + sf100 + ss100)
        }
    }

//    fun getEventList(): ArrayList<String> {
//        return mylist
//    }

}
