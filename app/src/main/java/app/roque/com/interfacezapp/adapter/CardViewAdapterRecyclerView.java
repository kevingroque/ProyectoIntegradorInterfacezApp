package app.roque.com.interfacezapp.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import app.roque.com.interfacezapp.R;
import app.roque.com.interfacezapp.modelo.Anuncio;
import app.roque.com.interfacezapp.vistas.activity.DetailActivity;

public class CardViewAdapterRecyclerView extends RecyclerView.Adapter<CardViewAdapterRecyclerView.PictureViewHolder> {

    private ArrayList<Anuncio> anuncios;
    private int resource;
    private Activity activity;

    public CardViewAdapterRecyclerView(ArrayList<Anuncio> anuncios, int resource, Activity activity) {
        this.anuncios = anuncios;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        //se trabaja con la lista de elementos, paso de datos
        Anuncio anuncio = anuncios.get(position);
        holder.titleCard.setText(anuncio.getTitle());
        holder.dirCard.setText(anuncio.getDireccion());
        holder.lugarCard.setText(anuncio.getLugar());
        Picasso.with(activity).load(anuncio.getImagen()).into(holder.pictureCard);

        holder.pictureCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, DetailActivity.class);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        //conteo de elementos
        return anuncios.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{
        //Todos los elementos de la tarjeta
        private ImageView pictureCard;
        private TextView titleCard;
        private TextView dirCard;
        private TextView lugarCard;

        public PictureViewHolder(View itemView) {
            super(itemView);

            pictureCard    = (ImageView)itemView.findViewById(R.id.pictureCard);
            titleCard      = (TextView)itemView.findViewById(R.id.titleCard);
            dirCard        = (TextView)itemView.findViewById(R.id.direccionCard);
            lugarCard      = (TextView)itemView.findViewById(R.id.lugarCard);

        }
    }
}
