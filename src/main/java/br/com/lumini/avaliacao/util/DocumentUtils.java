package br.com.lumini.avaliacao.util;

public class DocumentUtils {

	public static String fillCNPJ(String str) {
		return ValidationUtils.validateString(str)
				? str.substring(0, 2) + "." + str.substring(2, 5) + "." + str.substring(5, 8) + "/"
						+ str.substring(8, 12) + "-" + str.substring(12)
				: str;
	}

	public static String clearCNPJ(String str) {
		return ValidationUtils.validateString(str) ? str.replaceAll("[./-]", "") : str;
	}

}
