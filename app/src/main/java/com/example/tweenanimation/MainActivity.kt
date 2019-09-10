package com.example.tweenanimation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.view.View
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }





    fun clockwise(view: View) {
        val image = findViewById(R.id.imageView) as ImageView
        val animation = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.zoomin
        )
        image.startAnimation(animation)
    }





    fun zoom(view: View) {
        val image = findViewById(R.id.imageView) as ImageView
        val animation1 = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.clockwise
        )
        image.startAnimation(animation1)
    }

    fun fade(view: View) {
        val image = findViewById(R.id.imageView) as ImageView
        val animation1 = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade
        )
        image.startAnimation(animation1)
    }

    fun blink(view: View) {
        val image = findViewById(R.id.imageView) as ImageView
        val animation1 = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.blink
        )
        image.startAnimation(animation1)
    }

    fun move(view: View) {
        val image = findViewById(R.id.imageView) as ImageView
        val animation1 = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
        image.startAnimation(animation1)
    }

    fun slide(view: View) {
        val image = findViewById(R.id.imageView) as ImageView
        val animation1 = AnimationUtils.loadAnimation(applicationContext, R.anim.slide)
        image.startAnimation(animation1)
    }
}
