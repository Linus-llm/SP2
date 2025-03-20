//abstract klasse til to underklasser. Den har en constructor til skabelse af objekter med parameterne String, String, int
public abstract class Title {
    private String title;
    private double literatureTypePoints;
    protected int copies;
    protected double rate = 0.067574;
    protected String literatureType;
    public Title(String title, String literatureType,int copies){
        this.title = title;
        this.copies = copies;
        this.literatureType = literatureType;
    }
    //bruger variablen rate som er hentet fra opgavebeskrivelsen og ganger med calculatePoints() som er overskrevet i de to underklasser.
    public double calculateRoyalty(){
        return rate * calculatePoints();
    }
    //bruges som model til de to underklasser
    protected abstract double calculatePoints();
    //metode udnytter switch case til at konvertere String literaturtypen til int værdien som står i opgavebeskrivelsen
    protected double convertLiteratureType(){
        switch (this.literatureType){
            case "BI":
                literatureTypePoints = 3;
                break;
            case "TE":
                literatureTypePoints = 3;
                break;
            case "LYRIK":
                literatureTypePoints = 6;
                break;
            case "SKØN":
                literatureTypePoints = 1.7;
                break;
            case "FAG":
                literatureTypePoints = 1;
                break;


        }
        return literatureTypePoints;
    }
}
