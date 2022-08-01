package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener() {
//            val toast=Toast.makeText(this,"dice rolled",Toast.LENGTH_SHORT)
//            toast.show()
//            val resultTextView:TextView=findViewById(R.id.textView)
//            resultTextView.text="6"
            rollDice()
        }

    }

    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage:ImageView=findViewById(R.id.imageView)
     when(diceRoll){
       1->diceImage.setImageResource(R.drawable.dice_1)
         2->diceImage.setImageResource(R.drawable.dice_2)
         3->diceImage.setImageResource(R.drawable.dice_3)
         4->diceImage.setImageResource(R.drawable.dice_4)
         5->diceImage.setImageResource(R.drawable.dice_5)
         6->diceImage.setImageResource(R.drawable.dice_6)
     }
    }
}

