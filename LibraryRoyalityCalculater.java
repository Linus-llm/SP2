public class LibraryRoyalityCalculater {
    public static void main(String[] args) {
        Author author1 = new Author("Jens Christen");
        Title lydbog1 = new AudioBook("Erasmus","SKØN",133,150);
        Title bog1 = new PrintedBook("Tjerd","LYRIK",100,90);
        author1.addTitle(bog1);
        author1.addTitle(lydbog1);
        //print statement til at se udbetalingen til author objektet.
        System.out.println(author1.getName()+": " + author1.calculateTotalPay()+"kr");

    }
}
