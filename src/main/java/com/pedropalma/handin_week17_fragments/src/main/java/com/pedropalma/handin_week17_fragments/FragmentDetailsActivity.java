package com.pedropalma.handin_week17_fragments;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class FragmentDetailsActivity extends Fragment {
    TextView name;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_details, container, false);
        name = (TextView)view.findViewById(R.id.Name);
        return view;
    }
    public void change(String uname){
        name.setText(uname);
    }
}
