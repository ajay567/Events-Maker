package com.example.groupproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cal.*

class cal : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal)
        var sb = StringBuilder()
        button_zero.setOnClickListener {
            sb.append("0")
            textView_input_numbers.setText(sb)
        }
        button_one.setOnClickListener {
            sb.append("1")
            textView_input_numbers.setText(sb)
        }
        button_two.setOnClickListener {
            sb.append("2")
            textView_input_numbers.setText(sb)
        }
        button_three.setOnClickListener {
            sb.append("3")
            textView_input_numbers.setText(sb)
        }
        button_four.setOnClickListener {
            sb.append("4")
            textView_input_numbers.setText(sb)
        }
        button_five.setOnClickListener {
            sb.append("5")
            textView_input_numbers.setText(sb)
        }
        button_six.setOnClickListener {
            sb.append("6")
            textView_input_numbers.setText(sb)
        }
        button_seven.setOnClickListener {
            sb.append("7")
            textView_input_numbers.setText(sb)
        }
        button_eight.setOnClickListener {
            sb.append("8")
            textView_input_numbers.setText(sb)
        }
        button_nine.setOnClickListener {
            sb.append("9")
            textView_input_numbers.setText(sb)
        }
        button_clear.setOnClickListener {
            if(sb.length != 0){
            sb.delete(0,sb.length)
            textView_input_numbers.setText(sb)
            }
        }
        button_delete.setOnClickListener {
            if(sb.length != 0){
                sb.deleteCharAt(sb.length-1)
                textView_input_numbers.setText(sb)
            }
        }

        button_multiplication.setOnClickListener {
            sb.append("X")
            textView_input_numbers.setText(sb)
        }
        button_division.setOnClickListener {
            sb.append("/")
            textView_input_numbers.setText(sb)
        }
        button_addition.setOnClickListener {
            sb.append("+")
            textView_input_numbers.setText(sb)
        }
        button_subtraction.setOnClickListener {
            sb.append("-")
            textView_input_numbers.setText(sb)
        }
        button_equal.setOnClickListener {
            var first = StringBuilder()
            var second = StringBuilder()
            var thing:String = ""
            var index = 0;
            var counter = 0;

            var current = 0.0;
            for(x in 0 until sb.length)
            {
                if(sb.get(x).toString().equals("+") || sb.get(x).toString().equals("-") || sb.get(x).toString().equals("X") || sb.get(x).toString().equals("/")) {
                    counter++
                }
            }

            var uu = 0;
            var kk = 0;
            for(c in 0 until counter) {
if(uu == 0) {
    for (i in uu until sb.length) {
        if (sb.get(i).toString().equals("+") || sb.get(i).toString().equals("-") || sb.get(
                i
            ).toString().equals("X") || sb.get(i).toString().equals("/")
        ) {
            thing = sb[i].toString()
            index = i
            kk = i
            uu = i
            break
        } else {
            first.append(sb[i])

        }
    }
}else{
    var cur = current.toString()
    for(l in 0 until cur.length){
        first.append(cur[l])
    }
//    first =
}
                for (i in kk+1 until sb.length) {
                    thing = sb[kk].toString()
                    if (sb.get(i).toString().equals("+") || sb.get(i).toString().equals("-") || sb.get(i
                        ).toString().equals("X") || sb.get(i).toString().equals("/")
                    ) {
                        kk = i
                       break
                    }
                    else{
                    second.append(sb.get(i))
                    }

                }

                println("first"+first)
                println("second"+second)
                if (thing.equals("+")) {
                    var res1 = first.toString().toDouble()
                    var res2 = second.toString().toDouble()
                    if(current != 0.0){
                        res1 = current
                    }
                    var res = res1 + res2
                    current = res.toDouble()
                    textView_input_numbers.setText(res.toString())
                }

                if (thing.equals("-")) {
                    var res1 = first.toString().toDouble()
                    var res2 = second.toString().toDouble()
                    if(current != 0.0){
                        res1 = current
                    }
                    var res = res1 - res2
                    current = res.toDouble()
                    textView_input_numbers.setText(res.toString())
                }

                if (thing.equals("X")) {
                    var res1 = first.toString().toDouble()
                    var res2 = second.toString().toDouble()
                    if(current != 0.0){
                        res1 = current
                    }
                    var res = res1 * res2
                    current = res.toDouble()
                    textView_input_numbers.setText(res.toString())
                }
                if (thing.equals("/")) {
                    var res1 = first.toString().toDouble()

                    var res2 = second.toString().toDouble()
                    if(current != 0.0){
                        res1 = current
                    }
                    var res = res1 / res2
                    current = res
                    textView_input_numbers.setText(res.toString())
                }
                first.clear()
                second.clear()
            }
            current = 0.0
        }
    }
}



