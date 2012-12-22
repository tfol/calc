package com.e.askey;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	    textView = (TextView) findViewById(R.id.textView1);
        

        
        
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View arg0) {
                        textView.setText("1");
                }             
                }); 
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View arg0) {
                        textView.setText("1");
                }             
                }); 
        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View arg0) {
                        textView.setText("1");
                }             
                }); 
        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View arg0) {
                        textView.setText("1");
                }             
                }); 
        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View arg0) {
                        textView.setText("1");
                }             
                }); 
        Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View arg0) {
                        textView.setText("1");
                }             
                }); 
        Button button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View arg0) {
                        textView.setText("1");
                }             
                }); 
        Button button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View arg0) {
                        textView.setText("1");
                }             
                }); 
        Button button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View arg0) {
                        textView.setText("1");
                }             
                }); 
        Button button0 = (Button)findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View arg0) {
                        textView.setText("1");
                }             
                }); 

        Button buttonplus = (Button)findViewById(R.id.buttonplus);
        buttonplus.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View arg0) {
                        textView.setText("1");
                }             
                }); 
        Button buttoneqaul = (Button)findViewById(R.id.buttoneqaul);
        buttoneqaul.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View arg0) {
                        textView.setText("1");
                }             
                }); 
        }
}