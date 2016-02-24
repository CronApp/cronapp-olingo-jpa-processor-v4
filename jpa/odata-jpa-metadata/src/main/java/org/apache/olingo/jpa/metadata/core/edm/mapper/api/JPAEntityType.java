package org.apache.olingo.jpa.metadata.core.edm.mapper.api;

import java.util.List;

import org.apache.olingo.jpa.metadata.core.edm.mapper.exception.ODataJPAModelException;

public interface JPAEntityType extends JPAStructuredType {
  /**
   * Returns a resolved list of all attributes that are marked as Id, so the attributes of an EmbeddedId are returned as
   * separate entries
   * @return
   * @throws ODataJPAModelException
   */
  public List<? extends JPAAttribute> getKey() throws ODataJPAModelException;

  public List<JPAPath> searchChildPath(JPAPath selectItemPath);

  /**
   * Returns the class of the Key. This could by either a primitive tape, the IdClass or the Embeddable of an EmbeddedId
   * @return
   */
  public Class<?> getKeyType();

  /**
   * 
   * @return
   * @throws ODataJPAModelException
   */
  public List<JPAPath> getSearchablePath() throws ODataJPAModelException;

  /**
   * Returns a list of path of all attributes annotated as Id. EmbeddedId are <b>not</b> resolved
   * @return
   * @throws ODataJPAModelException
   */
  public List<JPAPath> getKeyPath() throws ODataJPAModelException;

  /**
   * 
   * @return Name of the database table
   */
  public String getTableName();

}
