
public class ProgramSeven {
	
	public static void main(String[] args) {
		int a,b,sum = 0;
		if(args.length < 2){
			System.out.println("Parameter Missing");
			return ;
		}
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
		
		System.out.print(a+" "+b+" ");
		
		for (int i = 0; i < 13; i++) {
			b = a+b;
			a = b-a;
			System.out.print(b+" ");
		}
	}
}
