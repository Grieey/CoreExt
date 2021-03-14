package com.github.grieey.coreext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.PARENT_ID
import com.github.grieey.core_ext.applyParams

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val text = findViewById<TextView>(R.id.test)
    text.applyParams<ConstraintLayout.LayoutParams> {
      bottomToBottom = PARENT_ID
    }
  }
}