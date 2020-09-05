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
public class fragment1 extends Fragment {

    TextView text, vers;

    public fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment1,
                container, false);
        text = (TextView)view.findViewById(R.id.AndroidApp);
        vers = (TextView)view.findViewById(R.id.Description);

        return view;
    }

    public void chnage(String txt, String txt1){
        text.setText(txt);
        vers.setText(txt1);
    }

}
