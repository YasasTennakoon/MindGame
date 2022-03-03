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
        var count=0

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
        var buttoncolors= mutableListOf<Int>()
        var correctbuttons= mutableListOf<Button>()
        var r=Random()

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
            //buttoncolors.clear()
            correctbuttons.clear()
            txt1.setText(" ")
            txt2.setText(" ")
            var randomnum = 3 + r.nextInt(3)
            var coloumran=3 + r.nextInt(3)
            txt1.setText(" "+correctbuttons.size+" ")
           // txt2.setText(" "+coloumran+" ")

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
        b1.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b1 in correctbuttons)
                {
                    b1.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b1.setBackgroundColor(Color.RED)
                    b1.setText("X")
                }
            }
            else
            {
                count=0
                generateButton()
            }

        }
        b2.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b2 in correctbuttons)
                {
                    b2.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b2.setBackgroundColor(Color.RED)
                    b2.setText("X")
                }
            }
            else
            {
                count=0
                generateButton()
            }

        }
        b3.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b3 in correctbuttons)
                {
                    b3.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b3.setBackgroundColor(Color.RED)
                    b3.setText("X")
                }
            }
            else
            {
                count=0
                generateButton()
            }

        }
        b4.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b4 in correctbuttons)
                {
                    b4.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b4.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }

        }
        b5.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b5 in correctbuttons)
                {
                    b5.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b5.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b6.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b6 in correctbuttons)
                {
                    b6.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b6.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b7.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b7 in correctbuttons)
                {
                    b7.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b7.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b8.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b8 in correctbuttons)
                {
                    b8.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b8.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b9.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b9 in correctbuttons)
                {
                    b9.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b9.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b10.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b10 in correctbuttons)
                {
                    b10.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b10.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b11.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b11 in correctbuttons)
                {
                    b11.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b11.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b12.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b12 in correctbuttons)
                {
                    b12.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b12.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b13.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b13 in correctbuttons)
                {
                    b13.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b13.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b14.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b14 in correctbuttons)
                {
                    b14.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b14.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b15.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b15 in correctbuttons)
                {
                    b15.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b15.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b16.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b16 in correctbuttons)
                {
                    b16.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b16.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b17.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b17 in correctbuttons)
                {
                    b17.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b17.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b18.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b18 in correctbuttons)
                {
                    b18.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b18.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b19.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b19 in correctbuttons)
                {
                    b19.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b19.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b20.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b20 in correctbuttons)
                {
                    b20.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b20.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b21.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b21 in correctbuttons)
                {
                    b21.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b21.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b22.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b22 in correctbuttons)
                {
                    b22.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b22.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b23.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b23 in correctbuttons)
                {
                    b23.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b23.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b24.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b24 in correctbuttons)
                {
                    b24.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b24.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }
        b25.setOnClickListener {
            if(count<=correctbuttons.size-2)
            {
                if(b25 in correctbuttons)
                {
                    b25.setBackgroundColor(Color.GREEN)
                    count++
                }
                else
                {
                    b25.setBackgroundColor(Color.RED)
                }
            }
            else
            {
                count=0
                generateButton()
            }
        }





    }


}

