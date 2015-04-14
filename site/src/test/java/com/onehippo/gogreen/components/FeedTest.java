package com.onehippo.gogreen.components;

import org.hippoecm.hst.configuration.hosting.Mount;
import org.hippoecm.hst.core.container.ContainerConfiguration;
import org.hippoecm.hst.core.request.HstRequestContext;
import org.hippoecm.hst.core.request.ResolvedMount;
import org.hippoecm.hst.mock.core.component.MockHstRequest;
import org.hippoecm.hst.mock.core.component.MockHstResponse;
import org.hippoecm.hst.mock.core.request.MockHstRequestContext;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

/**
 * Tests {@link Feed}
 */
@RunWith(MockitoJUnitRunner.class)
public class FeedTest {

    @Mock
    private HstRequestContext hstRequestContext;

    @Mock
    private ResolvedMount resolvedMount;

    @Mock
    private Mount mount;

    @Mock
    private ContainerConfiguration containerConfiguration;

    private MockHstRequest request = new MockHstRequest();

    private MockHstResponse response = new MockHstResponse();

    private MockHstRequestContext requestContext = new MockHstRequestContext();

    private Object object = null;

    @Before
    public void setUp() {
        setupRequestMockVaules();
        setupRequestContextMockValues();
        setContainerConfiguration();

        doReturn(mount).when(resolvedMount).getMount();
        when(request.getRequestContext().getContainerConfiguration().getString("cms.location", "/cms/")).thenReturn("\"cms.location\", \"/cms/\"");
    }

    @Ignore
    @Test
    public void testDoBeforeRender() throws Exception {
        Feed feed = new Feed();
        feed.doBeforeRender(request, response);

    }

    private void setupRequestMockVaules() {
        request.setRequestContext(requestContext);
        request.setContextPath("/contentPath/");
        request.setAttribute("", object);
    }

    private void setupRequestContextMockValues() {
        requestContext.setResolvedMount(resolvedMount);
        requestContext.setAttribute("attribute", true);
    }

    private void setContainerConfiguration() {
        requestContext.setContainerConfiguration(containerConfiguration);
    }

}