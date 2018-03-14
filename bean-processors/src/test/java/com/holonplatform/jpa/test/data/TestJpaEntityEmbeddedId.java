/*
 * Copyright 2016-2017 Axioma srl.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.holonplatform.jpa.test.data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;

public class TestJpaEntityEmbeddedId {

	@EmbeddedId
	private TestJpaEntityPk primaryKey;

	@Column(name = "text")
	private String value;

	public TestJpaEntityPk getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(TestJpaEntityPk primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
