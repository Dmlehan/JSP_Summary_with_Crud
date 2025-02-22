package com.example.jsp_summary_with_crud.Entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    private int id ;
    private String name;
    private String address;
    private String email;

}
