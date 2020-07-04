package com.example.practical_2_part_a;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private Button Zero;
    private Button Count;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        Zero = findViewById(R.id.button_zero);
        Count = findViewById(R.id.button_count);
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view){
        ++mCount;
        if (mShowCount !=null)
            mShowCount.setText(Integer.toString(mCount));
        Zero.setBackgroundColor(Color.BLUE);
        switch (mCount %2){
            case 0: view.setBackgroundColor(Color.MAGENTA);
                break;
            case 1: view.setBackgroundColor(Color.GREEN);
                break;
            default:break;
        }
    }
    public void resetZero(View view){
        mCount= 0;
        mShowCount.setText(Integer.toString(mCount));
        Zero.setBackgroundColor(Color.DKGRAY);
        Count.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
    }

}