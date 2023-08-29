package mujahid.data;

public enum Level {
    STANDARD("Standard customer"),
    PREMIUM("Premium customer"),
    VIP("VIP customer");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
