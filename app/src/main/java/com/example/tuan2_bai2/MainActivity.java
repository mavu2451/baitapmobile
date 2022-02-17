package com.example.tuan2_bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView kq = (TextView) findViewById(R.id.kq);
        EditText nhapC = (EditText) findViewById(R.id.nhapC);
        EditText nhapF = (EditText) findViewById(R.id.nhapF);
        Button conC = (Button) findViewById(R.id.conC);
        Button conF = (Button) findViewById(R.id.conF);
        Button clear = (Button) findViewById(R.id.clear);
        conC.setOnClickListener(new View.OnClickListener() {
            @Override
            //C sang F
            public void onClick(View view) {
                double tong;
                int c = Integer.parseInt(nhapC.getText() + "");
                tong = c * 9 / 5 + 32;
                kq.setText("Ket qua" + tong + "do F");

            }
        });

        conF.setOnClickListener(new View.OnClickListener() {
            @Override
            //F sang C
            public void onClick(View view) {
                double tong;
                int f = Integer.parseInt(nhapF.getText() + "");
                tong = (f-32)*5/9;
                kq.setText("Ket qua" +  tong +"do C");

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nhapC.setText("");
                nhapF.setText("");
            }
        });
    }
}