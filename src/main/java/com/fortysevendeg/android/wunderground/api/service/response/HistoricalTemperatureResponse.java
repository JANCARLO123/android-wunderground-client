/*
 *
 *  * Copyright (C) 2012 47 Degrees, LLC
 *  * http://47deg.com
 *  * hello@47deg.com
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.fortysevendeg.android.wunderground.api.service.response;

import it.restrung.rest.annotations.JsonProperty;
import it.restrung.rest.marshalling.response.AbstractJSONResponse;

import java.io.Serializable;

/**
 * HistoricalTemperatureResponse class
 */
public class HistoricalTemperatureResponse extends AbstractJSONResponse implements Serializable {

    private BasicTemperatureResponse normal;

    private BasicTemperatureResponse record;

    @JsonProperty("recordyear")
    private int recordYear;

    public BasicTemperatureResponse getNormal() {
        return normal;
    }

    public void setNormal(BasicTemperatureResponse normal) {
        this.normal = normal;
    }

    public BasicTemperatureResponse getRecord() {
        return record;
    }

    public void setRecord(BasicTemperatureResponse record) {
        this.record = record;
    }

    public int getRecordYear() {
        return recordYear;
    }

    public void setRecordYear(int recordYear) {
        this.recordYear = recordYear;
    }
}
