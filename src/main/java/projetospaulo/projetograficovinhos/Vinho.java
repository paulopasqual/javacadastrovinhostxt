package projetospaulo.projetograficovinhos;

public class Vinho {

    private String nomeRotulo;
    private String cor;
    private int safra;
    private String classificacao;
    private String doc;
    private String produtor;
    private String tipo;
    private int tempoEnvelhecimento;
    private String carvalhoFrances;
    private String carvalhoAmericano;
    private String inox;
    private String emGarrafa;
    private int potencialGuarda;
    private String uvaPredominante;

    public Vinho(String nomeRotulo, String cor, int safra, String classificacao, String doc, String produtor,
            String tipo, int potencialGuarda, String uvaPredominante, String carvalhoFrances,
            String carvalhoAmericano, String inox, String emGarrafa, int tempoEnvelhecimento) {
        this.nomeRotulo = nomeRotulo;
        this.cor = cor;
        this.safra = safra;
        this.classificacao = classificacao;
        this.doc = doc;
        this.produtor = produtor;
        this.tipo = tipo;
        this.potencialGuarda = potencialGuarda;
        this.uvaPredominante = uvaPredominante;
        this.carvalhoFrances = carvalhoFrances;
        this.carvalhoAmericano = carvalhoAmericano;
        this.inox = inox;
        this.emGarrafa = emGarrafa;
        this.tempoEnvelhecimento = tempoEnvelhecimento;
    }

    // Getters and Setters
    public String getNomeRotulo() {
        return nomeRotulo;
    }

    public void setNomeRotulo(String nomeRotulo) {
        this.nomeRotulo = nomeRotulo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getSafra() {
        return safra;
    }

    public void setSafra(int safra) {
        this.safra = safra;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTempoEnvelhecimento() {
        return tempoEnvelhecimento;
    }

    public void setTempoEnvelhecimento(int tempoEnvelhecimento) {
        this.tempoEnvelhecimento = tempoEnvelhecimento;
    }

    public String getCarvalhoFrances() {
        return carvalhoFrances;
    }

    public void setCarvalhoFrances(String carvalhoFrances) {
        this.carvalhoFrances = carvalhoFrances;
    }

    public String getCarvalhoAmericano() {
        return carvalhoAmericano;
    }

    public void setCarvalhoAmericano(String carvalhoAmericano) {
        this.carvalhoAmericano = carvalhoAmericano;
    }

    public String getInox() {
        return inox;
    }

    public void setInox(String inox) {
        this.inox = inox;
    }

    public String getEmGarrafa() {
        return emGarrafa;
    }

    public void setEmGarrafa(String emGarrafa) {
        this.emGarrafa = emGarrafa;
    }

    public int getPotencialGuarda() {
        return potencialGuarda;
    }

    public void setPotencialGuarda(int potencialGuarda) {
        this.potencialGuarda = potencialGuarda;
    }

    public String getUvaPredominante() {
        return uvaPredominante;
    }

    public void setUvaPredominante(String uvaPredominante) {
        this.uvaPredominante = uvaPredominante;
    }

      
   public static Vinho parseVinho(String linha) throws IllegalArgumentException {
    String[] campos = linha.split("-");

    if (campos.length != 14) {
        throw new IllegalArgumentException("Formato de linha inválido. Esperados 14 campos, encontrados: " + campos.length);
    }

    try {
        String nomeRotulo = campos[0].split(": ")[1].trim();
        String produtor = campos[1].split(": ")[1].trim();
        String doc = campos[2].split(": ")[1].trim();
        String classificacao = campos[3].split(": ")[1].trim();
        String cor = campos[4].split(": ")[1].trim();
        int safra = Integer.parseInt(campos[5].split(": ")[1].trim());
        String tipo = campos[6].split(": ")[1].trim();

        // Corrigindo a extração para pegar apenas a parte numérica
        int tempoEnvelhecimento = Integer.parseInt(campos[7].split(": ")[1].split(" ")[0].trim());

        String carvalhoFrances = campos[8].split(": ")[1].trim();
        String carvalhoAmericano = campos[9].split(": ")[1].trim();
        String inox = campos[10].split(": ")[1].trim();
        String emGarrafa = campos[11].split(": ")[1].trim();

        // Corrigindo a extração para pegar apenas a parte numérica
        int potencialGuarda = Integer.parseInt(campos[12].split(": ")[1].split(" ")[0].trim());

        String uvaPredominante = campos[13].split(": ")[1].trim();

        return new Vinho(nomeRotulo, cor, safra, classificacao, doc, produtor,
                tipo, potencialGuarda, uvaPredominante, carvalhoFrances,
                carvalhoAmericano, inox, emGarrafa, tempoEnvelhecimento);
    } catch (Exception e) {
        throw new IllegalArgumentException("Erro ao processar a linha: " + linha + "\n" + e.getMessage());
    }
}


    
    
private static String extrairValorCampo(String campo) throws IllegalArgumentException {
        String[] partes = campo.split(": ");
        if (partes.length != 2) {
            throw new IllegalArgumentException("Formato de campo inválido: " + campo);
        }
        return partes[1].trim();
    }

    @Override
    

public String toString() {
    return "Nome do Rótulo: " + nomeRotulo + "-"
            + "Produtor: " + produtor + "-"
            + "DOC: " + doc + "-"
            + "Classificação: " + classificacao + "-"
            + "Cor: " + cor + "-"
            + "Safra: " + safra + "-"
            + "Tipo: " + tipo + "-"
            + "Tempo de Envelhecimento: " + tempoEnvelhecimento + " meses" + "-"
            + "Envelhecido em Carvalho Francês: " + carvalhoFrances + "-"
            + "Envelhecido em Carvalho Americano: " + carvalhoAmericano + "-"
            + "Envelhecido em Inox: " + inox + "-"
            + "Envelhecido em Garrafa: " + emGarrafa + "-"
            + "Potencial de Guarda: " + potencialGuarda + " anos" + "-"
            + "Uva Predominante: " + uvaPredominante;
}


}
