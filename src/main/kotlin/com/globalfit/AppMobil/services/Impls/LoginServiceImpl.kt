package com.globalfit.AppMobil.services.Impls;

import com.globalfit.AppMobil.Model.UsuariosModel
import com.globalfit.AppMobil.repository.LoginRepository
import com.globalfit.AppMobil.services.LoginService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LoginServiceImpl @Autowired constructor(
        private val loginRepository: LoginRepository
) : LoginService {
    
    /**
     * Inserta un nuevo usuario en la base de datos.
     *
     * @param usuario El objeto [UsuariosModel] que se va a insertar.
     * @throws DataAccessException Si hay algún problema al interactuar con la base de datos.
     */
    override fun insertarUsuario(usuario: UsuariosModel) {
        loginRepository.save(usuario)
    }
}