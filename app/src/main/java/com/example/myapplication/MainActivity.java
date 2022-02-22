package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> myList;
    private ArrayAdapter<String> adapter;
    private ListView list;
    private Button btnNhap;
    private TextView tvNhap,tvKetQua;
    private EditText nhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nhap = (EditText) findViewById(R.id.nhap);
        myList = new ArrayList<String>();
        list = (ListView)findViewById(R.id.list);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myList);
        list.setAdapter(adapter);
        btnNhap = (Button)findViewById(R.id.bt_nhap);

        tvKetQua = (TextView) findViewById(R.id.tvKetQua);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String msg = "position: " + (position + 1);
                msg += "; value: " + parent.getItemAtPosition(position).toString();
                tvKetQua.setText(msg);
            }
        });
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myList.add(nhap.getText() + "");
                adapter.notifyDataSetChanged();
            }
        });

    }
}