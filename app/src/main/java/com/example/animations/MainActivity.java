package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    public void billBill(View view){
        ImageView billGates = (ImageView) findViewById(R.id.billGates);
        ImageView markImage = (ImageView) findViewById(R.id.markImage);
        billGates.animate().alpha(0f).setDuration(2000);
        markImage.animate().alpha(1f).translationXBy(1000f).translationYBy(1000f).rotationBy(0).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView markImage = (ImageView) findViewById(R.id.markImage);
        markImage.setTranslationX(-1000f);
        markImage.setTranslationY(-1000f);
    }
}