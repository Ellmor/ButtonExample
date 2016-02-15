package com.iducate.helloworld;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("piotr");

        final Button button = (Button) findViewById(R.id.btnNew);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Toast

                Toast.makeText(MainActivity.this, "Hello, Piotr", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void sayHello(View view) {

        Dialog dialog = new Dialog(this);

        dialog.setTitle("Greetings");

        TextView textView = new TextView(this);
        textView.setText("Hello World");
        textView.setPadding(20, 20, 20, 20);

        dialog.setContentView(textView);

        dialog.show();
    }

}
