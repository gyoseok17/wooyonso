package com.example.wooyonsotest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.wooyonsotest.fragment.FragmentView;

public class MainActivity extends AppCompatActivity {
    ImageButton ibCate1, ibHome;
    Button btnCate2, getBtnCate2;
    FragmentView fragment1;
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context = getApplicationContext();
        MainActivity.context = getApplicationContext();

        findViewById(R.id.mainLinear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayout, new FragmentView());
                ft.addToBackStack(null);
                ft.commit();

            }
        });
    }



}