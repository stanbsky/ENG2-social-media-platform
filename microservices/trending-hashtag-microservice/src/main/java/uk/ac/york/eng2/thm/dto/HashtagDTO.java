package uk.ac.york.eng2.thm.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class HashtagDTO implements Comparable<HashtagDTO> {

    private String hashtag;
    private Long id;
    private Long likes;
    private Integer rank;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public int compareTo(HashtagDTO o) {
        return this.getRank().compareTo(o.getRank());
    }
}
