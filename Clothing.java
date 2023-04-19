public class Clothing {

    String color;
    String pattern;
    String aesthetic;
    int outfit;
    String imageURL;

    public Clothing (String color, String pattern, String aesthetic, int outfit, String imageURL){
        this.color = color;
        this.pattern = pattern;
        this.aesthetic = aesthetic;
        this.outfit = outfit;
    }

    public String getColor(){
        return color;
    }

    public String getPattern(){
        return pattern;
    }

    public String getAesthetic(){
        return aesthetic;
    }

    public int getOutfit(){
        return outfit;
    }

    public String getImageURL(){
        return imageURL;
    }

}