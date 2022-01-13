package equals;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Movie implements Comparable<Movie> {
    private String title;
    private Date releaseDate;
    private Integer ranking;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Movie(String title, Date releaseDate, Integer ranking) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + " Ranking : " + getRanking();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Movie m = (Movie) obj;
        if (title == null) {
            if(m.title != null) {
                return false;
            }
        }else if (!title.equals(m.title)) {
            return false;
        }

        if (releaseDate == null) {
            if (m.releaseDate != null) {
                return false;
            }
        } else if (!releaseDate.equals(m.releaseDate)) {
            return false;
        }

        if (ranking == null) {
            if (m.ranking != null) {
                return false;
            }
        } else if (!ranking.equals(m.ranking)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
       return Objects.hash(title, releaseDate, ranking);
    }

    @Override
    public int compareTo(Movie m) {
        if (m.ranking > this.ranking) {
            return 1;
        }else if (this.ranking > m.ranking) {
            return -1;
        }

        return 0;
    }
}
