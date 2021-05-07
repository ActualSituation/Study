package org.hdcd.domain;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class CodeClass implements Serializable {

    @Serial
    private static final long serialVersionUID = 1632268421764813806L;

    private String classCode;
    private String className;
    private String useYn;
    private Date regDate;
    private Date updDate;

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }
}
