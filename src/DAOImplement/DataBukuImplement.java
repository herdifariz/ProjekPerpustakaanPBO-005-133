/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;
import java.util.List;
import model.*;
/**
 *
 * @author acer
 */
public interface DataBukuImplement {
    public void insert(DataBuku p);
    public void update(DataBuku p);
    public void delete(int id);
    public List<DataBuku> getAll();
}
