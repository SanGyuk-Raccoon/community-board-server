package com.raccoon.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public interface PostInfoMapping {
    Long getId();
    String getTitle();
    String getAuthor();
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss")
    Date getDate();
}
