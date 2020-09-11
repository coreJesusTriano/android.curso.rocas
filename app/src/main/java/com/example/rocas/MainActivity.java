package com.example.rocas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Creando y configurando menú
    @Override
    public boolean onCreateOptionsMenu(Menu miMenu) {
        getMenuInflater().inflate(R.menu.menu, miMenu);
        return true; //super.onCreateOptionsMenu(miMenu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        boolean resp = true;
        switch (id){
            case R.id.btn_info:
                openActivityInfo(null);
                break;
            case R.id.btn_setting:
                dontExist(null); // lo cambiaremos cuando lo hagamos
                break;
            case R.id.btn_play:
                dontExist(null); // lo cambiaremos cuando lo hagamos
                break;
            case R.id.btn_exit:
                closeApp(null);
            default:
                resp = false;
        }
        return resp;
    }

    // Funcionalidad de los botones
    public void openActivityInfo(View view){
        Intent activInfo = new Intent(this, InfoActivity.class);
        startActivity(activInfo);
    }

    public void closeApp(View view){
        finish();
    }

    public void dontExist(View view){
        Toast.makeText(this, R.string.opt_dont_exist,Toast.LENGTH_LONG).show();
    }
}