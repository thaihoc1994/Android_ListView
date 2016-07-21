package listview.learn.thaihoc.listviewnangcaobt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import listview.learn.thaihoc.adapter.TiGiaAdapter;
import listview.learn.thaihoc.model.TiGia;

public class MainActivity extends AppCompatActivity {

    ListView lvTiGia;
    ArrayList<TiGia> dsTiGia;
    TiGiaAdapter tiGiaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addConTrol();
        addEvent();
    }

    private void addEvent() {

    }

    private void addConTrol() {
        lvTiGia = (ListView)findViewById(R.id.lvTiGia);
        dsTiGia = new ArrayList<>();
        dsTiGia.add(new TiGia(1,"AUD",R.drawable.canada,
                1500l,1450l,1300l,1250l));
        dsTiGia.add(new TiGia(1,"AMR",R.drawable.american,
                1600l,1550l,1400l,1350l));
        dsTiGia.add(new TiGia(1,"CAD",R.drawable.canada,
                1700l,1650l,1500l,1450l));

        tiGiaAdapter =new TiGiaAdapter(MainActivity.this,R.layout.item,dsTiGia);

        lvTiGia.setAdapter(tiGiaAdapter);
    }
}
