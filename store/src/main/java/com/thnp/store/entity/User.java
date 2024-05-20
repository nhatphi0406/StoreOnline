package com.thnp.store.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    @Column(length = 10)
    String firstName;
    @Column(length = 32)
    String lastName;
    LocalDate dayOfBirth;
    @Column(length = 100, unique = true)
    String email;
    @Column(length = 10, unique = true)
    String phone;
    String address;
    @Column(length = 150)
    String avatar;
    @Column(length = 32,unique = true, nullable = false)
    String username;
    @Column(nullable = false)
    String password;
    LocalDateTime dateJoined;
    LocalDateTime updatedDate;
    boolean isActive;
}
