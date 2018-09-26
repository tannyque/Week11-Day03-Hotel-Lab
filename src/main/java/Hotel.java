import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;


    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public int getBedroomCount() {
        return this.bedrooms.size();
    }
}
