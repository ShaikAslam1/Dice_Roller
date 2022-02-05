package com.aslam.diceroller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            // Displaying toast message on button click
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            rollDice()
        }

        // resetting the dice values
        val resetDiceButton: Button = findViewById(R.id.button2)

        resetDiceButton.setOnClickListener {
            // Display toast message
            Toast.makeText(this, "Dice got reset!", Toast.LENGTH_SHORT).show()
            resetDice()
        }

        // second screen dice game with graphics
        val secondScreen: Button = findViewById(R.id.button3)

        secondScreen.setOnClickListener { navigateToSecondScreen() }

    }

    private fun navigateToSecondScreen() {
        val intent = Intent(this, DiceActivity::class.java)
        startActivity(intent)
    }

    private fun resetDice() {
        val oneTo20 = "1to20"
        val oneToSix = "1to6"

        val text1: TextView = findViewById(R.id.textView)
        val text2: TextView = findViewById(R.id.textView2)

        text1.text = oneToSix
        text2.text = oneTo20
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice Object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

        // second dice
        val dice2 = Dice(20)
        val diceRoll2 = dice2.roll()

        val secondDice: TextView = findViewById(R.id.textView2)
        secondDice.text = diceRoll2.toString()
    }
}