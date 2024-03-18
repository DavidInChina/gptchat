package android.gov.nist.javax.sdp.fields;

import a.AbstractC1882b;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;

/* loaded from: classes2.dex */
public class AttributeField extends SDPField implements AbstractC1882b {
    protected NameValue attribute;

    public AttributeField() {
        super(SDPFieldNames.ATTRIBUTE_FIELD);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        AttributeField attributeField = (AttributeField) super.clone();
        NameValue nameValue = this.attribute;
        if (nameValue != null) {
            attributeField.attribute = (NameValue) nameValue.clone();
        }
        return attributeField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        NameValue nameValue = this.attribute;
        String str = SDPFieldNames.ATTRIBUTE_FIELD;
        if (nameValue != null) {
            str = str + this.attribute.encode();
        }
        return a.g(str, Separators.NEWLINE);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof AttributeField)) {
            return false;
        }
        AttributeField attributeField = (AttributeField) obj;
        boolean equalsIgnoreCase = attributeField.getAttribute().getName().equalsIgnoreCase(getAttribute().getName());
        if (getAttribute().getValueAsObject() != null) {
            z10 = getAttribute().getValueAsObject().equals(attributeField.getAttribute().getValueAsObject());
        } else if (attributeField.getAttribute().getValueAsObject() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!equalsIgnoreCase || !z10) {
            return false;
        }
        return true;
    }

    public NameValue getAttribute() {
        return this.attribute;
    }

    public String getName() {
        String name;
        NameValue attribute = getAttribute();
        if (attribute == null || (name = attribute.getName()) == null) {
            return null;
        }
        return name;
    }

    public String getValue() {
        Object valueAsObject;
        NameValue attribute = getAttribute();
        if (attribute == null || (valueAsObject = attribute.getValueAsObject()) == null) {
            return null;
        }
        if (valueAsObject instanceof String) {
            return (String) valueAsObject;
        }
        return valueAsObject.toString();
    }

    public boolean hasValue() {
        NameValue attribute = getAttribute();
        if (attribute == null || attribute.getValueAsObject() == null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (getAttribute() != null) {
            return encode().hashCode();
        }
        throw new UnsupportedOperationException("Attribute is null cannot compute hashCode ");
    }

    public void setAttribute(NameValue nameValue) {
        this.attribute = nameValue;
        nameValue.setSeparator(":");
    }

    public void setName(String str) {
        if (str != null) {
            NameValue attribute = getAttribute();
            if (attribute == null) {
                attribute = new NameValue();
            }
            attribute.setName(str);
            setAttribute(attribute);
            return;
        }
        throw new Exception("The name is null");
    }

    public void setValue(String str) {
        if (str != null) {
            NameValue attribute = getAttribute();
            if (attribute == null) {
                attribute = new NameValue();
            }
            attribute.setValueAsObject(str);
            setAttribute(attribute);
            return;
        }
        throw new Exception("The value is null");
    }

    public void setValueAllowNull(String str) {
        NameValue attribute = getAttribute();
        if (attribute == null) {
            attribute = new NameValue();
        }
        attribute.setValueAsObject(str);
        setAttribute(attribute);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject
    public String toString() {
        return encode();
    }
}
