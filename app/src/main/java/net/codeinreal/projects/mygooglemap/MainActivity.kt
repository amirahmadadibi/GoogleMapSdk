package net.codeinreal.projects.mygooglemap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapFragment = MyMapFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.mainContainer, mapFragment)
            .commit()

    }
}