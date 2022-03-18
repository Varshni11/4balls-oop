public class Ball {
    private int xPos,yPos;
    private int diameter;
    private int speed;

    public Ball(int xPos,int yPos,int diameter,int speed) {
        this.xPos = xPos;
        this.yPos= yPos;
        this.diameter=diameter;
        this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void moveX(){
        this.xPos+=this.speed;
    }





}
