/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.crudmahasiswasederhana;

import com.mycompany.crudmahasiswasederhana.db.ConnectionHelper_3062;
import com.mycompany.crudmahasiswasederhana.views.MahasiswaFrame3062;
import javax.swing.SwingUtilities;

/**
 *
 * @author Judecca_GilangFibarkah_21103062 
 */
public class Crudmahasiswasederhana {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            MahasiswaFrame3062 form = new MahasiswaFrame3062();
             form.setLocationRelativeTo(null);
             form.setVisible(true);
            }
        });
         
    }
}
