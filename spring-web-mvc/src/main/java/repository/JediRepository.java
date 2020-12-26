package repository;

import com.globallabes.springwebmvc.model.Jedi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository // informando classe é repositorio
public class JediRepository {
    private List<Jedi> jedi;
    @Autowired
    public JediRepository() {
        jedi = new ArrayList<>(); String name;  String lastName;
        jedi.add(new Jedi(name="Luke" , lastName= "Skaiwoke"));
        jedi.add(new Jedi(name="Celio" , lastName= "Skaiwoke"));
    }

    public List <Jedi> getAllJedi(){

        return this.jedi;
    }

    public void add(final Jedi jedi ) {
        this.add(jedi);
    }
}
