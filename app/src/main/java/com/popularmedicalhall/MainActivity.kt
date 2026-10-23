package com.popularmedicalhall

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(24, 24, 24, 24)
            setBackgroundColor(Color.rgb(240, 247, 255))
        }

        val title = TextView(this).apply {
            text = "জনপ্রিয় মেডিকেল হল"
            textSize = 28f
            setTextColor(Color.rgb(20, 75, 150))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "\nফার্মেসি ম্যানেজমেন্ট অ্যাপ\n\nওষুধের হিসাব সহজেই রাখুন"
            textSize = 18f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
        }

        layout.addView(title, ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        layout.addView(subtitle, ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)

        setContentView(layout)
    }
}
