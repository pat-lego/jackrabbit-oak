/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.apache.jackrabbit.oak.query;

import java.util.Optional;

/**
 * A query options (or "hints") that are used to customize the way the query is processed.
 */
public class QueryOptions {
    
    public Traversal traversal = Traversal.DEFAULT;
    public String indexName;
    public String indexTag;
    public Optional<Long> limit = Optional.empty();
    public Optional<Long> offset = Optional.empty();
    
    public enum Traversal {
        // traversing without index is OK for this query, and does not fail or log a warning
        OK, 
        // traversing is OK, but logs a warning
        WARN, 
        // traversing will fail the query
        FAIL,
        // the default setting
        DEFAULT
    };

}
