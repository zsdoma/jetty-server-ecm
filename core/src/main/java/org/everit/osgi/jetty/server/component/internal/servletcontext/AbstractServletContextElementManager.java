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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractServletContextElementManager<KEY, ELEMENT> {

  private Map<KEY, Integer> previousKeysWithPosition = Collections.emptyMap();

  protected abstract ELEMENT createNewElement(KEY newKey);

  protected abstract ELEMENT[] createNewElementArray(int length);

  public ELEMENT[] generateUpgradedElementArray(final KEY[] newKeys,
      final ELEMENT[] previousElements) {

    ELEMENT[] result = createNewElementArray(newKeys.length);

    for (int i = 0; i < newKeys.length; i++) {
      KEY newKey = newKeys[i];
      if (previousElements == null || previousElements.length == 0) {
        // The length of previousElements can be zero if the ServletHandler is freshly created
        result[i] = createNewElement(newKey);
      } else {
        Integer position = previousKeysWithPosition.get(newKey);
        if (position != null) {
          result[i] = previousElements[i];
        } else {
          result[i] = createNewElement(newKey);
        }
      }
    }

    return result;
  }

  public void updatePrviousKeys(final KEY[] keys) {
    Map<KEY, Integer> updated = new HashMap<>(keys.length);
    for (int i = 0; i < keys.length; i++) {
      updated.put(keys[i], i);
    }
    previousKeysWithPosition = updated;
  }
}