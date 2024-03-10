package com.globalfit.AppMobil.repository;

import com.globalfit.AppMobil.Model.UsuariosModel
import org.springframework.data.jpa.repository.JpaRepository


interface LoginRepository : JpaRepository<UsuariosModel, Long> {

}
