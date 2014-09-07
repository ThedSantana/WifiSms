package com.example.utils;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class SmsServiceProvider implements IDomParser,IHtmlGetter {
	private final URL url;
	private String htmlBody;

	public SmsServiceProvider(String url) {
		try {
			this.url = new URL(url);
		} catch (MalformedURLException e) {
			throw new IllegalArgumentException("Stupid url");
		}
		htmlBody= this.getHtmlBody();
	}
}
