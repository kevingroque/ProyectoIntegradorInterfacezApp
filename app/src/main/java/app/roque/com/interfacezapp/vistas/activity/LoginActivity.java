package app.roque.com.interfacezapp.vistas.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import app.roque.com.interfacezapp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void CrearCuenta(View view){
        Intent intent = new Intent(LoginActivity.this, CrearCuentaActivity.class);
        startActivity(intent);
    }

    public void Ingresar(View view){
        Intent intent = new Intent(LoginActivity.this, InicioActivity.class);
        startActivity(intent);
    }
}
