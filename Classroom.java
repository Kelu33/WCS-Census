public class Classroom {

    public static void main(String[] args) {
        Wilder[] wilders = {
                new Wilder("Adèle", false),
                new Wilder("Anna", false),
                new Wilder("Chloé", false),
                new Wilder("Clément", false),
                new Wilder("Iliess", false),
                new Wilder("Jennifer", false),
                new Wilder("Julien", false),
                new Wilder("Lucas", false),
                new Wilder("Numa", false),
                new Wilder("Samuel", false),
                new Wilder("Tatiana", false),
                new Wilder("Thibault", false)
        };

        for (Wilder wilder : wilders) {
            System.out.println(wilder.whoAmI());
            wilder.setAware(true);
            String newName = "Wild_" + wilder.getFirstname();
            wilder.setFirstname(newName);
        }

        System.out.println("\n 6 months later :\n");

        for (Wilder wilder : wilders) {
            System.out.println(wilder.whoAmI());
        }

    }

}
