package com.zzj.designPattern.construct.builderPattern;

import lombok.Builder;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class User {
    private String name;
    private String password;
    private String nickname;
    private Integer age;

    private User(String name, String password, String nickname, Integer age) {
        this.name = name;
        this.password = password;
        this.nickname = nickname;
        this.age = age;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String name;
        private String password;
        private String nickname;
        private Integer age;

        private UserBuilder() {}

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            if(name == null || password == null) {
                throw new RuntimeException("用户名和密码必填");
            }
            if(age <= 0 || age >= 150) {
                throw new RuntimeException("年龄错误");
            }
            // 还可以赋值
            if(nickname == null) {
                nickname = name;
            }
            return new User(name, password, nickname, age);
        }
    }
}
