package it.team1Restaurant.foods;

public class Ingredient {

    private String name;
    //private List<Allergen> allergensList;

    public Ingredient(){}

    public Ingredient(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                '}';
    }
}
