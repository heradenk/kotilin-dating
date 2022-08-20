package com.yoo.fello_test

import android.content.Intent
<<<<<<< HEAD
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.yoo.fello_test.auth.IntroActivity
import com.yoo.fello_test.utils.FirebaseAuthUtils

class SplashActivity : AppCompatActivity() {

    private val TAG = "SplashActivity"

//    private val auth = FirebaseAuth.getInstance()

=======
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.yoo.fello_test.auth.IntroActivity

class SplashActivity : AppCompatActivity() {
>>>>>>> 0d2615b6b18e2c69c22241070cf85c0f3cdd1c54
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

<<<<<<< HEAD
//        val uid =  auth.currentUser?.uid.toString()
        val uid = FirebaseAuthUtils.getUid()
        if (uid == "null") {

            Handler().postDelayed({
                val intent = Intent(this, IntroActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                startActivity(intent)
                finish()
            },3000)

        }   else {

            Handler().postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                startActivity(intent)
                finish()
            },3000)


        }


=======
        Handler().postDelayed({
            val intent = Intent(this, IntroActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        },3000)
>>>>>>> 0d2615b6b18e2c69c22241070cf85c0f3cdd1c54


    }

}