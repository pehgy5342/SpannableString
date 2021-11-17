package com.example.spannablestring

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.BackgroundColorSpan
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val lyrics1 = "太多人愛抱怨但hustle程度接近zero"
    val lyrics2 = "當個厭世少年沒用 只會更加emo"
    val lyrics3 = "沒啥成就不是因為個性平凡"
    val lyrics4 = "是你踏不出舒適圈 打破惡性循環"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        changeTextAppearance()

    }

    private fun changeTextAppearance() {
        val text = findViewById<TextView>(R.id.text)
        val spannable = SpannableStringBuilder()
        spannable.append(lyrics1)
        spannable.setSpan(BackgroundColorSpan(Color.YELLOW), 7, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        text.text = spannable
    }

}