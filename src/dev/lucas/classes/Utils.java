package dev.lucas.classes;

public abstract class Utils {

	public static final boolean isAQuestion(String string) {
		return string.contains("?");
	}

	public static final boolean isAScream(String string) {
		boolean hasScream = false;

		for (String piece : string.split(" ")) {
			if (piece.trim().equals(piece.toUpperCase()))
				hasScream = true;
		}

		return hasScream;
	}

	public static final boolean isAMathOperation(String string) {

		return 
				string.contains("some") 		|| 
				string.contains("soma") 		|| 
				string.contains("subtraia") 	|| 
				string.contains("multiplique") 	|| 
				string.contains("multiplica") 	|| 
				string.contains("divide") 	|| 
				string.contains("divida");
	}
}
