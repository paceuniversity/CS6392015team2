package com.example.litianyu.automobilemaintenance;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class automainFragment extends Fragment {

    public automainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_automain,container,false);
        String[] maintenance ={
                "oil change: 06/29/2015",
                "engire check: 03/15/2013",
                "replace tires: 05/18/2015",
                "check lights: 06/29/2015"
        };
        List<String> mainAL = new ArrayList<String>(Arrays.asList(maintenance));
        ArrayAdapter<String> mainAdapter= new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,maintenance);
        final ListView lv=(ListView)rootView.findViewById(R.id.state_list_view);
        lv.setAdapter(mainAdapter);
        return rootView;
    }

}
