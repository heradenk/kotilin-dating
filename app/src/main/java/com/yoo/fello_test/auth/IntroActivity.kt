package com.yoo.fello_test.auth

<<<<<<< HEAD
<<<<<<< HEAD
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.yoo.fello_test.R


class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)


        val loginBtn : Button = findViewById(R.id.loginBtn)
        loginBtn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }

        val joinBtn = findViewById<Button>(R.id.joinBtn)
        joinBtn.setOnClickListener {

            val intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)

        }

=======
=======
>>>>>>> 0d2615b6b18e2c69c22241070cf85c0f3cdd1c54
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yoo.fello_test.R

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
<<<<<<< HEAD
>>>>>>> 0d2615b6b18e2c69c22241070cf85c0f3cdd1c54
=======
>>>>>>> 0d2615b6b18e2c69c22241070cf85c0f3cdd1c54
    }
}