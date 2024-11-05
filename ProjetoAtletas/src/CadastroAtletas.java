
import java.util.ArrayList;
import java.util.List;

public class CadastroAtletas {
    private List<Atleta> atletas;

    public CadastroAtletas() {
        this.atletas = new ArrayList<>();
    }

    public void adicionarAtleta(Atleta atleta) {
        atletas.add(atleta);
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public double calcularPesoMedio() {
        double somaPeso = 0.0;
        for (Atleta atleta : atletas) {
            somaPeso += atleta.getPeso();
        }
        return somaPeso / atletas.size();
    }

    public Atleta getAtletaMaisAlto() {
        Atleta maisAlto = atletas.get(0);
        for (Atleta atleta : atletas) {
            if (atleta.getAltura() > maisAlto.getAltura()) {
                maisAlto = atleta;
            }
        }
        return maisAlto;
    }

    public double calcularPorcentagemHomens() {
        int totalHomens = 0;
        for (Atleta atleta : atletas) {
            if (atleta.getSexo().equalsIgnoreCase("M")) {
                totalHomens++;
            }
        }
        return (totalHomens / (double) atletas.size()) * 100;
    }

    public double calcularAlturaMediaMulheres() {
        int totalMulheres = 0;
        double somaAlturaMulheres = 0.0;
        for (Atleta atleta : atletas) {
            if (atleta.getSexo().equalsIgnoreCase("F")) {
                somaAlturaMulheres += atleta.getAltura();
                totalMulheres++;
            }
        }
        if (totalMulheres == 0) {
            return -1; 
        }
        return somaAlturaMulheres / totalMulheres;
    }
}