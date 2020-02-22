package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IUomTypeDao;
import in.nit.model.UomType;

@Repository
public class UomTypeDaoImpl implements IUomTypeDao{
	@Autowired
	private HibernateTemplate ht;
	
	public Integer saveUomType(UomType ob) {
		return  (Integer) ht.save(ob);
	}
	
	public List<UomType> getAllUomTypes() {
		return ht.loadAll(UomType.class);
	}
	
	public void deleteUomType(Integer id) {
	ht.delete(ht.get(UomType.class, id));	
	}
	
	public UomType getOneUomType(Integer id) {
		return 	ht.get(UomType.class, id);
	}
	@Override
	public void UpdateUomType(UomType ob) {
	ht.update(ob);	
	}
}

