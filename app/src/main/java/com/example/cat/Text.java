package com.example.cat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Text extends Activity {

    ArrayList<String> list = new ArrayList<>();
    final Random random = new Random();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_activity);
        list.add("Вам сегодня повезёт");
        list.add("Вам сегодня не повезёт");
        list.add("Вам повiстка");
        list.add("Неделя пройдёт,\nвыпустите её.");
        list.add("Через год вы станете на год старше");
        list.add("Вам сегодня повезёт");
        list.add("Ага, попався");
        list.add("Через год вы станете на год старше");
        list.add("Вам сегодня повезёт");
        list.add("Вам сегодня не повезёт");
        list.add("Ага, попався");
        list.add("Закажите роллов, поешьте");
        list.add("Через год вы станете на год старше");
        list.add("Вам БАН, откройте");
        list.add("Вам сегодня повезёт");
        list.add("Вам повiстка");
        list.add("Вам сегодня повезёт");
        list.add("Завтра вас ждёт не ждёт");
        list.add("Закажите роллов, поешьте");
        list.add("В чём смылс жизни?\nИскать чужие ошибки??");
        list.add("Ага, попався");
        list.add("Вам сегодня повезёт");
        list.add("Через год вы станете на год старше");
        list.add("Вам сегодня повезёт");
        list.add("Вам сегодня не повезёт");
        list.add("Через год вы станете на год старше");
        list.add("Вам сегодня повезёт");
        list.add("Вы уже умерли, просто не знаете об этом...");
        list.add("Вам сегодня повезёт");
        list.add("Закажите роллов, поешьте");
        list.add("Ага, попався");
        list.add("Вам сегодня повезёт");
        list.add("Вам БАН, откройте");
        list.add("Вам сегодня не повезёт");
        list.add("Через год вы станете на год старше");
        list.add("Через год вы станете на год старше");
        list.add("Закажите роллов, поешьте");
        list.add("Вам сегодня не повезёт");
        list.add("Вам сегодня повезёт");
        list.add("Через год вы станете на год старше");
        list.add("Вам повiстка");
        list.add("Вам сегодня повезёт");
        list.add("Вам сегодня не повезёт");
        list.add("Вам сегодня повезёт");
        list.add("Вам БАН, откройте");
        list.add("Вам повiстка");
        list.add("Вам сегодня повезёт");
        list.add("Через год вы станете на год старше");
        list.add("Посмотри во что ты привратился");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(list.get(random.nextInt(list.size())));

        Button button = (Button) findViewById(R.id.textButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Text.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
