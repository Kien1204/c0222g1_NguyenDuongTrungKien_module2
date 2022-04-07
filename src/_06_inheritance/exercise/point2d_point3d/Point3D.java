package _06_inheritance.exercise.point2d_point3d;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z =0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float z, float x , float y){
     super.setXY(x, y);
     this.z= z;

    }
    public float[] getXYZ(){
        return new float[] {getX(),getY(),getZ()};
    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}
