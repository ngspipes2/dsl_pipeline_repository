package pt.isel.ngspipes.pipeline_repository;

import pt.isel.ngspipes.pipeline_descriptor.IPipelineDescriptor;

import java.util.Collection;
import java.util.Map;

public interface IPipelineRepository {

    String getLocation() throws RepositoryException;
    Map<String, Object> getConfig() throws RepositoryException;

    Collection<IPipelineDescriptor> getAll() throws RepositoryException;
    IPipelineDescriptor get(String pipelineName) throws RepositoryException;
    void insert(IPipelineDescriptor pipeline) throws RepositoryException;
    void update(IPipelineDescriptor pipeline) throws RepositoryException;
    void delete(String pipelineName) throws RepositoryException;

}
