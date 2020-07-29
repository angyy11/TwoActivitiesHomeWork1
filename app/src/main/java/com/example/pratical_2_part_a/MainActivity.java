package com.example.pratical_2_part_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    public static final String EXTRA_MESSAGE = "com.example.pratical_2_part_a.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }
    public void launchSecondActivity(View view) {
        //Toast  toast = Toast.makeText(this, R.string.second_message, Toast.LENGTH_SHORT);
        //toast.show();

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        String  num = mShowCount.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, num);
        startActivityForResult(intent, TEXT_REQUEST);
    }
    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}