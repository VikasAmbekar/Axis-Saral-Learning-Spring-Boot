package com.axis.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Data
@EqualsAndHashCode
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int commentId;

    @Column(name = "message")
    private String message;

    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name = "news_feed_id", referencedColumnName = "NewsId")
    private NewsFeed newsFeed;

}
