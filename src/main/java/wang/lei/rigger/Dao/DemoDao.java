package wang.lei.rigger.Dao;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import wang.lei.rigger.Entity.DemoEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Repository
public interface DemoDao extends JpaRepository<DemoEntity, Integer>{

}
