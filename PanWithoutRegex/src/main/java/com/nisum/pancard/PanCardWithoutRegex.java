package com.nisum.pancard;

import java.util.Objects;

public class PanCardWithoutRegex {

	public static final String regex = "[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}";

	public boolean isValidPancardNumber(String panCardNumber) {
		if (Objects.isNull(panCardNumber) || panCardNumber.length() != 10) {
			return false;
		}

		char[] charcters = panCardNumber.toCharArray();
		for (int i = 0; i <= 4; i++) {
			char character = charcters[i];
			if (!((character >= 65 && character <= 90) || (character >= 97 && character <= 122))) {

				return false;
			}
		}

		for (int i = 5; i <= 8; i++) {
			char character = charcters[i];
			if (!(character >= 48 && character <= 57)) {
				return false;
			}
		}
		char character = charcters[9];
		if (!((character >= 65 && character <= 90) || (character >= 97 && character <= 122))) {

			return false;
		}
		return true;
	}

	public boolean isValidPancardNumber(String panCardNumber, boolean userRegex) {

		return Objects.nonNull(panCardNumber) && panCardNumber.matches(regex);
	}
}