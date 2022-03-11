package com.masai1;

public class song {
    String artist;
     String title;
     void play(){
         System.out.println(artist+"--->"+title);
     }


}
class Application {
    public static void main(String[] args) {
        song song1= new song();
        song1.artist="artist1";
        song1.title="Title1";
        System.out.println(song1.artist+" ---> "+song1.title);
        song1.play();

    }
}
