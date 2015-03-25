/*
 * Copyright (C) 2015 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.osgi.jetty.server.component.internal.servletcontext;

import org.eclipse.jetty.servlet.ServletMapping;

/**
 * Manager for servlet mapping keys.
 */
public class ServletMappingManager extends
    AbstractServletContextElementManager<ServletMappingKey, ServletMapping> {

  @Override
  protected ServletMapping createNewElement(final ServletMappingKey newKey) {
    ServletMapping servletMapping = new ServletMapping();
    servletMapping.setServletName(newKey.servletName);
    servletMapping.setPathSpecs(newKey.urlPatterns);
    return servletMapping;
  }

  @Override
  protected ServletMapping[] createNewElementArray(final int length) {
    return new ServletMapping[length];
  }

}
