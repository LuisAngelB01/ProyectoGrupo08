package com.example.terceraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivityProducto(View view) {
        Intent newIntent = new Intent(this, ProductoActivity2.class);
        newIntent.putExtra("msg","Hola MinTic");
        newIntent.putExtra("year",2022);
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(newIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        Integer id= menuItem.getItemId();
        if(id== R.id.mnu_producto){
            Intent newIntent = new Intent(this, ProductoActivity2.class);
            newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(newIntent);
        }
        else if (id== R.id.mnu_categoria){
            Intent newIntent = new Intent(this, CategoriaActivity3.class);
            newIntent.putExtra("msg","Hola MinTic");
            newIntent.putExtra("year",2022);
            newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(newIntent);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
