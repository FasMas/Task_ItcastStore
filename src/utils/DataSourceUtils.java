package task_itcaststore.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceUtils {
	/** 从数据库连接池中获取一个连接 */
	private static DataSource dataSource = new ComboPooledDataSource();
	/** 本地线程 */
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

	/**
	 * 得到数据源
	 */
	public static DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * 当DBUtils需要手动控制事务时，调用该方法获得一个连接
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		var con = tl.get();
		if(con == null) {
			con = dataSource.getConnection();
			tl.set(con);
		}
		return con;
	}

	/**
	 * 开启事务
	 * @throws SQLException
	 */
	public static void startTransaction() throws SQLException {
		var con = getConnection();
		if(con != null)
			con.setAutoCommit(false);
	}

	/**
	 * 结束事务
	 * @throws SQLException
	 */
	public static void stopTransaction() throws SQLException {
		var con = getConnection();
		if(con != null)
			con.setAutoCommit(true);
	}

	/**
	 * 从ThreadLocal中释放并关闭Connection，并结束事务
	 * @throws SQLException
	 */
	public static void releaseAndCloseConnection() throws SQLException {
		Connection con = getConnection();
		if(con == null)
			return;
		con.commit();
		tl.remove();
		con.close();
	}

	/**
	 * 事务回滚
	 * @throws SQLException
	 */
	public static void rollback() throws SQLException {
		var con = getConnection();
		if(con != null)
			con.rollback();
	}
}
