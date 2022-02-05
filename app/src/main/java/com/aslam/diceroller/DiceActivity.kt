package com.aslam.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)

        val actionBar = supportActionBar

//        if(actionBar != null) {
//            actionBar.title = "Dice graphical game"
//        }

        actionBar!!.title = "Dice graphical game"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}