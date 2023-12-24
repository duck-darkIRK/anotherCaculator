package com.example.tuan2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

//import com.example.appandroidinone.R;
public class result_layout extends AppCompatActivity  {
    TextView so_thu_1, so_thu_2, ket_qua, dau_bang, dau_cong;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.layout_result);

        ket_qua = findViewById(R.id.ket_qua);
        so_thu_1 = findViewById(R.id.so_thu_1);
        so_thu_2 = findViewById(R.id.so_thu_2);
        dau_bang = findViewById(R.id.dau_bang);
        dau_cong = findViewById(R.id.dau_cong);

        Intent num = getIntent();

        float so1 = Float.parseFloat(num.getExtras().getString("so1"));
        float so2 = Float.parseFloat(num.getExtras().getString("so2"));

        ket_qua.setText(String.valueOf(so1 +  so2));
        dau_bang.setText("=");
        dau_cong.setText("+");
        so_thu_1.setText(String.valueOf(so1));
        so_thu_2.setText(String.valueOf(so2));
    }
}
