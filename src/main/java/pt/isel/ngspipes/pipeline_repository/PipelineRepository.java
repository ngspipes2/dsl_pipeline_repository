package pt.isel.ngspipes.pipeline_repository;

import java.util.Map;

public abstract class PipelineRepository implements IPipelineRepository {

    private String location;
    @Override public String getLocation() throws PipelineRepositoryException {  return this.location; }

    private Map<String, Object> config;
    @Override public Map<String, Object> getConfig() throws PipelineRepositoryException { return this.config; }



    public PipelineRepository(String location, Map<String, Object> config) {
        this.location = location;
        this.config = config;
    }

}
