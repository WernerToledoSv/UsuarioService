public interface IAppContext {
    public Connection getConnectionOracle();
    public Connection getConnectionMysql();
    public Connection getConnectionMongo();
    public Connection getConnectionSqlServer();
}
