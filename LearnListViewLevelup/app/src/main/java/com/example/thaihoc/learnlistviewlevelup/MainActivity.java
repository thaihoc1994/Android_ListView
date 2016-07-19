package com.example.thaihoc.learnlistviewlevelup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.thaihoc.adapter.DanhBaAdapter;
import com.example.thaihoc.model.DanhBa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvDanhBa;
    ArrayList<DanhBa> dsDanhBa;
    DanhBaAdapter danhBaAdapter;//do da ke thua tu adapter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        addEvent();
    }

    private void addEvent() {
    }

    private void addControl() {
        lvDanhBa = (ListView) findViewById(R.id.lvDanhBa);
        dsDanhBa = new ArrayList<DanhBa>();
        dsDanhBa.add(new DanhBa(1,"Ha Nguyen Thai Hoc","01223410987"));
        dsDanhBa.add(new DanhBa(2,"Nguyen Thanh Nhan","01225321987"));
        dsDanhBa.add(new DanhBa(3,"Hoang ABC","0129810437"));
        //lay thong tin tu main, đẩy vào danhbaAdapter da bao gom hàm xử lý
        danhBaAdapter = new DanhBaAdapter(MainActivity.this,R.layout.item,dsDanhBa);
        lvDanhBa.setAdapter(danhBaAdapter);//đưa ra lại list view chính
    }
}
