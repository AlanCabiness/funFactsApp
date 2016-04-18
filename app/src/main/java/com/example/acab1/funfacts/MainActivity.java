package com.example.acab1.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private FactsList mFactList = new FactsList();
    private ColorsList mColorsList = new ColorsList();

    //view variables
    private TextView mFactTextView;
    private Button mNewFactButton;
    private RelativeLayout mMainViewLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign values to view vars
        mFactTextView = (TextView) findViewById(R.id.funFactView);
        mNewFactButton = (Button) findViewById(R.id.newFactButton);
        mMainViewLayout = (RelativeLayout) findViewById(R.id.mainViewLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View v){

                String fact = mFactList.getFact();
                mFactTextView.setText(fact);
                int newColor = mColorsList.getColor();
                mMainViewLayout.setBackgroundColor(newColor);
            }
        };
        mNewFactButton.setOnClickListener(listener);
    }
}
