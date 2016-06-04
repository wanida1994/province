package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Province extends Model {


    @Id
    public Integer id;
    public String th; // ชื่อภาษาไทย
    public String en; //ชื่อโรมัน
    public String slogan;



    @Override
	public String toString() {

  return  ""+id+", "+th+", "+en+", "+slogan;
	}

	public boolean contains(String term) {
		if (term.equals(""+id)) {
			return true;
		}
		if (th.contains(term) || en.contains(term)) {
			return true;
		}
		return false;
	}

    public static Finder<Integer, Province> find = new Model.Finder<>(Province.class);
}
