package ca.qc.johnabbott.cs.cs616.contacts.model;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

/**
 * Table class for Contacts
 *
 * @author Ian Clement (ian.clement@johnabbott.qc.ca)
 */
public class ContactTable implements CRUDRepository<Long, Contact> {

    private SQLiteOpenHelper dbh;

    /**
     * Create a ContactTable with the DB handler.
     * @param dbh
     */
    public ContactTable(SQLiteOpenHelper dbh) {
        this.dbh = dbh;
    }

    /**
     * Get the SQL CREATE TABLE statement for this table.
     * @return SQL CREATE TABLE statement.
     */
    public String getCreateTableStatement() {
        return "";
    }

    /**
     * Get the SQL DROP TABLE statement for this table.
     * @return SQL DROP TABLE statement.
     */
    public String getDropTableStatement() {
        return "";
    }

    @Override
    public Long create(Contact element) throws DatabaseException {
        return 0l;
    }

    @Override
    public Contact read(Long key) throws DatabaseException {
        return null;
    }

    @Override
    public List<Contact> readAll() throws DatabaseException {
        return null;
    }

    @Override
    public boolean update(Contact element) throws DatabaseException {
        return false;
    }

    @Override
    public boolean delete(Contact element) throws DatabaseException {
        return false;
    }

    /**
     * Check that the table has initial data.
     * @return
     */
    public boolean hasInitialData() {
        return true;
    }

    /**
     * Populate table with initial data.
     * Precondition: table has been created.
     * Note: this method is called during the handler's onCreate method where a writable database is opne
     *       trying to get a second writable database will throw an error, hence the parameter.
     * @param database
     */
    public void initialize(SQLiteDatabase database) {

    }
}
