
public class ExceptionHandlingeExample {
	public static void main(String args[]) {
		// Using Try-Catch Block
		try {
			System.out.println("Example One:"+ (100/0));
			} catch(Exception e) {
				System.out.println("Message:"+ e.getMessage());
				}
		//Using Try-Catch with finally
		try {
			int arr[] = {12,11,13,14};
			System.out.println("Example two:"+arr[12]);
		
		}
		catch(Exception e) {
			System.out.println("Message:"+ e.getMessage());
		}
		finally {
			System.out.println("Finally block is executed");
		}
		//multiple catch block
		try {
			System.out.println("Example three:"+ (100/0));
			int arr[] = {12,11,13,14};
			System.out.println("Example four:"+arr[12]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Message:"+ e.getMessage());
		}
		//Other Exception classes: NullPointerException, NumberFormatException
		// NullPointerexception with 'thow' & 'new' keyword
		try {
			String name = null;
			System.out.println("Example five:"+ name);
			if(name == null) {
				throw new NullPointerException("is null");
			}
		}
		catch(NullPointerException e) {
			System.out.println("Message:"+ e.getMessage());
		}
		// another ecample of 'throw' & 'new' keyword
		System.out.println("Example six:");
		try{
		int age = 15;
		if(age<18) {
			throw new NumberFormatException("You're not eligible to vote");
		}
	

		}
		catch(NumberFormatException e) {
			System.out.println("Message:"+ e.getMessage());
		}

	}}


 	