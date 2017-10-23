package com.cliporganizer.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Mainul35 on 10/23/2017.
 */

@Entity
public class RadioShow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer duration;
    private Integer minutesOfAudio;
    private Integer minutesOfVideo;
    private Integer minutesOfAdvertisement;
    private Integer minutesOfVoiceOver;
    @Transient
    private Set<Clip> clips;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getMinutesOfAudio() {
        return minutesOfAudio;
    }

    public void setMinutesOfAudio(Integer minutesOfAudio) {
        this.minutesOfAudio = minutesOfAudio;
    }

    public Integer getMinutesOfVideo() {
        return minutesOfVideo;
    }

    public void setMinutesOfVideo(Integer minutesOfVideo) {
        this.minutesOfVideo = minutesOfVideo;
    }

    public Integer getMinutesOfAdvertisement() {
        return minutesOfAdvertisement;
    }

    public void setMinutesOfAdvertisement(Integer minutesOfAdvertisement) {
        this.minutesOfAdvertisement = minutesOfAdvertisement;
    }

    public Integer getMinutesOfVoiceOver() {
        return minutesOfVoiceOver;
    }

    public void setMinutesOfVoiceOver(Integer minutesOfVoiceOver) {
        this.minutesOfVoiceOver = minutesOfVoiceOver;
    }

    public Set<Clip> getClips() {
        return clips;
    }

    public void setClips(Set<Clip> clips) {
        this.clips = clips;
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", duration=" + duration +
                ", minutesOfAudio=" + minutesOfAudio +
                ", minutesOfVideo=" + minutesOfVideo +
                ", minutesOfAdvertisement=" + minutesOfAdvertisement +
                ", minutesOfVoiceOver=" + minutesOfVoiceOver +
                ", clips=" + clips +
                '}';
    }
}
