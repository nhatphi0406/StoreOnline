package com.thnp.store.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {
    String          firstName;
    String          lastName;
    LocalDate       dayOfBirth;
    String          email;
    @Size(min = 10, max = 10, message = "USER_INVALID_PHONE")
    String          phone;
    String          address;
    String          avatar;
    @Size(min = 6, message = "USER_INVALID_PASSWORD")
    String          password;
    List<String>    roles;
}
