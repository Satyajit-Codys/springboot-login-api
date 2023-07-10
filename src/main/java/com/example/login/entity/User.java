package com.example.login.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private Set<Role> roles;

	public Optional<User> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public void setName(String name2) {
		// TODO Auto-generated method stub
		this.name= name2;
	}

	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		this.password = encode;
	}

	public void setUsername(String username2) {
		// TODO Auto-generated method stub
		this.username = username2;
	}

	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		this.email=email2;
	}

	public void setRoles(Set<Role> roles2) {
		// TODO Auto-generated method stub
		this.roles=roles2;
	}
}