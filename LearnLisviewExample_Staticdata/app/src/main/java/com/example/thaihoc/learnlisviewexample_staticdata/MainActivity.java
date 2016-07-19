package com.example.thaihoc.learnlisviewexample_staticdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //data store
    String []arrThu;
    //=>dua vao adapter
    ArrayAdapter<String> adapterThu;
    //=> dua vao view
    ListView lvThu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addControl();
        addEnvent();
    }

    private void addEnvent() {
        lvThu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //postion in view
                Toast.makeText(MainActivity.this,"Bạn chọn " + arrThu[position],Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addControl() {
        arrThu = getResources().getStringArray(R.array.arrayThu);//lay tai nguyen cua he thong
        adapterThu = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrThu);

        lvThu = (ListView) findViewById(R.id.lvThu);
        lvThu.setAdapter(adapterThu);
    }
}
