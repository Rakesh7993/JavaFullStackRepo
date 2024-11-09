package nit.Proj01;


public class App {
	
	public int sum(int x,int y) {
		return x+y;
	}
    public static void main(String[] args) {
     App a = new App();
     a.sum(2, 5);
     System.out.println(a);
    }
}
