package com.example.litianyu.automobilemaintenance;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

        Button SETUP = (Button)rootView.findViewById(R.id.button);
        SETUP.setOnClickListener(this);

        Button MAINT = (Button)rootView.findViewById(R.id.button2);
        MAINT.setOnClickListener(this);

        Button REMIND = (Button)rootView.findViewById(R.id.button3);
        REMIND.setOnClickListener(this);

        Button DIAL = (Button)rootView.findViewById(R.id.button4);
        DIAL.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {


        switch(v.getId()){
            case R.id.button:
                final Intent activitysetup = new Intent(getActivity(),setup.class);
                startActivity(activitysetup);
                break;
            case R.id.button2:
                final Intent activitymaint = new Intent(getActivity(),MainActivity.class);
                startActivity(activitymaint);
                break;
            case R.id.button3:
                final Intent activityremind = new Intent(getActivity(),remainder.class);
                startActivity(activityremind);
                break;
            case R.id.button4:
                final Intent activityintent = new Intent(getActivity(),quickdial.class);
                startActivity(activityintent);
                break;
        }
    }



}
