import java.util.*;
public class converter {
	private int leninft;
	public converter(int leninft){
		this.leninft=leninft;
	}
	public void setlen(int leninft) {
		this.leninft=leninft;
	}
	public double res(int len) {
		double r=len*30.48;
		return r;
	}
	public void printres(int len) {
		double x=res(len);
		System.out.println("Length in cm: "+x+" cm.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter length in ft: ");
		int len = in.nextInt();
		converter my = new converter(len);
		my.printres(len);
	}
}