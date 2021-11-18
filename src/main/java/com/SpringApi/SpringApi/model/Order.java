package com.SpringApi.SpringApi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="asd")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger orderId;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private User userId;


}
