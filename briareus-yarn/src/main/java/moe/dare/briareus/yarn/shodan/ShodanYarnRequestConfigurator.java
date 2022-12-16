package moe.dare.briareus.yarn.shodan;

import moe.dare.briareus.api.RemoteJvmOptions;
import org.apache.hadoop.yarn.api.records.ApplicationSubmissionContext;

/**
 * An extension point to configure low level aspects of yarn requests.
 */
public interface ShodanYarnRequestConfigurator {
    /**
     * @param request an application submission context to configure
     * @param options options passed to {@link BriareusYarnShodanContext}
     */
    default void configure(ApplicationSubmissionContext request, RemoteJvmOptions options) {
        // default implementation does nothing
    }
}
