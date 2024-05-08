package com.example.ztpai.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Availability {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
    private UUID id_availability;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    @Column(name = "friday")
    private String friday;
    @Column(name = "saturday")
    private String saturday;
    @Column(name = "sunday")
    private String sunday;
    @Column(name = "monday")
    private String monday;
    @Column(name = "tuesday")
    private String tuesday;
    @Column(name = "wednesday")
    private String wednesday;
    @Column(name = "thursday")
    private String thursday;
}