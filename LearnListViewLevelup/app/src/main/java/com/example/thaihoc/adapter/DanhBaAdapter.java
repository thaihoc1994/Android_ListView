package com.example.thaihoc.adapter;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thaihoc.learnlistviewlevelup.R;
import com.example.thaihoc.model.DanhBa;

import java.util.List;

/**
 * Created by thaihoc on 7/20/2016.
 */
public class DanhBaAdapter extends ArrayAdapter<DanhBa> {
    //đối số 1: Màn hình sử dụng layout hiện tại
    Activity context;
    //Layout cho từng dòng muốn hiển thị (yêu cầu của khách hàng)
    int resource;
    //danh sách nguồn dữ liệu muốn hiển thị lên giao diện
    List<DanhBa> objects;
    //activity context la man hinh dang su dung hien tai
    public DanhBaAdapter(Activity context, int resource, List<DanhBa> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //positon: vi tri hien tai can ve len
        LayoutInflater inflater = this.context.getLayoutInflater();
        //một lớp dùng để build một layout bt=> một code java android có thể sử dụng được

        View row = inflater.inflate(this.resource,null);//build cuc resouce thanh code java => đẩy ra list view
    //giao dien trong layout phai thuoc row => lay control
        TextView txtTen = (TextView) row.findViewById(R.id.txtTen);
        TextView txtPhone = (TextView) row.findViewById(R.id.txtPhone);
        ImageButton btnCall = (ImageButton) row.findViewById(R.id.btnCall);
        ImageButton btnSms = (ImageButton) row.findViewById(R.id.btnSms);
        ImageButton btnDetail = (ImageButton) row.findViewById(R.id.btnDetail);

        final DanhBa db = this.objects.get(position);//tra ve danh ba hien tai muon ve
        txtTen.setText(db.getTen().toString());
        txtPhone.setText(db.getSdt().toString());

        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyDetail(db);
            }
        });
        return row;//quy định giao diện


    }

    private void xuLyDetail(DanhBa db) {
        Toast.makeText(this.context,"Bạn chọn: " + db.getTen(),Toast.LENGTH_SHORT).show();
    }
}
