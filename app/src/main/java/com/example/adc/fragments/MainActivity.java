package com.example.adc.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button firstFragment,secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment=(Button)findViewById(R.id.firstFragment);
        secondFragment=(Button)findViewById(R.id.secondFragment);
        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FirstFragment());
            }
        });
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new SecondFragment());
            }
        });
    }
    private void loadFragment(Fragment fragment){
        //create a fragment manager
        FragmentManager fm=getFragmentManager();
        //Creating a fragment transaction
        FragmentTransaction fragmentTransaction= fm.beginTransaction();
        //replace the fragment layout
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
        //save the changes
    }
}
