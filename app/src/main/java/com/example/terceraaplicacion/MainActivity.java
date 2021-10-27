package com.example.terceraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivityProducto(View view) {
        Intent newIntent = new Intent(this, ProductoActivity2.class);
        newIntent.putExtra("msg","Hola");
        newIntent.putExtra("year",2021);
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(newIntent);
    }
}
