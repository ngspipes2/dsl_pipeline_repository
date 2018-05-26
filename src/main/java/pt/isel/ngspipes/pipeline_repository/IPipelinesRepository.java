package pt.isel.ngspipes.pipeline_repository;

import pt.isel.ngspipes.pipeline_descriptor.IPipelineDescriptor;

import java.util.Collection;
import java.util.Map;

public interface IPipelinesRepository {

    String getLocation() throws PipelinesRepositoryException;
    Map<String, Object> getConfig() throws PipelinesRepositoryException;

    Collection<IPipelineDescriptor> getAll() throws PipelinesRepositoryException;
    IPipelineDescriptor get(String pipelineName) throws PipelinesRepositoryException;
    void insert(IPipelineDescriptor pipeline) throws PipelinesRepositoryException;
    void update(IPipelineDescriptor pipeline) throws PipelinesRepositoryException;
    void delete(String pipelineName) throws PipelinesRepositoryException;

}
