package com.example.me_one.domain;


import com.example.me_one.dto.TbuserDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.UUID;

@EntityListeners(AuditingEntityListener.class)

@Getter
@Entity
public class Tbuser {
    @Id private String id;


    @Setter
    @Column(nullable = false) private String deleted; // 삭제여부

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @CreatedDate
    @Column(nullable = false, updatable = false)
    protected LocalDateTime createdAt; // 생성일시

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @LastModifiedDate
    @Column(nullable = false)
    protected LocalDateTime modifiedAt; // 수정일시


    @Setter @Column(nullable = false) private String username; // 사용자아이디
    @Setter @Column(nullable = false) private String password; // 비번
    @Setter @Column(nullable = false) private String name;
    @Setter @Column(nullable = false) private boolean delete;

    protected  Tbuser(){}

    private Tbuser(String username, String password, String name, boolean delete) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.delete = delete;
    }

    public static Tbuser of(String username, String password, String name, boolean delete){
        return new Tbuser(username, password, name, delete);
    }

    @PrePersist
    public void onPrePersist() {
        this.id = String.valueOf(Long.valueOf(UUID.randomUUID().toString().replace("-", "")));
        this.deleted = "N";
    }

    public TbuserDto.CreateResDto toTbuserAfterCreateDto() {
        return TbuserDto.CreateResDto.builder().id(getId()).build();
        /*
        TbuserDto.TbuserAfterCreateDto a =  new TbuserDto.TbuserAfterCreateDto();
        a.setId(getId());
        return a;
        */
    }

}
