package consultorio.medico.Console;

import java.util.Scanner;


public class Console {
	
	public static String scanString(Object out)
	{
		System.out.print(out);
		Scanner scanner = new Scanner (System.in);
		return(scanner.nextLine());
	}
        public static int scanInt(Object out)
        {
                System.out.print(out);
                Scanner scanner = new Scanner (System.in);
                return(scanner.nextInt());
        }
	  

}
