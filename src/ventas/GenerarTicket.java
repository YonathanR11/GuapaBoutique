/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import Principal.conectar;
import com.mysql.jdbc.Connection;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Yonathan
 */
public class GenerarTicket {
    
    public void ticket(int id){
        try {
            conectar cc = new conectar();
        java.sql.Connection cn = cc.conexion();
            
            JasperReport reporte = null;
            String path = "src\\ticket\\ticket.jasper";
            
            InputStream is=this.getClass().getResourceAsStream("/com/medicam/servlets/Invoice.jrxml");
            JasperReport jasperReport = JasperCompileManager.compileReport(is);
            
            Map parametro = new HashMap();
            parametro.put("id_venta", id);
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, cn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(GenerarTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
