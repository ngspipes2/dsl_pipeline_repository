package pt.isel.ngspipes.pipeline_repository;

public class PipelinesRepositoryException extends Exception {

    public PipelinesRepositoryException() {
        super();
    }

    public PipelinesRepositoryException(String message) {
        super(message);
    }

    public PipelinesRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public PipelinesRepositoryException(Throwable cause) {
        super(cause);
    }

}
