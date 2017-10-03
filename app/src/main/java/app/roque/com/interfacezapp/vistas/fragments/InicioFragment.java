package app.roque.com.interfacezapp.vistas.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import app.roque.com.interfacezapp.R;
import app.roque.com.interfacezapp.adapter.CardViewAdapterRecyclerView;
import app.roque.com.interfacezapp.modelo.Anuncio;

/**
 * A simple {@link Fragment} subclass.
 */
public class InicioFragment extends Fragment {

    public InicioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio,container, false);
        RecyclerView pictureRecycler = (RecyclerView)view.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        pictureRecycler.setLayoutManager(linearLayoutManager);

        //adapter
        CardViewAdapterRecyclerView cardViewAdapterRecyclerView = new CardViewAdapterRecyclerView(buildPictures(), R.layout.cardview_model, getActivity());

        pictureRecycler.setAdapter(cardViewAdapterRecyclerView);

        return view;
    }

    public ArrayList<Anuncio> buildPictures(){
        ArrayList<Anuncio> pictures = new ArrayList<>();
        pictures.add(new Anuncio("https://cdn.pixabay.com/photo/2017/08/17/13/14/motorcycle-2651286_960_720.jpg","Casa 1", "Lima","Lima"));
        pictures.add(new Anuncio("https://cdn.pixabay.com/photo/2017/08/27/23/29/not-hear-2687975_960_720.jpg","Casa 2", "Lima","Lima"));
        pictures.add(new Anuncio("https://cdn.pixabay.com/photo/2017/08/23/13/38/desirable-2672931_960_720.jpg","Casa 3", "Lima","Lima"));
        return pictures;
    }


    public void showToolbar(String title, boolean upButton,View view){
        Toolbar toolbar = (Toolbar)view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}

