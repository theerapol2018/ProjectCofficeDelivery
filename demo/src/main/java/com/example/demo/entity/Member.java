package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table( name = "Member")
public class Member {

    @Id
    @SequenceGenerator(name="member_seq",sequenceName="member_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="member_seq")
    private @NotNull Long meid;
    private String nameM;
    private String tel;
    private String email;
    private String address;
    private String province;
    private String sex;




}
