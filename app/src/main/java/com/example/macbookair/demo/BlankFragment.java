package com.example.macbookair.demo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    TextView txt;

    public BlankFragment() {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_blank, null, false);
        txt = v.findViewById(R.id.txtFrag1);
        txt.setText(getActivity().getIntent().getStringExtra("key"));
        return v;

    }

}
