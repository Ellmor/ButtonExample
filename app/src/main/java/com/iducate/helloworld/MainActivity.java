package com.iducate.helloworld;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("martin");
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
