package com.jeberson.message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    String editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();


    }

    public void addListenerOnButton() {

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                EditText editText = (EditText) findViewById(R.id.editText);
                String text = editText.getText().toString();

                Intent myIntent = new Intent(view.getContext(), Main2Activity.class);
                myIntent.putExtra("mytext", text);
                startActivity(myIntent);

            }
        });
    }
}

