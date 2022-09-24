package br.com.framework.interfac.crud;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public interface InterfaceCrud<T> extends Serializable {

	// salvar dados
	void save(T obj) throws Exception;
	
	// 
	void persist(T obj) throws Exception;
	
	// salva ou atualiza
	void saveOrUpadate(T obj) throws Exception;
	
	// realiza atualização de dados
	void upadate(T obj) throws Exception;
	
	// realiza o exclusão de dados
	void delete(T obj) throws Exception;

	// salva ou atualiza e retorna o objeto em estado persistente
	T merge (T obj) throws Exception;
	
	// Carrega a lista de dados determinada clase
	List<T> findList(Class<T> objs) throws Exception;
	
	Object findById(Class<T> entidade, Long id)  throws Exception;
	
	T findPorId(Class<T> entidade, Long id)  throws Exception;
	
	List<T> findListByQueryDinamica(String s) throws Exception;
	
	// executar update com HQL
	void executeUpdateQueryDinamica(String s) throws Exception;
	
	// executar update com SQL
	void executeUpdateSQLDinamica(String s) throws Exception;
	
	// limpa a sessão do hibernate
	void clearSession() throws Exception;
	
	// Retira um objeto da sessão do hibernate
	void evict (Object objs) throws Exception;
	
	Session getSession() throws Exception;
	
	List<?> getListSQLDinamica(String sql) throws Exception;
	
	// JDBC Spring
	JdbcTemplate getJdbcTemplate();
	
	SimpleJdbcTemplate getSimpleJdbcTemplate();
	
	SimpleJdbcInsert getSimpleJdbcInsert();
	
	Long totalRegistro(String table) throws Exception;
	
	Query obterQuery(String query) throws Exception;
	
	// carregamento dinamico
	List<T> findListByQueryDinamica(String query, int iniciaNoRegistro, int maximoResultado) throws Exception;
	
	
}
