package se1app.applicationcore.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import se1app.applicationcore.Customer;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // Spring leitet die Query aus der Signatur ab ("name" ist ein Attribut von Customer)
    Optional<Customer> findByName(String name);

    // Hier definieren wir eine eigene SQL-Query ("native")
    @Query(value = "SELECT * FROM CUSTOMER WHERE EXISTS (SELECT * FROM RESERVATION WHERE RESERVATION.CUSTOMER_ID=CUSTOMER.ID AND RESERVATION.MOVIE=:movie)", nativeQuery = true)
    List<Customer> findCustomersByMovie(@Param("movie") String movie);
}