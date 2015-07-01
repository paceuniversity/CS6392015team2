package com.example.litianyu.automobilemaintenance;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageButton;
import android.widget.Toast;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ImageButton SETUP = (ImageButton)rootView.findViewById(R.id.Button);
        SETUP.setOnClickListener(this);

        ImageButton MAINT = (ImageButton)rootView.findViewById(R.id.Button2);
        MAINT.setOnClickListener(this);

        ImageButton REMIND = (ImageButton)rootView.findViewById(R.id.Button3);
        REMIND.setOnClickListener(this);

        ImageButton DIAL = (ImageButton)rootView.findViewById(R.id.Button4);
        DIAL.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {


        switch(v.getId()){
            case R.id.Button:
                final Intent activitysetup = new Intent(getActivity(),setup.class);
                startActivity(activitysetup);
                break;
            case R.id.Button2:
                final Intent activitymaint = new Intent(getActivity(),automain.class);
                startActivity(activitymaint);
                break;
            case R.id.Button3:
                final Intent activityremind = new Intent(getActivity(),remainder.class);
                startActivity(activityremind);
                break;
            case R.id.Button4:
                final Intent activityintent = new Intent(getActivity(),quickdial.class);
                startActivity(activityintent);
                break;
        }
    }



}
