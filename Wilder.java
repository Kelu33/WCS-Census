public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String whoAmI() {
        String response = "Je m'appelle " + this.firstname;
        if (this.aware) {
            response += " et je suis aware";
        } else {
            response += " et je ne suis pas aware";
        }
        return response;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

}
