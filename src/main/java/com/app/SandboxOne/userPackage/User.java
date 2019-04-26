package com.app.SandboxOne.userPackage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users")
class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    String id;

    String ename;

    int age;

    @ManyToOne
    User parent;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parent")
    Collection<User> children;
}