public class VerificaSexo implements Verificador {
    private Cliente.Sexo sexo;
    
    public VerificaSexo(Cliente.Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean verificar(Cliente cliente) {
        return cliente.getSexo() == this.sexo;
    }
    

    
}
