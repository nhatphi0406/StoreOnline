package com.thnp.store.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    String          firstName;
    String          lastName;
    LocalDate       dayOfBirth;
    String          email;
    @Size(min = 10, max = 10, message = "USER_INVALID_PHONE")
    String          phone;
    String          address;
    String          avatar;
    @Size(min = 4, message = "USER_INVALID_USERNAME")
    String          username;
    @Size(min = 6, message = "USER_INVALID_PASSWORD")
    String          password;
}
