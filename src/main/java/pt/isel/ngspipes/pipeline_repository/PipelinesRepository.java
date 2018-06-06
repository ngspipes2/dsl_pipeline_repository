package pt.isel.ngspipes.pipeline_repository;

import java.util.Map;

public abstract class PipelinesRepository implements IPipelinesRepository {

    protected String location;
    @Override public String getLocation() throws PipelinesRepositoryException {  return this.location; }

    protected Map<String, Object> config;
    @Override public Map<String, Object> getConfig() throws PipelinesRepositoryException { return this.config; }



    public PipelinesRepository(String location, Map<String, Object> config) {
        this.location = location;
        this.config = config;
    }

}
