package com.aslam.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
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

//      val diceImage: ImageView = findViewById(R.id.imageView)
        val diceBtn: Button = findViewById(R.id.button4)

        diceBtn.setOnClickListener { rollDice() }

    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableResource = when(diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()
        Toast.makeText(this, "Dice Rolled: $diceRoll", Toast.LENGTH_SHORT).show()
    }
}