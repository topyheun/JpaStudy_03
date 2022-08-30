package Study.JpaStudy_03.repository;

import Study.JpaStudy_03.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
