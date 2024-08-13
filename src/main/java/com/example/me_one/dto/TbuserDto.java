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
    @Schema
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateResDto {
        private String id;
    }

    @Builder
    @Schema
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateReqDto {
        @Schema(description = "write_id", example="")
        @NotNull
        @NotEmpty
        @Size(max = 100)
        private String id;

        @Schema(description = "pw", example="")
        @NotNull
        @NotEmpty
        @Size(max = 100)
        private String password;

        @Schema(description = "name", example="홍길동")
        @NotNull
        @NotEmpty
        @Size(max = 100)
        private String name;

        public Tbuser toEntity() {
            return Tbuser.of(id, password, name);
        }
    }

    @Builder
    @Schema
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SelectReqDto {
        @Schema(description = "id", example="")
        @NotNull
        @NotEmpty
        private String id;
    }

    @Schema
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
    @Schema
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DeleteReqDto {
        @Schema(description = "id", example="")
        @NotNull
        @NotEmpty
        private String id;
    }

    @Builder
    @Schema
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DeleteResDto {
        @Schema(description = "삭제 여부", example="true")
        private String deleted;
    }

//    @Builder
//    @Schema
//    @Getter
//    @Setter
//    @AllArgsConstructor
//    @NoArgsConstructor
//    public static class ScrollListReqDto {
//
//        @Schema(description = "cursor", example="")
//        private String cursor;
//
//        @Schema(description = "perpage", example="")
//        private Integer perpage;
//
//        @Schema(description = "orderby", example="")
//        private String orderby;
//
//        @Schema(description = "orderway", example="")
//        private String orderway;
//
//        @Schema(description = "deleted", example="")
//        private String deleted;
//
//        @Schema(description = "이름", example="")
//        private String name;
//    }
//
//    @Builder
//    @Schema
//    @Getter
//    @Setter
//    @AllArgsConstructor
//    @NoArgsConstructor
//    public static class ListReqDto {
//        @Schema(description = "이름", example="")
//        private String name;
//    }
//
//    @Builder
//    @Schema
//    @Getter
//    @Setter
//    @AllArgsConstructor
//    @NoArgsConstructor
//    public static class PagedListReqDto {
//
//        @Schema(description = "callpage", example="")
//        private Integer callpage;
//
//        @Schema(description = "perpage", example="")
//        private Integer perpage;
//
//        @Schema(description = "orderby", example="")
//        private String orderby;
//
//        @Schema(description = "orderway", example="")
//        private String orderway;
//
//        @Schema(description = "offset", example="")
//        private Integer offset;
//
//        @Schema(description = "deleted", example="")
//        private String deleted;
//
//        @Schema(description = "이름", example="")
//        private String name;
//    }
//
//    @Builder
//    @Schema
//    @Getter
//    @Setter
//    @AllArgsConstructor
//    @NoArgsConstructor
//    public static class PagedListResDto {
//
//        @Schema(description = "callpage", example="")
//        private Integer callpage;
//
//        @Schema(description = "perpage", example="")
//        private Integer perpage;
//
//        @Schema(description = "orderby", example="")
//        private String orderby;
//
//        @Schema(description = "orderway", example="")
//        private String orderway;
//
//        @Schema(description = "listsize", example="")
//        private Integer listsize;
//
//        @Schema(description = "pagesize", example="")
//        private Integer pagesize;
//
//        @Schema(description = "list", example="")
//        private List<SelectResDto> list;
//    }
}
