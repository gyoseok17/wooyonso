package com.example.wooyonsotest.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wooyonsotest.MainActivity;
import com.example.wooyonsotest.R;

import java.util.ArrayList;

//프래그먼트는 액티비티위에 올라가있을떄만 프래그먼트로서 동작할 수 있다.
public class FragmentView extends Fragment {

    LinearLayout layout;
    LinearLayout order_his;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.category, container, false);

        return root;
    }
}