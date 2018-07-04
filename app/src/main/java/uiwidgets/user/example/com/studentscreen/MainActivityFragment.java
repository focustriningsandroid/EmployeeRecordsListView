package uiwidgets.user.example.com.studentscreen;

import android.os.Build;
import android.support.annotation.RequiresApi;
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

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
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

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private Records[] getRecords() {
        Records[] records = new Records[1000];

        for(int i = 0; i < 1000; i++){
            Employee emp = new Employee(getActivity().getDrawable(R.drawable.br), String.valueOf(i).toUpperCase(), i);
            Company company = new Company(getActivity().getDrawable(R.drawable.br), "Com:"+String.valueOf(i), "Hyderabad");
            Category category = new Category(String.valueOf(i));
            Records record = new Records(emp, category, company, i);
            records[i] = record;
        }
        return records;
    }
}
