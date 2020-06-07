package saulmm.coordinatorexamples.custom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_custom.toolbar
import saulmm.coordinatorexamples.R

class CustomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom)
        setSupportActionBar(toolbar)
    }
}