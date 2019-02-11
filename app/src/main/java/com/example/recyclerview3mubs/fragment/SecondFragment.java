package com.example.recyclerview3mubs.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview3mubs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

RecyclerView rvSecond;
SecondAdapter adapterdua;
FragmentManager fm;

String[] arrayNamadua = {"Air Conditioner","Bulb Light","Screen","Curtains","CCTV","Melody","Projector","Tribune"};
int[] arrayGambardua = {R.drawable.ac,R.drawable.bulb,R.drawable.screen,R.drawable.curtains,R.drawable.cctv,R.drawable.melodhy,R.drawable.projector,R.drawable.tribune};

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate( R.layout.fragment_second, container, false );

        adapterdua = new SecondAdapter();
        rvSecond = v.findViewById( R.id.secondlist );
        rvSecond.setAdapter( adapterdua );
        rvSecond.setLayoutManager( new GridLayoutManager( getActivity(),2 ) );

        return v;
    }

    private class SecondAdapter extends RecyclerView.Adapter<MyViewHolder> implements View.OnClickListener {
        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new MyViewHolder( LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.adptr_dua,viewGroup,false ) );
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
myViewHolder.txt_namadua.setText( arrayNamadua[i] );
myViewHolder.img_gambardua.setImageResource( arrayGambardua[i] );
myViewHolder.itemView.setOnClickListener( this );
        }

        @Override
        public int getItemCount() {
            return arrayNamadua.length;
        }

        @Override
        public void onClick(View v) {

        }
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txt_namadua;
        ImageView img_gambardua;

        public MyViewHolder(@NonNull View itemView) {
            super( itemView );

            txt_namadua = itemView.findViewById( R.id.tvNamaSecond );
            img_gambardua = itemView.findViewById( R.id.imgGambarSecond );
        }
    }
}
