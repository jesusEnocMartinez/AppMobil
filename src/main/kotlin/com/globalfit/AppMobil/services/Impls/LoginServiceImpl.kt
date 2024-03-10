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

    override fun insertarUsuario(usuario: UsuariosModel) {
        loginRepository.save(usuario)
    }
}