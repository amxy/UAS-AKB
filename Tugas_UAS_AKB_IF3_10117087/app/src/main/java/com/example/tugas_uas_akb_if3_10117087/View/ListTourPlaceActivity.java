package com.example.tugas_uas_akb_if3_10117087.View;

import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.tugas_uas_akb_if3_10117087.Database.AdapterWisata;
import com.example.tugas_uas_akb_if3_10117087.Database.MapsHelper;
import com.example.tugas_uas_akb_if3_10117087.Database.Wisata;
import com.example.tugas_uas_akb_if3_10117087.Database.WisataHelper;
import com.example.tugas_uas_akb_if3_10117087.R;
import com.google.android.material.snackbar.Snackbar;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


/** NIM : 10117087
   Nama : AhmadMaula
   Kelas : IF-3
 **/

public class ListTourPlaceActivity  extends Fragment implements LoadTourPlaceCallback{

    private ProgressBar progressBar;
    private RecyclerView rvNotes;
    private AdapterWisata adapter;
    private WisataHelper tpHelper;
    private static final String EXTRA_STATE = "EXTRA_STATE";

//    private ImageView fabAdd;

    public ListTourPlaceActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        ((AppCompatActivity) getActivity()).getSupportActionBar().show();
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.list_tour, container, false);



//        if ( ((AppCompatActivity) getActivity()).getSupportActionBar() != null) {
//            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Friends");
//            ((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#03AC0E")));

        progressBar = view.findViewById(R.id.progressbar);
        rvNotes = view.findViewById(R.id.rv_notes);
        rvNotes.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvNotes.setHasFixedSize(true);
        adapter = new AdapterWisata(getActivity());
        rvNotes.setAdapter(adapter);

//        }
        tpHelper = WisataHelper.getInstance(getActivity());
        tpHelper.open();

        if (savedInstanceState == null) {
            new LoadNotesAsync(tpHelper, this).execute();
        } else {
            ArrayList<Wisata> list = savedInstanceState.getParcelableArrayList(EXTRA_STATE);
            if (list != null) {
                adapter.setListNotes(list);
            }
        }


        return view;
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList(EXTRA_STATE, adapter.getListNotes());
    }


    @Override
    public void preExecute() {
        new Runnable(){
            @Override
            public void run() {
                progressBar.setVisibility(View.VISIBLE);
            }
        };
    }

    @Override
    public void postExecute(ArrayList<Wisata> notes) {
        progressBar.setVisibility(View.INVISIBLE);
        if (notes.size() > 0) {
            adapter.setListNotes(notes);
        } else {
            adapter.setListNotes(new ArrayList<Wisata>());
            showSnackbarMessage("Tidak ada data saat ini");
        }
    }

    private static class LoadNotesAsync extends AsyncTask<Void, Void, ArrayList<Wisata>> {
        private final WeakReference<WisataHelper> weakNoteHelper;
        private final WeakReference<LoadTourPlaceCallback> weakCallback;

        private LoadNotesAsync(WisataHelper noteHelper, LoadTourPlaceCallback callback) {
            weakNoteHelper = new WeakReference<>(noteHelper);
            weakCallback = new WeakReference<>(callback);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            weakCallback.get().preExecute();
        }

        @Override
        protected ArrayList<Wisata> doInBackground(Void... voids) {
            Cursor dataCursor = weakNoteHelper.get().queryAll();
            return MapsHelper.mapCursorToArrayList(dataCursor);
        }

        @Override
        protected void onPostExecute(ArrayList<Wisata> notes) {
            super.onPostExecute(notes);
            weakCallback.get().postExecute(notes);
        }
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        tpHelper.close();
    }

    private void showSnackbarMessage(String message) {
        Snackbar.make(rvNotes, message, Snackbar.LENGTH_SHORT).show();
    }
}

interface LoadTourPlaceCallback{
    void preExecute();
    void postExecute(ArrayList<Wisata> notes);
}
