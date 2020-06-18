/****************************
 * Sudarsna Mukund
 * Recording 
 * ITC 2100
 * Northeastern University
 * This is a program that will sort user inputted entries (in this case, music).
 *****************************/

import java.util.*;

public class Recording {
    // main variables asked for
    String title;
    String artist;
    int runtime;
// get them and set them!!
public String getTitle(){
    return title;
}
public void setTitle(String title){
    this.title = title;
}
public String getArtist(){
    return artist;
}

public void setArtist (String artist){
    this.artist = artist;
}

public int getRuntime(){
    return runtime;
}
public void setRuntime(int x){
    this.runtime = x;
}
// the actual constructor
public Recording(String title, String artist, int runtime){
    this.title = title;
    this.artist = artist;
    this.runtime = runtime;

}

}