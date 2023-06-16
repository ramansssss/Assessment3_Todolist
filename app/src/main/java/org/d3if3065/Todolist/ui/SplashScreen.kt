package org.d3if3065.Todolist.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import org.d3if3065.Todolist.MainActivity
import org.d3if3065.Todolist.R

class SplashScreen : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long = 3000 //delay 3 detik

    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}