package md.vladdubceac.spring6webapp.repositories;

import md.vladdubceac.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
