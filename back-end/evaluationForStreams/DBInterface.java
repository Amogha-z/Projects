package evaluationForStreams;

public interface DBInterface {
    void createTable();
    void insertIntoTable(String value);
    void readData();
    void deleteFromTable(String name);
}
