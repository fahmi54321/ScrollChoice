package com.android.a68scrollchoice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.webianks.library.scroll_choice.ScrollChoice;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> data = new ArrayList<>();
    TextView textView;
    ScrollChoice scrollChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txt_result);
        scrollChoice = findViewById(R.id.scroll_choice);
        
        loadData();

        scrollChoice.addItems(data,2); // default selected is item at index 2
        scrollChoice.setOnItemSelectedListener(new ScrollChoice.OnItemSelectedListener() {
            @Override
            public void onItemSelected(ScrollChoice scrollChoice, int position, String name) {
                textView.setText("Choice"+name);
            }
        });
    }

    private void loadData() {
        data.add("Captain America");
        data.add("Batman");
        data.add("Spider Man");
        data.add("Ant Man");
        data.add("Iron Man");
        data.add("Grand Master");
        data.add("Thor");
    }
}