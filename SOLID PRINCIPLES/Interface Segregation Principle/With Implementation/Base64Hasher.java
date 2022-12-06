public class Base64Hasher implements PasswordHasher, Decryptable

{

    @Override

    public String hashPassword(String password)

    {

        return "hashed with base64";

    }

    @Override

    public String decodePasswordFromHash(String hash)

    {

        return "decoded from base64";

    }

}
