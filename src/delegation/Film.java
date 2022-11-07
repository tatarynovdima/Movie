package delegation;

public class Film {
    enum FilmTypes{
      NEW_FILM(),
      CHILDREN_FILM,
      REGULAR_FILM;
    }
    private FilmTypes type;

    public void setType(FilmTypes type) {
        this.type = type;
    }
    public int price(int days){
        switch (type){
            case NEW_FILM:
                NewFilm newFilm = new NewFilm();
                return newFilm.getPrice(days);
            case CHILDREN_FILM:
                Children children = new Children();
                return children.getPrice(days);
            case REGULAR_FILM:
                Regular regular = new Regular();
                return regular.getPrice(days);
        }
        return 0;
    }
}