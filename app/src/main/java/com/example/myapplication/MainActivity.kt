package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.EditText;

class MainActivity : AppCompatActivity() {
    private EditText ed_name;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}