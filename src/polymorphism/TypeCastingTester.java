package polymorphism;

public class TypeCastingTester {
    public static void main(String[] args) {
//        Movie theMovie3 = Movie.makeMovie("Conjuring", "Comedy");
//        theMovie3.watchMovie();
//
//        Movie conjuring = new Comedy("Conjuring");
//        conjuring.watchMovie();

//        Comedy conjuring = (Comedy) Movie.makeMovie("Conjuring", "C");
//        conjuring.watchMovie();
//
//        Object conjuringTwo = Movie.makeMovie("Conjuring 2", "C");
        //((Movie) conjuringTwo).watchMovie();

//        Movie comedyMovie  = (Comedy) conjuringTwo;
//        comedyMovie.watchComedy();

//        Comedy comedyMovie  = (Comedy) conjuringTwo;
//        comedyMovie.watchComedy();
//
//        var airplane = Movie.makeMovie("A","Ab");
//        airplane.watchMovie();

        Object unknownMovie = Movie.makeMovie("C", "S");
        if (unknownMovie.getClass().getSimpleName().equals("Comedy")){
            Comedy c =  (Comedy) unknownMovie;
            c.watchComedy();
        } else if (unknownMovie instanceof Adventure) {
            Adventure a =  (Adventure) unknownMovie;
            a.watchAdventure();
        }else if(unknownMovie instanceof SciFi sci){
            sci.watchSciFi();
        }

    }
}
