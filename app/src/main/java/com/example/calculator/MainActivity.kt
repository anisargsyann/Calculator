package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var userIsTypingFirstNumber = true
        var userIsTypingSecondNumber = false
        var addition = false
        var subtraction = false
        var multiplication = false
        var division = false
        var percent1 = false
        var firstNumber = 0.0
        var secondNumber: Double

        // numbers

        digit_0.setOnClickListener {
            if(userIsTypingFirstNumber) {
                if (answer.text.toString() == "0") {
                    answer.text = digit_0.text.toString()
                } else {
                    val numSting = answer.text.toString() + digit_0.text.toString()
                    answer.text = numSting
                }
            } else if(userIsTypingSecondNumber) {
                val numSting = answer.text.toString() + digit_0.text.toString()
                answer.text = numSting
            }
        }
        digit_1.setOnClickListener {
            if(userIsTypingFirstNumber) {
                if (answer.text.toString() == "0") {
                    answer.text = digit_1.text.toString()
                } else {
                    val numSting = answer.text.toString() + digit_1.text.toString()
                    answer.text = numSting
                }
            }else if(userIsTypingSecondNumber) {
                val numSting = answer.text.toString() + digit_1.text.toString()
                answer.text = numSting
            }
        }
        digit_2.setOnClickListener {
            if(userIsTypingFirstNumber) {
                if (answer.text.toString() == "0") {
                    answer.text = digit_2.text.toString()
                } else {
                    val numSting = answer.text.toString() + digit_2.text.toString()
                    answer.text = numSting
                }
            }else if(userIsTypingSecondNumber) {
                val numSting = answer.text.toString() + digit_2.text.toString()
                answer.text = numSting
            }
        }
        digit_3.setOnClickListener {
            if(userIsTypingFirstNumber) {
                if (answer.text.toString() == "0") {
                    answer.text = digit_3.text.toString()
                } else {
                    val numSting = answer.text.toString() + digit_3.text.toString()
                    answer.text = numSting
                }
            }else if(userIsTypingSecondNumber) {
                val numSting = answer.text.toString() + digit_3.text.toString()
                answer.text = numSting
            }
        }
        digit_4.setOnClickListener {
            if(userIsTypingFirstNumber) {
                if (answer.text.toString() == "0") {
                    answer.text = digit_4.text.toString()
                } else {
                    val numSting = answer.text.toString() + digit_4.text.toString()
                    answer.text = numSting
                }
            }else if(userIsTypingSecondNumber) {
                val numSting = answer.text.toString() + digit_4.text.toString()
                answer.text = numSting
            }
        }
        digit_5.setOnClickListener {
            if(userIsTypingFirstNumber) {
                if (answer.text.toString() == "0") {
                    answer.text = digit_5.text.toString()
                } else {
                    val numSting = answer.text.toString() + digit_5.text.toString()
                    answer.text = numSting
                }
            }else if(userIsTypingSecondNumber) {
                val numSting = answer.text.toString() + digit_5.text.toString()
                answer.text = numSting
            }
        }
        digit_6.setOnClickListener {
            if(userIsTypingFirstNumber) {
                if (answer.text.toString() == "0") {
                    answer.text = digit_6.text.toString()
                } else {
                    val numSting = answer.text.toString() + digit_6.text.toString()
                    answer.text = numSting
                }
            }else if(userIsTypingSecondNumber) {
                val numSting = answer.text.toString() + digit_6.text.toString()
                answer.text = numSting
            }
        }
        digit_7.setOnClickListener {
            if(userIsTypingFirstNumber) {
                if (answer.text.toString() == "0") {
                    answer.text = digit_7.text.toString()
                } else {
                    val numSting = answer.text.toString() + digit_7.text.toString()
                    answer.text = numSting
                }
            }else if(userIsTypingSecondNumber) {
                val numSting = answer.text.toString() + digit_7.text.toString()
                answer.text = numSting
            }
        }
        digit_8.setOnClickListener {
            if(userIsTypingFirstNumber) {
                if (answer.text.toString() == "0") {
                    answer.text = digit_8.text.toString()
                } else {
                    val numSting = answer.text.toString() + digit_8.text.toString()
                    answer.text = numSting
                }
            }else if(userIsTypingSecondNumber) {
                val numSting = answer.text.toString() + digit_8.text.toString()
                answer.text = numSting
            }
        }
        digit_9.setOnClickListener {
            if(userIsTypingFirstNumber) {
                if (answer.text.toString() == "0") {
                    answer.text = digit_9.text.toString()
                } else {
                    val numSting = answer.text.toString() + digit_9.text.toString()
                    answer.text = numSting
                }
            }else if(userIsTypingSecondNumber) {
                val numSting = answer.text.toString() + digit_9.text.toString()
                answer.text = numSting
            }
        }
        dot.setOnClickListener {
            if(userIsTypingFirstNumber) {
                    val numSting = answer.text.toString() + dot.text.toString()
                    answer.text = numSting
            } else if(userIsTypingSecondNumber) {
                val numSting = answer.text.toString() + dot.text.toString()
                answer.text = numSting
            }
        }

        //operations

        plus.setOnClickListener {
            firstNumber = answer.text.toString().toDouble()
            answer.text = ""
            userIsTypingFirstNumber = false
            userIsTypingSecondNumber = true
            addition = true
        }
        minus.setOnClickListener {
            firstNumber = answer.text.toString().toDouble()
            answer.text = ""
            userIsTypingFirstNumber = false
            userIsTypingSecondNumber = true
            subtraction = true
        }
        div.setOnClickListener {
            firstNumber = answer.text.toString().toDouble()
            answer.text = ""
            userIsTypingFirstNumber = false
            userIsTypingSecondNumber = true
            division = true
        }
        mult.setOnClickListener {
            firstNumber = answer.text.toString().toDouble()
            answer.text = ""
            userIsTypingFirstNumber = false
            userIsTypingSecondNumber = true
            multiplication = true
        }
        div.setOnClickListener {
            firstNumber = answer.text.toString().toDouble()
            answer.text = ""
            userIsTypingFirstNumber = false
            userIsTypingSecondNumber = true
            division = true
        }
        percent.setOnClickListener {
            firstNumber = answer.text.toString().toDouble()
            answer.text = ""
            userIsTypingFirstNumber = false
            userIsTypingSecondNumber = true
            percent1 = true
        }
        pos_neg.setOnClickListener {
            firstNumber = answer.text.toString().toDouble() * (-1)
            if(!(answer.text.toString().contains("-"))) {
                answer.text = "-" + answer.text.toString()
            }
        }

        equals.setOnClickListener {
            secondNumber = answer.text.toString().toDouble()
            when {
                addition -> {
                    val result = firstNumber + secondNumber
                    answer.text = result.toString()
                }
                subtraction -> {
                    val result = firstNumber - secondNumber
                    answer.text = result.toString()
                }
                multiplication -> {
                    val result = firstNumber * secondNumber
                    answer.text = result.toString()
                }
                division -> {
                    val result = firstNumber / secondNumber
                    answer.text = result.toString()
                }
                percent1 -> {
                    val result = (firstNumber * secondNumber) / 100
                    answer.text = result.toString()
                }
            }
        }
        clear.setOnClickListener {
            answer.text = "0"
            userIsTypingFirstNumber = true
            userIsTypingSecondNumber = false
            addition = false
            subtraction = false
            multiplication = false
            division = false
            percent1 = false
        }
    }
}