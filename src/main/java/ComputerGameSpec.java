public class ComputerGameSpec {
    public String name, description;
    public int ageRestriction;
    public Platform platform;
    public Genre genre;


    public ComputerGameSpec(String name, String description, Genre genre, int ageRestriction,
                            Platform platform) {
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.ageRestriction = ageRestriction;
        this.platform = platform;
    }

    public boolean matches(ComputerGameSpec other) {
        if(!name.equals(other.name)){
            return false;
        }
        if (!description.toLowerCase().contains(other.description.toLowerCase())
                && !other.description.toLowerCase().contains(description.toLowerCase())) {
            return false;
        }
        if(ageRestriction != other.ageRestriction) {
            return false;
        }
        if(genre != other.genre) {
            return false;
        }
        if(platform != other.platform) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return name;
    }
}
