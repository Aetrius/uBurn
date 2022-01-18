package com.example.uburn;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
        setTitleText();

    }

    private void setTitleText() {
        TextView textView = (TextView) findViewById(R.id.title_text);
        Spannable word = new SpannableString("u");

        word.setSpan(new ForegroundColorSpan(Color.rgb(249,87,56)), 0, word.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(word);
        Spannable wordTwo = new SpannableString("Burn");

        wordTwo.setSpan(new ForegroundColorSpan(Color.WHITE), 0, wordTwo.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.append(wordTwo);
    }
}