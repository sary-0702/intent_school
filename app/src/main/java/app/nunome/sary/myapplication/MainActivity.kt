package app.nunome.sary.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quizIntent: Intent = Intent(this, QuizActivity::class.java)
        val startButton : Button = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            startActivity(quizIntent)
        }
    }
}