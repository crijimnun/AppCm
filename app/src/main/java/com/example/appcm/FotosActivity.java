package com.example.appcm;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FotosActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        TextView lblMensaje= (TextView) findViewById(R.id.lblMensaje);
        switch (item.getItemId()) {
            case R.id.noticias:
                Intent i = new Intent(this, NoticiasActivity.class);
                startActivity(i);
                finish();
                return true;
            case R.id.fotos:
                //lblMensaje.setText("¡Nuestras Fotos!");
                Intent i1 = new Intent(this, FotosActivity.class);
                startActivity(i1);
                finish();
                return true;
            case R.id.viernesSanto:
                //lblMensaje.setText("¡Viernes Santo y Nuestro Recorrido!");
                Intent i2 = new Intent(this, ViernesSantoActivity.class);
                startActivity(i2);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
