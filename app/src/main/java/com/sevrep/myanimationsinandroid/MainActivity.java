package com.sevrep.myanimationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private TextView txtPad;
    private ImageView imageViewHello;
    private ImageView imageViewHi;
    private boolean isHelloWorldVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);
        imageViewHello = findViewById(R.id.imageViewHello);
        imageViewHi = findViewById(R.id.imageViewHi);
        txtPad = findViewById(R.id.textViewPad);

        txtHelloWorld.setX(-1000);
        txtPad.setX(1000);
        
        txtHelloWorld.animate().translationX(0).setDuration(3000);
        txtPad.animate().translationX(0).setDuration(3000);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isHelloWorldVisible) {
                    txtHelloWorld.animate().alpha(0.0f).setDuration(1000);
                    imageViewHello.animate().alpha(0.0f).setDuration(1000);
                    txtHiWorld.animate().alpha(1f).setDuration(1000);
                    imageViewHi.animate().alpha(1f).setDuration(1000);
                    isHelloWorldVisible = false;
                } else {
                    txtHiWorld.animate().alpha(0.0f).setDuration(1000);
                    imageViewHi.animate().alpha(0.0f).setDuration(1000);
                    txtHelloWorld.animate().alpha(1f).setDuration(1000);
                    imageViewHello.animate().alpha(1f).setDuration(1000);
                    isHelloWorldVisible = true;
                }
            }
        });

        txtPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txtPad.animate().translationX(200).setDuration(2000);
                //txtPad.animate().rotation(180).setDuration(2000);
                txtPad.animate().rotationX(360).translationY(-1000).setDuration(2000);
            }
        });
    }
}