package com.example.wooyonsotest;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.wooyonsotest.Club.ClubMainFragment;

//프래그먼트는 액티비티위에 올라가있을떄만 프래그먼트로서 동작할 수 있다.
public class CategoryFragment extends Fragment {
    ImageButton[] ibCate = new ImageButton[3];
    int[] ibCateId = {R.id.ibCate1, R.id.ibCate2, R.id.ibCate3};
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.category, container, false);
        this.context = container.getContext();

        ibCateClickEvent(root);
        return root;
    }

    public void ibCateClickEvent(View root){
        for(int i=0; i<ibCateId.length; i++){
            ibCate[i] = (ImageButton) root.findViewById(ibCateId[i]);
        }
        for(int i=0; i<ibCateId.length; i++){
            int finalI = i;
            ibCate[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentTransaction ft = ((HomeActivity)getActivity()).getSupportFragmentManager().beginTransaction();
                    switch (ibCateId[finalI]){
                        case R.id.ibCate1:
                            ft.replace(R.id.frameLayout, new ClubMainFragment());
                            break;
                        case R.id.ibCate2:
                            //ft.replace(R.id.frameLayout, new Club1MainFragment());
                            Toast.makeText(getContext(),""+finalI+"",Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.ibCate3:
                            Toast.makeText(getContext(),""+finalI+"",Toast.LENGTH_SHORT).show();
                            //ft.replace(R.id.frameLayout, new Club1MainFragment());
                            break;
                    }
                    ft.addToBackStack(null);
                    ft.commit();
                }
            });
        }
    }
}