package com.example.renebarrientosexev1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InformacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        ImageView img = findViewById(R.id.img);
        TextView nombre = findViewById(R.id.nombre);
        TextView puntuacion = findViewById(R.id.puntuacion);
        Intent intent = getIntent();
        if (intent != null) {
            String txt = intent.getStringExtra("nombre");
            String pt = intent.getStringExtra("pt");
            String img2 = intent.getStringExtra("imagen");
            Uri imagenUri = Uri.parse(img2);

            if (txt != null && !txt.isEmpty()) {
                nombre.setText(txt);
            }
            if (pt != null && !pt.isEmpty()) {
                puntuacion.setText(pt);
            }
            if(img2!=null){
                img.setImageURI(imagenUri);
            }
        }
    }
}