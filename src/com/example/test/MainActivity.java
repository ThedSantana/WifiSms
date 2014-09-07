package com.example.test;

import com.example.utils.IDomParser;
import com.example.utils.MockedSmsProvider;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {
	IDomParser parser ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		parser = new MockedSmsProvider("https://www.life.com.ua/sms/smsFree.html");
		parser.getCapchaImage((ImageView)findViewById(R.id.capchaField));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void send(){
		EditText recipient = (EditText)findViewById(R.id.numberField);
		EditText text = (EditText)findViewById(R.id.textField);
		parser.setNumberField(recipient.getText().toString());
		parser.setSmsMessage(text.getText().toString());
		parser.setCapcha("mockedCapcha");
		parser.sendContent();	
	}
}
