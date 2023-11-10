package com.example.renebarrientosexev1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView logoImageView = findViewById(R.id.logoImageView);
        logoImageView.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),PrincipalActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Imagen clicada", Toast.LENGTH_SHORT).show();
        });

    }
}