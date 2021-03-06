/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
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
package org.everit.jetty.server.ecm.internal.servletcontext;

import javax.servlet.Filter;

import org.eclipse.jetty.servlet.FilterHolder;

/**
 * Manager for Filters in ServletContext component.
 */
public class FilterHolderManager extends
    AbstractServletContextElementManager<HolderKey<Filter>, FilterHolder> {

  @Override
  protected FilterHolder createNewElement(final HolderKey<Filter> newKey) {
    FilterHolder filterHolder = new FilterHolder(newKey.heldValue);
    filterHolder.setAsyncSupported(newKey.asyncSupported);
    filterHolder.setInitParameters(newKey.initParameters);
    filterHolder.setName(newKey.name);

    return filterHolder;
  }

  @Override
  protected FilterHolder[] createNewElementArray(final int length) {
    return new FilterHolder[length];
  }
}
