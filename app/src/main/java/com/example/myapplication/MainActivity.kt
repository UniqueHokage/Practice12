package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import androidx.core.view.isInvisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onRadioButtonClicked(view: View){
        val image: ImageView = findViewById(R.id.imageView)
        val radiobutt: RadioButton = findViewById(R.id.radioButton)
        val radiobutt2: RadioButton = findViewById(R.id.radioButton2)

        if (radiobutt.isChecked){
            image.setImageResource(R.drawable.apple)
        }
        else if (radiobutt2.isChecked){
            image.setImageResource(R.drawable.grusha)
        }
        else{
            image.setImageResource(R.drawable.vinograd)
        }
    }

    fun onRadioCheckboxClicked(view: View){
        val image1: ImageView = findViewById(R.id.imageView2)
        val image2: ImageView = findViewById(R.id.imageView3)
        val image3: ImageView = findViewById(R.id.imageView4)

        val check1: CheckBox = findViewById(R.id.checkBox)
        val check2: CheckBox = findViewById(R.id.checkBox2)
        val check3: CheckBox = findViewById(R.id.checkBox3)

        if (check1.isChecked){
            image1.setImageResource(R.drawable.apple)
            image1.visibility = View.VISIBLE

        }
        else {
            image1.visibility = View.INVISIBLE
        }
        if (check2.isChecked){
            image2.setImageResource(R.drawable.grusha)
            image2.visibility = View.VISIBLE
        }
        else {image2.visibility = View.INVISIBLE}
        if (check3.isChecked){
            image3.setImageResource(R.drawable.vinograd)
            image3.visibility = View.VISIBLE
        }
        else {image3.visibility = View.INVISIBLE}
    }
}