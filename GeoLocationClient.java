// Jingyun Du
// 11/28/17
// CSE142
// TA: Judith Kim
// Assignment #8
//
// This program will construct GeoLocation objects of three places
// and print the cleansed location data of them.

public class GeoLocationClient {
   public static void main(String[] args) {
      GeoLocation stash = new GeoLocation(34.988889, -106.614444);
      GeoLocation abq = new GeoLocation(34.989978, -106.614357);
      GeoLocation fbi = new GeoLocation(35.131281, -106.61263);
      
      System.out.println("the stash is at " + stash.toString());
      System.out.println("ABQ studio is at " + abq.toString());
      System.out.println("FBI building is at " + fbi.toString());
      
      System.out.println("distance in miles between: ");
      System.out.println("    stash/studio = " + stash.distanceFrom(abq));
      System.out.println("    stash/fbi    = " + stash.distanceFrom(fbi));
   }
}