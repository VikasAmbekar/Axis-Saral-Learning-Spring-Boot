package com.axis.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "News Feed")
@Data  // toString
@EqualsAndHashCode
public class NewsFeed {
    @Id
    @Column(name = "NewsId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long newsFeedId;

    @Column(name = "News name", length = 100, nullable = false)
    private String newsName;
    private String newsImageUrl;

    private String newsDescription;

    @OneToMany(mappedBy = "newsFeed",cascade = CascadeType.ALL)
    private List<Comment> comments;


}
