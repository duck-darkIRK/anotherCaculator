package com.example.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

//import com.example.appandroidinone.R;

public class MainActivity extends AppCompatActivity{
    EditText number1, number2;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.so_1);
        number2 = findViewById(R.id.so_2);
        submit = findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, result_layout.class);

                i.putExtra("so1", number1.getText().toString());
                i.putExtra("so2", number2.getText().toString());

                startActivity(i);
            }
        });

        number1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    resetNumber(number1);
                }
            }
        });

        number2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    resetNumber(number2);
                }
            }

        });


    }
    private void resetNumber(EditText data) {
        data.setText("");
    }
}