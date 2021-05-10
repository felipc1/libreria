package co.com.bancolombia.ecopagos.repository;

import co.com.bancolombia.ecopagos.domain.TblPsfMovimientosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TblPsfMovimientosrepository extends JpaRepository<TblPsfMovimientosModel, Integer> {
}
