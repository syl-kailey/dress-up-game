import java.util.*;

public class User {
    
    List<Top> tops;
    List<Bottom> bottoms;
    List<Shoes> shoes;
    List<String> colors;
    List<String> patterns;
    List<String> aesthetics;
    Outfit[] allOutfits;


    public User(){
        tops = null;
        bottoms =null;
        shoes = null;
        colors = new ArrayList<String>();
        patterns = new ArrayList<String>();
        aesthetics = new ArrayList<String>();
        this.allOutfits = DressUpGame.allOutfits;
    }

    public User (List<Top> tops, List<Bottom> bottoms, List<Shoes> shoes, Outfit[] allOutfits){
        this.tops = tops;
        this.bottoms = bottoms;
        this.shoes = shoes;
        this.allOutfits = allOutfits;
        colors = new ArrayList<String>();
        patterns = new ArrayList<String>();
        aesthetics = new ArrayList<String>();
    }

    public void giveTops(List<Top> t){
        tops = t;
    }

    public List<String> preferredColors(){
        //iterate through tops, bottoms, and shoes and get the color of each. 
        //If color is already in list, don't add it.
        for (Top t : tops){
            if (colors.contains(allOutfits[t.getOutfit()].getColor()) == false){
                colors.add(allOutfits[t.getOutfit()].getColor());
            }
        }
        for (Bottom b : bottoms){
            if (colors.contains(allOutfits[b.getOutfit()].getColor()) == false){
                colors.add(allOutfits[b.getOutfit()].getColor());
            }
        }
        for (Shoes s : shoes){
            if (colors.contains(allOutfits[s.getOutfit()].getColor()) == false){
                colors.add(allOutfits[s.getOutfit()].getColor());
            }
        }
        
        return colors;
    }

    public List<String> preferredPatterns(){
        //iterate through tops, bottoms, and shoes and get the pattern of each. 
        for (Top t : tops){
            if (patterns.contains(allOutfits[t.getOutfit()].getPattern()) == false){
                patterns.add(allOutfits[t.getOutfit()].getPattern());
            }
        }
        for (Bottom b : bottoms){
            if (patterns.contains(allOutfits[b.getOutfit()].getPattern()) == false){
                patterns.add(allOutfits[b.getOutfit()].getPattern());
            }
        }
        for (Shoes s : shoes){
            if (patterns.contains(allOutfits[s.getOutfit()].getPattern()) == false){
                patterns.add(allOutfits[s.getOutfit()].getPattern());
            }
        }
        //If pattern is already in list, don't add it.
        return patterns;
    }

    public List<String> preferredAesthetics(){
        //iterate through tops, bottoms, and shoes and get the aesthetic of each. 
        //If color is already in list, don't add it.
        for (Top t : tops){
            if (aesthetics.contains(allOutfits[t.getOutfit()].getAesthetic()) == false){
                aesthetics.add(allOutfits[t.getOutfit()].getAesthetic());
            }
        }
        for (Bottom b : bottoms){
            if (aesthetics.contains(allOutfits[b.getOutfit()].getAesthetic()) == false){
                aesthetics.add(allOutfits[b.getOutfit()].getAesthetic());
            }
        }
        for (Shoes s : shoes){
            if (aesthetics.contains(allOutfits[s.getOutfit()].getAesthetic()) == false){
                aesthetics.add(allOutfits[s.getOutfit()].getAesthetic());
            }
        }
        
        return aesthetics;
    }



}
