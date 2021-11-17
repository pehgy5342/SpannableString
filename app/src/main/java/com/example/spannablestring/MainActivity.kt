package com.example.spannablestring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        val lyrics2 = "當個厭世少年沒用 只會更加emo"
//        val lyrics3 = "沒啥成就不是因為個性平凡"
//        val lyrics4 = "是你踏不出舒適圈 打破惡性循環"

        changeTextAppearance()

    }

    private fun changeTextAppearance(){
        val lyrics1 = "太多人愛抱怨但hustle程度接近zero"
        val spannable = SpannableStringBuilder(lyrics1)





    }

}