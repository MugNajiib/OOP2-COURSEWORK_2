import java.util.ArrayList;

public class javMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter students name (Enter exist when done)");
		ArrayList<String> naj = new ArrayList<String>();
		ArrayList<String> css = new ArrayList<String>();
		ArrayList<Double> ma = new ArrayList<Double>();
		int n=1;
		int r= 1;
		double SUM = 0;
		double AVG = 0;
		while(true) {
			System.out.print("Enter student "+n+":");
			String najib = new java.util.Scanner(System.in).nextLine();
			int c = 1;
				while(c<=5) {
				System.out.print("Enter Course Unit "+c+":");
				String cr = new java.util.Scanner(System.in).nextLine();
				System.out.print("Enter Marks:");
				Double mug = new java.util.Scanner(System.in).nextDouble();
				SUM = SUM+ mug;
				if(najib.equals("Exit"))
					break;
				else
					naj.add(najib);
					ma.add(mug);
					css.add(cr);
					
				c++;
		}		
				System.out.println("Student name:"+najib);
				System.out.println("SUM: ="+SUM);
				AVG = SUM/5;
				System.out.println("AVERAGE: = "+AVG);
				if(AVG>=85){
					System.out.println("GRADE = A");
				}else{
					if(AVG>=75){
						System.out.println("GRADE = B");
					}else{
						if(AVG>=65){
							System.out.println("GRADE = C");
						}else{
							if(AVG>=50){
								System.out.println("GRADE = D");
							}else{
								if(AVG<=49){
									System.out.println("GRADE = F");
								}
							}
						}
					}
				}
				n++;
	}
}
}

