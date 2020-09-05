package com.example.fragmentappjava;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment2 extends ListFragment {

    String[] AndroidApps = new String[]{
          "Master Android App",
          "Master Android App Pro",
          "Master Flutter",
          "Master Kotlin",
          "Subcribe To Our Channel",
          "Rate Our Apps 5 Stars",
    };

    String[] Descriptions = new String[]{
           "Over 900,000 Users with 4.7 Rating",
           "Support us by Buying this App with $0.99",
           "Learn Flutter from Zero with this APP(4.0 Rating)",
           "Learn Kotlin from Zero to Hero",
           "Get Tutorial & Source code from AndroidMasterAPP",
           "Rate Master Android App 5 Star on Playstore",
    };


    public fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment2,
                container, false);

        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, AndroidApps);

        setListAdapter(adapter);

        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        fragment1 txt = (fragment1)getFragmentManager()
                .findFragmentById(R.id.fragment1);
        txt.chnage("APP: " + AndroidApps[position],
                "Version: " + Descriptions[position]);
        getListView().setSelector(R.color.colorAccent);
    }
}
