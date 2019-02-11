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
public class ThirdFragment extends Fragment {

    RecyclerView rvThird;
    ThirdAdapter adapterTiga;

    String[] arrayNamaTiga = {"Aster", "Beebalm", "Buttercup", "BellFlower", "Chrysanthemum", "Columbine", "Moonflower", "Leadwort", "Marigold", "Lily"};
    int[] arrayGambarTiga = {R.drawable.aster, R.drawable.beebalm, R.drawable.buttercup, R.drawable.bellflower, R.drawable.chrysanthemum, R.drawable.columbine, R.drawable.moonflower, R.drawable.leadwort, R.drawable.marigold, R.drawable.lily};
    FragmentManager fm;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        adapterTiga = new ThirdAdapter();
        View v = inflater.inflate( R.layout.fragment_third, container, false );
        rvThird = v.findViewById( R.id.thirdlist );
        rvThird.setLayoutManager( new GridLayoutManager( getActivity(), 2 ) );
        rvThird.setAdapter( adapterTiga );


        return v;
    }

    private class ThirdAdapter extends RecyclerView.Adapter<ThirdAdapter.MyViewHolder> implements View.OnClickListener {
        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new MyViewHolder( LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.adptr_tiga, viewGroup, false ) );
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
            myViewHolder.txtTiga.setText( arrayNamaTiga[i] );
            myViewHolder.imgTiga.setImageResource( arrayGambarTiga[i] );
            myViewHolder.itemView.setOnClickListener( this );
        }

        @Override
        public int getItemCount() {
            return arrayNamaTiga.length;
        }

        @Override
        public void onClick(View v) {

        }

        private class MyViewHolder extends RecyclerView.ViewHolder {

            TextView txtTiga;
            ImageView imgTiga;

            public MyViewHolder(@NonNull View itemView) {
                super( itemView );

                txtTiga = itemView.findViewById( R.id.tvNamaThird );
                imgTiga = itemView.findViewById( R.id.imgGambarThird );

            }
        }
    }
}
