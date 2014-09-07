package com.example.utils;

import android.widget.ImageView;

public interface IDomParser {

	void setNumberField(String number);
	void setSmsMessage(String sms);
	void setCapcha(String capcha);
	
	void sendContent();
	void getCapchaImage(ImageView image);
	
	
}
