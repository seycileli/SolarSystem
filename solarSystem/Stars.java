package solarSystem;

import entities.HeavenlyBody;
import entities.Star;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Stars {
    private final static Map<String, HeavenlyBody> sunInfo = new HashMap<>();
    private final static Set<HeavenlyBody> collectSuns = new HashSet<>();

    public static void starsOverview() {
        System.out.println("\n Quick overview of the known Stars in our Galaxy \n");

        HeavenlyBody sun = new Star("Sun", 0.0, "G-Type");
        sunInfo.put(sun.getName(), sun);
        collectSuns.add(sun);
        System.out.println(sun.toString());

        HeavenlyBody alphaCentauri = new Star("Alpha Centauri", 0.0, "G-Type");
        sunInfo.put(alphaCentauri.getName(), alphaCentauri);
        collectSuns.add(alphaCentauri);
        System.out.println(alphaCentauri.toString());

        HeavenlyBody sirius = new Star("Sirius", 0.0, "A-Type");
        sunInfo.put(sirius.getName(), sirius);
        collectSuns.add(sirius);
        System.out.println(sirius.toString());

        HeavenlyBody uyScuti = new Star("UY Scuti", 0.0, "A-Type");
        sunInfo.put(uyScuti.getName(), uyScuti);
        collectSuns.add(uyScuti);
        System.out.println(sirius.toString());

        HeavenlyBody r136a1 = new Star("R136a1", 0.0, "F-Type");
        sunInfo.put(r136a1.getName(), r136a1);
        collectSuns.add(r136a1);
        System.out.println(r136a1.toString());

        HeavenlyBody vega = new Star("Vega", 0.0, "A-Type");
        sunInfo.put(vega.getName(), vega);
        collectSuns.add(vega);
        System.out.println(vega.toString());

        HeavenlyBody betelgeuse = new Star("Betelgeuse", 0.0, "Unknown");
        sunInfo.put(betelgeuse.getName(), betelgeuse);
        collectSuns.add(betelgeuse);
        System.out.println(betelgeuse.toString());

        HeavenlyBody antares = new Star("Antares", 0.0, "Unknown");
        sunInfo.put(antares.getName(), antares);
        collectSuns.add(antares);
        System.out.println(antares.toString());

        HeavenlyBody rigel = new Star("Rigel", 0.0, "Unknown");
        sunInfo.put(rigel.getName(), rigel);
        collectSuns.add(rigel);
        System.out.println(rigel.toString());
    }

    public static void generalInformation() {

        System.out.println("\n---------------------------------------" +
                "\n      General Information about Stars " +
                "\n---------------------------------------" +
                "\n | Stars are luminous spheres made of plasma – a superheated gas threaded with a magnetic field. " +
                "\n | They are made mostly of hydrogen, which stars fuse in their cores. " +
                "\n | " +
                "\n | That process releases energy, which pushes against the weight of the outer layers " +
                "\n | of the star and keeps it stable. The energy is also released as heat and light, " +
                "\n | which are radiated out to space. Stars are the main components of galaxies, " +
                "\n | and were among the first objects to form in the early universe. " +
                "\n | " +
                "\n | The closest star to Earth is the Sun.");

        System.out.println(
                "\n ~ Quick facts about Stars ⭐ " +
                        "\n \t (1) There are 9,096 stars visible to the naked eye in the entire sky. " +
                        "\n          To see more, you have to use a telescope to reveal stars fainter " +
                        "\n          than your eyes can see." +
                        "\n \t (2) You can only see about 2,000 stars on a very dark night with the naked " +
                        "\n          eye from any given place on Earth. To do this, you need to observe " +
                        "\n          on a moonless night and be far away from sources of light pollution." +
                        "\n \t (3) Stars are born in batches in their stellar nurseries. Over time, " +
                        "\n          they travel through the Milky Way, far from their crèches." +
                        "\n \t (4) The more massive a star, the shorter its lifespan. " +
                        "\n          A very massive star may live only tens of millions of years, " +
                        "\n          while a cool dwarf will shine on for billions of years. " +
                        "\n          At an age of about 4.5 billion years, our Sun is considered middle-aged." +
                        "\n \t (5) When you look at a star (or any object in space) you are seeing how " +
                        "\n          it looked in the past. The Sun appears as it was 8.5 minutes ago. " +
                        "\n          The view of Alpha Centauri is 4.3 years old, while the appearance of Sirius " +
                        "\n          is more than 8 years old. \n");

        System.out.println("---------------------------------------" +
                "\n             How Stars Form" +
                "\n---------------------------------------" +
                "\n | Star formation happens in clouds of interstellar gas and dust called “nebulae”. " +
                "\n | These clouds are mostly molecular hydrogen, and are often referred to as HII regions. " +
                "\n | The process begins when the cloud is nudged into a spinning motion, perhaps by a shock wave " +
                "\n | from a nearby supernova explosion. Clumps begin to form, and they get hotter and hotter as " +
                "\n | they gain more mass. When the temperature inside such a “young stellar object” reaches " +
                "\n | 10 million degrees Celsius, a process called “nuclear fusion” ignites, and a star is born." +
                "\n |" +
                "\n | Star birth can take millions of years and create families of stars. " +
                "\n | Astronomers see examples of star formation in nebulae throughout our own Milky Way Galaxy " +
                "\n | and in many other galaxies. " +
                "\n | The most famous and closest stellar nursery to Earth is the Orion Nebula, " +
                "\n | which lies about 1,500 light-years away and is visible to observers from " +
                "\n | November through April each year. \n");

        System.out.println("---------------------------------------" +
                "\n             How Stars Die" +
                "\n---------------------------------------" +
                "\n | Stars may “live” longer than humans do – ranging from tens of millions to billions of years – " +
                "\n | but eventually, they, too, come to the ends of their lives. " +
                "\n | The manner of a star’s death depends on the mass it had after it finished forming. " +
                "\n | Stars with masses similar to the Sun die much differently from stars that have " +
                "\n | 7 or more solar masses. " +
                "\n | Yet, the process of star death starts out the same for all stars: they run out of fuel. " +
                "\n | For much of its life, a star fuses hydrogen to make helium. When that runs out, " +
                "\n | then the star fuses helium, and then carbon. Each level of fusion releases more energy, " +
                "\n | which heats up the star." +
                "\n | " +
                "\n | In sun-like stars, the increased heating causes them to swell up to become giant stars. " +
                "\n | Any nearby planets are enveloped by the expanding star. Eventually the outer stellar " +
                "\n | atmosphere blows away, creating an expanding cloud of gas around the star. " +
                "\n | This is called a “planetary nebula”. What’s left of the star itself slowly shrinks and cools. " +
                "\n | Eventually, the dying star becomes a white dwarf." +
                "\n | " +
                "\n | Stars that are much more massive than the Sun continue the fusion process until they reach a " +
                "\n | point where the core collapses. The outer layers also collapse onto the core and then " +
                "\n | rebound out to space in a catastrophic explosion called a supernova." +
                "\n | " +
                "\n | When stars die, all the elements they created in their cores are scattered to space, " +
                "\n | to become part of interstellar clouds of gas and dust. Those chemical elements are seed " +
                "\n | materials for new generations of stars, planets, and life. \n");

        System.out.println("---------------------------------------" +
                "\n             Types of Stars" +
                "\n---------------------------------------" +
                "\n | Astronomers sort stars into categories according to their spectral characteristics – " +
                "\n | that is the information contained in the light they radiate. " +
                "\n | " +
                "\n | The general categories are O, B, A, F, G, K, M, R, N, T, Y, and group stars (and stellar objects) " +
                "\n | by their temperatures, luminosities, and colors. For example, O- and " +
                "\n | B-type stars are blue-looking and are generally among the hottest stars – " +
                "\n | between 30-40,000 Kelvin. A-type stars are blue-white and have temperatures around 9,500 K. " +
                "\n | " +
                "\n | The F-type stars are white and are no hotter than 7,500 K. The G-type stars are yellow-white " +
                "\n | and around 5,900-6,000 K. At the cooler end of the spectrum, the K and M stars are orange " +
                "\n | and red, respectively, and range from 5,300 to 3,800 degrees Kelvin." +
                "\n | " +
                "\n | The coolest stellar objects are the R, N, T, and Y stars, which include the brown dwarfs " +
                "\n | (objects too hot to be planets and too cool to be stars)." +
                "\n | " +
                "\n | Astronomers further classify stars by such characteristics as their rotation rates, " +
                "\n | and metallicity (how many elements heavier than hydrogen and helium they contain). " +
                "\n | In addition, they use some other specific information about their luminosity or the " +
                "\n | existence of exotic chemical elements in the star’s atmosphere." +
                "\n | " +
                "\n | Stars are plotted on a color-luminosity chart called the Hertzsprung-Russell Diagram. " +
                "\n | The stars in their hydrogen-burning phase fall into a curving line called the Main Sequence. " +
                "\n | White dwarfs, giants, and Super Giants all fall outside this sequence, showing that they are " +
                "\n | fusing other elements and thus are in advanced stages of evolution.");
    }

    public static void famousStars() {
        System.out.println("\n Famous Stars in our Solar System");

        System.out.println("---------------------------------------" +
                "\n             The Sun" +
                "\n---------------------------------------" +
                "\n | The most famous star in our sky is the Sun, the source of the heat and light that " +
                "\n | powers the solar system. It’s a G-type star that formed some 4.6 billion years ago. " +
                "\n | The Sun is a yellow-white dwarf that will continue its hydrogen-burning phase " +
                "\n | (that is, “live” on the Main Sequence) for another 5 or so billion years. " +
                "\n | Then, it will start to fuse helium, which will heat up the Sun and cause it to expand. " +
                "\n | " +
                "\n | The Sun may form a planetary nebula, and eventually will shrink down to become a white dwarf. " +
                "\n | It will continue cooling for another 10-15 billion years." +
                "\n | " +
                "\n | Astronomers have calculated that it takes the Sun 226 million years to completely orbit " +
                "\n | around the center of the Milky Way. In other words, that last time that the Sun was " +
                "\n | in its current position in space around the Milky Way, dinosaurs ruled the Earth. " +
                "\n | In fact, this Sun orbit has only happened 20.4 times since the Sun itself formed " +
                "\n | 4.6 billion years ago.");

        System.out.println("---------------------------------------" +
                "\n             α Centauri System" +
                "\n---------------------------------------" +
                "\n | The closest stars to our Sun are in the Alpha Centauri System. " +
                "\n | They are visible mainly from the Southern Hemisphere and the most southerly parts of " +
                "\n | the Northern Hemisphere. These stars lie 4.3 light-years away from us. " +
                "\n | " +
                "\n | The brightest is Alpha Centauri, which is a double star containing a G-type main-sequence " +
                "\n | star similar to the Sun. It’s called Alpha Centauri A. Its companion is Alpha Centauri B, " +
                "\n | and is a K-type star somewhat dimmer than the Sun and with less mass. The third star is " +
                "\n | called Alpha Centauri C, or more commonly as Proxima Centauri. Of the three stars in the system, " +
                "\n | it’s actually the closest to us.");

        System.out.println("---------------------------------------" +
                "\n             Sirius (α Canis Majoris)" +
                "\n---------------------------------------" +
                "\n | The brightest star in our night sky is called Sirius and is also the brightest star in the " +
                "\n | constellation of Canis Major, the Big Dog. It lies 8.3 light-years away from us. " +
                "\n | Sirius is the brighter member of a two-star system; its companion is called Sirius B. " +
                "\n | Sirius A is an A-type star that “lives” on the main sequence. " +
                "\n | " +
                "\n | It is twice the mass of the Sun and over 25 times more luminous. " +
                "\n | Sirius B is slightly less massive than the Sun and is a dim white dwarf star." +
                "\n | Sirius was used by ancient people as a way to mark the change of seasons and as a " +
                "\n | navigational aid for long sea voyages.");

        System.out.println("---------------------------------------" +
                "\n             UY Scuti: the largest known star by radius" +
                "\n---------------------------------------" +
                "\n | One way to express a star’s size is by its diameter, which is usually written in terms " +
                "\n | of the radius of the Sun. Astronomers theorize that the widest a star can be is just under " +
                "\n | 2,000 solar radii. There are a few stars that reach that size, including one called UY Scuti. " +
                "\n | " +
                "\n | It’s a red supergiant that measures about 1,708 solar radii  (about 2.4 billion kilometers). " +
                "\n | UY Scuti is a variable star, which means that its brightness varies over time.");

        System.out.println("---------------------------------------" +
                "\n             R136a1:  The Most Massive Star" +
                "\n---------------------------------------" +
                "\n | Another way to measure a star is by its mass, which is expressed in terms of solar mass. " +
                "\n | Astronomers have found a number of very massive stars, such as R136a1, which is in a " +
                "\n | cluster in the Tarantula Nebula in the Large Magellanic Cloud (visible from the " +
                "\n | Southern Hemisphere). " +
                "\n | " +
                "\n | This star has 256 times the mass of the Sun and is part of a binary system. " +
                "\n | No one is quite sure how long R136a1 will last and what it will do when it dies. " +
                "\n | Some predict it will end in a supermassive supernova explosion when its core collapses. " +
                "\n | It could also become a neutron star or a stellar black hole.");

        System.out.println("---------------------------------------" +
                "\n             Vega (α Lyrae)" +
                "\n---------------------------------------" +
                "\n | Vega is a familiar star to most of us and the brightest one in the constellation Lyra, the Harp. " +
                "\n | It is also part of an asterism called the Summer Triangle, which is made up of Vega, Deneb " +
                "\n | (in Cygnus, the Swan), and Altair (in Aquila the Eagle). " +
                "\n | Vega will be our pole star in the year 13,727 as Earth’s pole processes to point toward it. " +
                "\n | Astronomers found that Vega looks very large in relation to its mass. " +
                "\n | This is because it is rotating on its axis very rapidly, which flattens Vega. " +
                "\n | We see Vega from the direction of its pole." +
                "\n | " +
                "\n | Vega is only about 400 million years old – which is fairly young. " +
                "\n | It is an A-type star and has about twice the mass of the Sun. " +
                "\n | It will not live as long as the Sun does because Vega will exhaust " +
                "\n | its nuclear fuel much sooner.");

        System.out.println("---------------------------------------" +
                "\n             Betelgeuse (α Orionis)" +
                "\n---------------------------------------" +
                "\n | People often ask which stars will blow up as supernovae. " +
                "\n | There are a number of known red supergiant stars that could die this way. " +
                "\n | Betelgeuse is one of them. It’s the second-brightest star in the constellation Orion, " +
                "\n | which is visible to stargazers in much of the world from November through April. " +
                "\n | " +
                "\n | Betelgeuse is a red supergiant that lies about 650 light-years away. " +
                "\n | No one is quite sure when it will undergo the transformation to a supernova. " +
                "\n | Astronomers suspect it could be in the next million years, " +
                "\n | which is fairly soon in cosmic time.");

        System.out.println("---------------------------------------" +
                "\n             Antares (α Scorpii)" +
                "\n---------------------------------------" +
                "\n | Another red supergiant – called Antares – lies in the constellation Scorpius and " +
                "\n | is visible to observers around the world. Its name means literally " +
                "\n | “equal to Mars (Ares)” in ancient Greek. That’s because its reddish appearance is similar " +
                "\n | to the planet Mars, whose orbit takes it a few degrees away from Antares (as seen from Earth). " +
                "\n | " +
                "\n | Antares lies about 550 light-years from Earth, in the direction of the constellation Scorpius. " +
                "\n | This star is about 10,000 times brighter than the Sun, and has up to 18 times the " +
                "\n | mass of our star. There is also a companion star called Antares B, which is quite small, " +
                "\n | perhaps four times the radius of the Sun and only about 10 times its mass. Like Betelgeuse," +
                "\n | Antares could someday explode as a supernova, and astronomers think that could happen " +
                "\n | in the next 100,000 years.");

        System.out.println("---------------------------------------" +
                "\n             Rigel (ẞ Orionis)" +
                "\n---------------------------------------" +
                "\n | Orion’s brightest star is called Rigel, and it is the 7th brightest star in the sky. " +
                "\n | Rigel is very bright — about 120,000 times the luminosity of the Sun and is also a " +
                "\n | variable star. " +
                "\n | " +
                "\n | It has a companion which is, itself, a binary star containing two main-sequence B-type stars. " +
                "\n | Although it is named as the second-brightest star in Orion, Rigel is actually " +
                "\n | the brightest most of the time. Its name comes from the Arabic term for the " +
                "\n | “left foot of Jauzah”, where Jauzah was the proper name for Orion.\n");

    }

}
