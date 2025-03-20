public class AudioBook extends Title{
    private int durationInMinutes;
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title,literatureType,copies);
        this.durationInMinutes = durationInMinutes;


    }
    //metode til at udregne point for en lydbog
    @Override
    protected double calculatePoints(){
        return (durationInMinutes/2)*convertLiteratureType()*copies;
    }
}
