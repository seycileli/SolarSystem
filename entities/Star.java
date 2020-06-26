package entities;

public class Star extends HeavenlyBody {
    private final String starType;

    /*
    * Change double to Double
    * So that we can give the Suns orbitalPeriod
    * a NULL value */

    public Star(String name, double orbitalPeriod, String starType) {
        super(name, orbitalPeriod, BodyTypes.STAR);
        this.starType = starType;
    }

    public String getStarType() {
        return starType;
    }

    @Override
    public String toString() {
        return "\n" +
                "| ----------------------- | \n" +
                "|     Star Information    |\n" +
                "| ----------------------- |" +
                "\n|  Name: " + getName() +
                "\n|  Star Type: " + getStarType() +
                "\n---------------------------";
    }
}
