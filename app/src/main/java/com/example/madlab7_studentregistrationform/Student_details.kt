package com.example.madlab7_studentregistrationform
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StudentsDetails : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_details)

        val welcome = findViewById<TextView>(R.id.welcome)
        val studentName = intent.getStringExtra("studentName")

        welcome.text = "Welcome, $studentName!"
    }
}
