package com.example.quanlychamcong.view;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.quanlychamcong.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;


public class ChamCongFragment extends Fragment {
    Button mbtnVaoCa;
    TextInputEditText mtxtInputName, mtxtInputMSNV;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cham_cong,container,false);
        mbtnVaoCa = v.findViewById(R.id.buttonVaoCa);
        mtxtInputMSNV = v.findViewById(R.id.textInputMSNV);
        mtxtInputName = v.findViewById(R.id.textInputName);
        Click();

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    private void Click(){
        mbtnVaoCa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mtxtInputName.length() > 0 && mtxtInputMSNV.length() >0){
                    changeFragment();
                }else {
                    Toast.makeText(getActivity(), "Mời nhập thông tin", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void changeFragment(){
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container,new NhanVienFragment());
        fragmentTransaction.commit();

    }
}