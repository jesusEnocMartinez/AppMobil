package com.globalfit.AppMobil.Model;

import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class UsuariosModel(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var nombre: String? = null,
        var contraseña: String? = null,
        var correo: String? = null,
        var tipoUsuario: String? = null,
        var genero: String? = null,
        var contraseñaBloqueada: Boolean = false,
        var fecha: Date? = null
)
