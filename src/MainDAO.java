import DAO.ClientDAO;
import DAO.GenericDAO;
import DAO.UserDAO;
import entities.ClientDomain;
import domain.UserDomain;

public class MainDAO {

    private final static GenericDAO<Integer, UserDomain> userDAO = new UserDAO();
    private final static GenericDAO<String, ClientDomain> clientDAO = new ClientDAO();

    public static void main(String[] args){
        System.out.println("++++++++++++++ USER DAO +++++++++++++");
        var user = new UserDomain( 1,"Raul", 27);
        System.out.println(userDAO.count());
        System.out.println(userDAO.save(1, user));
        System.out.println(userDAO.findAll());
        System.out.println(userDAO.find(d -> d.getId().equals(1)));
        System.out.println(userDAO.find(d -> d.getId().equals(2)));
        System.out.println(userDAO.count());
        //userDAO.update(new UserDomain("Raul", 27));
        System.out.println(userDAO.delete(new UserDomain(1, "", -1)));
        System.out.println(userDAO.delete(user));
        System.out.println(userDAO.findAll());
        System.out.println(userDAO.count());

        System.out.println("++++++++++++++ CLIENT DAO +++++++++++++");
        var client = new ClientDomain("Nome", 20, "1");
        System.out.println(clientDAO.count());
        System.out.println(clientDAO.save(1, client));
        System.out.println(clientDAO.findAll());
        System.out.println(clientDAO.find(d -> d.getId().equals(1)));
        System.out.println(clientDAO.find(d -> d.getId().equals(2)));
        System.out.println(clientDAO.count());
        //clientDAO.update(new UserDomain("Raul", 27));
        System.out.println(clientDAO.delete(new ClientDomain("1", 1, "-1")));
        System.out.println(clientDAO.delete(client));
        System.out.println(clientDAO.findAll());
        System.out.println(clientDAO.count());
    }
}
