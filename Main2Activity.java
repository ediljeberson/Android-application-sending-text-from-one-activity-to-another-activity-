package com.jeberson.message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView;

        textView = (TextView)findViewById(R.id.textView);

        textView.setText(getIntent().getStringExtra("mytext"));
    }
    }

