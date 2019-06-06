package br.com.cvc.rf.api.util;

import java.text.NumberFormat;

import org.apache.commons.lang3.StringUtils;

public class Util {

	public static String formatBalance(double balance) {		
		return String.valueOf( NumberFormat.getCurrencyInstance().format(balance));
	}

	public static String formatAccountNumber(long number) {		
		return StringUtils.leftPad(String.valueOf(number), 6,"0");
	}

}
