package groupe_ipi_belote.compteurBelote.Data_Access_Layer;

/**
 * Created by Axel on 18/02/2015.
 */
public class Database_Equipe_Facade extends Database_Facade {

    public Database_Equipe_Facade(Database_mediator dbm){
        super("Equipe");
        setUpMediator(dbm);
    }



}
