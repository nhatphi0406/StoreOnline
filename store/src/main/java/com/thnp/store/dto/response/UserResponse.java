package com.thnp.store.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    String          id;
    String          firstName;
    String          lastName;
    LocalDate       dayOfBirth;
    String          email;
    String          phone;
    String          address;
    String          avatar;
    String          username;
    LocalDateTime   dateJoined;
}
