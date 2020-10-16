/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthomesdt;

/**
 *
 * @author cristina
 */
public class Filter implements Cloneable {
	protected String filter,fileType;
        protected String size;
	protected String name, word;

	String setFilter() {
		return (word + ". Severity Type:" + filter + " and the disability type: " + size + " .The sensor type you need is: " + fileType);
	}
        
        String getF() {
		return (filter);
	}
        
        String getFileT() {
		return (fileType);
	}
        
        String getsize() {
		return (size);
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}
        
        public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
        
        public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
        
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
