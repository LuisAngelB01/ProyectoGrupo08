package com.example.terceraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class CategoriaActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getParametros();
    }
    public void getParametros(){
        Bundle extras = getIntent().getExtras();
        String msg = extras.getString("msg");
        Integer year = extras.getInt("year");
        Toast.makeText(this, msg +" "+ year, Toast.LENGTH_SHORT).show();
    }
    public void OnBackPressed(){
        finish();

    }
    public boolean onOptionsItemSelected(MenuItem menuItem){
        Integer id= menuItem.getItemId();
        if(id== android.R.id.home){
            OnBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}