public class Rover {
    private Position position;
    private Orientation orientation;

    public Rover(Position position, Orientation orientation) {
        this.position = position;
        this.orientation = orientation;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public void goForward() {

        switch (this.orientation) {
            case East:
                if(this.position.getX() == 9) {
                    this.position.setX(0);
                } else {
                    this.position.setX(this.position.getX()+1);
                }
                break;
            case West:
                if(this.position.getX() == 0) {
                    this.position.setX(9);
                } else {
                    this.position.setX(this.position.getX()-1);
                }
                break;
            case North:
                if(this.position.getY() == 9) {
                    this.position.setY(0);
                } else {
                    this.position.setY(this.position.getY()+1);
                }
                break;
            case South:
                if(this.position.getY() == 0) {
                    this.position.setY(9);
                } else {
                    this.position.setY(this.position.getY()-1);
                }
                break;
        }

    }
    public void goBackward() {
        switch (this.orientation) {
            case West:
                if(this.position.getX() == 9) {
                    this.position.setX(0);
                } else {
                    this.position.setX(this.position.getX()+1);
                }
                break;
            case East:
                if(this.position.getX() == 0) {
                    this.position.setX(9);
                } else {
                    this.position.setX(this.position.getX()-1);
                }
                break;
            case South:
                if(this.position.getY() == 9) {
                    this.position.setY(0);
                } else {
                    this.position.setY(this.position.getY()+1);
                }
                break;
            case North:
                if(this.position.getY() == 0) {
                    this.position.setY(9);
                } else {
                    this.position.setY(this.position.getY()-1);
                }
                break;
        }

    }

    @Override
    public String toString() {
        return "Rover{" +
                "position=" + position +
                ", orientation=" + orientation +
                '}';
    }
}

