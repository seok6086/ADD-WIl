package com.example.messiah.user.domain.user;

import io.lettuce.core.dynamic.annotation.Command;
import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

@Entity
@Table(schema = "MESSIAH", name = "A_USER")
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @Column(name = "USER_PK")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userPk;

    @Column(name = "USER_ID" , length = 20, nullable = false)
    @Comment("유저 아이디")
    private String userId;

    @Column(name = "USER_PASSWORD", length = 30, nullable = false)
    @Comment("유저 암호")
    private String userPassword;

    @Column(name = "NICK_NAME", length = 25, nullable = false)
    @Comment("닉네임")
    private String nickName;

    @Column(name = "INSR_DT", nullable = false)
    @Comment("생성일자")
    private LocalDate insrDt;

    @Column(name = "USE_YN", nullable = false)
    @Comment("사용여부")
    private String useYn;

}
