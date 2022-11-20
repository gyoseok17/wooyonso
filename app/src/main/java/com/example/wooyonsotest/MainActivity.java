package com.example.wooyonsotest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wooyonsotest.fragment.FragmentView;

public class MainActivity extends AppCompatActivity {

    Button btnCate2, getBtnCate2;
    FragmentView fragment1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(R.id.mainLinear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction(); // 주문내역으로 이동
                ft.replace(R.id.frameLayout, new FragmentView())
                        .addToBackStack(null)
                        .commit();

            }
        });



    }




}