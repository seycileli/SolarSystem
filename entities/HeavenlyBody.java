package entities;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyTypes bodyType;

    /*
    Modify the previous HeavenlyBody example so that the HeavenlyBody
    class also has a "bodyType" field.

    This field will store the
    type of HeavenlyBody (such as STAR, PLANET, MOON, etc).

    You can include as many types as you want, but must support at
    least PLANET and MOON.

    For each of the types that you support, subclass the HeavenlyBody class
    so that your program can create objects of the appropriate type.
    */

    /* A nested enum is automatically static */
    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID,
        HYPOTHETICAL,
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody heavenlyBodyObject = (HeavenlyBody) obj;
            if (this.name.equals(heavenlyBodyObject.getName())) {
                return this.bodyType == heavenlyBodyObject.getBodyType();
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return "\n" +
                "| ----------------------- | \n" +
                "|  Planetary Information  |\n" +
                "| ----------------------- |" +
                "\n|  Name: " + getName() +
                "\n|  Type: " + getBodyType() +
                "\n|  Orbital Period: " + getOrbitalPeriod() + " days in Earth years \n" +
                "---------------------------------------";
    }
}
