package aliGlez.councilsGameBack.councils;

// import com.fasterxml.jackson.annotation.JsonProperty;

// import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "councils")
public class Council {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_council")
    private Long id;

    @Column
    private String council_name;

    // @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    // @OneToMany(mappedBy = "council", cascade = CascadeType.ALL)
    // private Set<Trial>trials;

    public Council() {
    }

    public Council(String council_name) {
        this.council_name = council_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCouncil_name() {
        return council_name;
    }

    public void setCouncil_name(String council_name) {
        this.council_name = council_name;
    }

    // public Set<Trial> getTrials() {
    //     return trials;
    // }

    // public void setTrials(Set<Trial> trials) {
    //     this.trials = trials;
    // }



    
}
