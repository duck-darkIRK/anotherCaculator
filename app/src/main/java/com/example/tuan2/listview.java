package com.example.tuan2;

//import static android.os.Build.VERSION_CODES.R;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

//import com.example.appandroidinone.R;

public class listview extends AppCompatActivity {
    ListView listV;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        listV = findViewById(R.id.listview);

        String[] arr = new String[] {"ele1", "ele2", "ele3", "ele4", "ele5"};

        ArrayAdapter<String>
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);

        listV.setAdapter(adapter);
    }
}