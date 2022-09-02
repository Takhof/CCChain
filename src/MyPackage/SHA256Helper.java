package MyPackage;


import java.security.MessageDigest;


public class SHA256Helper {

    public static String generateHash(String stuff) {
        try {
            MessageDigest hasher = MessageDigest.getInstance("SHA-256");
            byte[] hash = hasher.digest(stuff.getBytes("UTF-8"));
            StringBuffer hexadecimalString = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                String hexadecimal = Integer.toHexString(0xff & hash[i]);
                if (hexadecimal.length() == 1) hexadecimalString.append('0');
                hexadecimalString.append(hexadecimal);
            }
            return hexadecimalString.toString();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}