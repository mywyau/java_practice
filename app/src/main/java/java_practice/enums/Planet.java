package java_practice.enums;

public enum Planet {

    Mercury(3.303e+20, 2.439e+6),
    Venus(4.869e+24, 6.052e+6),
    Earth(5.976e+24, 6.378e+6),
    Mars(6.421e+23, 3.397e+6);

    // Constructor for the enum
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    private final double mass; // in kilograms
    private final double radius; // in meters

    // Method to calculate the surface gravity of the planet
    public double surfaceGravity() {
        final double G = 6.67430E-11; // gravitational constant
        return G * mass / (radius * radius);
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return name() + " [Mass: " + mass + ", Radius: " + radius + "]";
    }
}
