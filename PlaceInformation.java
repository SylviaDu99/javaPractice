// Jingyun Du
// 11/28/17
// CSE142
// TA: Judith Kim
// Assignment #8
//
// This class stores information of a place. The place is specified by name,
// address, tag, latitude, and longitude.

public class PlaceInformation {
   private String name;
   private String address;
   private String tag;
   private double latitude;
   private double longitude;
   
   //construct a PlaceInformation object
   //take in string name, string address, string tag, double latitude, and double longitude
   public PlaceInformation(String name, String address, String tag,
                                    double latitude, double longitude) {
      this.name = name;
      this.address = address;
      this.tag = tag;
      this.latitude = latitude;
      this.longitude = longitude;
   }
   
   //return the name of the place as a String
   public String getName() {
      return name;
   }
   
   //return the address of the place as a String
   public String getAddress() {
      return address;
   }
   
   //return the tag of the place as a String
   public String getTag() {
      return tag;
   }
   
   //return the cleansed data including name, latitude and longitude of the place as a String
   public String toString() {
      return name + " (latitude: " + latitude + ", longitude: " + longitude + ")";
   }
   
   //return a new GeoLocation object constructed by the place's latitude and longitude
   public GeoLocation getLocation() {
      return new GeoLocation(latitude, longitude);
   }
   
   //take in a GeoLocation object
   //return the distance from the place to the spot as a double
   public double distanceFrom(GeoLocation spot) {
      return getLocation().distanceFrom(spot);
   }
}