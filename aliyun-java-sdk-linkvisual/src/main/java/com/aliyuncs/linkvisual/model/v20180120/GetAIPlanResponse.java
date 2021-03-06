/*
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
 */

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.GetAIPlanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAIPlanResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String planId;

		private String appId;

		private String planTemplateId;

		private Integer triggerEnum;

		private Integer intervalTiming;

		private Long preTiming;

		private String description;

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getPlanTemplateId() {
			return this.planTemplateId;
		}

		public void setPlanTemplateId(String planTemplateId) {
			this.planTemplateId = planTemplateId;
		}

		public Integer getTriggerEnum() {
			return this.triggerEnum;
		}

		public void setTriggerEnum(Integer triggerEnum) {
			this.triggerEnum = triggerEnum;
		}

		public Integer getIntervalTiming() {
			return this.intervalTiming;
		}

		public void setIntervalTiming(Integer intervalTiming) {
			this.intervalTiming = intervalTiming;
		}

		public Long getPreTiming() {
			return this.preTiming;
		}

		public void setPreTiming(Long preTiming) {
			this.preTiming = preTiming;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public GetAIPlanResponse getInstance(UnmarshallerContext context) {
		return	GetAIPlanResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
