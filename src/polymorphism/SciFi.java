package polymorphism;

public class SciFi extends Movie{
    public SciFi(String title) {
        super(title);
    }

    public void watchSciFi(){
        System.out.println("Watching a science fiction!!!");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Nice movie",
                "Futuristic music",
                "Futuristic stuff happen");
    }
}
