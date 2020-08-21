package com.muhammadreza.lengeunah;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MenuFragment extends Fragment {
    private RecyclerView rvList;
    private RecyclerAdapter rvAdapter;
    private RecyclerView.LayoutManager rvLayout;
    private Button btBack;
    private ImageView ivBack;

    public MenuFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_menu, container, false);

        ArrayList<Menu> listmenu = new ArrayList<>();

        listmenu.add(new Menu(R.drawable.americano, "Americano","Rp. 5.000"));
        listmenu.add(new Menu(R.drawable.ice_latte, "Ice Latte","Rp. 7.500"));
        listmenu.add(new Menu(R.drawable.chocolate, "Chocholate","Rp. 6.000"));
        listmenu.add(new Menu(R.drawable.cappucino, "Cappucino","Rp. 8.000"));

        rvList = (RecyclerView) view.findViewById(R.id.rv_list);
        rvList.setHasFixedSize(true);
        rvLayout = new LinearLayoutManager(getActivity());
        rvAdapter = new RecyclerAdapter(listmenu);

        rvList.setLayoutManager(rvLayout);
        rvList.setAdapter(rvAdapter);

        ivBack = (ImageView) view.findViewById(R.id.ivBack);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        btBack = (Button) view.findViewById(R.id.btBack);
        btBack.setPaintFlags(btBack.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);

            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}