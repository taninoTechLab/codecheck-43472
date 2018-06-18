package codecheck;

public class App {
	public static void main(String[] args) {

		boolean str_3 = false;
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);
			if (!args[i].matches("^[0-9]+$")) {
				System.out.println("invalid");
				continue;
			} else if (args[i].contains("3")) {
				str_3 = true;
			}

			int arg = Integer.parseInt(args[i]);
			if (arg <= 1000 && arg > 0) {
				if (arg % 3 == 0 && str_3) {
					System.out.println("dumb");
				} else if (arg % 3 == 0) {
					System.out.println("idiot");
				} else if (str_3) {
					System.out.println("stupid");
				} else {
					System.out.println("smart");
				}

			} else {
				System.out.println("invalid");
			}

		}
	}
}
