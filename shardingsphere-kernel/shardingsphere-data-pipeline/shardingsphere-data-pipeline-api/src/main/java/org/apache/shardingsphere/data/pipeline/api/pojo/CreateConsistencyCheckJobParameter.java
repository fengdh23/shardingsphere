/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.data.pipeline.api.pojo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Properties;

/**
 * Create consistency check job parameter.
 */
@Data
@RequiredArgsConstructor
public final class CreateConsistencyCheckJobParameter {
    
    private final String jobId;
    
    private final String algorithmTypeName;
    
    private final Properties algorithmProps;
}
