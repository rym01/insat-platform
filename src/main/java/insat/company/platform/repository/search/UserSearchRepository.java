package insat.company.platform.repository.search;

import insat.company.platform.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {

    Optional<User> findByLogin(String Login);
}
