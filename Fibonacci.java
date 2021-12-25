package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int fnum=0, secnum=1, sum;
		int num=8;
		
		System.out.println(fnum);
		System.out.println(secnum);
		for(int i=1; i<num; i++) {
			sum=fnum+secnum;
			fnum=secnum;
			secnum=sum;
			System.out.println(sum);
		}

	}

}
