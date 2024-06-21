package polymorphism;

public class Movie {
    private String title;
    Movie(String title){
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a "+instanceType+ " movie");
    }
    public static Movie makeMovie(String title, String genre){
        return switch (genre.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'S' -> new SciFi(title);
            case 'C' -> new Comedy(title);
            default -> new Movie(title);
        };
    }
}
