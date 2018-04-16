package pt.isel.ngspipes.pipeline_repository;

import pt.isel.ngspipes.pipeline_descriptor.IPipelineDescriptor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class PipelineRepository implements IPipelineRepository {

    private String location;
    @Override public String getLocation() throws RepositoryException {  return this.location; }

    private Map<String, Object> config;
    @Override public Map<String, Object> getConfig() throws RepositoryException { return this.config; }

    private Map<String, IPipelineDescriptor> descriptorByName;



    public PipelineRepository(String location, Map<String, Object> config) {
        this.location = location;
        this.config = config;
    }



    @Override
    public Collection<IPipelineDescriptor> getAll() throws RepositoryException {
        init();
        return descriptorByName.values();
    }

    @Override
    public IPipelineDescriptor get(String pipelineName) throws RepositoryException {
        init();
        return descriptorByName.get(pipelineName);
    }

    @Override
    public void insert(IPipelineDescriptor pipeline) throws RepositoryException {
        init();
        descriptorByName.put(pipeline.getName(), pipeline);
    }

    @Override
    public void update(IPipelineDescriptor pipeline) throws RepositoryException {
        init();
        this.descriptorByName.put(pipeline.getName(), pipeline);
    }

    @Override
    public void delete(String pipelineName) throws RepositoryException {
        init();
        descriptorByName.remove(pipelineName);
    }

    private void init() throws RepositoryException {
        if(descriptorByName == null) {
            this.descriptorByName = new HashMap<>();

            for(IPipelineDescriptor descriptor : loadAll())
                descriptorByName.put(descriptor.getName(), descriptor);
        }
    }



    protected abstract Collection<IPipelineDescriptor> loadAll() throws RepositoryException;

}
