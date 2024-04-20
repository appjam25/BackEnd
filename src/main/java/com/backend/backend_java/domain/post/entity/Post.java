package com.backend.backend_java.domain.post.entity;

import com.backend.backend_java.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "writer_nickname", nullable = false)
    private String writerNickname;

    @Column(name = "post_name", nullable = false)
    private String postName;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "area", nullable = false)
    private String area;

    @Column(name = "menu", nullable = false)
    private String menu;

    @Column(name = "max_people", nullable = false)
    private Integer maxPeople;

    @Column(name = "restaurant_name", nullable = false)
    private String restaurantName;

    @OneToMany
    private List<User> members = new ArrayList<>();
}
