import java.util.*;
import java.lang.*;
import java.net.*;
import java.io.*;
import javax.swing.UIManager;
import javax.swing.plaf.metal.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class DressUpGame {
    User user1;
    User user2;
    static Outfit finalOutfit;
    static List<String> colors;
    static List<String> patterns;
    static List<String> aesthetics;
    List<String> favoritePattern;
    static Top[] allTops;
    static Bottom[] allBottoms;
    static Shoes[] allShoes;
    public static Outfit[] allOutfits;
    static List<Outfit> patternOutfits;
    static List<Outfit> colorOutfits;
    static List<Outfit> aestheticOutfits;

    public static List<String> favoriteColor(User user1, User user2){
        List<String> colors1 = user1.preferredColors();
        List<String> colors2 = user2.preferredColors();
        colors = new ArrayList<String>();
        
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

    public static List<String> favoritePattern(User user1, User user2){
        List<String> patterns1 = user1.preferredPatterns();
        List<String> patterns2 = user2.preferredPatterns();
        patterns = new ArrayList<String>();
        
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

    public static List<String> favoriteAesthetic(User user1, User user2){
        List<String> aes1 = user1.preferredAesthetics();
        List<String> aes2 = user2.preferredAesthetics();
        aesthetics = new ArrayList<String>();
        
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

    static void populateTops(){
        allTops = new Top[20];
        allTops[0] = new Top(0, "./allpngs/top1.png");
        allTops[1] = new Top(1, "./allpngs/top2.png");
        allTops[2] = new Top(2, "./allpngs/top3 .png");
        allTops[3] = new Top(3, "./allpngs/top4 .png");
        allTops[4] = new Top(4, "./allpngs/top5.png");
        allTops[5] = new Top(5, "./allpngs/top6 .png");
        allTops[6] = new Top(6, "./allpngs/top7 .png");
        allTops[7] = new Top(7, "./allpngs/top8 .png");
        allTops[8] = new Top(8, "./allpngs/top9 .png");
        allTops[9] = new Top(9, "./allpngs/top10.png");
        allTops[10] = new Top(10, "./allpngs/top 11 .png");
        allTops[11] = new Top(11, "./allpngs/top 12.png");
        allTops[12] = new Top(12, "./allpngs/top 13 .png");
        allTops[13] = new Top(13, "./allpngs/top 14.png");
        allTops[14] = new Top(14, "./allpngs/top 15 .png");
        allTops[15] = new Top(15, "./allpngs/top 16 .png");
        allTops[16] = new Top(16, "./allpngs/top17 .png");
        allTops[17] = new Top(17, "./allpngs/top18.png");
        allTops[18] = new Top(18, "./allpngs/top19 .png");
        allTops[19] = new Top(19, "./allpngs/top20.png");
    }

    static void populateBottoms(){
        allBottoms = new Bottom[20];
        allBottoms[0] = new Bottom(0, "./allpngs/skirt 1.png");
        allBottoms[1] = new Bottom(1, "./allpngs/pants2 .png");
        allBottoms[2] = new Bottom(2, "./allpngs/skirt 3 .png");
        allBottoms[3] = new Bottom(3, "./allpngs/pants4 .png");
        allBottoms[4] = new Bottom(4, "./allpngs/skirt 5 .png");
        allBottoms[5] = new Bottom(5, "./allpngs/skirt 6 .png");
        allBottoms[6] = new Bottom(6, "./allpngs/skirt7 .png");
        allBottoms[7] = new Bottom(7, "./allpngs/pants8 .png");
        allBottoms[8] = new Bottom(8, "./allpngs/skirt9 .png");
        allBottoms[9] = new Bottom(9, "./allpngs/skirt10 .png");
        allBottoms[10] = new Bottom(10, "./allpngs/skirt11 .png");
        allBottoms[11] = new Bottom(11, "./allpngs/pants12 .png");
        allBottoms[12] = new Bottom(0, "./allpngs/skirt13 .png");
        allBottoms[13] = new Bottom(13, "./allpngs/skirt14 .png");
        allBottoms[14] = new Bottom(14, "./allpngs/skirt15 .png");
        allBottoms[15] = new Bottom(15, "./allpngs/skirt16.png");
        allBottoms[16] = new Bottom(16, "./allpngs/skirt17 .png");
        allBottoms[17] = new Bottom(17, "./allpngs/skirt18 .png");
        allBottoms[18] = new Bottom(18, "./allpngs/skirt19 .png");
        allBottoms[19] = new Bottom(19, "./allpngs/skirt20 .png");

    }

    static void populateShoes(){
        allShoes = new Shoes[20];
        allShoes[0] = new Shoes(0, "./allpngs/Shoes1.png");
        allShoes[1] = new Shoes(1, "./allpngs/shoes 2 .png");
        allShoes[2] = new Shoes(2, "./allpngs/shoes3 .png");
        allShoes[3] = new Shoes(3, "./allpngs/shoes4 .png");
        allShoes[4] = new Shoes(4, "./allpngs/shoe 5 .png");
        allShoes[5] = new Shoes(5, "./allpngs/shoes6 .png");
        allShoes[6] = new Shoes(6, "./allpngs/shoes7 .png");
        allShoes[7] = new Shoes(7, "./allpngs/shoes8 .png");
        allShoes[8] = new Shoes(8, "./allpngs/shoes9.png");
        allShoes[9] = new Shoes(9, "./allpngs/shoes 10 .png");
        allShoes[10] = new Shoes(10, "./allpngs/shoes 11.png");
        allShoes[11] = new Shoes(11, "./allpngs/shoes12 .png");
        allShoes[12] = new Shoes(12, "./allpngs/shoes13.png");
        allShoes[13] = new Shoes(13, "./allpngs/shoes14 .png");
        allShoes[14] = new Shoes(14, "./allpngs/shoes15.png");
        allShoes[15] = new Shoes(15, "./allpngs/shoes16 .png");
        allShoes[16] = new Shoes(16, "./allpngs/shoes17 .png");
        allShoes[17] = new Shoes(17, "./allpngs/shoes18 .png");
        allShoes[18] = new Shoes(18, "./allpngs/shoes19.png");
        allShoes[19] = new Shoes(19, "./allpngs/shoes20 .png");
    }

    static void populateOutfit(){//in spreadsheet all outfit numbers are +1
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


    public static Outfit selectOutfit(){//i removed parameters because theyre already global variables
        colorOutfits = new ArrayList<Outfit>();
        patternOutfits = new ArrayList<Outfit>();
        aestheticOutfits = new ArrayList<Outfit>();
        //if length of colors is 1
            //find outfits with that color
            //colorOutfits
        int color = 0;
        if (colors.size() > 1){
            color = (int)(Math.random()*2)+1;//i think this is right, should probably double check
        }
        for (Outfit o: allOutfits){
            if (o.getColor().equals(colors.get(color))){
                colorOutfits.add(o);
            }
        }

        //else if length of patterns is 1
            //find outfits with that pattern
            //patternOutfits
            int pattern = 0;
            if (patterns.size() > 1){
                pattern = (int)(Math.random()*2)+1;
            }
            for (Outfit o: allOutfits){
                if (o.getPattern().equals(patterns.get(pattern))){
                    patternOutfits.add(o);
                }
            }

        //else if length of aesthetics is 1
            //find outfits with that aesthetic
            //aestheticOutfits
            int aesthetic = 0;
            if (aesthetics.size() > 1){
                aesthetic = (int)(Math.random()*2)+1;
            }
            for (Outfit o: allOutfits){
                if (o.getAesthetic().equals(aesthetics.get(aesthetic))){
                    aestheticOutfits.add(o);
                }
            }
        
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

        List<Outfit> potentialOutfits = new ArrayList<Outfit>();
        for (Outfit o : colorOutfits){
            if (aestheticOutfits.contains(o) && patternOutfits.contains(o)){
                finalOutfit = o;
                return finalOutfit;
            }else if (aestheticOutfits.contains(o) || patternOutfits.contains(o)){//compare color w/ aesthetic and pattern
                potentialOutfits.add(o);
            }
        }
        for (Outfit o : aestheticOutfits){//compare aesthetic with pattern
            if (patternOutfits.contains(o)){
                potentialOutfits.add(o);
            }
        }
        //else randomly select an outfit from the list
            //that outfit is final outfit
        if (potentialOutfits.size() == 0){//very unlikely,maybe impossible
            potentialOutfits.add(colorOutfits.get(0));
            potentialOutfits.add(patternOutfits.get(0));
            potentialOutfits.add(aestheticOutfits.get(0));
        }
        finalOutfit = potentialOutfits.get((int)(Math.random()*potentialOutfits.size()));//again, should probably check my math
        return finalOutfit ;
    }



}
