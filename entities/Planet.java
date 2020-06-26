package entities;

public class Planet extends HeavenlyBody {
    private final String planetType;

    public Planet(String name, double orbitalPeriod, String planetType) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
        this.planetType = planetType;
    }

    public String getPlanetType() {
        return planetType;
    }

    @Override
    public String toString() {
        return "\n" +
                "| ----------------------- | \n" +
                "|  Planetary Information  |\n" +
                "| ----------------------- |" +
                "\n|  Name: " + getName() +
                "\n|  Planet Type: " + getPlanetType() +
                "\n|  Orbital Period: " + getOrbitalPeriod() + " days in Earth years \n" +
                "---------------------------------------";
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
