package com.example.practical22

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View){
        when (view.id) {

            R.id.box_one_text ->  view.setBackgroundResource(R.drawable.download6)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.download3)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.textView ->  view.setBackgroundResource(R.drawable.download2)
            R.id.textView2 ->  view.setBackgroundResource(R.drawable.download1)
            R.id.textView3 ->  view.setBackgroundResource(R.drawable.download5)
            R.id.textView4 ->  view.setBackgroundResource(R.drawable.download)
            else -> view.setBackgroundResource(R.drawable.download6)

        }
    }

    private fun setListeners(){
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)
        val textView4 = findViewById<TextView>(R.id.textView4)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableView: List<View> =
            listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText,textView,textView2,textView3,textView4,rootConstraintLayout)

        for(item in clickableView){
            item.setOnClickListener{makeColored(it)}
        }
    }
}
