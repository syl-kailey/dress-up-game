public class Clothing {

    String color;
    String pattern;
    String aesthetic;
    int outfit;

    public Clothing (String color, String pattern, String aesthetic, int outfit){
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

}