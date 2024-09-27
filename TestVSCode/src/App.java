public class App {
	public static int doSomething() {
		int x = 7 + 4;
		return x;
	}
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("This is a test of VS Code's git tools.");
        int value = doSomething();
        System.out.println(value);
        System.out.println("Then I imported it into Eclipse using File >> Open Projects from File System");
    }
}
