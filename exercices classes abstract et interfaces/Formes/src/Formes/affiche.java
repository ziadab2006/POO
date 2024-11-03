package Formes;

public class affiche {

	public static void main(String[] args) {
		Forme cercle = new Cercle(5);
        System.out.println("Cercle - Surface: " + cercle.calculerSurface() + ", P�rim�tre: " + cercle.calculerPerimetre());

        Forme rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle - Surface: " + rectangle.calculerSurface() + ", P�rim�tre: " + rectangle.calculerPerimetre());

        Forme triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle - Surface: " + triangle.calculerSurface() + ", P�rim�tre: " + triangle.calculerPerimetre());
	}

}
