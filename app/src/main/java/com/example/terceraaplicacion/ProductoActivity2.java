package com.example.terceraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class ProductoActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void goToActivityMain(View view) {
        Intent newIntent = new Intent(this, MainActivity.class);
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(newIntent);
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