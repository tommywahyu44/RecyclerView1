package ilkomp.recyclerview;

/**
 * Created by Tommy on 2/27/2017.
 */

public class Endpoint {
    private static final String MainUrl = "https://api.themoviedb.org/",
        APIVer = "3/",
        APIKey = "?api_key="+ BuildConfig.MOVIE_API_KEY;
    public static final String DiscoverMovie = MainUrl + APIVer +"Discover/Movie" + APIKey;


}
