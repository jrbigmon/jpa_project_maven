package application;



import domain.person.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {
  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-project");
    EntityManager em = emf.createEntityManager();

    Person p1 = new Person("Vagner", "vagner.junior@mail.com");
    Person p2 = new Person("Aretha", "aretha.silverio@mail.com");
    
    em.getTransaction().begin();
    em.persist(p1);
    em.persist(p2);
    em.getTransaction().commit();

    System.out.println("Done!");
  }
}
