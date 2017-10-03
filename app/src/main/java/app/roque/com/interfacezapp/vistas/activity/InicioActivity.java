package app.roque.com.interfacezapp.vistas.activity;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import app.roque.com.interfacezapp.R;
import app.roque.com.interfacezapp.vistas.fragments.InicioFragment;
import app.roque.com.interfacezapp.vistas.fragments.MapaFragment;
import app.roque.com.interfacezapp.vistas.fragments.PerfilFragment;
import app.roque.com.interfacezapp.vistas.fragments.UniversidadFragment;

public class InicioActivity extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

         BottomBar bottomBar = (BottomBar)findViewById(R.id.bottombar);
         bottomBar.setDefaultTab(R.id.home);
         bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
             @Override
             public void onTabSelected(@IdRes int tabId) {
                 switch (tabId) {
                     case R.id.home:
                         InicioFragment inicioFragment = new InicioFragment();
                         getSupportFragmentManager().beginTransaction().replace(R.id.container, inicioFragment)
                                 .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                         break;
                     case R.id.universidades:
                         UniversidadFragment universidadFragment = new UniversidadFragment();
                         getSupportFragmentManager().beginTransaction().replace(R.id.container, universidadFragment)
                                 .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                         break;
                     case R.id.maps:
                         MapaFragment mapaFragment = new MapaFragment();
                         getSupportFragmentManager().beginTransaction().replace(R.id.container,mapaFragment)
                                 .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                         break;
                     case R.id.perfil:
                         PerfilFragment perfilFragment = new PerfilFragment();
                         getSupportFragmentManager().beginTransaction().replace(R.id.container,perfilFragment)
                                 .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                         break;

                 }
             }
         });


      /*  RecyclerView itemsRecycler = (RecyclerView)findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        itemsRecycler.setLayoutManager(linearLayoutManager);

        //adapter
        CardViewAdapterRecyclerView cardViewAdapterRecyclerView = new CardViewAdapterRecyclerView(buildPictures(), R.layout.cardview_model, this);

        itemsRecycler.setAdapter(cardViewAdapterRecyclerView);*/
    }

    //metodo que devuelve arraylist
  /*  public ArrayList<Anuncio> buildPictures(){
        ArrayList<Anuncio> pictures = new ArrayList<>();
        pictures.add(new Anuncio("https://cdn.pixabay.com/photo/2013/08/30/12/56/holiday-house-177401_960_720.jpg","Casa N°1", "Av. Hola Mundo","Lima"));
        pictures.add(new Anuncio("https://cdn.pixabay.com/photo/2013/11/13/21/14/san-francisco-210230_960_720.jpg","Departamento", "Av.Hola Mundo","Arequipa"));
        pictures.add(new Anuncio("https://cdn.pixabay.com/photo/2012/04/25/11/24/dyke-road-41832_960_720.jpg","Casa N°2", "Calle Hola Mundo","Trujillo"));
        return pictures;
    }*/
}
