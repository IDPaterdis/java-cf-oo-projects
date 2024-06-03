package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.model.PointXYZ;

public class MainPoint {
    public static void main(String[] args) {
        PointXYZ point = new PointXYZ(3, 4, 5);

        System.out.println("Point: " + point.convertToString());
        System.out.println("XY Distance: " + point.getXYDistance());
        System.out.println("YZ Distance: " + point.getYZDistance());
        System.out.println("XZ Distance: " + point.getXZDistance());
        System.out.println("XYZ Distance: " + point.getXYZDistance());

    }
}
