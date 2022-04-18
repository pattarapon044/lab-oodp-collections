package lab.oodp.pancake;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * A class that randomly generates names.
 */
public class NameGenerator {

    private List<String> namesList;

    /**
     * Creates the name generator by loading names.txt and reading all names from it into a set.
     * Then add the contents of that set to the namesList list.
     */
    public NameGenerator() {

        Set<String> names = new TreeSet<>();

        try (Scanner scanner = new Scanner(this.nameStr)) {

            while (scanner.hasNextLine()) {

                String name = scanner.nextLine();

                // This line removes everything from the name that's not a letter.
                // Normally, using trim() would work fine. However, the names.txt file I copy / pasted from a website
                // has some other random characters in it that aren't removed by the trim() function...
                name = name.replaceAll("[^A-Za-z]", "");

                names.add(name);

            }

        } catch (Exception e) {
            // This will not happen unless someone deleted names.txt by mistake or it's been corrupted.
            // If that happens, there's not much the user can do about it, so may as well just crash.
            throw new RuntimeException(e);
        }

        // We first assign to a Set because this will nicely remove duplicates for us.
        // We then add those elements to an ArrayList as its easier to pick an element at random from a List
        // rather than a Set.
        this.namesList = new ArrayList<>(names);

    }

    /**
     * Gets a random name from the set.
     * @return a name
     */
    public String getRandomName() {
        return this.namesList.get((int)(Math.random() * this.namesList.size()));
    }
    
