package com.example.roomtest.dao

import androidx.room.*
import com.example.roomtest.model.Contato

@Dao
interface ContatoDao {

    @Insert
    fun salvar(contato: Contato)

    @Update
    fun atualizar(contato: Contato)

    @Query("SELECT * FROM contato ORDER BY nome ASC")
    fun listarTodos() : List<Contato>

    @Query("SELECT * FROM contato WHERE id = :id")
    fun listarPorId(id: Int) : Contato

    @Delete
    fun excluir(contato: Contato)
}