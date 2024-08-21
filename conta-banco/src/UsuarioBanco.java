public class UsuarioBanco {
    public class ContaBanco {

        public int NumeroConta = 1021; // Nomenclatura em camelCase
        public int NUMERO_DA_AGENCIA = 067-8; // Constantes em letras maiúsculas e sublinhados
        public String NomeCliente = "MARIO ANDRADE";
        public Double Saldo = 237.48; // Nomenclatura em camelCase
      
        
        public Double verSaldo() {
           return Saldo;
        }
      
      }
  }
