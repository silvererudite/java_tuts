package polymorphism;

public class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
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

