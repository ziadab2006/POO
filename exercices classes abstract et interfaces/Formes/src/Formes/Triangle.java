package Formes;

public class Triangle extends Forme {
	 private double coteA;
	    private double coteB;
	    private double coteC;
	    
	    
	    public Triangle(double coteA, double coteB, double coteC) {
	        this.coteA = coteA;
	        this.coteB = coteB;
	        this.coteC = coteC;
	    }

	    @Override
	    public double calculerSurface() {
	        double semiPerimetre = calculerPerimetre() / 2;
	        return Math.sqrt(semiPerimetre * (semiPerimetre - coteA) * (semiPerimetre - coteB) * (semiPerimetre - coteC));
	    }

	    @Override
	    public double calculerPerimetre() {
	        return coteA + coteB + coteC;
	    }
}
