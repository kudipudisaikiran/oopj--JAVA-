import javax.crypto.*;
import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class BlowfishKeyTool {

    static SecretKey getKey() throws Exception {
        KeyGenerator kg = KeyGenerator.getInstance("Blowfish");
        kg.init(128);
        return kg.generateKey();
    }

    static String process(String text, SecretKey key, int mode) throws Exception {
        Cipher c = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");
        c.init(mode, key);

        return (mode == Cipher.ENCRYPT_MODE)
                ? Base64.getEncoder().encodeToString(
                    c.doFinal(text.getBytes(StandardCharsets.UTF_8)))
                : new String(
                    c.doFinal(Base64.getDecoder().decode(text)),
                    StandardCharsets.UTF_8);
    }

    public static void main(String[] args) throws Exception {
        SecretKey key = getKey();
        String text = "Hello World";

        String enc = process(text, key, Cipher.ENCRYPT_MODE);
        String dec = process(enc, key, Cipher.DECRYPT_MODE);

        System.out.println("Original: " + text);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}
