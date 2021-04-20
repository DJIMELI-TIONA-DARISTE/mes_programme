import java.util.Scanner;
public class Rectangle {
    private double nLargeur;
    private double nLongeur;
    public Rectangle(double largeur,double longeur){
        this.nLargeur=largeur;
        this.nLongeur=longeur;
    }
    public double Perimetre(double largeur,double longeur){
       return (longeur+largeur)*2;
    }
}