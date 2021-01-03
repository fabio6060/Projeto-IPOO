
/**
 * Escreva a descrição da classe RandomId aqui.
 * 
 * @author (Diogo&Fábio) 
 * @version (Projeto 2020 - IPOO)
 */
import java.util.UUID;
import java.sql.Date; 
import java.text.SimpleDateFormat;

public class RandomId {
    public static void main() {
            Date data = new Date(System.currentTimeMillis()); 
            SimpleDateFormat formatarDate = new SimpleDateFormat("dd-MM-yyyy");
        
        System.out.println(generateString() +" - " + formatarDate.format(data));
 
    }

    public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-","");
    }
    
    
}

   

