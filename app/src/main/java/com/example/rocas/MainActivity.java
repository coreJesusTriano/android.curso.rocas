package com.example.rocas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // activamos la rotación del asteroide
        ImageView asteroide = findViewById(R.id.asteroide);
        rotarImageView(asteroide);
    }

    // Animar rotación asteroide
    private void rotarImageView(View view){
        RotateAnimation animation = new RotateAnimation(0,1800,
                RotateAnimation.RELATIVE_TO_SELF,0.5f,
                RotateAnimation.RELATIVE_TO_SELF,0.5f);
        animation.setDuration(9000);
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);
        view.startAnimation(animation);
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
                openActivityProfile(null);
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

    public void openActivityProfile(View view){
        Intent activProfile = new Intent(this, ProfileActivity.class);
        startActivity(activProfile);
    }

    public void closeApp(View view){
        finish();
    }

    public void dontExist(View view){
        Toast.makeText(this, R.string.opt_dont_exist,Toast.LENGTH_SHORT).show();
    }
}