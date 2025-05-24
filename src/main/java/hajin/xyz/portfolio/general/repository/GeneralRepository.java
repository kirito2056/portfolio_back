package hajin.xyz.portfolio.general.repository;

import hajin.xyz.portfolio.general.entity.JustForConnectRepositoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneralRepository extends JpaRepository<JustForConnectRepositoryEntity, Long> {
}
