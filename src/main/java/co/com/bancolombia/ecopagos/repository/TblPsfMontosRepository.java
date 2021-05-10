package co.com.bancolombia.ecopagos.repository;

import co.com.bancolombia.ecopagos.domain.TblPsfMontosModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TblPsfMontosRepository extends CrudRepository<TblPsfMontosModel, Integer> {

}
