package polymorphism;

import java.util.Scanner;

public class MovieTester {
    public static void main(String[] args) {
//        Movie theMovie = Movie.makeMovie("Rush Hour", "Comedy");
//        theMovie.watchMovie();
//        Movie theMovie2 = Movie.makeMovie("Interstellar", "Sc");
//        theMovie2.watchMovie();

        Scanner s  = new Scanner(System.in);
        while (true){
            System.out.println("Enter Type (A for Adventure, C for Comedy, S for SciFi or Q to Quit): ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.makeMovie(title, type);
            movie.watchMovie();
        }
    }
}
