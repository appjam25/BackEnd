package com.backend.backend_java.domain.post.dto.response;

import com.backend.backend_java.domain.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class PostUserResponse {

    private String nickname;

    private LocalDate birthDate;

    public PostUserResponse(User user) {
        nickname = user.getNickname();
        birthDate = user.getBirthDate();
    }
}
