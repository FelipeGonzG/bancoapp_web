package test;

import javax.persistence.*;
import models.Ejecutivo1;

public class TestEjecutivo {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EJECUTIVO_PU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        Ejecutivo1 e = new Ejecutivo1("202932", "Mario", "bros", "123");
        em.persist(e);
        tx.commit();
        em.close();
    }
}
