package polymorphism;

public class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    public void watchComedy(){
        System.out.println("Watching a comedy!!!");
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Nice movie",
                "Funny music",
                "Funny stuff happen");
    }
}

