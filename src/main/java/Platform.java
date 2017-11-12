public enum Platform {
    WINDOWS("Windows"), LINUX("Linux"), MACOS("MacOS");

    private String name;

    Platform(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
