package com.example.responsi_alwipratamarahman

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class EducationActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var imgbtnEdu: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        imgbtnEdu = findViewById(R.id.img_btn_edu)
        imgbtnEdu.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.img_btn_edu -> {
                val intentEdu = Intent(this@EducationActivity, MainActivity::class.java)
                startActivity(intentEdu)
            }
        }
    }
}