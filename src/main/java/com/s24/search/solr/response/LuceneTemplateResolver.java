package com.s24.search.solr.response;

import java.util.Map;

import org.apache.lucene.analysis.util.ResourceLoader;
import org.thymeleaf.IEngineConfiguration;
import org.thymeleaf.templateresolver.AbstractConfigurableTemplateResolver;
import org.thymeleaf.templateresource.ITemplateResource;

public class LuceneTemplateResolver
    extends AbstractConfigurableTemplateResolver {

    private final ResourceLoader resourceLoader;

    public LuceneTemplateResolver(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public ITemplateResource computeTemplateResource(
        IEngineConfiguration configuration,
        String ownerTemplate,
        String template,
        String resourceName,
        String characterEncoding,
        Map<String, Object> templateResolutionAttributes
    ) {
        return new LuceneTemplateResource(resourceLoader, resourceName, characterEncoding);
    }
}