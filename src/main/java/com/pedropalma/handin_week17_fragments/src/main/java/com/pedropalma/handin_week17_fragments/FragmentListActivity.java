package com.pedropalma.handin_week17_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

public class FragmentListActivity extends ListFragment {
    private String[] users = new String[] { "Item1","Item2","Item3","Item4","Item5","Item6" };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.activity_fragment_list, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, users);
        setListAdapter(adapter);
        return view;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        FragmentDetailsActivity txt = (FragmentDetailsActivity) getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change("Name: "+ users[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}
