/*
 * Copyright 2015-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 */

package org.schema;

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;
import java.util.*;

/**
 * Text representing an XPath (typically but not necessarily version 1.0).
 */
public class XPathType extends Text {
  protected XPathType(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link XPathType}
   */
  public static class Builder extends Text.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public XPathType build() {
      return new XPathType(myData);
    }
    @Override protected void fromMap(String key, Object value) {
      super.fromMap(key, value);
    }
  }
  
}
