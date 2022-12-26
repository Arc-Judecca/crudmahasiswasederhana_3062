/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crudmahasiswasederhana.interfc3062;

import com.mycompany.crudmahasiswasederhana.models3062.Mahasiswa3062;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
public interface MahasiswaInterface3062 {
    Mahasiswa3062 insert (Mahasiswa3062 o) throws SQLException;
    
    void update (Mahasiswa3062 o) throws SQLException;
    
    void delete (String nim) throws SQLException;
    
    List<Mahasiswa3062> getAll() throws SQLException;
}
