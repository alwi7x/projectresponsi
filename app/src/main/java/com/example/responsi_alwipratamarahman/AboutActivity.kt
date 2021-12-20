package com.example.responsi_alwipratamarahman

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var imgbtnAbout: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        imgbtnAbout = findViewById(R.id.img_btn_about)
        imgbtnAbout.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.img_btn_about -> {
                val intentAbout = Intent(this@AboutActivity, MainActivity::class.java)
                startActivity(intentAbout)
            }
        }
    }
}