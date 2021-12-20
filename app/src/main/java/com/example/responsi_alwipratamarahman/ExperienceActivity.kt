package com.example.responsi_alwipratamarahman

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ExperienceActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var imgbtnExp: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experience)

        imgbtnExp = findViewById(R.id.img_btn_exp)
        imgbtnExp.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.img_btn_exp -> {
                val intentExp = Intent(this@ExperienceActivity, MainActivity::class.java)
                startActivity(intentExp)
            }
        }
    }
}