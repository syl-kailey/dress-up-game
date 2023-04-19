import java.util.*;

public class User {
    
    List<Top> tops;
    List<Bottom> bottoms;
    List<Shoes> shoes;
    List<String> colors;
    List<String> patterns;
    List<String> aesthetics;


    public User (List<Top> tops, List<Bottom> bottoms, List<Shoes> shoes){
        this.tops = tops;
        this.bottoms = bottoms;
        this.shoes = shoes;
    }

    public List<String> preferredColors(List<Top> tops, List<Bottom> bottoms, List<Shoes> shoes){
        //iterate through tops, bottoms, and shoes and get the color of each. 
        //If color is already in list, don't add it.
        
        return colors;
    }

    public List<String> preferredPatterns(List<Top> tops, List<Bottom> bottoms, List<Shoes> shoes){
        //iterate through tops, bottoms, and shoes and get the pattern of each. 
        //If pattern is already in list, don't add it.
        
        return patterns;
    }

    public List<String> preferredAesthetics(List<Top> tops, List<Bottom> bottoms, List<Shoes> shoes){
        //iterate through tops, bottoms, and shoes and get the aesthetic of each. 
        //If color is already in list, don't add it.
        
        return aesthetics;
    }



}
