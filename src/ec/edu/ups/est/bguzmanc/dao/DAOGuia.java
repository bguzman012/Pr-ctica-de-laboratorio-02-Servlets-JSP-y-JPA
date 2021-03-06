package ec.edu.ups.est.bguzmanc.dao;

import ec.edu.ups.est.bguzmanc.mysql.Jpa.JPADAOGuia;

public abstract class DAOGuia {

	protected static DAOGuia guia = new JPADAOGuia();
	/**
	 * @return the guia
	 */
	public static DAOGuia getGuia() {
		return guia;
	}

	public abstract UsuarioDAO getUsuarioDAO();

	public abstract TelefonoDAO getTelefonoDAO();
	
}
