package pe.macs.demo.web.app.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import pe.macs.demo.web.app.db.accesoMSSQL;
import pe.macs.demo.web.app.domain.curso;

public class cursoModel {
	Connection cn;
	Statement smt;
	ResultSet rs;
	PreparedStatement psm;
	LocalDate current_date=LocalDate.now();
	
	public void createCurso(curso bean) {
		try {
			cn=accesoMSSQL.getConnection();
			String sql="INSERT INTO TB_CURSO(NOMBRE_CURSO,MATERIA,DESCRIPCION,ESTADO) VALUES (?,?,?,?);";
			psm=cn.prepareStatement(sql);
			psm.setString(1, bean.getNombre());
			psm.setString(2, bean.getMateria());
			psm.setString(3, bean.getDescripcion());
			psm.setInt(4, bean.getEstado());
			psm.executeUpdate();
			psm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException("ERROR, no se tiene acceso al servidor. ->insertCurso");
		} finally {
			try {
				cn.close();
			} catch (Exception e2) {
			}
		}
	}
}
