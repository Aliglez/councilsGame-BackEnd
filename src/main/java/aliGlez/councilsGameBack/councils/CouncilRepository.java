package aliGlez.councilsGameBack.councils;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CouncilRepository extends JpaRepository<Council, Long> {
    public Optional<Council> findByNameOfCouncil(String council);
}