package com.example.tuan2_bai3;

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
        EditText nhap = (EditText) findViewById(R.id.nhap);
        Button chuyendoi = (Button) findViewById(R.id.chuyendoi);

        chuyendoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int can,chi;
                String am;

                Integer nhapnam = Integer.parseInt(nhap.getText() + "");
                String can1=null;
                String chi1=null;

                switch(nhapnam%10){
                    case 0:{
                        can1 = "Canh";
                        break;
                    }
                    case 1:{
                        can1 = "Dậu";
                        break;
                    }
                    case 2:{
                        can1 = "Nhâm";
                        break;
                    }
                    case 3:{
                        can1 = "Quý";
                        break;
                    }
                    case 4:{
                        can1 = "Giáp";
                        break;
                    }
                    case 5:{
                        can1 = "Ất";
                        break;
                    }
                    case 6:{
                        can1 = "Bính";
                        break;
                    }
                    case 7:{
                        can1 = "Đinh";
                        break;
                    }
                    case 8:{
                        can1 = "Mậu";
                        break;
                    }
                    case 9:{
                        can1 = "Kỷ";
                        break;
                    }

                }
                switch(nhapnam%12){
                    case 0:{
                        chi1 = "Thân";
                        break;
                    }
                    case 1:{
                        chi1 = "Dậu";
                        break;
                    }
                    case 2:{
                        chi1 = "Tuất";
                        break;
                    }
                    case 3:{
                        chi1 = "Hợi";
                        break;
                    }
                    case 4:{
                        chi1 = "Tý";
                        break;
                    }
                    case 5:{
                        chi1 = "Sửu";
                        break;
                    }
                    case 6:{
                        chi1 = "Dần";
                        break;
                    }
                    case 7:{
                        chi1 = "Mẹo";
                        break;
                    }
                    case 8:{
                        chi1 = "Thìn";
                        break;
                    }
                    case 9:{
                        chi1 = "Tị";
                        break;
                    }
                    case 10:{
                        chi1 = "Ngọ";
                        break;
                    }
                    case 11:{
                        chi1 = "Mùi";
                        break;
                    }

                }

                am = can1 + " " + chi1;
                kq.setText(am);
            }
        });
    }
}