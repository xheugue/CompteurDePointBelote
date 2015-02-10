package groupe_ipi_belote.compteurBelote.Exceptions_core;

/**
 * Created by Axel on 08/02/2015.
 */
public class BERException extends CustomExceptionTemplate{

    public BERException(int code) throws Exception{
        super(code);

        switch(code){
            case 0xCC00:
                message = "L'équipe spécifiée est nulle.";
                break;
            case 0xCC01:
                message = "La couleur spécifiée est nulle.";
                break;
        }

    }

}
