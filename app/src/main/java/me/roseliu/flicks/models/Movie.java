package me.roseliu.flicks.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel //to be parcelable

public class Movie {

    //values from API
    public String title;
    public String overview;
    public String posterPath; //only the path
    public String backdropPath;
    Double voteAverage;

    public Movie() {
    }

    //initialize from JSON data
    public Movie(JSONObject object) throws JSONException {
        title=object.getString("title");
        overview = object.getString("overview");
        posterPath=object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }
}
