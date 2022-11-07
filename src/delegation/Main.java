package delegation;

public class Main {
    public static void main(String[] args) {
        Film film = new Film();
        film.setType(Film.FilmTypes.REGULAR_FILM);
        System.out.println(film.price(4));

        film.setType(Film.FilmTypes.NEW_FILM);
        System.out.println(film.price(4));

        film.setType(Film.FilmTypes.CHILDREN_FILM);
        System.out.println( film.price(4) );
    }
}