package com.cue;

public class Main {
    public static void main(String[] args) {
        PersonaService service = new PersonaService();

        // Crear y guardar una nueva persona
        Persona persona = new Persona();
        persona.setId(4L);
        persona.setNombre("Carlos");
        persona.setApellido("Aranzazu");

        service.guardarPersona(persona);

        // Buscar la persona recién guardada
        Persona p = service.buscarPersona(1L);
        System.out.println("Persona encontrada: " + p.getNombre() + " " + p.getApellido());
    }
}
