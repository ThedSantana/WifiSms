package com.example.utils;

import android.widget.ImageView;

public class MockedSmsProvider extends SmsServiceProvider{

	public MockedSmsProvider(String url)  {
		super(url);
	}

	@Override
	public void setNumberField(String number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSmsMessage(String sms) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCapcha(String capcha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendContent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCapchaImage(ImageView imageHolder) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getHtmlBody() {
		// TODO Auto-generated method stub
		return null;
	}

}
