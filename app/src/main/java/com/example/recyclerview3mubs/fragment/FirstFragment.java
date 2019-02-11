package com.example.recyclerview3mubs.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview3mubs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    FirstAdapter adapter;
    RecyclerView firstRv;
    FragmentManager fm;

    String[] arrayNama = {"Aster","Beebalm","Buttercup","BellFlower","Chrysanthemum","Columbine","Moonflower","Leadwort","Marigold","Lily"};
    int[] arrayGambar = {R.drawable.aster,R.drawable.beebalm,R.drawable.buttercup,R.drawable.bellflower,R.drawable.chrysanthemum,R.drawable.columbine,R.drawable.moonflower,R.drawable.leadwort,R.drawable.marigold,R.drawable.lily};


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate( R.layout.fragment_first2, container, false );

        adapter = new FirstAdapter();
        firstRv = v.findViewById( R.id.firstList );
        firstRv.setLayoutManager(new GridLayoutManager( getActivity(),2 ));
        firstRv.setAdapter( adapter );

        return v;
    }

    private class FirstAdapter extends RecyclerView.Adapter<MyViewHolder> implements View.OnClickListener {
        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

            return new MyViewHolder( LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.adptr,viewGroup,false ) );
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
myViewHolder.txt_nama.setText( arrayNama[i] );
myViewHolder.img_gambar.setImageResource( arrayGambar[i] );
myViewHolder.itemView.setOnClickListener( this );

        }

        @Override
        public int getItemCount() {
            return arrayNama.length;
        }

        @Override
        public void onClick(View v) {

        }
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txt_nama;
        ImageView img_gambar;

        public MyViewHolder(@NonNull View itemView) {
            super( itemView );

            txt_nama = itemView.findViewById( R.id.tvNama );
            img_gambar = itemView.findViewById( R.id.imgGambar );

        }
    }
}
