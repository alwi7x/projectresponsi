package com.example.responsi_alwipratamarahman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnAbout : View
    private lateinit var btnEducation : View
    private lateinit var btnExperience : View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAbout = findViewById(R.id.btn_about)
        btnAbout.setOnClickListener (this)

        btnEducation = findViewById(R.id.btn_edu)
        btnEducation.setOnClickListener (this)

        btnExperience = findViewById(R.id.btn_exp)
        btnExperience.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_about ->{
                val intentAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intentAbout)
            }
            R.id.btn_edu ->{
                val intentEdu = Intent(this@MainActivity, EducationActivity::class.java)
                startActivity(intentEdu)
            }
            R.id.btn_exp ->{
                val intentExp = Intent(this@MainActivity, ExperienceActivity::class.java)
                startActivity(intentExp)
            }
        }
    }
}