package it.uliana.repository;


import it.uliana.dto.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {

    @Query("select s from Status s order by id desc")
    List<Status> last();


}
