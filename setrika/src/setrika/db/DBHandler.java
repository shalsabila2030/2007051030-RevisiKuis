
package setrika.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import setrika.model.setrika;


public class DBHandler {
    public final Connection conn;

    public DBHandler(String driver) {
        this.conn = DBHelper.getConnection(driver);
    }
    public void addsetrika(setrika s){
        String insertsetrika = "INSERT INTO `setrika`(`id`, `nama_produk`, `tgl_produksi`,`harga`,`jenis`,`merk`)"
                + "VALUES (?,?,?)";
        try {
            PreparedStatement stmtInsert = conn.prepareStatement(insertsetrika);
            stmtInsert.setString(1, s.getId());
            stmtInsert.setString(2, s.getNama());
            stmtInsert.setString(3, s.getTglProduksi());
            stmtInsert.setString(4, s.getHarga());
            stmtInsert.setString(5, s.getJenis());
            stmtInsert.setString(6, s.getMerk());
            stmtInsert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}