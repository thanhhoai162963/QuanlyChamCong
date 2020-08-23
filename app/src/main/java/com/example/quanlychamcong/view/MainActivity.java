package com.example.quanlychamcong.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.quanlychamcong.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView mbottom;
    FragmentTransaction mfragmentTransaction;
    FragmentManager mfragmentManager;
    ChamCongFragment mchamCongFragment;
    GiaoViecFragment mgiaoViecFragment;
    NhanVienFragment mnhanVienFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this,QcaoActivity.class);
        startActivity(intent);

        mbottom = findViewById(R.id.nav_bottom);
        mfragmentManager = getSupportFragmentManager();

        mchamCongFragment = new ChamCongFragment();
        mgiaoViecFragment = new GiaoViecFragment();
        mnhanVienFragment = new NhanVienFragment();

        mfragmentTransaction = mfragmentManager.beginTransaction();
        mfragmentTransaction.replace(R.id.frame_container,mchamCongFragment);
        mfragmentTransaction.commit();



        mbottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.navigation_chamcong:
                        fragment =mchamCongFragment;
                        break;
                    case R.id.navigation_giaoviec:
                        fragment =mgiaoViecFragment;
                        break;
                    case R.id.navigation_nhanvien:
                        fragment =mnhanVienFragment;
                        break;
                }
                mfragmentTransaction =mfragmentManager.beginTransaction();
                mfragmentTransaction.replace(R.id.frame_container,fragment);
                mfragmentTransaction.commit();
                return true;
            }
        });

    }
    public void addFragmentChamcong(){

    }
}