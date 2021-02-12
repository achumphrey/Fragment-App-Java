package com.example.fragmentappjava;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    TextView text, vers;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment1,
                container, false);
        text = view.findViewById(R.id.AndroidApp);
        vers = view.findViewById(R.id.Description);

        return view;
    }

    public void change(String txt, String txt1){
        text.setText(txt);
        vers.setText(txt1);
    }

}
