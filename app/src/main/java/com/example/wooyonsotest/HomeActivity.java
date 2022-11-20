package com.example.wooyonsotest;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

    }

    @Override
    protected void onStart() {
        super.onStart();
        findViewById(R.id.mainLinear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayout, new CategoryFragment());
                ft.addToBackStack(null);
                ft.commit();
            }
        });



    }




}