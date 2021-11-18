package com.SpringApi.SpringApi.model;

import com.SpringApi.SpringApi.utils.PersonType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="user_id")
    private Long userId;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "typ")
    @Enumerated(EnumType.STRING)
    private PersonType type;

    @Column(name = "veryfication_code")
    private String v_code;

    @Column(name = "isVerified")
    private Boolean isVerified;

    @OneToMany(mappedBy = "userId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Order> orders;
}
