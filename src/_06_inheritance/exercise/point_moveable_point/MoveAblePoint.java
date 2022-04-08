package _06_inheritance.exercise.point_moveable_point;

import java.util.Arrays;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {

    }

    public float[] getSpeed() {
        return new float[]{getXSpeed(), getYSpeed()};
    }


    public MoveAblePoint move() {
        super.setX(this.getX() + xSpeed);
        super.setY(this.getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY()) + " ,speed = " + Arrays.toString(getSpeed());
    }
}


