package com.example.wooyonsotest.Club;


import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.wooyonsotest.HomeActivity;
import com.example.wooyonsotest.R;

public class ClubMainFragment extends Fragment {
    int club = 3;  //동아리 수
    ImageButton[] ibClub = new ImageButton[club];
    ImageButton[] ibClubDetail = new ImageButton[club];
    int[] ibClubId = {R.id.ibClub1, R.id.ibClub2, R.id.ibClub3};
    int[] ibClubDetailId = {R.id.ibClubDetail1, R.id.ibClubDetail2, R.id.ibClubDetail3};
    Context context;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.club_main, container, false);
        this.context = container.getContext();
        for(int i=0; i<club; i++){
            ibClubDetail[i] = (ImageButton) root.findViewById(ibClubDetailId[i]);
        }
        ibClubClickEvent(root);
        ibClubDetailClickEvent();
        ibClubDetailLongClickEvent();
        return root;
    }
    public void ibClubClickEvent(View root){
        for(int i=0; i<club; i++){
            ibClub[i] = (ImageButton) root.findViewById(ibClubId[i]);
        }
        for(int i=0; i<club; i++) {
            int finalI = i;
            ibClub[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ibClub[finalI].setVisibility(View.GONE);
                    ibClubDetail[finalI].setVisibility(View.VISIBLE);
                }
            });
        }
    }
    public void ibClubDetailClickEvent(){
        for(int i=0; i<club; i++) {
            int finalI = i;
            ibClubDetail[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ibClubDetail[finalI].setVisibility(View.GONE);
                    ibClub[finalI].setVisibility(View.VISIBLE);
                }
            });
        }
    }
    public void ibClubDetailLongClickEvent(){
        for(int i=0; i<club; i++) {
            int finalI = i;
            ibClubDetail[i].setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    FragmentTransaction ft = ((HomeActivity)getActivity()).getSupportFragmentManager().beginTransaction();
                    switch (ibClubDetailId[finalI]){
                        case R.id.ibClubDetail1:
                            ft.replace(R.id.frameLayout, new Club1Fragment());
                            break;
                        case R.id.ibClubDetail2:
                            ft.replace(R.id.frameLayout, new Club2Fragment());
                            break;
                        case R.id.ibClubDetail3:
                            ft.replace(R.id.frameLayout, new Club3Fragment());
                            break;
                    }
                    ft.addToBackStack(null);
                    ft.commit();
                    return true;
                }
            });
        }
    }
}
