package com.example.macbookair.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.edittext);
        Button button = findViewById(R.id.go);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        i.putExtra("key", editText.getText().toString());
        startActivity(i);
    }
}
