package com.example.tugas_uas_akb_if3_10117087.Database;


import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.tugas_uas_akb_if3_10117087.R;
import com.example.tugas_uas_akb_if3_10117087.View.DetailActivity;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/** NIM : 10117087
 Nama : AhmadMaula
 Kelas : IF-3
 **/


public class AdapterWisata extends RecyclerView.Adapter<AdapterWisata.TourPlaceViewHolder> {
    private ArrayList<Wisata> listWisata = new ArrayList<>();
    private Activity activity;

    public AdapterWisata(Activity activity){
        this.activity = activity;
    }

    public ArrayList<Wisata> getListNotes(){
        return listWisata;
    }

    public void setListNotes(ArrayList<Wisata> listNotes){
        if (listNotes.size() > 0 ){
            this.listWisata.clear();
        }
        this.listWisata.addAll(listNotes);

        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public AdapterWisata.TourPlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note, parent, false);
        return new TourPlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TourPlaceViewHolder holder, int position) {
        holder.tvNama.setText(listWisata.get(position).getNama());
        holder.tvWaktuBuka.setText(listWisata.get(position).getWaktuBuka());
        Glide.with(activity)
                .asBitmap()
                .load(listWisata.get(position).getFoto())
                .into(holder.tvFoto);
        holder.cvNote.setOnClickListener(new CustomClickListener(position, new CustomClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(activity, DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_POSITION, position);
                intent.putExtra(DetailActivity.EXTRA_NOTE, listWisata.get(position));
                activity.startActivityForResult(intent, DetailActivity.REQUEST_UPDATE);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    public class TourPlaceViewHolder extends RecyclerView.ViewHolder{
        final TextView  tvNama, tvWaktuBuka;
        final ImageView tvFoto;
        final CardView cvNote;

        public TourPlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.nama_wisata);
            tvWaktuBuka = itemView.findViewById(R.id.waktuBuka);
            tvFoto = itemView.findViewById(R.id.gambar_wisata);
            cvNote = itemView.findViewById(R.id.cv_item_note);
        }
    }


}
