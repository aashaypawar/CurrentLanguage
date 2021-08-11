package org.geeksforgeeks.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mButton = findViewById<Button>(R.id.btn)
        mButton.setOnClickListener {
            Toast.makeText(applicationContext, Locale.getDefault().language.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}