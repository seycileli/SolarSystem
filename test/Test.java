package test;

import entities.*;
import solarSystem.*;

import java.util.*;

public class Test {

    private final static Scanner s = new Scanner(System.in);
    private static boolean quit = false;

    public static void main(String[] args) {

        mainMenu();

    }

    public static void mainMenu() {

        while (!quit) {
            System.out.println("\n __________________________________________________________" +
                    "\n|            🖖 👩‍🚀 👨‍🚀 Select destination 👨‍🚀 👩‍🚀 🖖            |" +
                    "\nInput a number to select one of the available options below: " +
                    "\n \t 1: Mercury" +
                    "\n \t 2: Venus" +
                    "\n \t 3: Earth" +
                    "\n \t 4: Mars" +
                    "\n \t 5: Jupiter" +
                    "\n \t 6: Saturn" +
                    "\n \t 7: Uranus" +
                    "\n \t 8: Neptune" +
                    "\n \t 9: Print All Planets in Our Solar System" +
                    "\n \t 10: View Moons in the Solar System" +
                    "\n \t 11: Visit Other Planet(s)" +
                    "\n \t 12: Search" +
                    "\n \t 0: Exit App"
            );
            int action = s.nextInt();
            s.nextLine();

            switch (action) {
                case 0:
                    //exit
                    System.out.println("\n \t Godspeed Guardian 👨‍🚀 👩‍🚀 🖖 🚀 \n");
                    quit = true;
                    break;
                case 1:
                    //Mercury Info
                    Planets.mercuryPlanet();
                    break;
                case 2:
                    //Venus
                    Planets.venusPlanet();
                    break;
                case 3:
                    //Earth
                    Planets.earthPlanet();
                    break;
                case 4:
                    //Mars
                    Planets.marsPlanet();
                    break;
                case 5:
                    //Jupiter
                    Planets.jupiterPlanet();
                    break;
                case 6:
                    //Saturn
                    Planets.saturnPlanet();
                    break;
                case 7:
                    //Uranus
                    Planets.uranusPlanet();
                    break;
                case 8:
                    //Neptune
                    Planets.neptunePlanet();
                    break;
                case 9:
                    //Planet overview of all
                    Planets.planetOverview();
                    break;
                case 10:
                    //Show all Planet Moons
                    Planets.planetMoonOverview();
                    break;
                case 11:
                    //visit other destinations
                    visitOtherPlanets();
                    break;
                case 12:
                    //search
                    search();
                    break;
            }
        }
    }

    private static void visitOtherPlanets() {
        while (!quit) {
            System.out.println("\n __________________________________________________________" +
                    "\n|            🖖 👩‍🚀 👨‍🚀 Select destination 👨‍🚀 👩‍🚀 🖖            |" +
                    "\nInput a number to select one of the available options below: " +
                    "\n \t 1: Dwarf Planet(s)" +
                    "\n \t 2: Hypothetical(s)" +
                    "\n \t 3: Star(s)" +
                    "\n \t 4: Asteroid(s)" +
                    "\n \t 5: Comet(s)" +
                    "\n \t 6: Go back" +
                    "\n \t 0: Exit App");

            int action = s.nextInt();
            s.nextLine();

            switch (action) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    //Dwarf Planet methods here, selection to choose all, or visit 1 specific planet
                    visitDwarfPlanet();
                    break;
                case 2:
                    //Hypothetical planet here, such as Planet Exo
                    Hypothetical.planetX();
                    break;
                case 3:
                    //Methods that will mention Stars here
                    visitStars();
                    break;
                case 4:
                    //Asteroid method here
                    Asteroids.generalInformation();
                    break;
                case 5:
                    //comets
                    Comets.generalInformation();
                    break;
                case 9:
                    //Go back
                    mainMenu();
                    break;
            }
        }
    }

    public static void visitDwarfPlanet() {
        while (!quit) {
            System.out.println("\n __________________________________________________________" +
                    "\n|            🖖 👩‍🚀 👨‍🚀 Select destination 👨‍🚀 👩‍🚀 🖖            |" +
                    "\nInput a number to select one of the available options below: " +
                    "\n \t 1: Pluto" +
                    "\n \t 2: Ceres" +
                    "\n \t 3: Makemake" +
                    "\n \t 4: Haumea" +
                    "\n \t 5: Eris" +
                    "\n \t 6: Compare All Dwarf Planets" +
                    "\n \t 7: Compare All Dwarf Planet Moons" +
                    "\n \t 8: Go Back" +
                    "\n \t 9: Back to Main Menu" +
                    "\n \t 0: Exit App");
            int action = s.nextInt();
            s.nextLine();

            switch (action) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    DwarfSolarSystem.pluto();
                    break;
                case 2:
                    DwarfSolarSystem.ceres();
                    break;
                case 3:
                    DwarfSolarSystem.makemake();
                    break;
                case 4:
                    DwarfSolarSystem.haumea();
                    break;
                case 5:
                    DwarfSolarSystem.eris();
                    break;
                case 6:
                    DwarfSolarSystem.allDwarfPlanets();
                    break;
                case 7:
                    DwarfSolarSystem.allDwarfPlanetMoons();
                    break;
                case 8:
                    mainMenu();
                    break;
            }
        }
    }

    private static void visitStars() {
        while (!quit) {

            System.out.println("\n __________________________________________________________" +
                    "\n|            🖖 👩‍🚀 👨‍🚀 Select destination 👨‍🚀 👩‍🚀 🖖            |" +
                    "\nInput a number to select one of the available options below: " +
                    "\n \t 1: Learn About Stars" +
                    "\n \t 2: Famous Stars in our Solar System" +
                    "\n \t 3: Overview of Stars" +
                    "\n \t 4: Go Back" +
                    "\n \t 5: Back to Main Menu" +
                    "\n \t 0: Exit App");
            int action = s.nextInt();
            s.nextLine();

            switch (action) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Stars.generalInformation();
                    break;
                case 2:
                    Stars.famousStars();
                    break;
                case 3:
                    Stars.starsOverview();
                    break;
                case 4:
                    //go back
                    visitOtherPlanets();
                    break;
                case 5:
                    //main menu
                    mainMenu();
                    break;
            }
        }
    }

    private static void search() {
        System.out.println("\n Searching for something that isn't listed? \n" +
                "Type in the name and we'll see if it's in our archives \n");
        String search = s.nextLine();

        if (search.equalsIgnoreCase("dwarf planet")
                || search.equalsIgnoreCase("dwarf planets")) {
            //enter dwarf planet method here
            System.out.println("-> List Dwarf Planets, then give option to visit particular" +
                    " Dwarf Planet to learn more");
            //call dwarf planet method
        } else if (search.equalsIgnoreCase("pluto") ||
                search.equalsIgnoreCase("planet pluto") ||
                search.equalsIgnoreCase("pluto planet")) {
            //enter pluto method here
            System.out.println("-> Taking you to Pluto");
        } else {
            //don't have method
            System.out.println("-> not available");
        }
    }
}
