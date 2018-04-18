package pt.isel.ngspipes.pipeline_repository;

import pt.isel.ngspipes.pipeline_descriptor.IPipelineDescriptor;

import java.util.Collection;
import java.util.Map;

public interface IPipelineRepository {

    String getLocation() throws PipelineRepositoryException;
    Map<String, Object> getConfig() throws PipelineRepositoryException;

    Collection<IPipelineDescriptor> getAll() throws PipelineRepositoryException;
    IPipelineDescriptor get(String pipelineName) throws PipelineRepositoryException;
    void insert(IPipelineDescriptor pipeline) throws PipelineRepositoryException;
    void update(IPipelineDescriptor pipeline) throws PipelineRepositoryException;
    void delete(String pipelineName) throws PipelineRepositoryException;

}
