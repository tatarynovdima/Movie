package delegation;

public class Regular implements FilmType {
    @Override
    public int getPrice(int days) {
        System.out.print("Price : ");
        return days;
    }
}