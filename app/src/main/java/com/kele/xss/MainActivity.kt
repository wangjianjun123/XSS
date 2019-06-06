package com.kele.xss

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRecord.setOnClickListener {
            Toast.makeText(this@MainActivity, "成功", Toast.LENGTH_SHORT).show()
        }
    }
}
