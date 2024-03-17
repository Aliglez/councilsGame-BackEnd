package aliGlez.councilsGameBack.roles;


import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import aliGlez.councilsGameBack.users.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private Long id;

    private String role_name;

    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    Set<User>users;

    public Rol() {
    }

    public Rol(String role_name, Set<User> users) {
        this.role_name = role_name;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
    
    
}
