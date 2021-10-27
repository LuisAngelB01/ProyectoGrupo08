package com.example.terceraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class CategoriaActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria3);
        getParametros();
    }
    public void getParametros(){
        Bundle extras = getIntent().getExtras();
        String msg = extras.getString("msg");
        Integer year = extras.getInt("year");
        Toast.makeText(this, msg +" "+ year, Toast.LENGTH_SHORT).show();
    }
}