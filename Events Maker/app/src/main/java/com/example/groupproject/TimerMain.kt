package com.example.groupproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.groupproject.video
import kotlinx.android.synthetic.main.fragment_mainpage.*
import kotlinx.android.synthetic.main.fragment_relax.*
import kotlinx.android.synthetic.main.fragment_timermain.*

/**
 * A simple [Fragment] subclass.
 */
class TimerMain : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_timermain, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        add.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_timerMain2_to_detailpage3))
    }


}