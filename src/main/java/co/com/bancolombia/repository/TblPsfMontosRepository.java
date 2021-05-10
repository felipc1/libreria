package co.com.bancolombia.repository;

import co.com.bancolombia.domain.TblPsfMontosModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TblPsfMontosRepository extends CrudRepository<TblPsfMontosModel, Integer> {

}
