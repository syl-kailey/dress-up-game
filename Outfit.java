import java.util.*;

public class Outfit {
    Top top;
    Bottom bottom;
    Shoes shoes;
    String color;
    String pattern;
    String aesthetic;

    public Outfit(Top top, Bottom bottom, Shoes shoes, String color, String pattern, String aesthetic){
        this.top = top;
        this.bottom = bottom;
        this.shoes = shoes;
        this.color = color;
        this.pattern = pattern;
        this.aesthetic = aesthetic;
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
    
}
