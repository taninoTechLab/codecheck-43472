package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
			if (!args[i].matches("^[0-9]+$")) {
				System.out.println("invalid");
				return;
			}

			int arg = Integer.parseInt(args[i]);
			if (arg <= 1000 && arg > 0) {
				System.out.println("smart");

			} else {
				System.out.println("invalid");
			}

		}
	}
}
