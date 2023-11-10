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


        img1.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), InformacionActivity.class);
            Uri uri = obtenerUriDesdeImageView(img1);
            intent.putExtra("imagen",uri.toString());
            String txt = txt1.getText().toString();
            String pt = pt1.getText().toString();
            intent.putExtra("nombre", txt);
            intent.putExtra("pt", pt);
            startActivity(intent);

        });
        img2.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), InformacionActivity.class);
            Uri uri = obtenerUriDesdeImageView(img2);
            intent.putExtra("imagen", uri.toString());
            String txt = txt2.getText().toString();
            String pt = pt2.getText().toString();
            intent.putExtra("nombre", txt);
            intent.putExtra("pt", pt);
            startActivity(intent);

        });
        img3.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), InformacionActivity.class);
            Uri uri = obtenerUriDesdeImageView(img3);
            intent.putExtra("imagen", uri.toString());
            String txt = txt3.getText().toString();
            String pt = pt3.getText().toString();
            intent.putExtra("nombre", txt);
            intent.putExtra("pt", pt);
            startActivity(intent);

        });
        img4.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), InformacionActivity.class);
            Uri uri = obtenerUriDesdeImageView(img4);
            String txt = txt4.getText().toString();
            String pt = pt4.getText().toString();
            intent.putExtra("imagen", uri.toString());
            intent.putExtra("nombre", txt);
            intent.putExtra("pt", pt);
            startActivity(intent);

        });


    }
    private Uri obtenerUriDesdeImageView(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        Bitmap bitmap = bitmapDrawable.getBitmap();
        String path = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Titulo", null);
        return Uri.parse(path);
    }
}