package com.example.wooyonsotest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.wooyonsotest.fragment.FragmentView;

public class MainActivity extends AppCompatActivity {
    ImageButton ibCate1, ibHome;
    Button btnCate2, getBtnCate2;
    FragmentView fragment1;
    private static Context context;
    Button[] btnCate = new Button[2];
    int[] btnCateId = {R.id.btnCate2, R.id.btnCate3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibCate1 = findViewById(R.id.ibCate1);
        ibCate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),1+"번 메뉴 선택",Toast.LENGTH_SHORT).show();
            }
        });
        btnCateClickEvent();

    }
    public void btnCateClickEvent(){
        for(int i=0; i<btnCateId.length; i++){
            btnCate[i] = findViewById(btnCateId[i]);
        }
        for(int i=0; i<btnCateId.length; i++){
            int finalI = i;
            btnCate[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(),(finalI +1)+"번 메뉴 선택",Toast.LENGTH_SHORT).show();
                }
            });
        }
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