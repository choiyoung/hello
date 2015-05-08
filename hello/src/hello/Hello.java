package hello;
class Hello {
/*	public static void main(String[] arge) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
							}
			System.out.println();
			}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (int j = 6; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.println(  );
	}
}
}*/
	public static void main(String[] arge) {
		for (int i = 2; i < 10; i+=4) {
			for (int j = 1; j < 10; j++) {
				System.out.println(
						  i + "*" + j + "=" + (i * j) + "\t"
						+(i+1)+ "*" + j + "=" + ((i+1) * j) + "\t"
						+(i+2)+ "*" + j + "=" + ((i+2) * j) + "\t"
						+(i+3)+ "*" + j + "=" + ((i+3) * j) + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}