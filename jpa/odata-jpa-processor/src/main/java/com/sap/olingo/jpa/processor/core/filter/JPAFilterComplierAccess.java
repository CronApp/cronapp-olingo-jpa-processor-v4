package com.sap.olingo.jpa.processor.core.filter;

import java.util.List;

import javax.persistence.EntityManager;

import org.apache.olingo.server.api.OData;
import org.apache.olingo.server.api.uri.UriResource;

import com.sap.olingo.jpa.metadata.core.edm.mapper.api.JPAEntityType;
import com.sap.olingo.jpa.metadata.core.edm.mapper.impl.ServiceDocument;
import com.sap.olingo.jpa.processor.core.query.JPAAbstractQuery;

interface JPAFilterComplierAccess {

  JPAAbstractQuery getParent();

  List<UriResource> getUriResourceParts();

  ServiceDocument getSd();

  OData getOdata();

  EntityManager getEntityManager();

  JPAEntityType getJpaEntityType();

  JPAOperationConverter getConverter();

}