package android.gov.nist.core;

import java.util.Map;

/* loaded from: classes.dex */
public class NameValue extends GenericObject implements Map.Entry<String, String> {
    private static final long serialVersionUID = -1857729012596437950L;
    protected final boolean isFlagParameter;
    protected boolean isQuotedString;
    private String name;
    private String quotes;
    private String separator;
    private Object value;

    public NameValue() {
        this.name = null;
        this.value = "";
        this.separator = Separators.EQUALS;
        this.quotes = "";
        this.isFlagParameter = false;
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        NameValue nameValue = (NameValue) super.clone();
        Object obj = this.value;
        if (obj != null) {
            nameValue.value = GenericObject.makeClone(obj);
        }
        return nameValue;
    }

    @Override // android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        String str;
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        NameValue nameValue = (NameValue) obj;
        if (this == nameValue) {
            return true;
        }
        String str2 = this.name;
        if ((str2 == null && nameValue.name != null) || (str2 != null && nameValue.name == null)) {
            return false;
        }
        if (str2 != null && (str = nameValue.name) != null && str2.compareToIgnoreCase(str) != 0) {
            return false;
        }
        Object obj2 = this.value;
        if ((obj2 != null && nameValue.value == null) || (obj2 == null && nameValue.value != null)) {
            return false;
        }
        Object obj3 = nameValue.value;
        if (obj2 == obj3) {
            return true;
        }
        if (obj2 instanceof String) {
            if (this.isQuotedString) {
                return obj2.equals(obj3);
            }
            if (((String) obj2).compareToIgnoreCase((String) obj3) != 0) {
                return false;
            }
            return true;
        }
        return obj2.equals(obj3);
    }

    public String getName() {
        return this.name;
    }

    public Object getValueAsObject() {
        return getValueAsObject(true);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return encode().toLowerCase().hashCode();
    }

    public boolean isValueQuoted() {
        return this.isQuotedString;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setQuotedValue() {
        this.isQuotedString = true;
        this.quotes = Separators.DOUBLE_QUOTE;
    }

    public void setSeparator(String str) {
        this.separator = str;
    }

    public void setValueAsObject(Object obj) {
        this.value = obj;
    }

    @Override // android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        Object obj;
        Object obj2;
        String str = this.name;
        if (str == null || (obj2 = this.value) == null || this.isFlagParameter) {
            if (str == null && (obj = this.value) != null) {
                if (GenericObject.isMySubclass(obj.getClass())) {
                    ((GenericObject) this.value).encode(sb2);
                    return sb2;
                } else if (GenericObjectList.isMySubclass(this.value.getClass())) {
                    sb2.append(((GenericObjectList) this.value).encode());
                    return sb2;
                } else {
                    sb2.append(this.quotes);
                    sb2.append(this.value.toString());
                    sb2.append(this.quotes);
                    return sb2;
                }
            }
            if (str != null && (this.value == null || this.isFlagParameter)) {
                sb2.append(str);
            }
            return sb2;
        } else if (GenericObject.isMySubclass(obj2.getClass())) {
            sb2.append(this.name);
            sb2.append(this.separator);
            sb2.append(this.quotes);
            ((GenericObject) this.value).encode(sb2);
            sb2.append(this.quotes);
            return sb2;
        } else if (GenericObjectList.isMySubclass(this.value.getClass())) {
            sb2.append(this.name);
            sb2.append(this.separator);
            sb2.append(((GenericObjectList) this.value).encode());
            return sb2;
        } else if (this.value.toString().length() == 0) {
            if (this.isQuotedString) {
                sb2.append(this.name);
                sb2.append(this.separator);
                sb2.append(this.quotes);
                sb2.append(this.quotes);
                return sb2;
            }
            sb2.append(this.name);
            sb2.append(this.separator);
            return sb2;
        } else {
            sb2.append(this.name);
            sb2.append(this.separator);
            sb2.append(this.quotes);
            sb2.append(this.value.toString());
            sb2.append(this.quotes);
            return sb2;
        }
    }

    @Override // java.util.Map.Entry
    public String getKey() {
        return this.name;
    }

    @Override // java.util.Map.Entry
    public String getValue() {
        Object obj = this.value;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public Object getValueAsObject(boolean z10) {
        if (this.isFlagParameter) {
            return "";
        }
        if (!z10 && this.isQuotedString) {
            return this.quotes + this.value.toString() + this.quotes;
        }
        return this.value;
    }

    public String setValue(String str) {
        String str2 = this.value == null ? null : str;
        this.value = str;
        return str2;
    }

    public NameValue(String str, Object obj, boolean z10) {
        this.name = str;
        this.value = obj;
        this.separator = Separators.EQUALS;
        this.quotes = "";
        this.isFlagParameter = z10;
    }

    public NameValue(String str, Object obj) {
        this(str, obj, false);
    }
}
