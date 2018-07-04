package uiwidgets.user.example.com.studentscreen.adapter;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import uiwidgets.user.example.com.studentscreen.models.Records;
import uiwidgets.user.example.com.studentscreen.R;

public class CustomAdapter extends BaseAdapter {
    Context context;
    Records records[];
    LayoutInflater inflter;

    public CustomAdapter(Context context, Records[] records) {
        this.context = context;
        this.records = records;
        inflter = (LayoutInflater.from(context));
    }
    @Override
    public int getCount() {
        return records.length;
    }

    @Override
    public Object getItem(int i) {
        return records[i];
    }

    @Override
    public long getItemId(int i) {
        return records[i].getId();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.row, null);
        TextView empname = (TextView) view.findViewById(R.id.tvemname);
        ImageView empIcon = (ImageView) view.findViewById(R.id.empicon);
        TextView tvempidvalue = (TextView) view.findViewById(R.id.tvempidtitle);
        TextView tvempaddressvalue = (TextView) view.findViewById(R.id.tvempaddressvalue);
        ImageView companylogo = (ImageView) view.findViewById(R.id.companylogo);
        Button category = (Button) view.findViewById(R.id.category);

        empname.setText(records[i].getEmployee().getName());
        empIcon.setBackground(records[i].getEmployee().getFlag());
        tvempidvalue.setText("Emloyee ID: "+records[i].getEmployee().getId());
        tvempaddressvalue.setText(records[i].getComany().getAddress());
        companylogo.setBackground(records[i].getComany().getLogo());
        category.setText(records[i].getCategory().getCategoryName());
        return view;
    }
}
