package solarSystem;

import entities.DwarfPlanet;
import entities.HeavenlyBody;
import entities.Moon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DwarfSolarSystem {
    private final static Map<String, HeavenlyBody> dwarfPlanet = new HashMap<>();
    private final static Set<HeavenlyBody> planet = new HashSet<>();

    public static void pluto() {
        System.out.println("\n We've arrived, at what was once our Ninth Planet 🚀");

        HeavenlyBody pluto = new DwarfPlanet("Pluto", 248);
        dwarfPlanet.put(pluto.getName(), pluto);
        planet.add(pluto);
        HeavenlyBody charon = new Moon("Charon", 6);
        dwarfPlanet.put(charon.getName(), charon);
        pluto.addSatellite(charon);
        System.out.println(pluto.toString());

        System.out.println(" " + dwarfPlanet.get("Pluto").getName() +
                "\n Discovered in 1930, Pluto is the second closest dwarf planet to the Sun and was at one " +
                "\n point classified as the ninth planet. Pluto is the largest dwarf planet but only the second " +
                "\n most massive, with Eris being the most massive.");

        System.out.println("\n Charon" +
                "\n Charon is the largest and innermost moon of Pluto and is nearly 1/8 of the mass" +
                "\n of Pluto. It orbits a common centre of gravity with Pluto, and the two worlds are tidally " +
                "\n locked together as they orbit. \n"
                + dwarfPlanet.get("Pluto").getSatellites());

        System.out.println("---------------------------------------" +
                "\n             More on " + dwarfPlanet.get("Pluto").getName() + ":" +
                "\n---------------------------------------" +
                "\n | Pluto—which is smaller than Earth’s Moon—has a heart-shaped glacier that’s the size of Texas and Oklahoma. " +
                "\n | This fascinating world has blue skies, spinning moons, mountains as high as the Rockies, " +
                "\n | and it snows—but the snow is red." +
                "\n |" +
                "\n | “The complexity of the Pluto system — from its geology to its satellite system to its atmosphere— " +
                "\n | has been beyond our wildest imagination,” said Alan Stern, New Horizons principal investigator " +
                "\n | from the Southwest Research Institute in Boulder, Colorado. " +
                "\n | “Everywhere we turn are new mysteries.");

        System.out.println(
                "\n ~ 5 Quick facts about " + dwarfPlanet.get("Pluto").getName() +
                        "\n \t (1) Pluto is the largest dwarf planet." +
                        "\n          At one point it was thought this could be Eris. Currently the most accurate " +
                        "\n          measurements give Eris an average diameter of 2,326km with a margin of error " +
                        "\n          of 12km, while Pluto’s diameter is 2,372km with a 2km margin of error." +
                        "\n \t (2) Pluto is one third water." +
                        "\n          This is in the form of water ice which is more than 3 times as much " +
                        "\n          water as in all the Earth’s oceans, the remaining two thirds are rock. " +
                        "\n          Pluto’s surface is covered with ices, and has several mountain ranges, " +
                        "\n          light and dark regions, and a scattering of craters." +
                        "\n \t (3) Pluto is smaller than a number of moons." +
                        "\n          These are Ganymede, Titan, Callisto, Io, Europa, Triton, and the Earth’s moon. " +
                        "\n          Pluto has 66% of the diameter of the Earth’s moon and 18% of its mass. " +
                        "\n          While it is now confirmed that Pluto is the largest dwarf planet for around 10 " +
                        "\n          years it was thought that this was Eris." +
                        "\n \t (4) Pluto has been visited by one spacecraft." +
                        "\n          The New Horizons spacecraft, which was launched in 2006, " +
                        "\n          flew by Pluto on the 14th of July 2015 and took a series of images and other " +
                        "\n          measurements. New Horizons is now on its way to the Kuiper Belt to explore " +
                        "\n          even more distant objects." +
                        "\n \t (5) Pluto sometimes has an atmosphere." +
                        "\n          When Pluto elliptical orbit takes it closer to the Sun, " +
                        "\n          its surface ice thaws and forms a thin atmosphere primarily of nitrogen which " +
                        "\n          slowly escapes the planet. It also has a methane haze that overs about 161 " +
                        "\n          kilometres above the surface. The methane is dissociated by sunlight into " +
                        "\n          hydrocarbons that fall to the surface and coat the ice with a dark covering. " +
                        "\n          When Pluto travels away from the Sun the atmosphere then freezes back " +
                        "\n          to its solid state.");
    }

    public static void ceres() {
        System.out.println("\n Dwarf Planet Ceres 🚀");
        HeavenlyBody ceres = new DwarfPlanet("Ceres", 1608);
        dwarfPlanet.put(ceres.getName(), ceres);
        planet.add(ceres);
        System.out.println(ceres.toString());

        System.out.println("---------------------------------------" +
                "\n             More on " + dwarfPlanet.get("Ceres").getName() + ":" +
                "\n---------------------------------------" +
                "\n | Ceres is the closest dwarf planet to the Sun and is located in the asteroid belt, " +
                "\n | between Mars and Jupiter, making it the only dwarf planet in the inner solar system. " +
                "\n | Ceres is the smallest of the bodies current classified as dwarf planets " +
                "\n | with a diameter of 950km." +
                "\n |" +
                "\n | Ceres is the only dwarf planet with no moons." +
                "\n | The other dwarf planets; Pluto, Haumea, Makemake and Eris all have at least one moon.");

        System.out.println(
                "\n ~ 5 Quick facts about " + dwarfPlanet.get("Ceres").getName() +
                        "\n \t (1) Ceres was the first object considered to be an asteroid." +
                        "\n \t (2) The first visit to Ceres is due in 2015" +
                        "\n          NASA’s Dawn spacecraft has been making its way to Ceres from the " +
                        "\n          asteroid Vesta since September 2012. There is high interest in this " +
                        "\n          mission since Ceres will be the first Dwarf Planet visited by a " +
                        "\n          spacecraft and is one possible destination for human colonisation given " +
                        "\n          its abundance of ice, water, and minerals." +
                        "\n \t (3) Ceres has  a mysterious white spot." +
                        "\n          This can be seen in both the old Hubble images and the more recent photos " +
                        "\n          taken by the Dawn spacecraft on its approach." +
                        "\n \t (4) Every second Ceres loses 6kg of its mass in steam." +
                        "\n          Plumes of water vapour shooting up from Ceres’ surface were observed " +
                        "\n          by the Herschel Space Telescope this was the first definitive observation " +
                        "\n          of water vapour in the asteroid belt. It’s thought this is caused when " +
                        "\n          portions of Ceres’ icy surface warm." +
                        "\n \t (5) Ceres accounts for one third of the mass in the asteroid belt." +
                        "\n          Despite this it is still the smallest and least massive of the dwarf planets.");
    }

    public static void makemake() {
        System.out.println("\n Dwarf Planet Makemake 🚀");
        HeavenlyBody makemake = new DwarfPlanet("Makemake", 309.9);
        dwarfPlanet.put(makemake.getName(), makemake);
        planet.add(makemake);
        HeavenlyBody mk2 = new Moon("MK2", 12.4);
        dwarfPlanet.put(mk2.getName(), mk2);
        makemake.addSatellite(mk2);
        System.out.println(makemake.toString());

        System.out.println("---------------------------------------" +
                "\n             More on " + dwarfPlanet.get("Makemake").getName() + ":" +
                "\n---------------------------------------" +
                "\n | Makemake is the second furthest dwarf planet from the Sun and is the third " +
                "\n | largest dwarf planet in the solar system. Makemake was discovered on March 31st 2005 " +
                "\n | and was recognized as a dwarf planet by the International Astronomical Union (IAU) " +
                "\n | in July 2008." +
                "\n | " +
                "\n | Until April 2016 Makemake was thought to be the only one of the four " +
                "\n | outer dwarf planets to not have any moons.");

        System.out.println("\n The nickname 'MK2' simply means object 2 in the Makemake system. " +
                "\n A permanent name may be chosen from an associated figure in the mythology of Easter Island, " +
                "\n such as Makemake's companion Haua, or one of Makemake's offspring: " +
                "\n Tive, Rorai, Hova and Arangi-kote-kote. \n" +
                dwarfPlanet.get("Makemake").getSatellites());

        System.out.println(
                "\n ~ 5 Quick facts about " + dwarfPlanet.get("Makemake").getName() +
                        "\n \t (1) Ceres was the first object considered to be an asteroid." +
                        "\n \t (2) The first visit to Ceres is due in 2015" +
                        "\n          NASA’s Dawn spacecraft has been making its way to Ceres from the " +
                        "\n          asteroid Vesta since September 2012. There is high interest in this " +
                        "\n          mission since Ceres will be the first Dwarf Planet visited by a " +
                        "\n          spacecraft and is one possible destination for human colonisation given " +
                        "\n          its abundance of ice, water, and minerals." +
                        "\n \t (3) Ceres has  a mysterious white spot." +
                        "\n          This can be seen in both the old Hubble images and the more recent photos " +
                        "\n          taken by the Dawn spacecraft on its approach." +
                        "\n \t (4) Every second Ceres loses 6kg of its mass in steam." +
                        "\n          Plumes of water vapour shooting up from Ceres’ surface were observed " +
                        "\n          by the Herschel Space Telescope this was the first definitive observation " +
                        "\n          of water vapour in the asteroid belt. It’s thought this is caused when " +
                        "\n          portions of Ceres’ icy surface warm." +
                        "\n \t (5) Ceres accounts for one third of the mass in the asteroid belt." +
                        "\n          Despite this it is still the smallest and least massive of the dwarf planets.");
    }

    public static void haumea() {
        System.out.println("\n Dwarf Planet Haumea 🚀");
        HeavenlyBody haumea = new DwarfPlanet("Haumea", 285);
        dwarfPlanet.put(haumea.getName(), haumea);
        planet.add(haumea);
        HeavenlyBody namaka = new Moon("Namaka", 18);
        dwarfPlanet.put(namaka.getName(), namaka);
        haumea.addSatellite(namaka);
        HeavenlyBody hiiaka = new Moon("Hi'iaka", 49);
        dwarfPlanet.put(hiiaka.getName(), hiiaka);
        haumea.addSatellite(hiiaka);
        System.out.println(haumea.toString());

        System.out.println("---------------------------------------" +
                "\n             More on " + dwarfPlanet.get("Haumea").getName() + ":" +
                "\n---------------------------------------" +
                "\n | Originally designated 2003 EL61 (and nicknamed Santa by one discovery team), " +
                "\n | Haumea resides in the Kuiper belt and is roughly the same size as Pluto. " +
                "\n | Haumea is one of the fastest rotating large objects in our solar system. " +
                "\n | Its fast spin distorts Haumea's shape, making this dwarf planet look like a football.");

        System.out.println("\n Haumea has two known moons: " +
                "\n Namaka is the inner moon, and Hi'iaka is the outer moon." +
                "\n Both are named for the mythological daughters of Huamea." +
                "\n Hi'iaka is the patron goddess of the island of Hawaii and of hula dancers." +
                "\n Namaka is a water spirit in Hawaiian mythology. \n" +
                dwarfPlanet.get("Haumea").getSatellites());

        System.out.println(
                "\n ~ 5 Quick facts about " + dwarfPlanet.get("Haumea").getName() +
                        "\n \t (1) Structure" +
                        "\n          Astronomers believe Haumea is a made of rock with a coating of ice." +
                        "\n \t (2) Surface" +
                        "\n          We know very little about Haumea's surface." +
                        "\n \t (3) Atmosphere" +
                        "\n          We know very little about Haumea's atmosphere" +
                        "\n \t (4) Potential for Life" +
                        "\n          The surface of Haumea is extremely cold, so it seems unlikely " +
                        "\n          that life could exist there." +
                        "\n \t (5) Rings" +
                        "\n          Haumea is the first known Kuiper Belt Object to have rings. " +
                        "\n          Scientists announced the discovery in 2017 after watching the dwarf planet " +
                        "\n          pass in front of a star.");
    }

    public static void eris() {
        System.out.println("\n Dwarf Planet Eris 🚀");
        HeavenlyBody eris = new DwarfPlanet("Eris", 557);
        dwarfPlanet.put(eris.getName(), eris);
        planet.add(eris);
        HeavenlyBody dysnomia = new Moon("Dysnomia", 16);
        dwarfPlanet.put(dysnomia.getName(), dysnomia);
        eris.addSatellite(dysnomia);
        System.out.println(eris.toString());

        System.out.println("---------------------------------------" +
                "\n             More on " + dwarfPlanet.get("Eris").getName() + ":" +
                "\n---------------------------------------" +
                "\n | Eris is one of the largest known dwarf planets in our solar system. " +
                "\n | It's about the same size as Pluto, but is three times farther from the Sun." +
                "\n |" +
                "\n | Eris first appeared to be larger than Pluto. " +
                "\n | This triggered a debate in the scientific community that led to the " +
                "\n | International Astronomical Union's decision in 2006 to clarify the definition of a planet. " +
                "\n | Pluto, Eris and other similar objects are now classified as dwarf planets." +
                "\n |" +
                "\n | Originally designated 2003 UB313 " +
                "\n | (and nicknamed for the television Warrior Xena by its discovery team)," +
                "\n | Eris is named for the ancient Greek goddess of discord and strife. The name fits since " +
                "\n | Eris remains at the center of a scientific debate about the definition of a planet.");

        System.out.println("\n Eris has a very small moon called Dysnomia " +
                "\n Dysnomia has a nearly circular orbit " +
                "\n lasting about 16 days. This moon is named after Eris' daughter, the demon goddess of lawlessness." +
                "\n" +
                "\n Dysnomia and other small moons around planets and dwarf planets allow astronomers to " +
                "\n calculate the mass of the parent body. Dysnomia plays a role in determining how comparable Pluto " +
                "\n and Eris are to each other. \n" +
                dwarfPlanet.get("Eris").getSatellites());

        System.out.println(
                "\n ~ 5 Quick facts about " + dwarfPlanet.get("Eris").getName() +
                        "\n \t (1) Structure" +
                        "\n          We know very little about Eris' internal structure." +
                        "\n \t (2) Surface" +
                        "\n          Eris most likely has a rocky surface similar to Pluto. Scientists think surface " +
                        "\n          temperatures vary from about -359 degrees Fahrenheit (-217 degrees Celsius) " +
                        "\n          to -405 degrees Fahrenheit (-243 degrees Celsius)." +
                        "\n \t (3) Atmosphere" +
                        "\n          The dwarf planet is often so far from the Sun that its atmosphere collapses and " +
                        "\n          freezes, falling to the surface as snow. As it gets closest to the Sun in " +
                        "\n          its faraway orbit, the atmosphere thaws." +
                        "\n \t (4) Potential for Life" +
                        "\n          The surface of Eris is extremely cold, so it seems unlikely " +
                        "\n          that life could exist there." +
                        "\n \t (5) Rings" +
                        "\n          Eris hss no known rings");
    }

    public static void allDwarfPlanets() {
        for (HeavenlyBody print : planet) {
            System.out.println(print.toString());
        }
    }

    public static void allDwarfPlanetMoons() {
        for (HeavenlyBody printMoon : planet) {
            System.out.println(printMoon.getSatellites());
        }
    }
}
