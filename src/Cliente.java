
public class Cliente {

    public Cliente(String name, Cliente.Sexo sexo) {
        this.name = name;
        this.sexo = sexo;
    }
    enum Sexo {
        Masculino, Feminino
    }
    
    private String name;
    private Sexo sexo;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public boolean isMasculino() {
        return this.sexo == Sexo.Masculino;
    }

    public Cliente filterSexo(Cliente.Sexo sexo) {
        if (this.sexo == sexo) {
            return this;
        }
        return null;
    }

    public boolean isFeminino() {
        return this.sexo == Sexo.Feminino;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ");
        sb.append(this.name);
        sb.append(" - ");
        sb.append("Sexo: ");
        sb.append(this.sexo);
        return sb.toString();
    }

}
