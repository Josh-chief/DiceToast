package com.example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    private var mCount = 0
//    private var mShowCount:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //mShowCount = findViewById<TextView>(R.id.show_count)
    }
    fun showToast(view: View) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
    }

    fun rollingDice(view: View) {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val resultTextView: TextView = findViewById(R.id.show_count)
        resultTextView.text = diceRoll.toString()
    }

//    fun countUp(view : View){
//        mCount++
//        if(mShowCount != null){
//            mShowCount !!.text = mCount.toString()
//        }

    }


class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
}
}