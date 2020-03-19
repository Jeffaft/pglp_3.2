

public enum AppSingleton {
	ENVIRONNEMENT;
	public void run(String[]args) {
		 System.out.println("hello world!");
	}
	public static void main(String[]args) {
	ENVIRONNEMENT.run(args);
	}
}
