package aliGlez.councilsGameBack.councils;

import java.util.List;

import org.springframework.stereotype.Service;

import aliGlez.councilsGameBack.interfaces.IGenericLimitedService;



@Service
public class CouncilService implements IGenericLimitedService<Council> {

    CouncilRepository repository;

   

    public CouncilService(CouncilRepository repository) {
        this.repository = repository;
    }

    public List<Council> getAll() {
        List<Council> councils = repository.findAll();

        return councils;
        
    }

    public Council getById(Long id) throws Exception {
        Council council = repository.findById(id).orElseThrow(() -> new CouncilNotFoundException("City not found"));

        return council;
    }

    public void deleteById(Long id) throws Exception {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new CouncilNotFoundException("Council not found");
        }
    }

    @Override
    public Council save(Council obj) {
        
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}