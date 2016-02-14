/*
 * jtoggl - Java Wrapper for Toggl REST API https://www.toggl.com/public/api
 *
 * Copyright (C) 2011 by simas GmbH, Moosentli 7, 3235 Erlach, Switzerland
 * http://www.simas.ch
 *
 * Copyright 2016 Aleksandr Duplishchev https://github.com/d-ai
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.simas.jtoggl.util;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Simon Martinelli
 * @author Aleksandr Duplishchev
 */
public class DateUtil {
    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    public static ZonedDateTime convertStringToZonedDateTime(String dateTimeString) {
		if (dateTimeString == null)
			return null;
        return ZonedDateTime.parse(dateTimeString, FORMAT);
    }

    public static String convertZonedDateTimeToString(ZonedDateTime zonedDateTime) {
        return zonedDateTime.format(FORMAT);
    }
}
