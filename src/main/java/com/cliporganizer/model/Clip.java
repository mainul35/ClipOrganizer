package com.cliporganizer.model;

import javax.persistence.*;

/**
 * Created by Mainul35 on 10/23/2017.
 */
@Entity
@Table(name = "Clip")
public class Clip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String fileName;
    private Long duration;
    private String type;
    private Integer numberOfTimeBeenPlayed;
    private Integer minNumberOfTimeCanBePlayed;
    private Integer maxNumberOfTimeCanBePlayed;
    private String genre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumberOfTimeBeenPlayed() {
        return numberOfTimeBeenPlayed;
    }

    public void setNumberOfTimeBeenPlayed(Integer numberOfTimeBeenPlayed) {
        this.numberOfTimeBeenPlayed = numberOfTimeBeenPlayed;
    }

    public Integer getMinNumberOfTimeCanBePlayed() {
        return minNumberOfTimeCanBePlayed;
    }

    public void setMinNumberOfTimeCanBePlayed(Integer minNumberOfTimeCanBePlayed) {
        this.minNumberOfTimeCanBePlayed = minNumberOfTimeCanBePlayed;
    }

    public Integer getMaxNumberOfTimeCanBePlayed() {
        return maxNumberOfTimeCanBePlayed;
    }

    public void setMaxNumberOfTimeCanBePlayed(Integer maxNumberOfTimeCanBePlayed) {
        this.maxNumberOfTimeCanBePlayed = maxNumberOfTimeCanBePlayed;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Clip{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", duration=" + duration +
                ", type='" + type + '\'' +
                ", numberOfTimeBeenPlayed=" + numberOfTimeBeenPlayed +
                ", minNumberOfTimeCanBePlayed=" + minNumberOfTimeCanBePlayed +
                ", maxNumberOfTimeCanBePlayed=" + maxNumberOfTimeCanBePlayed +
                ", genre='" + genre + '\'' +
                '}';
    }
}
