package com.example.thaihoc.learnbasiclistview_dynamicdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrTen;
    ArrayAdapter<String> adapterTen;
    ListView lvTen;
    
    Button btnLuu;
    EditText txtTen;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addControl();
        addEvent();
    }

    private void addEvent() {
        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyLuu();
            }
        });
    }

    private void xuLyLuu() {
        String ten = txtTen.getText().toString();
        arrTen.add(ten);

        //thuc thi adapter
        adapterTen.notifyDataSetChanged();//change theo thoi gian thuc(ra lenh lai cho list view cap nhat giao dien)

        txtTen.setText("");
        txtTen.requestFocus();
    }

    private void addControl() {
        arrTen = new ArrayList<String>();
        adapterTen = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrTen);
        lvTen = (ListView) findViewById(R.id.lvTen);
        lvTen.setAdapter(adapterTen);

        btnLuu = (Button) findViewById(R.id.btnLuu);
        txtTen = (EditText) findViewById(R.id.txtTen);
    }
}
