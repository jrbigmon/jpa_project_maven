package domain.person;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity(name = "person")
public class Person implements IPerson {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(length = 400)
  private String uuid;
  
  @Column(name = "name")
  private String name;

  @Column(name = "email")
  private String email;
  
  public Person(UUID uuid, String name, String email) {
    super();
    this.uuid = uuid.toString();
    this.name = name;
    this.email = email;
  }
  
  public Person(String name, String email) {
    super();
    this.uuid = UUID.randomUUID().toString();
    this.name = name;
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  public String getUuid() {
    return uuid;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [uuid=" + uuid + ", name=" + name + ", email=" + email + "]";
  }
}
