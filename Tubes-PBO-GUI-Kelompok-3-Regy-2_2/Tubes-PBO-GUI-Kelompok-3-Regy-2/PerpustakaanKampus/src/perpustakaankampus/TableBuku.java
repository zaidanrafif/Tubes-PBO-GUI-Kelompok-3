package perpustakaankampus;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableBuku extends AbstractTableModel {
    
    List <Buku> listBuku;
    int kolom, baris;
    public TableBuku(List<Buku> listBuku) { this.listBuku = listBuku; }
    public TableBuku(){}
    public Buku getRow(int row) { return listBuku.get(row); } 
    
    @Override
    public int getRowCount() { return listBuku.size(); }
    @Override
    public int getColumnCount() { return listBuku.get(0).getClass().getDeclaredFields().length; }
   
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Buku buku = listBuku.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> buku.getKodeBuku();
            case 1 -> buku.getJudulBuku();
            case 2 -> buku.getAuthor();
            case 3 -> buku.getKategoriBuku();
            case 4 -> buku.getTahunTerbit();
            case 5 -> buku.getStokBuku();
            case 6 -> buku.getFrekPeminjaman();
            case 7 -> buku.getAbstrak();
            default -> null;
        };
    }
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "Kode buku";
            case 1 -> "Judul buku";
            case 2 -> "Author";
            case 3 -> "Kategori buku";
            case 4 -> "Tahun terbit";
            case 5 -> "Stok buku";
            case 6 -> "Frekuensi Peminjaman";
            case 7 -> "Abstrak";
            default -> null;
        };
    }
    public void printAll(){
        kolom = getColumnCount();
        baris = getRowCount();
        System.out.println(kolom);
        System.out.println(baris);
    }
    
}