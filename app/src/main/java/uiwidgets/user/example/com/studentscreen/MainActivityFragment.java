package uiwidgets.user.example.com.studentscreen;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import uiwidgets.user.example.com.studentscreen.adapter.CustomAdapter;
import uiwidgets.user.example.com.studentscreen.models.Category;
import uiwidgets.user.example.com.studentscreen.models.Company;
import uiwidgets.user.example.com.studentscreen.models.Employee;
import uiwidgets.user.example.com.studentscreen.models.Records;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private static final String TAG = MainActivityFragment.class.getName();
    private ListView simpleList;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        simpleList = (ListView) v.findViewById(R.id.simpleListView);

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        CustomAdapter customAdapter = new CustomAdapter(getContext(), getRecords());
        for(int i = 0; i < getRecords().length; i++){
            Log.d(TAG,getRecords()[i].getEmployee().getName());
            Log.d(TAG,String.valueOf(getRecords()[i].getEmployee().getId()));
            Log.d(TAG,getRecords()[i].getComany().getName());
            Log.d(TAG,getRecords()[i].getComany().getAddress());
            Log.d(TAG,getRecords()[i].getCategory().getCategoryName());
        }
        simpleList.setAdapter(customAdapter);
    }

    private Records[] getRecords() {
        Records[] records = new Records[]{};
        for(int i = 0; i < 1000; i++){
            Employee emp = new Employee(R.drawable.ic_launcher_foreground, String.valueOf(i).toUpperCase());
            Company company = new Company(R.drawable.ic_launcher_background, "Com:"+String.valueOf(i));
            Category category = new Category("category is: "+String.valueOf(i));
            Records record = new Records(emp, category, company, i);
            records[i] = record;
        }
        return records;
    }
}
