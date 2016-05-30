
public class Bingo {
	static int numbers[] = {7, 25, 5, 19, 30};
	public static void main(String[] args) {
		
		int a,b,sum = 0;
		
		if(args.length < 2){
			System.out.println("Parameter Missing");
			return;
		}
		
		
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		if(a < 1 || a > 40 || b < 1 || b > 40){
			System.out.println("Number must be Between 1 to 40");
			return;
		}
		System.out.println("Your First Namber Was " + a);

		System.out.println("Your Second Namber Was " + b);
		
		if(contains(a) && contains(b)){
			System.out.println("Its Bingo!");
		}
		else {

			System.out.println("Not Found");
		}

	}
	public static boolean contains(int a){
		for (int i : numbers) {
			if(i == a){
				return true;
			}
		}
		return false;
	}


}
