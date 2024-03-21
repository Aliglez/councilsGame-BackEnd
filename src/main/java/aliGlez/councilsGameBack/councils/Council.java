package aliGlez.councilsGameBack.councils;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "councils")
public class Council {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_council")
    private Long id;

    @Column
    private String nameOfCouncil;

   

    public Council() {
    }

    public Council(String nameOfCouncil) {
        this.nameOfCouncil = nameOfCouncil;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfCouncil() {
        return nameOfCouncil;
    }

    public void setNameOfCouncil(String nameOfCouncil) {
        this.nameOfCouncil = nameOfCouncil;
    }

}