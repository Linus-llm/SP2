import java.util.ArrayList;
//Author klasse med en constructor med String name som parameter
public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();
    public Author(String name){
        this.name = name;
    }
    //metode til at tilføje titler til vores titles liste. listen skal bruges til udrening af total betaling
    public void addTitle(Title x){
        titles.add(x);
    }
    //metode til at udregne den totale betaling. Gennemløber titles og gemmer hvert instans calculateRoyalty i en variabel
    public float calculateTotalPay(){
        float v = 0;
        for(Title i:titles){
             v += i.calculateRoyalty();
        }
        return v;
    }
    //getter til navn på forfatter
    public String getName(){
        return this.name;
    }
}
