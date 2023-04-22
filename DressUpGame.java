import java.util.*;
import java.lang.*;

public class DressUpGame {
    User user1;
    User user2;
    Outfit finalOutfit;
    List<String> colors;
    List<String> patterns;
    List<String> aesthetics;
    List<String> favoritePattern;
    Top[] allTops;
    Bottom[] allBottoms;
    Shoes[] allShoes;
    public Outfit[] allOutfits;

    public List<String> favoriteColor(User user1, User user2){
        List<String> colors1 = user1.preferredColors();
        List<String> colors2 = user2.preferredColors();
        
        //look through user1's list and compare with user2's list
        //if anything matches, that is the only item in the list
        for(String c : colors1){
            if (colors2.contains(c)){
                colors.add(c);
                break;
            }
        }
        //else, select the color of first selected item of each 
            //user and put those in list
        if (colors.size() == 0){
            colors.add(colors1.get(0));
            colors.add(colors2.get(0));
        }
        return colors;
    }

    public List<String> favoritePattern(User user1, User user2){
        List<String> patterns1 = user1.preferredPatterns();
        List<String> patterns2 = user2.preferredPatterns();
        
        //look through user1's list and compare with user2's list
        //if anything matches, that is the only item in the list
        for(String c : patterns1){
            if (patterns2.contains(c)){
                patterns.add(c);
                break;
            }
        }
        //else, select the color of first selected item of each 
            //user and put those in list
        if (patterns.size() == 0){
            patterns.add(patterns1.get(0));
            patterns.add(patterns2.get(0));
        }
        return patterns;
    }

    public List<String> favoriteAesthetic(User user1, User user2){
        List<String> aes1 = user1.preferredAesthetics();
        List<String> aes2 = user2.preferredAesthetics();
        
        //look through user1's list and compare with user2's list
        //if anything matches, that is the only item in the list
        for(String c : aes1){
            if (aes2.contains(c)){
                aesthetics.add(c);
                break;
            }
        }
        //else, select the color of first selected item of each 
            //user and put those in list
        if (aesthetics.size() == 0){
            aesthetics.add(aes1.get(0));
            aesthetics.add(aes2.get(0));
        }
        return aesthetics;
    }

    void populateTops(){
        allTops = new Top[20];
        allTops[0] = new Top(0, null);
    }

    void populateBottoms(){
        allBottoms = new Bottom[20];
        allBottoms[0] = new Bottom(0, null);
    }

    void populateShoes(){
        allShoes = new Shoes[20];
        allShoes[0] = new Shoes(0, null);
    }

    void populateOutfit(){//in spreadsheet all outfit numbers are +1
        allOutfits = new Outfit[20];
        allOutfits[0] = new Outfit(allTops[0], allBottoms[0], allShoes[0], "pink", "floral", "casual", 0);
        allOutfits[1] = new Outfit(allTops[1], allBottoms[1], allShoes[1], "blue", "floral", "casual", 1);
        allOutfits[2] = new Outfit(allTops[2], allBottoms[2], allShoes[2], "purple", "plain", "club", 2);
        allOutfits[3] = new Outfit(allTops[3], allBottoms[3], allShoes[3], "blue", "stars", "casual", 3);
        allOutfits[4] = new Outfit(allTops[4], allBottoms[4], allShoes[4], "blue", "plain", "flowy", 4);
        allOutfits[5] = new Outfit(allTops[5], allBottoms[5], allShoes[5], "purple", "stripes", "club", 5);
        allOutfits[6] = new Outfit(allTops[6], allBottoms[6], allShoes[6], "pink", "plain", "flowy", 6);
        allOutfits[7] = new Outfit(allTops[7], allBottoms[7], allShoes[7], "blue", "stars", "fun", 7);
        allOutfits[8] = new Outfit(allTops[8], allBottoms[8], allShoes[8], "red", "plain", "flowy", 8);
        allOutfits[9] = new Outfit(allTops[9], allBottoms[9], allShoes[9], "blue", "hearts", "casual", 9);
        allOutfits[10] = new Outfit(allTops[10], allBottoms[10], allShoes[10], "blue", "plain", "fancy", 10);
        allOutfits[11] = new Outfit(allTops[11], allBottoms[11], allShoes[11], "pink", "stripes", "casual", 11);
        allOutfits[12] = new Outfit(allTops[12], allBottoms[12], allShoes[12], "green", "stars", "fancy", 12);
        allOutfits[13] = new Outfit(allTops[13], allBottoms[13], allShoes[13], "green", "plain", "flowy", 13);
        allOutfits[14] = new Outfit(allTops[14], allBottoms[14], allShoes[14], "pink", "stripes", "flowy", 14);
        allOutfits[15] = new Outfit(allTops[15], allBottoms[15], allShoes[15], "pink", "hearts", "casual", 15);
        allOutfits[16] = new Outfit(allTops[16], allBottoms[16], allShoes[16], "red", "flora", "fancy", 16);
        allOutfits[17] = new Outfit(allTops[17], allBottoms[17], allShoes[17], "purple", "stripes", "fun", 17);
        allOutfits[18] = new Outfit(allTops[18], allBottoms[18], allShoes[18], "red", "hearts", "fancy", 18);
        allOutfits[19] = new Outfit(allTops[19], allBottoms[19], allShoes[19], "red", "floral", "fun", 19);
        
    }


    Outfit selectOutfit(List<String> colors, List<String> patterns, List<String> aesthetics){

        //turn colors list into strings
        //turn patterns list into strings
        //turn aesthetics list into strings

        //if length of colors is 1
            //find outfits with that color
            //colorOutfits

        //else if length of patterns is 1
            //find outfits with that pattern
            //patternOutfits

        //else if length of aesthetics is 1
            //find outfits with that aesthetic
            //aestheticOutfits
        
        //else
            //randomly select color 1 or color 2
            //find outfits with that color
            //colorOutfits

            //randomly select pattern 1 or pattern 2
            //find outfits with that patter
            //patternOutfits

            //randomly select aesthetic 1 or aesthetic 2
            //find outfits with that aesthetic
            //aestheticOutfits

        //make list of colorOutfits, patternOutfits, and aestheticOutfits
        //if an outfit appears more than once
            //make list of those
            //if length of list is one
            //that outfit is finalOutfit
        //else randomly select an outfit from the list
            //that outfit is final outfit

        return finalOutfit;
    }



    public static void main(String[] args) {

    }

}
