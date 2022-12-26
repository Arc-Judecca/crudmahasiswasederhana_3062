/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudmahasiswasederhana.Cont3062;

import com.mycompany.crudmahasiswasederhana.db.ConnectionHelper_3062;
import com.mycompany.crudmahasiswasederhana.interfc3062.MahasiswaInterface3062;
import com.mycompany.crudmahasiswasederhana.models3062.Mahasiswa3062;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
public class MahasiswaCont3062 implements MahasiswaInterface3062{
    PreparedStatement st;
    @Override
    public Mahasiswa3062 insert(Mahasiswa3062 o) throws SQLException {
        st=ConnectionHelper_3062.getConnection().prepareStatement("Insert into Mahasiswa3062 values(?,?,?)");
        st.setString(1, o.getNim());
        st.setString(2, o.getNama());
        st.setString(3, o.getAlamat());
        st.executeUpdate();
        return o;
    }

    @Override
    public void update(Mahasiswa3062 o) throws SQLException {
       st=ConnectionHelper_3062.getConnection().prepareStatement("Update Mahasiswa3062 set nim=?, nama=?, where alamat=?");
       st.setString(1, o.getNim());
       st.setString(2, o.getNama());
       st.setString(3, o.getAlamat());
       st.executeUpdate();
    }

    @Override
    public void delete(String nim) throws SQLException {
        st=ConnectionHelper_3062.getConnection().prepareStatement("Delete from Mahasiswa3062 where nim=?");
        st.setString(1, nim);
        st.executeUpdate();
    }

    @Override
    public List<Mahasiswa3062> getAll() throws SQLException {
        Statement st=ConnectionHelper_3062.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select * from Mahasiswa3062");
        List<Mahasiswa3062>list=new ArrayList<>();
        while(rs.next()){
            Mahasiswa3062 mhs3062 = new Mahasiswa3062();
            mhs3062.setNim(rs.getString("NIM"));
            mhs3062.setNama(rs.getString("Nama"));
            mhs3062.setAlamat(rs.getString("Alamat"));
            list.add(mhs3062);
        }
            
        return list;
    }
    
}
