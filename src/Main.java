

public class Main {


    public static void main(String[] args) {

        int x = (int)(Math.random() * (9));
        int y = (int)(Math.random() * (9));
        Position position = new Position(x, y);
        Orientation orientation = Orientation.South;
        Rover rover = new Rover(position, orientation);
        System.out.println("Init: " + rover.toString());
        rover.goForward();
        rover.setOrientation(Orientation.East); //droite
        System.out.println("goForward: " + rover.toString());
        rover.setOrientation(Orientation.North); //haut
        rover.goBackward();
        System.out.println("goBackward: " + rover.toString());





    }
}
