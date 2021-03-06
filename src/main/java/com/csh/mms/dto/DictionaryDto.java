package com.csh.mms.dto;

import java.sql.Timestamp;

/**
 * 
 * @ClassName  DictionaryDomain 
 * @Description 数据字典实体类
 * @author csh
 * @date  2020年10月31日 下午10:16:41 
 *
 */
public class DictionaryDto {
	
	private String id;
	private String parentId;
	private String name;
	private String code;
	private String codeName;
	private String codeValue;
	private String sequence;
	private String enableUse;
	private String enableDelete;
	private String creator;
	private Timestamp createTime;
	private String modifier;
	private String type;
	private Timestamp updateTime;
	private int pageNum = 1;
	private int pageSize = 10;
	
	
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	private String remark;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEnableUse() {
		return enableUse;
	}
	public void setEnableUse(String enableUse) {
		this.enableUse = enableUse;
	}
	public String getEnableDelete() {
		return enableDelete;
	}
	public void setEnableDelete(String enableDelete) {
		this.enableDelete = enableDelete;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getCodeValue() {
		return codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
