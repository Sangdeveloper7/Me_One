package com.example.me_one.dto;

import com.example.me_one.domain.Tbuser;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

public class TbuserDto {

    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateResDto {
        @Schema(description = "User ID", example = "length32textnumber")
        private String id;
    }

    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateReqDto {
        @Schema(description = "User ID", example = "user123")
        @NotNull
        @NotEmpty
        @Size(max = 100)
        private String id;

        @Schema(description = "Password", example = "password123")
        @NotNull
        @NotEmpty
        @Size(max = 100)
        private String password;

        @Schema(description = "User Name", example = "홍길동")
        @NotNull
        @NotEmpty
        @Size(max = 100)
        private String name;

        public Tbuser toEntity() {
            return Tbuser.of(id, password, name);
        }
    }

    @Getter
    @Setter
    public static class SelectResDto {
        private String id;
        private String name;
        private String createdAt;
        private String modifiedAt;
        private String deleted;
    }

    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UpdateReqDto {
        @Schema(description = "User ID", example = "user123")
        @NotNull
        @NotEmpty
        @Size(max = 100)
        private String id;

        @Schema(description = "User Name", example = "홍길동")
        @Size(max = 100)
        private String name;

        @Schema(description = "Nickname", example = "hong123")
        @Size(max = 100)
        private String nick;

        @Schema(description = "Phone Number", example = "010-1234-5678")
        @Size(max = 100)
        private String phone;
    }

    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DeleteReqDto {
        @Schema(description = "User ID", example = "user123")
        @NotNull
        @NotEmpty
        private String id;
    }

    @Getter
    @Setter
    public static class DeleteResDto {
        @Schema(description = "Deletion Status", example = "true")
        private String deleted;
    }

    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ListReqDto {
        @Schema(description = "User Name", example = "홍길동")
        private String name;
    }
}
