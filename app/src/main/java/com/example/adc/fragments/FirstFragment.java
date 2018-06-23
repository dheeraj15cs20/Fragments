package com.example.adc.fragments;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstFragment extends Fragment {
    Button firstButton;
    View view;
    TextView tv1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //inflate the layout for this fragment
        view=inflater.inflate(R.layout.activity_first_fragment,container,false);
        //get the refrence of button
        firstButton=(Button)view.findViewById(R.id.firstButton);
        //performing set on clickListner on first Button
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //displaying a message by Toast
                Toast.makeText(getActivity(),"First Fragment",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
