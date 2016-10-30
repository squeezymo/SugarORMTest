package bkfon.sugartest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import model.JavaUser
import model.KotlinUser1
import model.KotlinUser2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        KotlinUser1().save()
        KotlinUser2().save()
        JavaUser().save()
    }
}