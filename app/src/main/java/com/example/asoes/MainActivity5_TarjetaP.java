package com.example.asoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5_TarjetaP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5_tarjeta_p);
    }

    public void Regresar(View view) {

        Intent intent = new Intent(this, MainActivity4_seleccionP.class);
        startActivity(intent);
        finish();

    }

}