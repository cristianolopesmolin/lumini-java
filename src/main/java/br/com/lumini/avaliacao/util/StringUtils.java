package br.com.lumini.avaliacao.util;

public class StringUtils {
	
	public static String fillCEP(final String str) {
		return ValidationUtils.validateString(str) ? str.substring(0, 5) + "-" + str.substring(5) : str;
	}

}
