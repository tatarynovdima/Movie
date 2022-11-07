package delegation;

public class NewFilm implements FilmType {
    @Override
    public int getPrice(int days) {
        System.out.print("Price : ");
        return  days * 3;
    }
}