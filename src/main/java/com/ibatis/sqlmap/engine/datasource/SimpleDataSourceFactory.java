/*
 * Copyright 2004-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibatis.sqlmap.engine.datasource;

import com.ibatis.common.jdbc.SimpleDataSource;

import java.util.Map;

import javax.sql.DataSource;

/**
 * DataSourceFactory implementation for the iBATIS SimpleDataSource.
 */
public class SimpleDataSourceFactory implements DataSourceFactory {

  /** The data source. */
  private DataSource dataSource;

  public void initialize(Map map) {
    dataSource = new SimpleDataSource(map);
  }

  public DataSource getDataSource() {
    return dataSource;
  }

}
