package by.epam.logic;

import by.epam.assembly.StringUtils;
import java.util.Arrays;

public class Utils {
	public static boolean isAllPositiveNumbers(String... str){
		return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
	}
}
