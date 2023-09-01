package PACKAGE_NAME;
public class Gastos extends Movimentacao {
    private int idGasto;
    private String tipoDespesa;
    private double somaGasto;

    public Gastos(int idMovimentacao, int idGasto, String tipoDespesa, double somaGasto ){
        super(idMovimentacao);
        this.idGasto = idGasto;
        this.tipoDespesa = tipoDespesa;
        this.somaGasto = somaGasto;
    }

    @Override
    public void salvarMov(int idMovimentacao) {
        super.salvarMov(idMovimentacao);
    }

}
