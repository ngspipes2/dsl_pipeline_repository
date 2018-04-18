package pt.isel.ngspipes.pipeline_repository;

public class PipelineRepositoryException extends Exception {

    public PipelineRepositoryException() {
        super();
    }

    public PipelineRepositoryException(String message) {
        super(message);
    }

    public PipelineRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public PipelineRepositoryException(Throwable cause) {
        super(cause);
    }

}
