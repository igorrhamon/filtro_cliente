import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("João", Cliente.Sexo.Masculino);
        Cliente cliente2 = new Cliente("Maria", Cliente.Sexo.Feminino);

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente1);
        clientes.add(cliente1);
        clientes.add(cliente2);        
        clientes.add(cliente2);        
        clientes.add(cliente1);
        clientes.add(cliente1);
        clientes.add(cliente2);        
        clientes.add(cliente2);        

        System.out.print("Digite o sexo para buscar clientes (Masculino/Feminino): ");
        String s = System.console().readLine();
        Cliente.Sexo sexoEscolhido = Cliente.Sexo.valueOf(s);
        List<Cliente> clientesFiltrados = new ArrayList<>();
        if (sexoEscolhido == Cliente.Sexo.Feminino) {
            clientesFiltrados = filtrar(clientes, Cliente::isFeminino);
            System.out.println("Feminino");
            return;
        }else if(sexoEscolhido == Cliente.Sexo.Masculino){
            clientesFiltrados = filtrar(clientes, Cliente::isMasculino);
            Collections.sort(clientesFiltrados, (c1, c2) -> c1.getName().compareTo(c2.getName())); //ordena por nome
        }else{
            System.out.println("Sexo inválido");
        }
        clientesFiltrados.forEach(System.out::println);

    }

    public static List<Cliente> filtrar(List<Cliente> clientes, Verificador verificador) {
        //retorna lista filtrada
        List<Cliente> clientesFiltrados = new ArrayList<Cliente>();
        clientes.forEach(c -> {
            if (verificador.verificar(c)) {
                clientesFiltrados.add(c);
            }
        });
        return clientesFiltrados;
    }
}
