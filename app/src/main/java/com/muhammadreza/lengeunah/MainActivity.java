package com.muhammadreza.lengeunah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeFragment homeFragment = new HomeFragment();
        FragmentTransaction fht = getSupportFragmentManager().beginTransaction();
        fht.replace(R.id.content, homeFragment);
        fht.commit();


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottonNav);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu:
                        MenuFragment menuFragment = new MenuFragment();
                        FragmentTransaction fmt = getSupportFragmentManager().beginTransaction();
                        fmt.replace(R.id.content, menuFragment);
                        fmt.commit();
                        return true;
                    case R.id.home:
                        HomeFragment homeFragment = new HomeFragment();
                        FragmentTransaction fht = getSupportFragmentManager().beginTransaction();
                        fht.replace(R.id.content, homeFragment);
                        fht.commit();
                        return true;
                }
                return false;
            }
        });
    }

}
