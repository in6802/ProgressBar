package com.cji.edu.progressbar;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);

        toggleButton = (ToggleButton)findViewById(R.id.toggleButton);
        textView = (TextView)findViewById(R.id.textView);
    }

    public void onClicked(View view){
        String text = toggleButton.getText() + " - " + toggleButton.isChecked();

        if(toggleButton.isChecked())
            progressBar.setVisibility(view.VISIBLE);

        else
            progressBar.setVisibility(view.GONE);

        textView.setText(text);
    }
}
