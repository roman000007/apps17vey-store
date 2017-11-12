public class ComputerGameSpec {
    private String name, description;
    private int ageRestriction;
    private Platform platform;
    private Genre genre;

    public ComputerGameSpec(String name, String description, Genre genre,
                            int ageRestriction, Platform platform) {
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.ageRestriction = ageRestriction;
        this.platform = platform;
    }

    public boolean matches(ComputerGameSpec other) {
        if (!name.equals(other.getName())) {
            return false;
        }
        if (!description.toLowerCase().contains(
                other.getDescription().toLowerCase()) &&
                !other.getDescription().toLowerCase().
                        contains(description.toLowerCase())) {
            return false;
        }
        if (ageRestriction != other.getAgeRestriction()) {
            return false;
        }
        if (genre != other.getGenre()) {
            return false;
        }
        if (platform != other.getPlatform()) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public Platform getPlatform() {
        return platform;
    }

    public Genre getGenre() {
        return genre;
    }

}
