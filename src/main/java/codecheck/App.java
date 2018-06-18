package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			System.out.println(output);

			if(args[i] == null ) {
				System.out.println("invalid");
			} else {
				int arg = Integer.parseInt(args[i]);

			}

		}
	}
}
