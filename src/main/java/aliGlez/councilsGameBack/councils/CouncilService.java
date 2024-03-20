package aliGlez.councilsGameBack.councils;

import java.util.List;

import aliGlez.councilsGameBack.interfaces.IGenericLimitedService;

public class CouncilService implements IGenericLimitedService<Council>{

    CouncilRepository repository;

    public CouncilService(CouncilRepository repository) {
        this.repository = repository;
    }

    public List<Council> getAll(){
        List<Council> councils = repository.findAll();
        return councils;
    }

    public Council getById(Long id) throws Exception {
        Council council = repository.findById(id).orElseThrow(() -> new CouncilNotFoundEXception("Council not found"));
        return council;
    }

    @Override
    public Council save(Council obj) {
        throw new UnsupportedOperationException("Unimplemented method save");
    }

    @Override
    public void deleteById(Long id) throws Exception {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new CouncilNotFoundEXception("Council not found");
        }
    }
    
}
