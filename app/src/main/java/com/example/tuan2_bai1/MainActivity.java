package com.example.tuan2_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView kq;
        EditText a, b;
        Button tong,hieu,tich,thuong,uocchung,thoat;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kq = this.findViewById(R.id.ketqua);
        a = this.findViewById(R.id.nhapA);
        b = this.findViewById(R.id.nhapB);
        tong = this.findViewById(R.id.tong);
        hieu = this.findViewById(R.id.hieu);
        tich = this.findViewById(R.id.tich);
        thuong = this.findViewById(R.id.thuong);
        uocchung = this.findViewById(R.id.uocchung);
        thoat = this.findViewById(R.id.thoat);
        tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tong;
                String textA = a.getText().toString();
                double soA = Double.parseDouble(textA);
                String textB = b.getText().toString();
                double soB = Double.parseDouble(textB);

                tong = soA + soB;
                kq.setText("Ket qua: " + tong);
            }
        });

        hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double hieu;
                String textA = a.getText().toString();
                double soA = Double.parseDouble(textA);
                String textB = b.getText().toString();
                double soB = Double.parseDouble(textB);

                hieu = soA - soB;
                kq.setText("Ket qua: " + hieu);
            }
        });
        tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tich;
                String textA = a.getText().toString();
                double soA = Double.parseDouble(textA);
                String textB = b.getText().toString();
                double soB = Double.parseDouble(textB);

                tich = soA * soB;
                kq.setText("Ket qua: " + tich);
            }
        });
        thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double thuong;
                String textA = a.getText().toString();
                double soA = Double.parseDouble(textA);
                String textB = b.getText().toString();
                double soB = Double.parseDouble(textB);

                thuong = soA / soB;
                kq.setText("Ket qua: " + thuong);
            }
        });

        uocchung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double uoc;
                String textA= a.getText().toString();
                double soA = Double.parseDouble(textA);
                String textB = b.getText().toString();
                double soB = Double.parseDouble(textB);

                if(soA==0||soB==0){
                    uoc=soA+soB;
                }
                while(soA!=soB){
                    if(soA>soB){
                        soA-=soB;
                    }
                    else{
                        soB-=soA;
                    }
                    uoc=soA;
                    kq.setText("Ket qua: " + uoc);
                }
            }
        });

        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}