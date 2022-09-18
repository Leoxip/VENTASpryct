package upeu.edu.pe.VentasPY.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.VentasPY.dao.Todo;
import upeu.edu.pe.VentasPY.daoimpl.VentasDaoimpl;
import upeu.edu.pe.VentasPY.entity.Ventas;


@Service
public class VentasService implements Todo<Ventas>{

	@Autowired
	private VentasDaoimpl daoimpl;

	@Override
	public int create(Ventas t) {
		// TODO Auto-generated method stub
		return daoimpl.create(t);
	}

	@Override
	public int update(Ventas t) {
		// TODO Auto-generated method stub
		return daoimpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoimpl.delete(id);
	}

	@Override
	public Ventas read(int id) {
		// TODO Auto-generated method stub
		return daoimpl.read(id);
	}

	@Override
	public List<Ventas> reAll() {
		// TODO Auto-generated method stub
		return daoimpl.reAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoimpl.readAll2();
	}
}
