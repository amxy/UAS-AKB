package com.example.tugas_uas_akb_if3_10117087.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugas_uas_akb_if3_10117087.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/** NIM : 10117087
   Nama : AhmadMaula
   Kelas : IF-3
 **/

public class ProfileFragment extends Fragment {
    public ProfileFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        // Inflate the layout for this fragment
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}
