package solarSystem;

import entities.HeavenlyBody;
import entities.Moon;
import entities.Planet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Planets {
    private final static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private final static Set<HeavenlyBody> planets = new HashSet<>();

    public static void mercuryPlanet() {
        //Mercury
        HeavenlyBody mercury = new Planet("Mercury", 176, "Terrestrial");
        solarSystem.put(mercury.getName(), mercury);
        planets.add(mercury);

        System.out.println("\n We're here... 🚀 " +
                "\n " + solarSystem.get("Mercury").getName() +
                " aka The Swiftest Planet" +
                "\n" + solarSystem.get("Mercury") + "\n");

        System.out.println("---------------------------------------" +
                "\n         More on " + solarSystem.get("Mercury").getName() + ":" +
                "\n---------------------------------------" +
                "\n | The smallest planet in our solar system and nearest to the Sun, " +
                "\n | Mercury is only slightly larger than Earth's Moon. " +
                "\n |" +
                "\n | From the surface of Mercury, the Sun would appear more than three times as large " +
                "\n | as it does when viewed from Earth, " +
                "\n | and the sunlight would be as much as seven times brighter. " +
                "\n |" +
                "\n | Despite its proximity to the Sun, Mercury is not the hottest planet in our solar system – " +
                "\n | that title belongs to nearby Venus, thanks to its dense atmosphere. " +
                "\n | But Mercury is the fastest planet, zipping around the Sun every 88 Earth days. \n");

        System.out.println(
                "~ 7 Quick facts about " + solarSystem.get("Mercury").getName() +
                        "\n \t (1) Mercury does not have any moons or rings" +
                        "\n \t (2) Mercury is the smallest Planet" +
                        "\n \t (3) Mercury is the closest Planet to the Sun" +
                        "\n \t (4) Your weight on Mercury would be 38% of your weight on Earth" +
                        "\n \t (5) Mercury spins slowly on its axis and completes one rotation every 59 Earth days" +
                        "\n \t (6) Mercury speeds around the Sun every 88 days, traveling through space at nearly " +
                        "\n         29 miles (47 kilometers) per second, faster than any other planet." +
                        "\n \t (7) One Mercury solar day (one full day-night cycle) equals 176 Earth days");
    }

    public static void venusPlanet() {
        //Venus
        HeavenlyBody venus = new Planet("Venus", 224, "Terrestrial");
        solarSystem.put(venus.getName(), venus);
        planets.add(venus);

        System.out.println("\n We're here 🚀 " +
                "\n " + solarSystem.get("Venus").getName() +
                " aka Planetary Hot Spot" +
                "\n" + solarSystem.get("Venus") + "\n");

        System.out.println("---------------------------------------" +
                "\n         More on " + solarSystem.get("Venus").getName() + ":" +
                "\n---------------------------------------" +
                "\n | Venus is the second planet from the Sun and is the second largest terrestrial planet. " +
                "\n | Venus is sometimes referred to as the Earth’s sister planet due to their similar size and mass. " +
                "\n | Venus is named after the Roman goddess of love and beauty. " +
                "\n | " +
                "\n | Early civilisations thought Venus was two different bodies. " +
                "\n | These were called Phosphorus and Hesperus by the Greeks, and Lucifer and Vesper by the Romans. " +
                "\n | When Venus’ orbit around the Sun overtakes Earth’s orbit, it changes from being visible after " +
                "\n | sunset to being visible before sunrise. Mayan astronomers made detailed observations " +
                "\n | of Venus as early as 650 AD.");

        System.out.println(
                "\n ~ 7 Quick facts about  " + solarSystem.get("Venus").getName() +
                        "\n \t (1) Venus has no moons and no rings" +
                        "\n \t (2) Venus orbits our Sun, a star. " +
                        "\n         Venus is the second closest planet to the sun at a distance of about 67 million miles (108 million km)." +
                        "\n \t (3) One day on Venus lasts 243 Earth days because Venus spins backwards, " +
                        "\n         with its Sun rising in the west and setting in the east." +
                        "\n \t (4) If the Sun were as tall as a typical front door," +
                        "\n          the Earth and Venus would each be about the size of a nickel. " +
                        "\n \t (5) Venus’ extreme temperatures and acidic clouds make " +
                        "\n         it an unlikely place for life as we know it." +
                        "\n \t (6) While the surface rotates slowly, the winds blow at hurricane force, " +
                        "\n         sending clouds completely around the planet every five days." +
                        "\n \t (7) The planet’s surface temperature is about 900 degrees Fahrenheit " +
                        "\n         (465 degrees Celsius)—hot enough to melt lead.");
    }

    public static void earthPlanet() {
        //Earth
        HeavenlyBody earth = new Planet("Earth", 365, "Terrestrial");
        solarSystem.put(earth.getName(), earth);
        planets.add(earth);

        //Earths moon
        HeavenlyBody earthMoon = new Moon("Moon", 27);
        solarSystem.put(earthMoon.getName(), earthMoon);
        earth.addSatellite(earthMoon);

        System.out.println("\n We're here 🚀 🌍" +
                "\n " + solarSystem.get("Earth").getName() +
                " aka Our Home Planet" +
                "\n" + solarSystem.get("Earth") + "\n");

        System.out.println(solarSystem.get("Earth").getSatellites());

        System.out.println("---------------------------------------" +
                "\n         More on " + solarSystem.get("Earth").getName() + ":" +
                "\n---------------------------------------" +
                "\n | Earth is the third planet from the Sun and is the largest of the terrestrial planets. " +
                "\n | The Earth is the only planet in our solar system not to be named after a Greek or Roman deity. " +
                "\n | The Earth was formed approximately 4.54 billion years ago and is the only known " +
                "\n | planet to support life." +
                "\n |" +
                "\n | While Earth is only the fifth largest planet in the solar system, " +
                "\n | it is the only world in our solar system with liquid water on the surface. " +
                "\n | " +
                "\n | Just slightly larger than nearby Venus, Earth is the biggest of the " +
                "\n | four planets closest to the Sun, all of which are made of rock and metal.");

        System.out.println(
                "\n ~ 7 Quick facts about " + solarSystem.get("Earth").getName() +
                        "\n \t (1) Protective Shield!" +
                        "\n         Our atmosphere protects us from incoming meteoroids, " +
                        "\n         most of which break up in our atmosphere before they can strike the surface." +
                        "\n \t (2) Earth's atmosphere is 78 percent nitrogen, " +
                        "\n          21 percent oxygen and 1 percent other ingredients—the perfect balance to breathe and live." +
                        "\n \t (3) As you’re probably aware, Earth has 1 moon (The Moon). " +
                        "\n          But did you know there are 2 additional asteroids locked into a co-orbital orbits with Earth? " +
                        "\n          They’re called 3753 Cruithne and 2002 AA29. NASA claims that Earth has a second Moon, " +
                        "\n          being the Asteroid 3753 Cruithne" +
                        "\n          We won’t go into too much detail about the Moon, I’m sure you’ve heard all about it." +
                        "\n \t (4) The Asteroid 3753 Cruithne is 5 km across," +
                        "\n          and is (sometimes) called Earth’s second moon. " +
                        "\n          It doesn’t actually orbit the Earth, but has a synchronized orbit with our home planet. " +
                        "\n          It has an orbit that makes it look like it’s following the Earth in orbit, " +
                        "\n          but it’s actually following its own, distinct path around the Sun." +
                        "\n \t (5) 2002 AA29 is only 60 meters across, and makes a horseshoe orbit around the Earth " +
                        "\n          that brings it close to the planet every 95 years. In about 600 years, " +
                        "\n          it will appear to circle Earth in a quasi-satellite orbit. " +
                        "\n          Scientists have suggested that it might make a good target for a space exploration mission." +
                        "\n \t (6) Earth is a rocky planet with a solid and dynamic surface of mountains, canyons, " +
                        "\n          plains and more. Most of our planet is covered in water." +
                        "\n \t (7) This deceleration is happening almost imperceptibly, at approximately " +
                        "\n          17 milliseconds per hundred years, although the rate at which it occurs is not perfectly uniform. " +
                        "\n          This has the effect of lengthening our days, " +
                        "\n          but it happens so slowly that it could be as much as 140 million years before " +
                        "\n          the length of a day will have increased to 25 hours.");
    }

    public static void marsPlanet() {
        //Mars
        HeavenlyBody mars = new Planet("Mars", 687, "Terrestrial");
        solarSystem.put(mars.getName(), mars);
        planets.add(mars);

        //Mars has 2 moons, which we will add to its method addSatellite();
        HeavenlyBody deimos = new Moon("Deimos", 1.3);
        solarSystem.put(deimos.getName(), deimos);
        mars.addSatellite(deimos); //adding the moon orbiting Mars to its satellite
        HeavenlyBody phobos = new Moon("Phobos", 0.3);
        solarSystem.put(phobos.getName(), phobos);
        mars.addSatellite(phobos);

        System.out.println(" We're here 🚀 " +
                "\n " + solarSystem.get("Mars").getName() +
                " aka The Red Planet" +
                "\n" + solarSystem.get("Mars") + "\n");

        System.out.println("Mars has two moons named Phobos and Deimos. \n" + solarSystem.get("Mars").getSatellites());

        System.out.println("---------------------------------------" +
                "\n             More on " + solarSystem.get("Mars").getName() + ":" +
                "\n---------------------------------------" +
                "\n | The fourth planet from the Sun, Mars is a dusty, cold, " +
                "\n | desert world with a very thin atmosphere." +
                "\n |" +
                "\n | This dynamic planet has seasons, polar ice caps and weather and canyons and extinct volcanoes, " +
                "\n | evidence of an even more active past." +
                "\n |" +
                "\n | Mars is one of the most explored bodies in our solar system, " +
                "\n | and it's the only planet where we've sent rovers to roam the alien landscape. " +
                "\n | " +
                "\n | NASA currently has three spacecraft in orbit, one rover and one lander on the surface and " +
                "\n | another rover under construction here on Earth. India and ESA also have spacecraft in " +
                "\n | orbit above Mars." +
                "\n |" +
                "\n | These robotic explorers have found lots of evidence that Mars was much wetter and warmer, " +
                "\n | with a thicker atmosphere, billions of years ago.");

        System.out.println(
                "\n ~ 7 Quick facts about " + solarSystem.get("Mars").getName() +
                        "\n \t (1) One day on Mars takes a little over 24 hours. Mars makes a complete orbit around " +
                        "\n          the Sun (a year in Martian time) in 687 Earth days." +
                        "\n \t (2) Mars is known as the Red Planet because iron minerals in the Martian soil oxidize, " +
                        "\n          or rust, causing the soil and atmosphere to look red." +
                        "\n \t (3) Several missions have visited this planet, from flybys and orbiters to rovers on " +
                        "\n          the surface.The first true Mars mission success was the Mariner 4 flyby in 1965." +
                        "\n \t (4) At this time, Mars' surface cannot support life as we know it. " +
                        "\n          Current missions are determining Mars' past and future potential for life." +
                        "\n \t (5) Pieces of Mars have fallen to Earth" +
                        "\n          Scientists have found tiny traces of Martian atmosphere within meteorites " +
                        "\n          violently ejected from Mars, then orbiting the solar system amongst galactic " +
                        "\n          debris for millions of years, before crash landing on Earth. " +
                        "\n          This allowed scientists to begin studying Mars prior to launching space missions." +
                        "\n \t (6) For years Mars has been known to have water in the form of ice. " +
                        "\n          The first signs of trickling water are dark stripes or stains on crater " +
                        "\n          wall and cliffs seen in satellite images. Due to Mars’ " +
                        "\n          atmosphere this water would have to be salty to prevent it from " +
                        "\n          freezing or vaporising." +
                        "\n \t (7) One day Mars will have a ring. " +
                        "\n          In the next 20-40 million years Mars’ largest moon Phobos will be " +
                        "\n          torn apart by gravitational forces leading to the creation of a ring that " +
                        "\n          could last up to 100 million years.");
    }

    public static void jupiterPlanet() {
        //Jupiter
        HeavenlyBody jupiter = new Planet("Jupiter", 4332, "Gas Giant");
        solarSystem.put(jupiter.getName(), jupiter);
        planets.add(jupiter);

        //Jupiter's moons
        HeavenlyBody io = new Moon("Io", 1.8);
        solarSystem.put(io.getName(), io);
        jupiter.addSatellite(io);

        HeavenlyBody europa = new Moon("Europa", 3.5);
        solarSystem.put(io.getName(), europa);
        jupiter.addSatellite(europa);

        HeavenlyBody ganymede = new Moon("Ganymede", 7.1);
        solarSystem.put(ganymede.getName(), ganymede);
        jupiter.addSatellite(ganymede);

        HeavenlyBody callisto = new Moon("Callisto", 16.7);
        solarSystem.put(callisto.getName(), callisto);
        jupiter.addSatellite(callisto);

        System.out.println("\n Planet Jupiter 🚀 " +
                "\n " + solarSystem.get("Jupiter").getName() +
                " aka Twice as massive as all the other planets combined" +
                "\n" + solarSystem.get("Jupiter") + "\n");

        System.out.println(solarSystem.get("Jupiter").getName() + "\n" +
                "Jupiter has 53 named moons and another 26 awaiting official names. " +
                "Combined, scientists now think Jupiter has 79 moons.\n" +
                "The largest four are called Io, Europa, Ganymede, Callisto. \n" +
                "These four moons are called the Galilean satellite. \n");
        System.out.println(solarSystem.get("Jupiter").getSatellites());

        System.out.println("---------------------------------------" +
                "\n             More on " + solarSystem.get("Jupiter").getName() + ":" +
                "\n---------------------------------------" +
                "\n | Jupiter has a long history surprising scientists—all the way back to 1610 when Galileo Galilei " +
                "\n | found the first moons beyond Earth. That discovery changed the way we see the universe." +
                "\n |" +
                "\n | Fifth in line from the Sun, Jupiter is, by far, the largest planet in the solar system – " +
                "\n | more than twice as massive as all the other planets combined." +
                "\n |" +
                "\n | Jupiter's familiar stripes and swirls are actually cold, windy clouds of ammonia and water, " +
                "\n | floating in an atmosphere of hydrogen and helium. " +
                "\n | Jupiter’s iconic Great Red Spot is a giant storm bigger than Earth that has raged for hundreds of years.");

        System.out.println(
                "\n ~ 7 Quick facts about " + solarSystem.get("Jupiter").getName() +
                        "\n \t (1) Jupiter rotates once about every 10 hours (a Jovian day), but takes about " +
                        "\n          12 Earth years to complete one orbit of the Sun (a Jovian year)." +
                        "\n \t (2) Jupiter is a gas giant and so lacks an Earth-like surface. " +
                        "\n          If it has a solid inner core at all, it’s likely only about the size of Earth." +
                        "\n \t (3) In 1979 the Voyager mission discovered Jupiter’s faint ring system. " +
                        "\n          All four giant planets in our solar system have ring systems." +
                        "\n \t (4) Nine spacecraft have visited Jupiter. " +
                        "\n          Seven flew by and two have orbited the gas giant. " +
                        "\n          Juno, the most recent, arrived at Jupiter in 2016." +
                        "\n \t (5) Jupiter cannot support life as we know it. But some of Jupiter's moons have oceans " +
                        "\n          beneath their crusts that might support life." +
                        "\n \t (6) Jupiter's Great Red Spot is a gigantic storm that’s about twice the size of " +
                        "\n          Earth and has raged for over a century." +
                        "\n \t (7) Jupiter is the fourth brightest object in the solar system." +
                        "\n          Only the Sun, Moon and Venus are brighter. " +
                        "\n          It is one of five planets visible to the naked eye from Earth.");
    }

    public static void saturnPlanet() {
        //Saturn
        HeavenlyBody saturn = new Planet("Saturn", 2944, "Gas Giant");
        solarSystem.put(saturn.getName(), saturn);
        planets.add(saturn);

        //adding Saturn's moon, Titan
        HeavenlyBody titan = new Moon("Titan", 16);
        solarSystem.put(titan.getName(), titan);
        saturn.addSatellite(titan);

        System.out.println("\n We've arrived 🚀 " +
                "\n " + solarSystem.get("Saturn").getName() +
                " aka Jewel of Our Solar System" +
                "\n" + solarSystem.get("Saturn") + "\n");

        System.out.println(" " + solarSystem.get("Saturn").getName() +
                "\n Saturn has more moons than any other planet." +
                "\n 20 new moons were discovered in 2019 bring the total to 82, 3 more than Jupiter." +
                "\n Saturn's largest moon Titan is bigger than both Mercury and Pluto. \n");
        System.out.println(solarSystem.get("Saturn").getSatellites());

        System.out.println("---------------------------------------" +
                "\n             More on " + solarSystem.get("Saturn").getName() + ":" +
                "\n---------------------------------------" +
                "\n | Saturn is the sixth planet from the Sun and the second largest planet in our solar system." +
                "\n |" +
                "\n | Adorned with thousands of beautiful ringlets, Saturn is unique among the planets. " +
                "\n | " +
                "\n | It is not the only planet to have rings—made of chunks of ice and rock—but " +
                "\n | none are as spectacular or as complicated as Saturn's." +
                "\n |" +
                "\n | Like fellow gas giant Jupiter, Saturn is a massive ball made mostly of hydrogen and helium.");

        System.out.println(
                "\n ~ 7 Quick facts about " + solarSystem.get("Saturn").getName() +
                        "\n \t (1) Saturn orbits the Sun once every 29.4 Earth years." +
                        "\n          Its slow movement against the backdrop of stars earned it the nickname of “Lubadsagush” " +
                        "\n          from the ancient Assyrians. The name means “oldest of the old”." +
                        "\n \t (2) Saturn takes about 10.7 hours (no one knows precisely) to rotate on its axis " +
                        "\n          once—a Saturn “day”—and 29 Earth years to orbit the sun." +
                        "\n \t (3) Four spacecraft have visited Saturn." +
                        "\n          Pioneer 11, Voyager 1 and 2, and the Cassini-Huygens mission have all studied the planet. " +
                        "\n          Cassini orbited Saturn from July 2004 until September 2017, " +
                        "\n          sending back a wealth of data about the planet, its moons, and rings." +
                        "\n \t (4) Saturn’s upper atmosphere is divided into bands of clouds." +
                        "\n          The top layers are mostly ammonia ice. Below them, the clouds are largely water ice. " +
                        "\n          Below are layers of cold hydrogen and sulfur ice mixtures." +
                        "\n \t (5) Saturn has 150 moons and smaller moonlets." +
                        "\n          All are frozen worlds. The largest moons are Titan and Rhea. " +
                        "\n          Enceladus appears to have an ocean below its frozen surface." +
                        "\n \t (6) Titan is a moon with complex and dense nitrogen-rich atmosphere." +
                        "\n          It is composed mostly of water ice and rock. Its frozen surface has lakes of liquid methane " +
                        "\n          and landscapes covered with frozen nitrogen. Planetary scientists consider " +
                        "\n          Titan to be a possible harbour for life, but not Earth-like life." +
                        "\n \t (7) Saturn has the most extensive rings in the solar system." +
                        "\n          The Saturnian rings are made mostly of chunks of ice and small amounts of carbonaceous dust. " +
                        "\n          The rings stretch out more than 120,700 km from the planet, but are are amazingly " +
                        "\n          thin: only about 20 meters thick.");
    }

    public static void uranusPlanet() {
        //Uranus
        HeavenlyBody uranus = new Planet("Uranus", 8396, "Ice Giant");
        solarSystem.put(uranus.getName(), uranus);
        planets.add(uranus);

        //adding Uranus moon, Titania
        HeavenlyBody titania = new Moon("Titania", 9);
        solarSystem.put(titania.getName(), titania);
        uranus.addSatellite(titania);

        System.out.println("\n We're here 🚀 " +
                "\n " + solarSystem.get("Uranus").getName() +
                " aka The Sideways Planet" +
                "\n" + solarSystem.get("Uranus") + "\n");

        System.out.println(" " + solarSystem.get("Uranus").getName() +
                "\n Uranus has 27 known moons, and they are named after characters from " +
                "\n the works of William Shakespeare and Alexander Pope." +
                "\n Titania, also designated Uranus III, is the largest of the moons of" +
                "\n Uranus and the eighth largest moon in the Solar System.");
        System.out.println(solarSystem.get("Uranus").getSatellites());

        System.out.println("---------------------------------------" +
                "\n             More on " + solarSystem.get("Uranus").getName() + ":" +
                "\n---------------------------------------" +
                "\n | The first planet found with the aid of a telescope, Uranus was discovered in 1781 " +
                "\n | by astronomer William Herschel, although he originally thought it was either a comet or a star." +
                "\n |" +
                "\n | It was two years later that the object was universally accepted as a new planet, " +
                "\n | in part because of observations by astronomer Johann Elert Bode. Herschel tried unsuccessfully " +
                "\n | to name his discovery Georgium Sidus after King George III. Instead the scientific community " +
                "\n | accepted Bode's suggestion to name it Uranus, the Greek god of the sky, as suggested by Bode.");

        System.out.println(
                "\n ~ 7 Quick facts about " + solarSystem.get("Uranus").getName() +
                        "\n \t (1) Uranus is an ice giant. Most of its mass is a hot, dense fluid of " +
                        "\n          icy materials – water, methane and ammonia – above a small rocky core." +
                        "\n \t (2) Like Venus, Uranus rotates east to west. But Uranus is unique in that it rotates on its side." +
                        "\n \t (3) Uranus has 13 known rings. The inner rings are narrow and dark " +
                        "\n          and the outer rings are brightly colored." +
                        "\n \t (4) Voyager 2 is the only spacecraft to fly by Uranus. " +
                        "\n          No spacecraft has orbited this distant planet to study it at length and up close." +
                        "\n \t (5) Uranus has an atmosphere made mostly of molecular hydrogen and atomic helium, " +
                        "\n          with a small amount of methane." +
                        "\n \t (6) Uranus hits the coldest temperatures of any planet." +
                        "\n          With minimum atmospheric temperature of -224°C Uranus is nearly " +
                        "\n          coldest planet in the solar system. While Neptune doesn’t get as cold " +
                        "\n          as Uranus it is on average colder. The upper atmosphere of Uranus is covered " +
                        "\n          by a methane haze which hides the storms that take place in the cloud decks." +
                        "\n \t (7) Uranus takes about 17 hours to rotate once (a Uranian day), " +
                        "\n          and about 84 Earth years to complete an orbit of the Sun (a Uranian year).");
    }

    public static void neptunePlanet() {
        HeavenlyBody neptune = new Planet("Neptune", 16469, "Ice Giant");
        solarSystem.put(neptune.getName(), neptune);
        planets.add(neptune);

        //adding Neptune's moons
        HeavenlyBody triton = new Moon("Triton", 6);
        solarSystem.put(triton.getName(), triton);
        neptune.addSatellite(triton);

        System.out.println("\n Planet Neptune, the coolest...no pun intended 🚀 " +
                "\n " + solarSystem.get("Neptune").getName() +
                " aka The Windiest Planet" +
                "\n" + solarSystem.get("Neptune") + "\n");

        System.out.println(" " + solarSystem.get("Neptune").getName() +
                "\n Neptune has 14 moons. Triton being its biggest." +
                "\n Triton is the largest of Neptune's 13 moons. It is unusual because it is " +
                "\n the only large moon in our solar system that orbits in the opposite direction of " +
                "\n its planet's rotation―a retrograde orbit. \n");
        System.out.println(solarSystem.get("Neptune").getSatellites());

        System.out.println("---------------------------------------" +
                "\n             More on " + solarSystem.get("Neptune").getName() + ":" +
                "\n---------------------------------------" +
                "\n | Dark, cold and whipped by supersonic winds, ice giant Neptune is the " +
                "\n | eighth and most distant planet in our solar system." +
                "\n |" +
                "\n | More than 30 times as far from the Sun as Earth, Neptune is the only planet " +
                "\n | in our solar system not visible to the naked eye and the first predicted by " +
                "\n | mathematics before its discovery. In 2011 Neptune completed its first " +
                "\n | 165-year orbit since its discovery in 1846." +
                "\n |" +
                "\n | NASA's Voyager 2 is the only spacecraft to have visited Neptune up close. " +
                "\n | It flew past in 1989 on its way out of the solar system.");

        System.out.println(
                "\n ~ 7 Quick facts about " + solarSystem.get("Neptune").getName() +
                        "\n \t (1) Neptune has a very thin collection of rings." +
                        "\n          They are likely made up of ice particles mixed with dust grains and " +
                        "\n          possibly coated with a carbon-based substance." +
                        "\n \t (2) Neptune has 6 faint rings and 14 moons." +
                        "\n          The most interesting moon is Triton, a frozen world that is spewing nitrogen " +
                        "\n          ice and dust particles out from below its surface. It was likely captured by " +
                        "\n          the gravitational pull of Neptune. It is probably the coldest world " +
                        "\n          in the solar system." +
                        "\n \t (3) Triton will wander too close to Neptune in its orbit " +
                        "\n          in about 3.5 billion years, and the gravitational " +
                        "\n          pull of the planet will break Triton up. The result will be a ring system." +
                        "\n \t (4) Neptune spins on its axis very rapidly." +
                        "\n          Its equatorial clouds take 16 hours to make one rotation. " +
                        "\n          This is because Neptune is not solid body." +
                        "\n \t (5) The atmosphere of Neptune is made of hydrogen and helium, with some methane." +
                        "\n          The methane absorbs red light, which makes the planet appear a lovely blue. " +
                        "\n          High, thin clouds drift in the upper atmosphere." +
                        "\n \t (6) Neptune has a very active climate." +
                        "\n          Large storms whirl through its upper atmosphere, " +
                        "\n          and high-speed winds track around the planet at up 600 meters per second. " +
                        "\n          One of the largest storms ever seen was recorded in 1989. " +
                        "\n          It was called the Great Dark Spot. It lasted about five years." +
                        "\n \t (7) Neptune is the smallest of the ice giants." +
                        "\n          Despite being smaller than Uranus, Neptune has a greater mass. " +
                        "\n          Below its heavy atmosphere, Uranus is made of layers of hydrogen, helium, " +
                        "\n          and methane gases. They enclose a layer of water, ammonia and methane ice. " +
                        "\n          The inner core of the planet is made of rock.");
    }

    public static void planetOverview() {
        int count = 1;

        System.out.println("Planets");
        for (HeavenlyBody printAllPlanets : planets) {
            System.out.println("\t" +
                    count++ + ": " + printAllPlanets.getName());
        }

        System.out.println("\n" +
                "\n \t Disclaimer: " +
                "\n          If you see Planets missing, then you'd have to head back" +
                "\n          to the unvisited Planets inorder to unlock them for this list." +
                "\n" +
                "\n          Disregard this message if it doesn't apply to you, awesome job 😄" +
                "\n" +
                "\n                     🚀 ⭐ 🖖 👨‍🚀 👩‍🚀 Safe travels Guardian 👩‍🚀 👨‍🚀 🖖 ⭐ 🚀" +
                "\n    --------------------------------------------------------------------------");

    }

    public static void planetMoonOverview() {
        int count = 1;

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t " +
                    count++ + ": " + moon.getName());
        }

        System.out.println("\n" +
                "\n \t Disclaimer: " +
                "\n          If you see Moons missing, then you'd have to head back" +
                "\n          to the unvisited Planets inorder to unlock them for this list." +
                "\n" +
                "\n          Disregard this message if it doesn't apply to you, awesome job 😄" +
                "\n" +
                "\n                     🚀 ⭐ 🖖 👨‍🚀 👩‍🚀 Safe travels Guardian 👩‍🚀 👨‍🚀 🖖 ⭐ 🚀" +
                "\n    --------------------------------------------------------------------------");
    }
}
