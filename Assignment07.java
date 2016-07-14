public class Assignment07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length!=0){
		int a=Integer.parseInt(args[0]);
		int fact=1;
		if(a!=0){
			for(int i=1;i<=a;i++){
				 fact=fact*i;
				
			
			}
			System.out.println(" the factorial is "+fact);
		}
		else{
			System.out.println("the factorial is 1");
			}
		}
		else{
			System.out.println("The integer value is expected");
		}
		}
		// TODO Auto-generated method stub

	}

