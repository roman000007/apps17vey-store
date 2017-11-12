public class ComputerGameSpec {
    String name, description;
    int ageRestriction;
    Platform platform;
    Genre genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    public ComputerGameSpec(String name, String description, Genre genre, int ageRestriction,
                            Platform platform){
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.ageRestriction = ageRestriction;
        this.platform = platform;
    }

    public boolean matches(ComputerGameSpec other){
        if(!name.equals(other.name)){
            return false;
        }
        if (!description.toLowerCase().contains(other.description.toLowerCase())
                && !other.description.toLowerCase().contains(description.toLowerCase())){
            return false;
        }
        if(ageRestriction != other.ageRestriction){
            return false;
        }
        if(genre != other.genre){
            return false;
        }
        if(platform != other.platform){
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return name;
    }
}