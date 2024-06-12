package com.thnp.store.dto.request;

import java.time.LocalDate;
import java.util.Set;

import jakarta.validation.constraints.Size;

import com.thnp.store.validator.DayOfBirthConstraint;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    String firstName;
    String lastName;

    @DayOfBirthConstraint(min = 2, message = "USER_INVALID_DAY_OF_BIRTH")
    LocalDate dayOfBirth;

    String email;

    @Size(min = 10, max = 10, message = "USER_INVALID_PHONE")
    String phone;

    String address;
    String avatar;

    @Size(min = 4, message = "USER_INVALID_USERNAME")
    String username;

    @Size(min = 6, message = "USER_INVALID_PASSWORD")
    String password;

    Set<String> roles;
}
