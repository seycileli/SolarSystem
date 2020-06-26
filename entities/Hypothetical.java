package entities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hypothetical extends HeavenlyBody {
    private final static Map<String, HeavenlyBody> bodyTypeHypothetical = new HashMap<>();
    private final static Set<HeavenlyBody> planet = new HashSet<>();

    public Hypothetical(String name, double orbitalPeriod, BodyTypes bodyType) {
        super(name, orbitalPeriod, bodyType);
    }

    /*
    * Because there is only 1 Hypothetical Planet at the moment,
    * We will add it's information within this Class and call this Class
    * In the future if there are ever more, we can just create a new Class
    * and copy and paste the information over */

    public static void planetX() {
        System.out.println("\n Hypothetical Planet X aka Planet 9 🚀");
        HeavenlyBody planetx = new Hypothetical ("Planet X", 20_000, BodyTypes.HYPOTHETICAL);
        bodyTypeHypothetical.put(planetx.getName(), planetx);
        planet.add(planetx);
        System.out.println(planetx.toString());

        System.out.println("---------------------------------------" +
                "\n             More on " + bodyTypeHypothetical.get("Planet X").getName() + ":" +
                "\n---------------------------------------" +
                "\n | Caltech researchers have found mathematical evidence suggesting there may be a Planet X" +
                "\n | deep in the solar system. This bodyTypeHypothetical Neptune-sized planet orbits our Sun in " +
                "\n | a highly elongated orbit far beyond Pluto. The object, which the researchers have nicknamed " +
                "\n | Planet Nine, could have a mass about 10 times that of Earth and orbit about " +
                "\n | 20 times farther from the Sun on average than Neptune. " +
                "\n |" +
                "\n | It may take between 10,000 and 20,000 Earth years to make one full orbit around the Sun." +
                "\n |" +
                "\n | The announcement does not mean there is a new planet in our solar system. " +
                "\n | The existence of this distant world is only theoretical at this point and no direct " +
                "\n | observation of the object nicknamed Planet 9 have been made. " +
                "\n | " +
                "\n | The mathematical prediction of a planet could explain the unique orbits of some " +
                "\n | smaller objects in the Kuiper Belt, a distant region of icy debris that extends far " +
                "\n | beyond the orbit of Neptune. Astronomers are now searching for the predicted planet.");

        System.out.println("\nThere are no known moon(s) for Planet X at this moment.");

        System.out.println(
                "\n ~ More info regarding " + bodyTypeHypothetical.get("Planet X").getName() + ":" +
                        "\n  -----------------------------" +
                        "\n \t Astronomers, including Batygin and Brown, will begin using the world's most powerful " +
                        "\n          telescopes to search for the object in its predicted orbit. Any object that far " +
                        "\n          away from the Sun will be very faint and hard to detect, but astronomers " +
                        "\n          calculate that it should be possible to see it using existing telescopes." +
                        "\n" +
                        "\n \t I would love to find it, says Brown." +
                        "\n          But I'd also be perfectly happy if someone else found it. " +
                        "\n          That is why we're publishing this paper. We hope that other people are going " +
                        "\n          to get inspired and start searching." +
                        "\n" +
                        "\n \t Anytime we have an interesting idea like this, " +
                        "\n          we always apply Carl Sagan's rules for critical thinking, " +
                        "\n          which include independent confirmation of the facts, looking for alternate " +
                        "\n          explanations, and encouraging scientific debate, said Green. " +
                        "\n" +
                        "\n \t If Planet X is out there, we'll find it together. " +
                        "\n          Or we'll determine an alternate explanation for the data " +
                        "\n          that we've received so far." +
                        "\n" +
                        "\n          Now let's go explore.");
    }

}
