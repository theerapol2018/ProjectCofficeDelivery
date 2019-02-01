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
@Table( name = "Menu")
public class Manu {

    @Id
    @SequenceGenerator(name="menu_seq",sequenceName="menu_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="menu_seq")
    private @NotNull int manuid;
    private String name;
    private int price;





}
