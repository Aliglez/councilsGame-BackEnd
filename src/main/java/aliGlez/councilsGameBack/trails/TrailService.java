package aliGlez.councilsGameBack.trails;

import java.util.List;

import org.springframework.stereotype.Service;

import aliGlez.councilsGameBack.councils.Council;
import aliGlez.councilsGameBack.councils.CouncilRepository;
import aliGlez.councilsGameBack.interfaces.IGenericFullService;

@Service
public class TrailService implements IGenericFullService<Trail> {
    
    TrailRepository trailRepository;
    CouncilRepository councilRepository;

    public TrailService(TrailRepository trailRepository, CouncilRepository councilRepository) {
        this.trailRepository = trailRepository;
        this.councilRepository = councilRepository;
    }

    public List<Trail> getAll() {
        List<Trail> trail = trailRepository.findAll();
        return trail;
    }

    public Trail getById(Long id) throws Exception {
        Trail trail = trailRepository.findById(id).orElseThrow(() -> new TrailNotFoundException("Event not found"));
        return trail;
    }

    public Trail save(Trail trail) {
        Council council = councilRepository.findByNameOfCouncil(trail.getCouncilName()).orElse(new Council(trail.getCouncilName()));
        councilRepository.save(council);
        trail.setCouncil(council);
        trailRepository.save(trail);
        return trail;
    }

    public Trail update(Long id, Trail trail) throws Exception {
        Trail updatingTrail = trailRepository.findById(id).orElseThrow(() -> new TrailNotFoundException("Event not found"));

        Council council = councilRepository.findByNameOfCouncil(trail.getCouncilName()).orElse(new Council(trail.getCouncilName()));
        councilRepository.save(council);

        updatingTrail.setId(trail.getId());
        updatingTrail.setTrail_title(trail.getTrail_title());
        updatingTrail.setTrail_image(trail.getTrail_image());
        updatingTrail.setDescription(trail.getDescription());
        updatingTrail.setPoints(trail.getPoints());
        updatingTrail.setWeb(trail.getWeb());
        updatingTrail.setCouncil(council);
        Trail updatedTrail = trailRepository.save(updatingTrail);
        return updatedTrail;
    }

    public void deleteById(Long id) throws Exception {
        if (trailRepository.existsById(id)) {
            trailRepository.deleteById(id);
        } else {
            throw new TrailNotFoundException("Event not found");
        }
}

}

