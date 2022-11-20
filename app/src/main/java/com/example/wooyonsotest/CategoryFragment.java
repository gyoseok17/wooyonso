package com.example.wooyonsotest;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.wooyonsotest.Club.ClubMainFragment;

import java.util.List;

//프래그먼트는 액티비티위에 올라가있을떄만 프래그먼트로서 동작할 수 있다.
public class CategoryFragment extends Fragment {
    ImageButton ibCate1;
    Button[] btnCate = new Button[2];
    int[] btnCateId = {R.id.btnCate2, R.id.btnCate3};
    Context context;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.category, container, false);
        this.context = container.getContext();

        ibCate1 = (ImageButton)root.findViewById(R.id.ibCate1);
        ibCate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = ((HomeActivity)getActivity()).getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frameLayout, new ClubMainFragment());
                ft.addToBackStack(null);
                ft.commit();
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
//                    FragmentTransaction ft = ((HomeActivity)getActivity()).getSupportFragmentManager().beginTransaction();
//                    ft.replace(R.id.frameLayout, new ClubMainFragment());
//                    ft.addToBackStack(null);
//                    ft.commit();
                    Toast.makeText(context.getApplicationContext(),(finalI+2)+"번 메뉴 선택",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}