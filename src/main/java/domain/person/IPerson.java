package domain.person;

import java.io.Serializable;

public interface IPerson extends Serializable {
  String getName();
  String getEmail();
  String getUuid();
  void setName(String name);
  void setEmail(String email);
}
