package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class conexionBase {
public DataSource datasource;


public conexionBase() {
	ComboPooledDataSource comboPool = new ComboPooledDataSource();
	comboPool.setJdbcUrl("jdbc:mysql://localhost/hotel_challenge?serverTimezone=UTC&useLegacyDatetimeCode=false");
	comboPool.setUser("root");
	comboPool.setPassword("MyC248geto_Kg99");
	
	this.datasource = comboPool;
}
public Connection recuperarConexion() {
	try {
		return this.datasource.getConnection();
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
}
}
