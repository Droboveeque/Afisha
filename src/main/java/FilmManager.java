public class FilmManager {

    private int limitForLastMovies;
    private String[] movieNames = new String[0];

    public FilmManager() {
        this.limitForLastMovies = 5;
    }

    public FilmManager(int limit) {
        this.limitForLastMovies = limit;
    }

    public void addNewMovie(String movie) {
        String[] tmp = new String[movieNames.length + 1];
        for (int i = 0; i < movieNames.length; i++) {
            tmp[i] = movieNames[i];
        }
        tmp[tmp.length - 1] = movie;
        movieNames = tmp;
    }

    public String[] findAll() {
        return movieNames;
    }

    public String[] findLast() {
        int resultLength;
        if (movieNames.length >= limitForLastMovies) {
            resultLength = limitForLastMovies;
        } else {
            resultLength = movieNames.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movieNames[movieNames.length - 1 - i];
        }
        return result;
    }
}
