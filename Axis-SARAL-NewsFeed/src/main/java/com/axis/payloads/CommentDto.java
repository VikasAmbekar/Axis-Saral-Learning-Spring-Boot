package com.axis.payloads;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class CommentDto {

    private Integer commentId;
    private String message;
    private String name;
}
