import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private List<User> users = new ArrayList<>();

    public void addUser(String name, int age) {
        User user = new User(name, age);
        users.add(user);
    }

    public User getUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }

        }
        return null;
    }

    public int getAverageAge() {
        int totalAge = 0;
        for (User user : users) {
            totalAge += user.getAge();
        }
        return totalAge / users.size();
    }

    public void removeUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                users.remove(user);
            }
        }
    }

    public void printUserNames() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }

    public class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
