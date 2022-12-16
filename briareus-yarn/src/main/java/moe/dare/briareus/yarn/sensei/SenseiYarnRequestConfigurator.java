package moe.dare.briareus.yarn.sensei;

import moe.dare.briareus.api.RemoteJvmOptions;
import org.apache.hadoop.yarn.client.api.AMRMClient.ContainerRequest.ContainerRequestBuilder;

/**
 * An extension point to configure low level aspects of yarn requests.
 */
public interface SenseiYarnRequestConfigurator {
    /**
     * @param request ContainerRequestBuilder to configure
     * @param options options passed to {@link BriareusYarnSenseiContext}
     */
    default void configure(ContainerRequestBuilder request, RemoteJvmOptions options) {
        // default implementation does nothing
    }
}
