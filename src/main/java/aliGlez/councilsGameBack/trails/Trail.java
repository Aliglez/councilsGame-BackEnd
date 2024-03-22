package aliGlez.councilsGameBack.trails;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import aliGlez.councilsGameBack.councils.Council;
import aliGlez.councilsGameBack.users.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="trails")
public class Trail {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_trail")
    private Long id;

    @Column
    private String trail_title;

    @Column
    private String trail_image;

    @Column
    private String description;

    @Column
    private int points;

    @Column
    private String web;

    @ManyToOne
    @JoinColumn(name= "council_id")
    private Council council;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToMany(mappedBy = "trials")
    Set<User> users;
    
    @Transient
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String councilName;

    public Trail() {

    }

    public Trail(String trail_title, String trail_image, String description, int points, String web, Council council,
            Set<User> users, String councilName) {
        this.trail_title = trail_title;
        this.trail_image = trail_image;
        this.description = description;
        this.points = points;
        this.web = web;
        this.council = council;
        this.users = users;
        this.councilName = councilName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrail_title() {
        return trail_title;
    }

    public void setTrail_title(String trail_title) {
        this.trail_title = trail_title;
    }

    public String getTrail_image() {
        return trail_image;
    }

    public void setTrail_image(String trail_image) {
        this.trail_image = trail_image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public Council getCouncil() {
        return council;
    }

    public void setCouncil(Council council) {
        this.council = council;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public String getCouncilName() {
        return councilName;
    }

    public void setCouncilName(String councilName) {
        this.councilName = councilName;
    }

    
}
