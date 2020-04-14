package com.example.appcm;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NoticiasActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        TextView lblMensaje= (TextView) findViewById(R.id.lblMensaje);
        switch (item.getItemId()) {
            case R.id.noticias:
                lblMensaje.setText("¡Últimas Noticias!");
                return true;
            case R.id.fotos:
                lblMensaje.setText("¡Nuestras Fotos!");;
                return true;
            case R.id.viernesSanto:
                lblMensaje.setText("¡Viernes Santo y Nuestro Recorrido!");;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
