package co.com.bancolombia.repository;

import co.com.bancolombia.domain.TblPsfMovimientosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TblPsfMovimientosrepository extends JpaRepository<TblPsfMovimientosModel, Integer> {
}
