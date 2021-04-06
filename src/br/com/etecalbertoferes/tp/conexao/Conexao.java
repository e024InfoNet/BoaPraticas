package br.com.etecalbertoferes.tp.conexao;

public class Conexao {
    private static String conexao;

    // Singleton - garate uma unica instancia de objeto para o sistema
    public static String getConexao() {
        if(conexao == null) {
            return new String("http://localhost:3306/etec?user=root&password=segredo");
        }
        return conexao;
    }
}
