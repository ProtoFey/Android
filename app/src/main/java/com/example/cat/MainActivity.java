package com.example.cat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomMethod();
            }
        });
    }

    public void randomMethod() {
        int i = random.nextInt(10);
        if (i == 0) {
            toast();
        }
        if (i != 0) {
            toText();
        }
    }

    public void toText() {
        Intent intent = new Intent(MainActivity.this, Text.class);
        startActivity(intent);
    }
    public void toast() {
        Toast toast = Toast.makeText(getApplicationContext(),"Ты чего наделал", Toast.LENGTH_LONG);
        LinearLayout toastContainer = (LinearLayout) toast.getView();
        toastContainer.setBackgroundColor(Color.TRANSPARENT);
        ImageView catImageView = new ImageView(getApplicationContext());
        catImageView.setImageResource(R.drawable.like_smile);
        toastContainer.addView(catImageView, 0);
        toast.show();
    }

    @Override
    public void onClick(View v) {

    }
}