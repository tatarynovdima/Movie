package delegation;

public class Children implements FilmType {
    @Override
    public int getPrice(int days) {
        System.out.print("Price : ");
        return  days * 2;
    }
}