package utilities;

public class CurrencyConverter {

		 public static final double IOF =  0.06;
			
	      public static	double converter (double price, double bought) {
	    	  double c = (price * bought);
	    	  return  c * (1.0 + IOF);
		}
				

	}

