package hajin.xyz.portfolio.general.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "general")
public class JustForConnectRepositoryEntity {

    @Id
    private Long idx;

}
