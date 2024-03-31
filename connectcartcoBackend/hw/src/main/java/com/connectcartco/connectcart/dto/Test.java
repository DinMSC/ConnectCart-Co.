package com.connectcartco.connectcart.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Getter
@Setter
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Test {

    @Id
    private String id;

    private String test;
}
