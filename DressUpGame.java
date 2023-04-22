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

    public List<String> favoriteColor(User user1, User user2){

        
        //look through user1's list and compare with user2's list
        //if anything matches, that is the only item in the list

        //else, select the color of first selected item of each 
            //user and put those in list

        return colors;
    }

    public List<String> favoritePattern(User user1, User user2){

        //look through user1's list and compare with user2's list
        //if anything matches, that is the only item in the list

        //else, select the pattern of first selected item of each 
            //user and put those in list

        return patterns;
    }

    public List<String> favoriteAesthetic(User user1, User user2){
       
        //look through user1's list and compare with user2's list
        //if anything matches, that is the only item in the list

        //else, select the aesthetic of first selected item of each 
            //user and put those in list

        return aesthetics;
    }

    void populateTops(){
        Top top1 = new Top(null, null, null, 0, null, null);
    }

    void populateBottoms(){
        Bottom bottom1 = new Bottom(null, null, null, 0, null, false);
    }

    void populateShoes(){
        Shoes shoe1 = new Shoes(null, null, null, 0, null, false);
    }

    void populateOutfit(){
        Outfit outfit1 = new Outfit(null, null, null, null, null, null, 0);
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
