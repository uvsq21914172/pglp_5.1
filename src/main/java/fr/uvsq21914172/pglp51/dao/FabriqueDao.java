package fr.uvsq21914172.pglp51.dao;

import fr.uvsq21914172.pglp51.Groupe;
import fr.uvsq21914172.pglp51.Personnel;

/**
 * Fabrique.
 * 
 * @author Dalil
 *
 */
public class FabriqueDao {

  /**
   * Renvoie un objet Personnel DAO.
   * 
   * @return DAO.
   */
  public static Dao<Personnel> getPersonnelDao() {
    return new PersonnelDao("./");
  }

  /**
   * Renvoie un objet Groupe DAO.
   * 
   * @return DAO.
   */
  public static Dao<Groupe> getGroupeDao() {
    return new GroupeDao("./");
  }
}
