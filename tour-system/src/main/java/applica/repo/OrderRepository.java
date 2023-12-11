package applica.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import applica.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}