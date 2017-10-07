class Glass<T>{
	 public T value;
	 public void show() {
	 System.out.println("hello " + value);
	 }
}
public class Head {
	public static void main(String args[]) {
		Glass gS = new Glass();
		gS.value=123;
		gS.show();
	}
}
