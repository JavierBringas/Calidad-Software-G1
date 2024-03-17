import java.io.Serializable;
import java.util.*;

public class Character_AppMenu  implements Serializable {

    private User user;
    private DatabaseManager databaseManager;
    private Map<String, Character_App> databaseC = new HashMap<>();



    public  void Character_AppMenu (User u) {
        Scanner input = new Scanner(System.in);
        databaseManager = new DatabaseManager();
        databaseC = databaseManager.obtainDatabaseC();


        if (databaseC == null){
            NewCharacter newCharacter = new NewCharacter();
            Character_App c = newCharacter.NewCharacter();
            databaseC.put(u.getRegisterNumber(), c);
            databaseManager.saveDatabaseC(databaseC);

            menu(u);
        }else if (databaseC.get(u.getRegisterNumber()) == null){
            NewCharacter newCharacter = new NewCharacter();
            Character_App c = newCharacter.NewCharacter();
            databaseC.put(u.getRegisterNumber(), c);
            databaseManager.saveDatabaseC(databaseC);
            menu(u);
        }
        else{
            DeleteCharacter deleteCharacter = new DeleteCharacter();
            Character_App c = deleteCharacter.deleteCharacter(u);
            if (c != null){
                menu(u);
            }
            System.out.println("Borrado completo, ahora  deberá crear un nuevo personaje para poder seguir jugando.");
            NewCharacter newCharacter = new NewCharacter();
            c = newCharacter.NewCharacter();
            databaseC.put(u.getRegisterNumber(), c);
            databaseManager.saveDatabaseC(databaseC);
        }




    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }

    public void setDatabaseManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public Map<String, Character_App> getDatabaseC() {
        return databaseC;
    }

    public void setDatabaseC(Map<String, Character_App> databaseC) {
        this.databaseC = databaseC;
    }
    public void menu(User u){
        Menu menu = new Menu();
        menu.Menu(u);
    }

}

