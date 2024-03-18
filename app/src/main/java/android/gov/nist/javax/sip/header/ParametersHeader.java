package android.gov.nist.javax.sip.header;

import android.gov.nist.core.DuplicateNameValueList;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.NameValueList;
import android.gov.nist.javax.sip.address.GenericURI;
import c.AbstractC2236H;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class ParametersHeader extends SIPHeader implements AbstractC2236H, ParametersExt, Serializable {
    protected DuplicateNameValueList duplicates;
    protected NameValueList parameters;

    public ParametersHeader() {
        this.parameters = new NameValueList();
        this.duplicates = new DuplicateNameValueList();
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ParametersHeader parametersHeader = (ParametersHeader) super.clone();
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null) {
            parametersHeader.parameters = (NameValueList) nameValueList.clone();
        }
        return parametersHeader;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public abstract StringBuilder encodeBody(StringBuilder sb2);

    public final boolean equalParameters(AbstractC2236H abstractC2236H) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (this == abstractC2236H) {
            return true;
        }
        Iterator<String> parameterNames = getParameterNames();
        while (parameterNames.hasNext()) {
            String next = parameterNames.next();
            String parameter = getParameter(next);
            String parameter2 = abstractC2236H.getParameter(next);
            if (parameter == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parameter2 == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 ^ z13) {
                return false;
            }
            if (parameter != null && !parameter.equalsIgnoreCase(parameter2)) {
                return false;
            }
        }
        Iterator parameterNames2 = abstractC2236H.getParameterNames();
        while (parameterNames2.hasNext()) {
            String str = (String) parameterNames2.next();
            String parameter3 = abstractC2236H.getParameter(str);
            String parameter4 = getParameter(str);
            if (parameter3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parameter4 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 ^ z11) {
                return false;
            }
            if (parameter3 != null && !parameter3.equalsIgnoreCase(parameter4)) {
                return false;
            }
        }
        return true;
    }

    public String getMultiParameter(String str) {
        return this.duplicates.getParameter(str);
    }

    public Iterator<String> getMultiParameterNames() {
        return this.duplicates.getNames();
    }

    public Object getMultiParameterValue(String str) {
        return this.duplicates.getValue(str);
    }

    public DuplicateNameValueList getMultiParameters() {
        return this.duplicates;
    }

    public NameValue getNameValue(String str) {
        return this.parameters.getNameValue(str);
    }

    @Override // c.AbstractC2236H
    public String getParameter(String str) {
        return this.parameters.getParameter(str);
    }

    public boolean getParameterAsBoolean(String str) {
        Object parameterValue = getParameterValue(str);
        if (parameterValue == null) {
            return false;
        }
        if (parameterValue instanceof Boolean) {
            return ((Boolean) parameterValue).booleanValue();
        }
        if (!(parameterValue instanceof String)) {
            return false;
        }
        return Boolean.valueOf((String) parameterValue).booleanValue();
    }

    public float getParameterAsFloat(String str) {
        if (getParameterValue(str) != null) {
            try {
                if (getParameterValue(str) instanceof String) {
                    return Float.parseFloat(getParameter(str));
                }
                return ((Float) getParameterValue(str)).floatValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0f;
    }

    public int getParameterAsHexInt(String str) {
        if (getParameterValue(str) != null) {
            try {
                if (getParameterValue(str) instanceof String) {
                    return Integer.parseInt(getParameter(str), 16);
                }
                return ((Integer) getParameterValue(str)).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public int getParameterAsInt(String str) {
        if (getParameterValue(str) != null) {
            try {
                if (getParameterValue(str) instanceof String) {
                    return Integer.parseInt(getParameter(str));
                }
                return ((Integer) getParameterValue(str)).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public long getParameterAsLong(String str) {
        if (getParameterValue(str) != null) {
            try {
                if (getParameterValue(str) instanceof String) {
                    return Long.parseLong(getParameter(str));
                }
                return ((Long) getParameterValue(str)).longValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public GenericURI getParameterAsURI(String str) {
        Object parameterValue = getParameterValue(str);
        if (parameterValue instanceof GenericURI) {
            return (GenericURI) parameterValue;
        }
        try {
            return new GenericURI((String) parameterValue);
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // c.AbstractC2236H
    public Iterator<String> getParameterNames() {
        return this.parameters.getNames();
    }

    public Object getParameterValue(String str) {
        return this.parameters.getValue(str);
    }

    public NameValueList getParameters() {
        return this.parameters;
    }

    public boolean hasMultiParameter(String str) {
        return this.duplicates.hasNameValue(str);
    }

    public boolean hasMultiParameters() {
        DuplicateNameValueList duplicateNameValueList = this.duplicates;
        if (duplicateNameValueList != null && !duplicateNameValueList.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean hasParameter(String str) {
        return this.parameters.hasNameValue(str);
    }

    public boolean hasParameters() {
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null && !nameValueList.isEmpty()) {
            return true;
        }
        return false;
    }

    public void removeMultiParameter(String str) {
        this.duplicates.delete(str);
    }

    public void removeMultiParameters() {
        this.duplicates = new DuplicateNameValueList();
    }

    @Override // c.AbstractC2236H
    public void removeParameter(String str) {
        this.parameters.delete(str);
    }

    public void removeParameters() {
        this.parameters = new NameValueList();
    }

    public void setMultiParameter(String str, String str2) {
        NameValue nameValue = new NameValue();
        nameValue.setName(str);
        nameValue.setValue(str2);
        this.duplicates.set(nameValue);
    }

    public void setParameter(String str, String str2) {
        NameValue nameValue = this.parameters.getNameValue(str);
        if (nameValue != null) {
            nameValue.setValueAsObject(str2);
            return;
        }
        this.parameters.set(new NameValue(str, str2));
    }

    public void setParameters(NameValueList nameValueList) {
        this.parameters = nameValueList;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersExt
    public void setQuotedParameter(String str, String str2) {
        NameValue nameValue = this.parameters.getNameValue(str);
        if (nameValue != null) {
            nameValue.setValueAsObject(str2);
            nameValue.setQuotedValue();
            return;
        }
        NameValue nameValue2 = new NameValue(str, str2);
        nameValue2.setQuotedValue();
        this.parameters.set(nameValue2);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersExt
    public String getParameter(String str, boolean z10) {
        return this.parameters.getParameter(str, z10);
    }

    public ParametersHeader(String str) {
        super(str);
        this.parameters = new NameValueList();
        this.duplicates = new DuplicateNameValueList();
    }

    public void setMultiParameter(NameValue nameValue) {
        this.duplicates.set(nameValue);
    }

    public void setParameter(String str, int i10) {
        this.parameters.set(str, Integer.valueOf(i10));
    }

    public ParametersHeader(String str, boolean z10) {
        super(str);
        this.parameters = new NameValueList(z10);
        this.duplicates = new DuplicateNameValueList();
    }

    public void setParameter(String str, boolean z10) {
        this.parameters.set(str, Boolean.valueOf(z10));
    }

    public void setParameter(String str, float f6) {
        Float valueOf = Float.valueOf(f6);
        NameValue nameValue = this.parameters.getNameValue(str);
        if (nameValue != null) {
            nameValue.setValueAsObject(valueOf);
            return;
        }
        this.parameters.set(new NameValue(str, valueOf));
    }

    public void setParameter(String str, Object obj) {
        this.parameters.set(str, obj);
    }

    public void setParameter(NameValue nameValue) {
        this.parameters.set(nameValue);
    }
}
