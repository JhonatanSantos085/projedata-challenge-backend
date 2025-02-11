import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("jhonatan", LocalDate.of(2002, 04, 02),
                new BigDecimal("4000.00"), "desenvolvedor");

        System.out.println(funcionario);

    }
}
