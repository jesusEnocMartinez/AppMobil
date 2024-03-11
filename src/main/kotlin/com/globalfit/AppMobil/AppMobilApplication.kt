package com.globalfit.AppMobil

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories(basePackages = ["com.globalfit.AppMobil.repository"])
@SpringBootApplication
class AppMobilApplication

fun main(args: Array<String>) {
	runApplication<AppMobilApplication>(*args)
}