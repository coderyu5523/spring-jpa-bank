package com.example.bank.user;

import lombok.Data;

public class UserResponse {

    //user 엔티티를 받는 DTO
    @Data
    public static class DTO{
        private String username ;
        private String fullname;

        public DTO(User user) {
            this.username = user.getUsername();
            this.fullname = user.getFullname();
        }
    }
}
