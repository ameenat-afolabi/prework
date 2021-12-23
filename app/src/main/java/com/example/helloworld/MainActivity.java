package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defines textview to reduce duplicate code and constant copy pasting
        TextView textView = ((TextView) findViewById(R.id.text));
        //lets user tap on the button
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this will change the color
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.pink));
                //changes color to pink
            }
        });

        //change background color
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //#b0e0e6
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_blue));
            }
        });


        //change text
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome");
            }
        });

        //reset everything to default settings



//when background is clicked on everything resets to default
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user click on anythink on parent then all the chnges will be made

                //reset background color to original color R.color.light_purple
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_purple));

                //reset text color to black @+id/text
                textView.setTextColor(getResources().getColor(R.color.black));

                //reset the text to Hello from Ameenat! @+id/text
                textView.setText("Hello from Ameenat");
            }
        });

        //users text replaces default text when the button is clicked on
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userEnteredText = ((EditText)findViewById(R.id.editText)).getText().toString();

                //if the csutom text is an empty string then we will replace it with the custom text
                if(userEnteredText.isEmpty()){
                    textView.setText("Enter your own text!");
                }else{
                    textView.setText(userEnteredText);//the text view will now be set to the custom text
                }
            }
        });


    }
}