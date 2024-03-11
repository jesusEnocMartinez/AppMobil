package com.globalfit.AppMobil.Model;

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "usuario")
data class UsuariosModel(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var id: Long? = null,
        @Column(name = "nombre")
        var nombre: String? = null,
        @Column(name = "contraseña")
        var contraseña: String? = null,
        @Column(name = "correo")
        var correo: String? = null,
        @Column(name = "tipousuario")
        var tipoUsuario: String? = null,
        @Column(name = "genero")
        var genero: String? = null,
        @Column(name = "contraseñaBloqueada")
        var contraseñaBloqueada: String? = null,
        @Column(name = "fecha")
        var fecha: Date? = null
)
