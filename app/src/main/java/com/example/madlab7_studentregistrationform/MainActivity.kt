package com.example.madlab7_studentregistrationform
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_form)

        val name = findViewById<EditText>(R.id.name)
        val usn = findViewById<EditText>(R.id.USN)
        val checkbox1 = findViewById<CheckBox>(R.id.checkbox1)
        val checkbox2 = findViewById<CheckBox>(R.id.checkbox2)
        val submit = findViewById<Button>(R.id.submit)

        submit.setOnClickListener {

            val studentName = name.text.toString().trim()
            val studentUSN = usn.text.toString().trim()

            if (studentName.isEmpty() || studentUSN.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please enter all student details",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (!checkbox1.isChecked || !checkbox2.isChecked) {
                Toast.makeText(
                    this,
                    "Please select both checkboxes",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val intent = Intent(this, StudentsDetails::class.java)
                intent.putExtra("studentName", studentName)
                startActivity(intent)
            }
        }
    }
}
