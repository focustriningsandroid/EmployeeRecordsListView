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

    public CustomAdapter(Context applicationContext, Records[] records) {
        this.context = context;
        this.records = records;
        inflter = (LayoutInflater.from(applicationContext));
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
        TextView tvempidvalue = (TextView) view.findViewById(R.id.tvempidvalue);
        TextView tvempaddressvalue = (TextView) view.findViewById(R.id.tvempaddressvalue);
        ImageView companylogo = (ImageView) view.findViewById(R.id.companylogo);
        Button category = (Button) view.findViewById(R.id.category);
        empname.setText(records[i].getEmployee().getName());
        empIcon.setBackground(context.getResources().getDrawable(records[i].getEmployee().getFlag(), null));
        tvempidvalue.setText(records[i].getEmployee().getId());
        tvempaddressvalue.setText(records[i].getComany().getAddress());
        companylogo.setBackground(context.getResources().getDrawable(records[i].getComany().getLogo(), null));
        category.setText("Category of "+ records[i].getComany().getName()+" is: "+records[i].getCategory().getCategoryName());
        return null;
    }
}