    String nameStr = "Tawnya  \n"
    		+ "Carli  \n"
    		+ "Chiquita  \n"
    		+ "Shakia  \n"
    		+ "Elane  \n"
    		+ "Marinda  \n"
    		+ "Scottie  \n"
    		+ "Dwayne  \n"
    		+ "Katelin  \n"
    		+ "Telma  \n"
    		+ "Coleman  \n"
    		+ "Migdalia  \n"
    		+ "Bronwyn  \n"
    		+ "Ja  \n"
    		+ "Arletha  \n"
    		+ "Paulina  \n"
    		+ "Antonio  \n"
    		+ "Kaleigh  \n"
    		+ "Chelsey  \n"
    		+ "Neomi  \n"
    		+ "Malorie  \n"
    		+ "Wai  \n"
    		+ "Ima  \n"
    		+ "Krystal  \n"
    		+ "Carolann  \n"
    		+ "Lekisha  \n"
    		+ "Paul  \n"
    		+ "Felton  \n"
    		+ "Vern  \n"
    		+ "Elma  \n"
    		+ "Ira  \n"
    		+ "Cortney  \n"
    		+ "Kesha  \n"
    		+ "Joanie  \n"
    		+ "Florinda  \n"
    		+ "Deadra  \n"
    		+ "Peg  \n"
    		+ "Edda  \n"
    		+ "Eric  \n"
    		+ "Verona  \n"
    		+ "Joseph  \n"
    		+ "Christiane  \n"
    		+ "Thea  \n"
    		+ "Elna  \n"
    		+ "Marybelle  \n"
    		+ "Ronnie  \n"
    		+ "Sheena  \n"
    		+ "Melony  \n"
    		+ "Tyrone  \n"
    		+ "Jessia  \n"
    		+ "Laure  \n"
    		+ "Bettyann  \n"
    		+ "Tressie  \n"
    		+ "Wendie  \n"
    		+ "Donya  \n"
    		+ "Vicente  \n"
    		+ "Lawerence  \n"
    		+ "Rachael  \n"
    		+ "Lakita  \n"
    		+ "Rowena  \n"
    		+ "Fredricka  \n"
    		+ "Tracee  \n"
    		+ "Gerald  \n"
    		+ "Katelynn  \n"
    		+ "Marielle  \n"
    		+ "Steven  \n"
    		+ "Brandon  \n"
    		+ "Rhoda  \n"
    		+ "Susannah  \n"
    		+ "Charlott  \n"
    		+ "Simon  \n"
    		+ "Annabel  \n"
    		+ "Sherri  \n"
    		+ "Jasper  \n"
    		+ "Eldon  \n"
    		+ "Enrique  \n"
    		+ "Otha  \n"
    		+ "Jayna  \n"
    		+ "Joey  \n"
    		+ "Audria  \n"
    		+ "Linsey  \n"
    		+ "Sharika  \n"
    		+ "Manuela  \n"
    		+ "Mercy  \n"
    		+ "Rosamaria  \n"
    		+ "Zita  \n"
    		+ "Nadia  \n"
    		+ "Jene  \n"
    		+ "Lashell  \n"
    		+ "Lekisha  \n"
    		+ "Heather  \n"
    		+ "Arron  \n"
    		+ "Latrina  \n"
    		+ "Kent  \n"
    		+ "Charissa  \n"
    		+ "Johnsie  \n"
    		+ "Melvin  \n"
    		+ "Merlyn  \n"
    		+ "Cleotilde  \n"
    		+ "Adam  \n"
    		+ "Kendal  \n"
    		+ "Ayesha  \n"
    		+ "Newton  \n"
    		+ "Natasha  \n"
    		+ "Lucien  \n"
    		+ "Joellen  \n"
    		+ "Deb  \n"
    		+ "Percy  \n"
    		+ "Latia  \n"
    		+ "Vivian  \n"
    		+ "Antonette  \n"
    		+ "Carla  \n"
    		+ "Luciana  \n"
    		+ "Lawrence  \n"
    		+ "Ellyn  \n"
    		+ "Maurine  \n"
    		+ "Mary  \n"
    		+ "Marianne  \n"
    		+ "Emma  \n"
    		+ "Ward  \n"
    		+ "Natalia  \n"
    		+ "Veta  \n"
    		+ "Shelly  \n"
    		+ "Daniel  \n"
    		+ "Lachelle  \n"
    		+ "Eloise  \n"
    		+ "Audie  \n"
    		+ "Margorie  \n"
    		+ "Ivonne  \n"
    		+ "Hedy  \n"
    		+ "Dawn  \n"
    		+ "Wilson  \n"
    		+ "Merlin  \n"
    		+ "Elfreda  \n"
    		+ "Mikel  \n"
    		+ "Charley  \n"
    		+ "Catina  \n"
    		+ "Bob  \n"
    		+ "Benito  \n"
    		+ "Mirna  \n"
    		+ "Rosy  \n"
    		+ "Heidy  \n"
    		+ "Raguel  \n"
    		+ "Elinor  \n"
    		+ "Karma  \n"
    		+ "Regena  \n"
    		+ "Melaine  \n"
    		+ "Maritza  \n"
    		+ "Genevieve  \n"
    		+ "Wynell  \n"
    		+ "Merissa  \n"
    		+ "Adele  \n"
    		+ "Bridgett  \n"
    		+ "Catrina  \n"
    		+ "Kelsey  \n"
    		+ "Ginny  \n"
    		+ "Randall  \n"
    		+ "Sharolyn  \n"
    		+ "Reyna  \n"
    		+ "Eldridge  \n"
    		+ "Shoshana  \n"
    		+ "Roman  \n"
    		+ "Hue  \n"
    		+ "Chiquita  \n"
    		+ "Hipolito  \n"
    		+ "Jammie  \n"
    		+ "Jorge  \n"
    		+ "Anette  \n"
    		+ "Artie  \n"
    		+ "Veta  \n"
    		+ "Lilia  \n"
    		+ "Marylynn  \n"
    		+ "Kirk  \n"
    		+ "Brice  \n"
    		+ "Glory  \n"
    		+ "Lakiesha  \n"
    		+ "Meagan  \n"
    		+ "Marcie  \n"
    		+ "Trinidad  \n"
    		+ "Lucrecia  \n"
    		+ "Saundra  \n"
    		+ "Everett  \n"
    		+ "Winona  \n"
    		+ "Yan  \n"
    		+ "Allene  \n"
    		+ "Willian  \n"
    		+ "Erik  \n"
    		+ "Freida  \n"
    		+ "Chuck  \n"
    		+ "Cordia  \n"
    		+ "Carri  \n"
    		+ "Chantelle  \n"
    		+ "Alfred  \n"
    		+ "Nestor  \n"
    		+ "Daron  \n"
    		+ "Neoma  \n"
    		+ "Lelah  \n"
    		+ "Roderick  \n"
    		+ "Christiana  \n"
    		+ "Burl ";

}
