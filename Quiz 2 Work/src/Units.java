public class Units {
	private int Totcar;
	private int DownP;
	private int LenMonths;
	private double Interest;
		
	public Units(int totcar, int downP, int lenMonths, double interest) {
		super();
		Totcar = totcar;
		DownP = downP;
		LenMonths = lenMonths;
		Interest = interest;
	}

	public int getTotcar() {
		return Totcar;
	}

	public void setTotcar(int totcar) {
		Totcar = totcar;
	}

	public int getDownP() {
		return DownP;
	}

	public void setDownP(int downP) {
		DownP = downP;
	}

	public int getLenMonths() {
		return LenMonths;
	}

	public void setLenMonths(int lenMonths) {
		LenMonths = lenMonths;
	}

	public double getInterest() {
		return Interest;
	}

	public void setInterest(int interest) {
		Interest = interest;
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
//Trying to find how to round a double online and found this formula online on stackoverflow
	

	public double theMonthlyPayment() {
		double theMonthlyPayment = round ((((((getTotcar()*(getInterest())/12)/(1 - Math.pow(1+getInterest()/12, (-getLenMonths()))))))), 2) ;
		return theMonthlyPayment;
		
	}
	
	public double theTotInterest() {
		double theTotInterest = round ((((getTotcar()*(getInterest())/12)/(1 - Math.pow(1+getInterest()/12, (-getLenMonths())))) * getLenMonths()) - (getTotcar()- getDownP()), 2);
		return theTotInterest;
	}

}
