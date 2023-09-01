package PACKAGE_NAME;
public class Ganhos extends Movimentacao {
    private int idGanhos;
    private String tipoReceita;
    private double somaGanho;

    public Ganhos (int idMovimentacao, int idGanhos, String tipoReceita, double somaGanho){
        super(idMovimentacao);
        this.idGanhos = idGanhos;
        this.tipoReceita = tipoReceita;
        this.somaGanho = somaGanho;
    }

    @Override
    public void salvarMov(int idMovimentacao) {
        super.salvarMov(idMovimentacao);
    }



}
