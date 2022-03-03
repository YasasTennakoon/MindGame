package com.example.tutorial3

import android.content.IntentSender
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var g=findViewById<androidx.gridlayout.widget.GridLayout>(R.id.grid)
        var b1=findViewById<Button>(R.id.button1)
        var b2=findViewById<Button>(R.id.button2)
        var b3=findViewById<Button>(R.id.button3)
        var b4=findViewById<Button>(R.id.button4)
        var b5=findViewById<Button>(R.id.button5)
        var b6=findViewById<Button>(R.id.button6)
        var b7=findViewById<Button>(R.id.button7)
        var b8=findViewById<Button>(R.id.button8)
        var b9=findViewById<Button>(R.id.button9)
        var b10=findViewById<Button>(R.id.button10)
        var b11=findViewById<Button>(R.id.button11)
        var b12=findViewById<Button>(R.id.button12)
        var b13=findViewById<Button>(R.id.button13)
        var b14=findViewById<Button>(R.id.button14)
        var b15=findViewById<Button>(R.id.button15)
        var b16=findViewById<Button>(R.id.button16)
        var b17=findViewById<Button>(R.id.button17)
        var b18=findViewById<Button>(R.id.button18)
        var b19=findViewById<Button>(R.id.button19)
        var b20=findViewById<Button>(R.id.button20)
        var b21=findViewById<Button>(R.id.button21)
        var b22=findViewById<Button>(R.id.button22)
        var b23=findViewById<Button>(R.id.button23)
        var b24=findViewById<Button>(R.id.button24)
        var b25=findViewById<Button>(R.id.button25)
        var txt1=findViewById<TextView>(R.id.textView1)
        var txt2=findViewById<TextView>(R.id.textView2)
        var exit=findViewById<Button>(R.id.exit)
        var count=0
        var score=0
        var total=0

        var firstrow= mutableListOf<Button>(b1,b2,b3,b4,b5)
        var secondrow= mutableListOf<Button>(b6,b7,b8,b9,b10)
        var thirdrow= mutableListOf<Button>(b11,b12,b13,b14,b15)
        var forthrow= mutableListOf<Button>(b16,b17,b18,b19,b20)
        var fifthrow= mutableListOf<Button>(b21,b22,b23,b24,b25)

        var firstcoloum=mutableListOf<Button>(b1,b6,b11,b16,b21)
        var secondcoloum=mutableListOf<Button>(b2,b7,b12,b17,b22)
        var thirdcoloum=mutableListOf<Button>(b3,b8,b13,b18,b23)
        var forthcoloum=mutableListOf<Button>(b4,b9,b14,b19,b24)
        var fifthcoloum=mutableListOf<Button>(b5,b10,b15,b20,b25)

        var threebythree= mutableListOf<Button>(b1,b2,b3,b6,b7,b8,b11,b12,b13)
        var threebyfour= mutableListOf<Button>(b1,b2,b3,b4,b6,b7,b8,b9,b11,b12,b13,b14)
        var threebyfive= mutableListOf<Button>(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15)
        var fourbythree= mutableListOf<Button>(b1,b2,b3,b6,b7,b8,b11,b12,b13,b16,b17,b18)
        var fourbyfour= mutableListOf<Button>(b1,b2,b3,b4,b6,b7,b8,b9,b11,b12,b13,b14,b16,b17,b18,b19)
        var fourbyfive= mutableListOf<Button>(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20)
        var fivebythree= mutableListOf<Button>(b1,b2,b3,b6,b7,b8,b11,b12,b13,b16,b17,b18,b21,b22,b23)
        var fivebyfour= mutableListOf<Button>(b1,b2,b3,b4,b6,b7,b8,b9,b11,b12,b13,b14,b16,b17,b18,b19,b21,b22,b23,b24)
        var fivebyfive= mutableListOf<Button>(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25)

        var rows= arrayOf(firstrow,secondrow,thirdrow,forthrow,fifthrow)
        var coloums= arrayOf(firstcoloum,secondcoloum,thirdcoloum,forthcoloum,fifthcoloum)
        var conditions= arrayOf(threebythree,threebyfour,threebyfive,fourbythree,fourbyfour,fourbyfive,fivebythree,fivebyfour,fivebyfive)
        var buttoncolors= mutableListOf<Int>()
        var correctbuttons= mutableListOf<Button>()
        var r=Random()

        exit.setOnClickListener {
            System.exit(0)
        }

        fun colorbtn()
        {
            b1.setBackgroundColor(Color.BLACK)
            b2.setBackgroundColor(Color.BLACK)
            b3.setBackgroundColor(Color.BLACK)
            b4.setBackgroundColor(Color.BLACK)
            b5.setBackgroundColor(Color.BLACK)
            b6.setBackgroundColor(Color.BLACK)
            b7.setBackgroundColor(Color.BLACK)
            b8.setBackgroundColor(Color.BLACK)
            b9.setBackgroundColor(Color.BLACK)
            b10.setBackgroundColor(Color.BLACK)
            b11.setBackgroundColor(Color.BLACK)
            b12.setBackgroundColor(Color.BLACK)
            b13.setBackgroundColor(Color.BLACK)
            b14.setBackgroundColor(Color.BLACK)
            b15.setBackgroundColor(Color.BLACK)
            b16.setBackgroundColor(Color.BLACK)
            b17.setBackgroundColor(Color.BLACK)
            b18.setBackgroundColor(Color.BLACK)
            b19.setBackgroundColor(Color.BLACK)
            b20.setBackgroundColor(Color.BLACK)
            b21.setBackgroundColor(Color.BLACK)
            b22.setBackgroundColor(Color.BLACK)
            b23.setBackgroundColor(Color.BLACK)
            b24.setBackgroundColor(Color.BLACK)
            b25.setBackgroundColor(Color.BLACK)

        }

        fun generateButton() {
            colorbtn()
            buttoncolors.clear()
            correctbuttons.clear()
            txt1.setText(""+score+"")
            txt2.setText(""+total+"")
            var randomnum = 3 + r.nextInt(3)
            var coloumran=3 + r.nextInt(3)
            if(randomnum == 3 && coloumran==3) {

                for (i in rows[3]) {
                    i.setVisibility(View.INVISIBLE);

                }
                for (i in rows[4]) {
                    i.setVisibility(View.INVISIBLE);
                }
                //Coloums
                for (i in coloums[3]) {
                    i.setVisibility(View.INVISIBLE);
                }
                for (i in coloums[4]) {
                    i.setVisibility(View.INVISIBLE);
                }
                buttoncolors.clear()
                var random=0 + r.nextInt(threebythree.size)
                while (buttoncolors.size<=4)
                {
                    if(random !in buttoncolors) {

                        buttoncolors.add(random)
                    }
                    else {
                        random=0 + r.nextInt(threebythree.size)
                    }
                }
                threebythree[buttoncolors[0]].setBackgroundColor(Color.GREEN)
                threebythree[buttoncolors[1]].setBackgroundColor(Color.GREEN)
                threebythree[buttoncolors[2]].setBackgroundColor(Color.GREEN)
                threebythree[buttoncolors[3]].setBackgroundColor(Color.GREEN)
                correctbuttons.add(threebythree[buttoncolors[0]])
                correctbuttons.add(threebythree[buttoncolors[1]])
                correctbuttons.add(threebythree[buttoncolors[2]])
                correctbuttons.add(threebythree[buttoncolors[3]])
                total += correctbuttons.size
                txt2.setText(""+total+"")
                var countdown=object :CountDownTimer(5000,1000)
                {
                    override fun onTick(millisUnitilFinished: Long) {

                    }

                    override fun onFinish() {
                        for(i in threebythree)
                        {
                            i.setBackgroundColor(Color.BLACK)
                        }
                    }

                }.start()


            }

            if(randomnum == 3 && coloumran==4) {
                for (i in rows[3]) {
                    i.setVisibility(View.INVISIBLE);


                }
                for (i in rows[4]) {
                    i.setVisibility(View.INVISIBLE);
                }
                //Coloums
                for (i in coloums[3]) {
                    i.setVisibility(View.VISIBLE);
                    b19.setVisibility(View.INVISIBLE);
                    b24.setVisibility(View.INVISIBLE);

                }
                for (i in coloums[4]) {
                    i.setVisibility(View.INVISIBLE);
                }
                buttoncolors.clear()
                var random=0 + r.nextInt(threebyfour.size)
                while (buttoncolors.size<=4)
                {
                    if(random !in buttoncolors) {

                        buttoncolors.add(random)
                    }
                    else {
                        random=0 + r.nextInt(threebyfour.size)
                    }
                }
                threebyfour[buttoncolors[0]].setBackgroundColor(Color.GREEN)
                threebyfour[buttoncolors[1]].setBackgroundColor(Color.GREEN)
                threebyfour[buttoncolors[2]].setBackgroundColor(Color.GREEN)
                threebyfour[buttoncolors[3]].setBackgroundColor(Color.GREEN)
                correctbuttons.add(threebyfour[buttoncolors[0]])
                correctbuttons.add(threebyfour[buttoncolors[1]])
                correctbuttons.add(threebyfour[buttoncolors[2]])
                correctbuttons.add(threebyfour[buttoncolors[3]])
                total += correctbuttons.size
                txt2.setText(""+total+"")
                var countdownthree=object :CountDownTimer(5000,1000)
                {
                    override fun onTick(millisUnitilFinished: Long) {

                    }

                    override fun onFinish() {
                        for(i in threebyfour)
                        {
                            i.setBackgroundColor(Color.BLACK)
                        }
                    }

                }.start()

            }

            if(randomnum == 3 && coloumran==5) {
                for (i in rows[3]) {
                    i.setVisibility(View.INVISIBLE);


                }
                for (i in rows[4]) {
                    i.setVisibility(View.INVISIBLE);
                }

                //Coloums
                for (i in coloums[0]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in coloums[1]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in coloums[2]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in coloums[3]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in coloums[4]) {
                    i.setVisibility(View.VISIBLE);
                }
                b16.setVisibility(View.INVISIBLE);
                b17.setVisibility(View.INVISIBLE);
                b18.setVisibility(View.INVISIBLE);
                b19.setVisibility(View.INVISIBLE);
                b20.setVisibility(View.INVISIBLE);
                b21.setVisibility(View.INVISIBLE);
                b22.setVisibility(View.INVISIBLE);
                b23.setVisibility(View.INVISIBLE);
                b24.setVisibility(View.INVISIBLE);
                b25.setVisibility(View.INVISIBLE);
                buttoncolors.clear()
                var random=0 + r.nextInt(threebyfive.size)
                while (buttoncolors.size<=4)
                {
                    if(random !in buttoncolors) {

                        buttoncolors.add(random)
                    }
                    else {
                        random=0 + r.nextInt(threebyfive.size)
                    }
                }
                threebyfive[buttoncolors[0]].setBackgroundColor(Color.GREEN)
                threebyfive[buttoncolors[1]].setBackgroundColor(Color.GREEN)
                threebyfive[buttoncolors[2]].setBackgroundColor(Color.GREEN)
                threebyfive[buttoncolors[3]].setBackgroundColor(Color.GREEN)
                correctbuttons.add(threebyfive[buttoncolors[0]])
                correctbuttons.add(threebyfive[buttoncolors[1]])
                correctbuttons.add(threebyfive[buttoncolors[2]])
                correctbuttons.add(threebyfive[buttoncolors[3]])
                total += correctbuttons.size
                txt2.setText(""+total+"")
                var countdownfive=object :CountDownTimer(5000,1000)
                {
                    override fun onTick(millisUnitilFinished: Long) {

                    }

                    override fun onFinish() {
                        for(i in threebyfive)
                        {
                            i.setBackgroundColor(Color.BLACK)
                        }
                    }

                }.start()


            }

            if(randomnum == 4 && coloumran==3) {
                for (i in rows[3]) {
                    i.setVisibility(View.VISIBLE);

                }
                for (i in rows[4]) {
                    i.setVisibility(View.INVISIBLE);
                }
                //Coloums
                for (i in coloums[3]) {
                    i.setVisibility(View.INVISIBLE);
                }
                for (i in coloums[4]) {
                    i.setVisibility(View.INVISIBLE);
                }
                buttoncolors.clear()
                var random=0 + r.nextInt(fourbythree.size)
                while (buttoncolors.size<=5)
                {
                    if(random !in buttoncolors) {

                        buttoncolors.add(random)
                    }
                    else {
                        random=0 + r.nextInt(fourbythree.size)
                    }
                }
                fourbythree[buttoncolors[0]].setBackgroundColor(Color.GREEN)
                fourbythree[buttoncolors[1]].setBackgroundColor(Color.GREEN)
                fourbythree[buttoncolors[2]].setBackgroundColor(Color.GREEN)
                fourbythree[buttoncolors[3]].setBackgroundColor(Color.GREEN)
                fourbythree[buttoncolors[4]].setBackgroundColor(Color.GREEN)
                correctbuttons.add(fourbythree[buttoncolors[0]])
                correctbuttons.add(fourbythree[buttoncolors[1]])
                correctbuttons.add(fourbythree[buttoncolors[2]])
                correctbuttons.add(fourbythree[buttoncolors[3]])
                correctbuttons.add(fourbythree[buttoncolors[4]])
                total += correctbuttons.size
                txt2.setText(""+total+"")
                var countdownfourbythree=object :CountDownTimer(5000,1000)
                {
                    override fun onTick(millisUnitilFinished: Long) {

                    }

                    override fun onFinish() {
                        for(i in fourbythree)
                        {
                            i.setBackgroundColor(Color.BLACK)
                        }
                    }

                }.start()


            }

            if(randomnum == 4 && coloumran==4) {
                for (i in rows[3]) {
                    i.setVisibility(View.VISIBLE);

                }
                for (i in rows[4]) {
                    i.setVisibility(View.INVISIBLE);
                }
                //Coloums
                for (i in coloums[4]) {
                    i.setVisibility(View.INVISIBLE);
                }
                b4.setVisibility(View.VISIBLE);
                b9.setVisibility(View.VISIBLE);
                b14.setVisibility(View.VISIBLE);
                b19.setVisibility(View.VISIBLE);
                buttoncolors.clear()
                var random=0 + r.nextInt(fourbyfour.size)
                while (buttoncolors.size<=5)
                {
                    if(random !in buttoncolors) {

                        buttoncolors.add(random)
                    }
                    else {
                        random=0 + r.nextInt(fourbyfour.size)
                    }
                }
                fourbyfour[buttoncolors[0]].setBackgroundColor(Color.GREEN)
                fourbyfour[buttoncolors[1]].setBackgroundColor(Color.GREEN)
                fourbyfour[buttoncolors[2]].setBackgroundColor(Color.GREEN)
                fourbyfour[buttoncolors[3]].setBackgroundColor(Color.GREEN)
                fourbyfour[buttoncolors[4]].setBackgroundColor(Color.GREEN)
                correctbuttons.add(fourbyfour[buttoncolors[0]])
                correctbuttons.add(fourbyfour[buttoncolors[1]])
                correctbuttons.add(fourbyfour[buttoncolors[2]])
                correctbuttons.add(fourbyfour[buttoncolors[3]])
                correctbuttons.add(fourbyfour[buttoncolors[4]])
                total += correctbuttons.size
                txt2.setText(""+total+"")
                var countdownfourbyfour=object :CountDownTimer(5000,1000)
                {
                    override fun onTick(millisUnitilFinished: Long) {

                    }

                    override fun onFinish() {
                        for(i in fourbyfour)
                        {
                            i.setBackgroundColor(Color.BLACK)
                        }
                    }

                }.start()
               // b24.setVisibility(View.VISIBLE);

            }

            if(randomnum == 5 && coloumran==5) {
                for (i in rows[0]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in rows[1]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in rows[2]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in rows[3]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in rows[4]) {
                    i.setVisibility(View.VISIBLE);
                }
                //Coloums
                for (i in coloums[0]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in coloums[1]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in coloums[2]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in coloums[3]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in coloums[4]) {
                    i.setVisibility(View.VISIBLE);
                }
                buttoncolors.clear()
                var random=0 + r.nextInt(fivebyfive.size)
                while (buttoncolors.size<=6)
                {
                    if(random !in buttoncolors) {

                        buttoncolors.add(random)
                    }
                    else {
                        random=0 + r.nextInt(fivebyfive.size)
                    }
                }
                fivebyfive[buttoncolors[0]].setBackgroundColor(Color.GREEN)
                fivebyfive[buttoncolors[1]].setBackgroundColor(Color.GREEN)
                fivebyfive[buttoncolors[2]].setBackgroundColor(Color.GREEN)
                fivebyfive[buttoncolors[3]].setBackgroundColor(Color.GREEN)
                fivebyfive[buttoncolors[4]].setBackgroundColor(Color.GREEN)
                fivebyfive[buttoncolors[5]].setBackgroundColor(Color.GREEN)
                correctbuttons.add(fivebyfive[buttoncolors[0]])
                correctbuttons.add(fivebyfive[buttoncolors[1]])
                correctbuttons.add(fivebyfive[buttoncolors[2]])
                correctbuttons.add(fivebyfive[buttoncolors[3]])
                correctbuttons.add(fivebyfive[buttoncolors[4]])
                correctbuttons.add(fivebyfive[buttoncolors[5]])
                total += correctbuttons.size
                txt2.setText(""+total+"")
                var countdownfivebyfive=object :CountDownTimer(5000,1000)
                {
                    override fun onTick(millisUnitilFinished: Long) {

                    }

                    override fun onFinish() {
                        for(i in fivebyfive)
                        {
                            i.setBackgroundColor(Color.BLACK)
                        }
                    }

                }.start()


            }

            if(randomnum == 4 && coloumran==5) {
                for (i in rows[3]) {
                    i.setVisibility(View.VISIBLE);


                }
                for (i in rows[4]) {
                    i.setVisibility(View.INVISIBLE);
                }
                //Coloums
                for (i in coloums[0]) {
                    i.setVisibility(View.VISIBLE);
                    b21.setVisibility(View.INVISIBLE);
                }
                for (i in coloums[1]) {
                    i.setVisibility(View.VISIBLE);
                    b22.setVisibility(View.INVISIBLE);
                }
                for (i in coloums[2]) {
                    i.setVisibility(View.VISIBLE);
                    b23.setVisibility(View.INVISIBLE);
                }
                for (i in coloums[3]) {
                    i.setVisibility(View.VISIBLE);
                    b24.setVisibility(View.INVISIBLE);
                }
                for (i in coloums[4]) {
                    i.setVisibility(View.VISIBLE);
                    b25.setVisibility(View.INVISIBLE);

                }
                buttoncolors.clear()
                var random=0 + r.nextInt(fourbyfive.size)
                while (buttoncolors.size<=5)
                {
                    if(random !in buttoncolors) {

                        buttoncolors.add(random)
                    }
                    else {
                        random=0 + r.nextInt(fourbyfive.size)
                    }
                }
                fourbyfive[buttoncolors[0]].setBackgroundColor(Color.GREEN)
                fourbyfive[buttoncolors[1]].setBackgroundColor(Color.GREEN)
                fourbyfive[buttoncolors[2]].setBackgroundColor(Color.GREEN)
                fourbyfive[buttoncolors[3]].setBackgroundColor(Color.GREEN)
                fourbyfive[buttoncolors[4]].setBackgroundColor(Color.GREEN)
                correctbuttons.add(fourbyfive[buttoncolors[0]])
                correctbuttons.add(fourbyfive[buttoncolors[1]])
                correctbuttons.add(fourbyfive[buttoncolors[2]])
                correctbuttons.add(fourbyfive[buttoncolors[3]])
                correctbuttons.add(fourbyfive[buttoncolors[4]])
                total += correctbuttons.size
                txt2.setText(""+total+"")
                var countdownfourbyfive=object :CountDownTimer(5000,1000)
                {
                    override fun onTick(millisUnitilFinished: Long) {

                    }

                    override fun onFinish() {
                        for(i in fourbyfive)
                        {
                            i.setBackgroundColor(Color.BLACK)
                        }
                    }

                }.start()

            }

            if(randomnum == 5 && coloumran==4) {

                for (i in rows[0]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in rows[1]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in rows[2]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in rows[3]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in rows[4]) {
                    i.setVisibility(View.VISIBLE);
                }
                //Coloums
                for (i in coloums[4]) {
                    i.setVisibility(View.INVISIBLE);
                }
                buttoncolors.clear()
                var random=0 + r.nextInt(fivebyfour.size)
                while (buttoncolors.size<=6)
                {
                    if(random !in buttoncolors) {

                        buttoncolors.add(random)
                    }
                    else {
                        random=0 + r.nextInt(fivebyfour.size)
                    }
                }
                fivebyfour[buttoncolors[0]].setBackgroundColor(Color.GREEN)
                fivebyfour[buttoncolors[1]].setBackgroundColor(Color.GREEN)
                fivebyfour[buttoncolors[2]].setBackgroundColor(Color.GREEN)
                fivebyfour[buttoncolors[3]].setBackgroundColor(Color.GREEN)
                fivebyfour[buttoncolors[4]].setBackgroundColor(Color.GREEN)
                fivebyfour[buttoncolors[5]].setBackgroundColor(Color.GREEN)
                correctbuttons.add(fivebyfour[buttoncolors[0]])
                correctbuttons.add(fivebyfour[buttoncolors[1]])
                correctbuttons.add(fivebyfour[buttoncolors[2]])
                correctbuttons.add(fivebyfour[buttoncolors[3]])
                correctbuttons.add(fivebyfour[buttoncolors[4]])
                correctbuttons.add(fivebyfour[buttoncolors[5]])
                total += correctbuttons.size
                txt2.setText(""+total+"")
                var countdownfivebyfour=object :CountDownTimer(5000,1000)
                {
                    override fun onTick(millisUnitilFinished: Long) {

                    }

                    override fun onFinish() {
                        for(i in fivebyfour)
                        {
                            i.setBackgroundColor(Color.BLACK)
                        }
                    }

                }.start()


            }

            if(randomnum == 5 && coloumran==3) {

                for (i in rows[0]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in rows[1]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in rows[2]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in rows[3]) {
                    i.setVisibility(View.VISIBLE);
                }
                for (i in rows[4]) {
                    i.setVisibility(View.VISIBLE);
                }
                //Coloums
                for (i in coloums[3]) {
                    i.setVisibility(View.INVISIBLE);
                }
                for (i in coloums[4]) {
                    i.setVisibility(View.INVISIBLE);
                }
                b4.setVisibility(View.INVISIBLE);
                b9.setVisibility(View.INVISIBLE);
                b14.setVisibility(View.INVISIBLE);
                b19.setVisibility(View.INVISIBLE);
                b24.setVisibility(View.INVISIBLE);
                b5.setVisibility(View.INVISIBLE);
                b10.setVisibility(View.INVISIBLE);
                b15.setVisibility(View.INVISIBLE);
                b20.setVisibility(View.INVISIBLE);
                b25.setVisibility(View.INVISIBLE);
                buttoncolors.clear()

                var random=0 + r.nextInt(fivebythree.size)
                while (buttoncolors.size<=6)
                {
                    if(random !in buttoncolors) {

                        buttoncolors.add(random)
                    }
                    else {
                        random=0 + r.nextInt(fivebythree.size)
                    }
                }
                fivebythree[buttoncolors[0]].setBackgroundColor(Color.GREEN)
                fivebythree[buttoncolors[1]].setBackgroundColor(Color.GREEN)
                fivebythree[buttoncolors[2]].setBackgroundColor(Color.GREEN)
                fivebythree[buttoncolors[3]].setBackgroundColor(Color.GREEN)
                fivebythree[buttoncolors[4]].setBackgroundColor(Color.GREEN)
                fivebythree[buttoncolors[5]].setBackgroundColor(Color.GREEN)
                correctbuttons.add(fivebythree[buttoncolors[0]])
                correctbuttons.add(fivebythree[buttoncolors[1]])
                correctbuttons.add(fivebythree[buttoncolors[2]])
                correctbuttons.add(fivebythree[buttoncolors[3]])
                correctbuttons.add(fivebythree[buttoncolors[4]])
                correctbuttons.add(fivebythree[buttoncolors[5]])
                total += correctbuttons.size
                txt2.setText(""+total+"")
                var countdownfivebythree=object :CountDownTimer(5000,1000)
                {
                    override fun onTick(millisUnitilFinished: Long) {

                    }

                    override fun onFinish() {
                        for(i in fivebythree)
                        {
                            i.setBackgroundColor(Color.BLACK)
                        }
                    }

                }.start()



            }

        }
        generateButton()
        fun buttoncheak(s:Button)
        {
            if(count<correctbuttons.size-1)
            {
                if(s in correctbuttons)
                {
                    s.setBackgroundColor(Color.GREEN)
                    count++
                    score++
                    txt1.setText(""+score+"")
                    button(s)
                }
                else
                {
                    s.setBackgroundColor(Color.RED)
                    count++
                    s.setText("X")
                    button(s)

                }
            }
            else
            {
                count=0
                generateButton()

            }
        }
        b1.setOnClickListener {
            buttoncheak(b1)
        }
        b2.setOnClickListener {
            buttoncheak(b2)
        }
        b3.setOnClickListener {
            buttoncheak(b3)
        }
        b4.setOnClickListener {
            buttoncheak(b4)
        }
        b5.setOnClickListener {
            buttoncheak(b5)
        }
        b6.setOnClickListener {
            buttoncheak(b6)
        }
        b7.setOnClickListener {
            buttoncheak(b7)
        }
        b8.setOnClickListener {
            buttoncheak(b8)
        }
        b9.setOnClickListener {
            buttoncheak(b9)
        }
        b10.setOnClickListener {
            buttoncheak(b10)
        }
        b11.setOnClickListener {
            buttoncheak(b11)
        }
        b12.setOnClickListener {
            buttoncheak(b12)

        }
        b13.setOnClickListener {
            buttoncheak(b13)
        }
        b14.setOnClickListener {
            buttoncheak(b14)
        }
        b15.setOnClickListener {
            buttoncheak(b15)
        }
        b16.setOnClickListener {
            buttoncheak(b16)
        }
        b17.setOnClickListener {
            buttoncheak(b17)
        }
        b18.setOnClickListener {
            buttoncheak(b18)
        }
        b19.setOnClickListener {
            buttoncheak(b19)
        }
        b20.setOnClickListener {
            buttoncheak(b20)
        }
        b21.setOnClickListener {
            buttoncheak(b21)
        }
        b22.setOnClickListener {
            buttoncheak(b22)
        }
        b23.setOnClickListener {
            buttoncheak(b23)
        }
        b24.setOnClickListener {
            buttoncheak(b24)
        }
        b25.setOnClickListener {
            buttoncheak(b25)
        }

    }

    fun button(d:Button)
    {
        var countdownfivebyfour=object :CountDownTimer(2000,1000)
        {
            override fun onTick(millisUnitilFinished: Long) {

            }

            override fun onFinish() {
                d.setBackgroundColor(Color.BLACK)
                d.setText("")

            }

        }.start()
    }






}

