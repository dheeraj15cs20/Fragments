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

public class SecondFragment extends Fragment {
    Button secondButton;
    TextView tv2;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
    view= inflater.inflate(R.layout.activity_second_fragment,container,false);
    secondButton=(Button)view.findViewById(R.id.secondButton);
    secondButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //display a message using Toast
            Toast.makeText(getActivity(),"Second Fragment",Toast.LENGTH_SHORT).show();
        }
    });

    return view;
    }
}
