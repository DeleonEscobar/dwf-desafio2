package sv.edu.udb.controller.dto;

import lombok.Data;

@Data
public class AlumnoDTO {
    private Integer id;
    private String nombre;
    private String apellido;
    private MateriaDTO materia;
}
