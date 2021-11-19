package livecode;

import java.util.Objects;

public class User {


   int id;
   String name;

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      User user = (User) o;
      return id == user.id && Objects.equals(name, user.name);
   }

   @Override
   public String toString() {
      return "User{" +
              "id=" + id +
              ", name='" + name + '\'' +
              '}';
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name);
   }
}
