package polymorphism;

public class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Nice movie",
                "Scary music",
                "Something bad happens");
    }
}
