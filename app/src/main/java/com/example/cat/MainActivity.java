package com.example.cat;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final Random random = new Random();
    int i = random.nextInt(10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomMethod();
                i = random.nextInt();
            }
        });
    }

    public void randomMethod() {
        if (i == 5) {
            toast();
        }
        if (i == 6) {
            toImage();
        }
        if (i != 5 & i != 6) {
            toText();
        }
    }

    public void toText() {
        Intent intent = new Intent(MainActivity.this, Text.class);
        startActivity(intent);
    }
    public void toImage() {
        Intent intent = new Intent(MainActivity.this, Image.class);
        startActivity(intent);
    }
    public void toast() {
        Toast toast = new Toast(getApplicationContext());
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,
                (ViewGroup) findViewById(R.id.toast));
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    @Override
    public void onClick(View v) {

    }
}