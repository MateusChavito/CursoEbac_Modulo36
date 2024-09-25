/**
 * 
 */
package br.com.mchaves.dao.jpa;

import br.com.mchaves.dao.generic.jpa.IGenericJapDAO;
import br.com.mchaves.domain.jpa.Persistente;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
