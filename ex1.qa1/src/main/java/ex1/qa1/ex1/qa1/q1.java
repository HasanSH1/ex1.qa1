package ex1.qa1.ex1.qa1;

public class q1 {

	public static String Comapre(double a, double b, String mod)

	{

		switch(mod) {

		  

		case "regular":

			  

		    if (a < b)

		    	return "B";

		    else

		    	return "A";

		

		  case "negatives":
			  if (-a < b)

			    	return "B";

			    else

			    	return "A";

		   

		  

		  case "reciprocals":
			  if (1/a < 1/b)

			    	return "B";

			    else

			    	return "A";


			    // code block

			   

		  default:

		    // code block

		}

		return "error";

		

	}


}
