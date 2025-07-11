public class UserService {
    public String getUserDisplayName(User user) {
        // Bug: No null check on user or user.getName()
        return user.getName().trim() + " (active)";
    }
}
