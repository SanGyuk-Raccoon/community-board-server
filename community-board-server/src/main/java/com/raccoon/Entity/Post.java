package com.raccoon.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Entity(name = "POST")
@Getter
@Table(name = "POST_TABLE")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss")
    private Date date;
    private String content;

    public void copyFrom(Post source) {
        this.title = source.title;
        this.author = source.author;
        this.date = source.date;
        this.content = source.content;
    }
}
