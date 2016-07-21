package listview.learn.thaihoc.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import listview.learn.thaihoc.listviewnangcaobt2.R;
import listview.learn.thaihoc.model.TiGia;

/**
 * Created by thaihoc on 7/20/2016.
 */
public class TiGiaAdapter extends ArrayAdapter<TiGia> {

    //Doi So 1: screen use this layout
    Activity context;
    //Layout for each row
    int resource;//item
    //list data want to show
    List<TiGia> objects;

    public TiGiaAdapter(Activity context, int resource, List<TiGia> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;//list data get in
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //position: vi tri hiện tại cần vẽ lên
        //class for build one layout normal=> java android code can read or use
        LayoutInflater inflater = this.context.getLayoutInflater();

        View row = inflater.inflate(this.resource,null);//build cuc resource(item( thanh code java => đẩy ra list view
        //Interface in layout must belong row => from layout control
//        TextView txtTen = (TextView) row.findViewById(R.id.txtTen);
        TextView txtMuaTM = (TextView) row.findViewById(R.id.txtMuaTM);
        TextView txtBanTm = (TextView) row.findViewById(R.id.txtBanTm);
        TextView txtMuaCK = (TextView) row.findViewById(R.id.txtMuaCK);
        TextView txtBanCk = (TextView) row.findViewById(R.id.txtBanCK);
        TextView txtNuoc = (TextView) row.findViewById(R.id.txtNuoc);
        ImageView imgNuoc = (ImageView) row.findViewById(R.id.imgNuoc);


        final TiGia db = this.objects.get(position);//tra ve ti gia hien tai muon ve
        txtNuoc.setText(db.getNuoc().toString());
        txtMuaTM.setText(db.getGiaMuaTM().toString());
        txtBanTm.setText(db.getGiaBanTM().toString());
        txtMuaCK.setText(db.getGiaMuaCK().toString());
        txtBanCk.setText(db.getGiaBanCK().toString());
        txtNuoc.setText(db.getNuoc().toString());
        imgNuoc.setImageResource(db.getImgSource());

        imgNuoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyChiTiet(db);
            }
        });

        return row;//quy định giao diện
//        return super.getView(position, convertView, parent);
    }

    private void xuLyChiTiet(TiGia db) {
        Toast.makeText(this.context,"Bạn chọn: " + db.getNuoc(),Toast.LENGTH_SHORT).show();
    }
}
