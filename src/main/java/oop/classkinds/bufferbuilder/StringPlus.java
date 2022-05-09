package oop.classkinds.bufferbuilder;

public class StringPlus {
    StringBuilder sb = null;

    StringPlus(){
        sb = new StringBuilder(32);
    }

    public StringPlus append(String str){
        sb.append(str);
        return this;
    }

    public StringPlus appendFormat(String format, Object... args){
        sb.append(String.format(format, args));
        return this;
    }
    
    public String toString(){
        return sb.toString();
    }

    public StringPlus line(){
        sb.append(System.lineSeparator());
        return this;
    }

    public StringPlus appendLine(String str){
        this.append(str);
        this.line();
        return this;
    }
}
