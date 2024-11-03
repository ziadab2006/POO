package Formes;

public class affiche {

	public static void main(String[] args) {
		Forme cercle = new Cercle(5);
        System.out.println("Cercle - Surface: " + cercle.calculerSurface() + ", Périmètre: " + cercle.calculerPerimetre());

        Forme rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle - Surface: " + rectangle.calculerSurface() + ", Périmètre: " + rectangle.calculerPerimetre());

        Forme triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle - Surface: " + triangle.calculerSurface() + ", Périmètre: " + triangle.calculerPerimetre());
	}

}
