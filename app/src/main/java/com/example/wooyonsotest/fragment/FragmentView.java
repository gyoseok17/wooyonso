package com.example.wooyonsotest.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wooyonsotest.MainActivity;
import com.example.wooyonsotest.R;

import java.util.ArrayList;

//프래그먼트는 액티비티위에 올라가있을떄만 프래그먼트로서 동작할 수 있다.
public class FragmentView extends Fragment {
    ImageButton ibCate1, ibHome;
    LinearLayout layout;
    LinearLayout order_his;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Button[] btnCate = new Button[2];
    int[] btnCateId = {R.id.btnCate2, R.id.btnCate3};
    Context context;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.category_main, container, false);
        this.context = container.getContext();
        ibCate1 = (ImageButton)root.findViewById(R.id.ibCate1);
        ibCate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context.getApplicationContext(),1+"번 메뉴 선택",Toast.LENGTH_SHORT).show();
            }
        });
        btnCateClickEvent(root);
        return root;
    }

    public void btnCateClickEvent(View root){
        for(int i=0; i<btnCateId.length; i++){
            btnCate[i] = (Button) root.findViewById(btnCateId[i]);
        }
        for(int i=0; i<btnCateId.length; i++){
            int finalI = i;
            btnCate[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context.getApplicationContext(),(finalI+2)+"번 메뉴 선택",Toast.LENGTH_SHORT).show();
                }
            });
        }
//        this.context = getApplicationContext();
//        MainActivity.context = getApplicationContext();

    }
}