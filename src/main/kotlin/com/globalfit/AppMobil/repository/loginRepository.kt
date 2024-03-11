package com.globalfit.AppMobil.repository;

import com.globalfit.AppMobil.Model.UsuariosModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LoginRepository : JpaRepository<UsuariosModel, Long> {

}
