package com.example.springbootelasticsearch.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "elasticdatabase",shards = 2)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private String id;
    @Field(name = "firstname",type = FieldType.Text)
    private String firstname;
    @Field(name = "lastname",type = FieldType.Text)
    private String lastname;
    @Field(name = "firstname",type = FieldType.Integer)
    private int age;

}
