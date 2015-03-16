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
package org.everit.osgi.jetty.server.component;

/**
 * Constants that help the usage of ServletContextHandlerFactory component.
 */
public final class ServletContextHandlerFactoryConstants {

  /**
   * Constant values a that are used as or as part of multiple constants in
   * {@link ServletContextHandlerFactoryConstants} class.
   */
  public static final class CommonConstants {

    public static final String CLAUSE_ATTR_URL_PATTERN = "url-pattern";

    private CommonConstants() {
    }
  }

  public static final Object ATTR_DISPATCHER = "dispatcher";

  public static final String FACTORY_PID =
      "org.everit.osgi.jetty.server.component.ServletContextHandlerFactory";

  public static final String FILTER_CLAUSE_ATTR_DISPATCHER = "dispatcher";

  public static final String FILTER_CLAUSE_ATTR_SERVLET_NAME = "servlet-name";

  public static final String FILTER_CLAUSE_ATTR_URL_PATTERN =
      CommonConstants.CLAUSE_ATTR_URL_PATTERN;

  public static final String SERVICE_REF_FILTERS = "filters";

  public static final String SERVICE_REF_SERVLETS = "servlets";

  public static final String SERVLET_CLAUSE_ATTR_URL_PATTERN =
      CommonConstants.CLAUSE_ATTR_URL_PATTERN;

  private ServletContextHandlerFactoryConstants() {
  }
}
