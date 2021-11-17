package com.example.spannablestring

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.BackgroundColorSpan
import android.text.style.TextAppearanceSpan
import android.text.style.URLSpan
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTextStyle()
        setTextLink()

    }

    private fun setTextStyle() {
        val tv_string = findViewById<TextView>(R.id.string)
        val spannable = SpannableStringBuilder(getString(R.string.string))

        spannable.setSpan(BackgroundColorSpan(Color.BLUE), 4, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannable.setSpan(
            TextAppearanceSpan(this, R.style.CustomTextStyle), 4, 10, Spanned.SPAN_INCLUSIVE_EXCLUSIVE
        )
        tv_string.text = spannable
        tv_string.movementMethod = LinkMovementMethod.getInstance()
    }

    private fun setTextLink() {
        val tv_link = findViewById<TextView>(R.id.link)
        val spannable = SpannableStringBuilder(getString(R.string.github))
        spannable.setSpan(URLSpan("https://github.com/"), 4, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_link.text = spannable
        tv_link.movementMethod = LinkMovementMethod.getInstance()


    }

}