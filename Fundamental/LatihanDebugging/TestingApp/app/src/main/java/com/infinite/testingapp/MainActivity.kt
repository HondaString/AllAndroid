package com.infinite.testingapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.ArrayList

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnSetValue: Button
    private lateinit var tvText: TextView

    private var names = ArrayList<String>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSetValue = findViewById(R.id.btn_set_value)
        tvText = findViewById(R.id.tv_text)

        btnSetValue.setOnClickListener(this)

        names.add("Andika Kurnia Sandi Yuda")
        names.add("Honda")
        names.add("String")
    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_set_value) {
            Log.d("MainActivity", names.toString())
            val name = StringBuilder()
//            for (i in 0..3) {
            for (i in 0..2) {
                name.append(names[i]).append("\n")
            }
            tvText.text = name.toString()
        }
    }
}
