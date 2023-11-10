package com.example.renebarrientosexev1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {
    private TextView txt1, txt2, txt3, txt4, pt1, pt2, pt3, pt4;
    ImageView img1, img2, img3, img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //recogemos los id del xml
        setContentView(R.layout.activity_principal);
        img1 = findViewById(R.id.lt1);
        img2 = findViewById(R.id.lt2);
        img3 = findViewById(R.id.lt3);
        img4 = findViewById(R.id.lt4);
        txt1 = findViewById(R.id.lt1txt);
        txt2 = findViewById(R.id.lt2txt);
        txt3 = findViewById(R.id.lt3txt);
        txt4 = findViewById(R.id.lt4txt);
        pt1 = findViewById(R.id.pt1);
        pt2 = findViewById(R.id.pt2);
        pt3 = findViewById(R.id.pt3);
        pt4 = findViewById(R.id.pt4);

        //añadimos un listener a los botones que pasan la imagen, el nombre, y la puntuacion al siguiente activity
        img1.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), InformacionActivity.class);
            intent.putExtra("imagen","app/src/main/res/drawable/lt1.jpg");
            String txt = txt1.getText().toString();
            String pt = pt1.getText().toString();
            intent.putExtra("nombre", txt);
            intent.putExtra("pt", pt);
            startActivity(intent);

        });
        img2.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), InformacionActivity.class);
            intent.putExtra("imagen", "app/src/main/res/drawable/lt2.jpg");
            String txt = txt2.getText().toString();
            String pt = pt2.getText().toString();
            intent.putExtra("nombre", txt);
            intent.putExtra("pt", pt);
            startActivity(intent);

        });
        img3.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), InformacionActivity.class);
            intent.putExtra("imagen", "app/src/main/res/drawable/lt3.jpg");
            String txt = txt3.getText().toString();
            String pt = pt3.getText().toString();
            intent.putExtra("nombre", txt);
            intent.putExtra("pt", pt);
            startActivity(intent);

        });
        img4.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), InformacionActivity.class);
            String txt = txt4.getText().toString();
            String pt = pt4.getText().toString();
            intent.putExtra("imagen", "app/src/main/res/drawable/lt4.jpg");
            intent.putExtra("nombre", txt);
            intent.putExtra("pt", pt);
            startActivity(intent);

        });


    }

}