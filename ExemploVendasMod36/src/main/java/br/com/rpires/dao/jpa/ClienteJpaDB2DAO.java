/**
 * 
 */
package br.com.mchaves.dao.jpa;

import br.com.mchaves.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.mchaves.domain.jpa.ClienteJpa;


public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
