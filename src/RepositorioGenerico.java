import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RepositorioGenerico <T extends Persistente>{
	
private List<T> lista;
	
	protected RepositorioGenerico() {
        this.lista = new ArrayList<>();
    }
	
	
	public List<T> buscarTodos() {
        //SELECT
        return this.lista;
    }
	
	public Optional<T> buscar(Integer id) {
        return this.lista
                .stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }
	
	
	public void agregar(T elemento) {
        //INSERT
        this.lista.add(elemento);
    }

    public Boolean modificar(T elemento) {
    	int count = 0;
		Boolean flag = false;
		
		while(lista.size() > count) {
			
			if(lista.get(count).getId() == elemento.getId()) {
				
				lista.set(count, elemento);
				count = lista.size();
				flag = true;
			}
			else {
				count++;
			}
			
		}
    
		return flag;
    }

    public void eliminar(T unElemento) {
        //DELETE
        this.lista.remove(unElemento);
    }
	

}
