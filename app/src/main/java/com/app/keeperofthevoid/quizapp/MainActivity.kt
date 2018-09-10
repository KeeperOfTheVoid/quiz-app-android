package com.app.keeperofthevoid.quizapp

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ConstraintLayout>(R.id.main_activity).setOnClickListener { startQuiz() }
    }

    private fun startQuiz() {

        // Create an Intent to start the second activity
        val quizIntent = Intent(this, ScoreActivity::class.java)
        startActivity(quizIntent)
    }
}