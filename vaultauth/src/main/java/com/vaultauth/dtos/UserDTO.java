package com.vaultauth.dtos;

import com.vaultauth.model.User;
import lombok.Data;

@Data
public class UserDTO {
    private Integer id;
    private String username;

    public UserDTO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
    }
}
