package DAO;

import DAO.CinemaDAO
import factory.*
import model.Cinema
import model.Filmes

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmesDAO {

    private Connection connection;

    public CinemaDAO() {
        this.connection = new com.example.prova02.factory.ConnectionFactory().getConnection();
    }
