public class MD5Hasher implements PasswordHasher

{

    @Override

    public String hashPassword(String password)

    {

        return "hashed with SHA256";

    }

}
