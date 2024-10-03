package com.cue;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersonaService {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_PU");

    public void guardarPersona(Persona persona) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(persona);  // Persistir una entidad
        em.getTransaction().commit();
        em.close();
    }

    public Persona buscarPersona(Long id) {
        EntityManager em = emf.createEntityManager();
        Persona persona = em.find(Persona.class, id);  // Buscar una entidad por ID
        em.close();
        return persona;
    }

    public void eliminarPersona(Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Persona persona = em.find(Persona.class, id);
        if (persona != null) {
            em.remove(persona);  // Eliminar una entidad
        }
        em.getTransaction().commit();
        em.close();
    }
}
