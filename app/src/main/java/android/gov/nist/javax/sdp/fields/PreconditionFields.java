package android.gov.nist.javax.sdp.fields;

import a.C1887g;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.header.ParameterNames;
import java.io.Serializable;
import java.util.Vector;

/* loaded from: classes2.dex */
public class PreconditionFields implements Serializable {
    public static final int DIRECTION_NONE = 0;
    public static final int DIRECTION_RECV = 2;
    public static final int DIRECTION_SEND = 1;
    public static final int DIRECTION_SENDRECV = 3;
    public static final int PRECONDITION_QOS = 0;
    public static final int STATUS_E2E = 0;
    public static final int STATUS_LOCAL = 1;
    public static final int STATUS_REMOTE = 2;
    public static final int STRENGTH_FAILURE = 1;
    public static final int STRENGTH_MANDATORY = 4;
    public static final int STRENGTH_NONE = 2;
    public static final int STRENGTH_OPTIONAL = 3;
    public static final int STRENGTH_UNKNOWN = 0;
    protected Vector preconditionAttributes = new Vector();
    public static final String[] STRENGTH = {"unknown", "failure", "none", ParameterNames.OPTIONAL, "mandatory"};
    public static final String[] DIRECTION = {"none", "send", "recv", "sendrecv"};
    public static final String[] STATUS = {"e2e", "local", "remote"};
    public static final String[] PRECONDITION = {"qos"};

    public Vector getPreconditionConfirmStatus() {
        if (this.preconditionAttributes == null) {
            return null;
        }
        Vector vector = new Vector();
        for (int i10 = 0; i10 < this.preconditionAttributes.size(); i10++) {
            AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i10);
            if (attributeField.getAttribute().getName().equals("conf")) {
                vector.addElement(attributeField);
            }
        }
        if (vector.size() == 0) {
            return null;
        }
        return vector;
    }

    public Vector getPreconditionCurr(String str) {
        if (str != null) {
            if (this.preconditionAttributes == null) {
                return null;
            }
            Vector vector = new Vector();
            for (int i10 = 0; i10 < this.preconditionAttributes.size(); i10++) {
                AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i10);
                if (attributeField.getAttribute().getName().equals("curr") && attributeField.getValue().indexOf(str) != -1) {
                    vector.addElement(attributeField);
                }
            }
            if (vector.size() == 0) {
                return null;
            }
            return vector;
        }
        throw new Exception("The status-type is null");
    }

    public Vector getPreconditionDes(String str) {
        if (str != null) {
            if (this.preconditionAttributes == null) {
                return null;
            }
            Vector vector = new Vector();
            for (int i10 = 0; i10 < this.preconditionAttributes.size(); i10++) {
                AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i10);
                if (attributeField.getAttribute().getName().equals("des") && attributeField.getValue().indexOf(str) != -1) {
                    vector.addElement(attributeField);
                }
            }
            if (vector.size() == 0) {
                return null;
            }
            return vector;
        }
        throw new Exception("The status-type is null");
    }

    public int getPreconditionSize() {
        Vector vector = this.preconditionAttributes;
        if (vector != null) {
            return vector.size();
        }
        return -1;
    }

    public Vector getPreconditions() {
        return this.preconditionAttributes;
    }

    public void setPreconditionConfirmStatus(String str) {
        if (str != null && str.length() != 0) {
            if (this.preconditionAttributes != null) {
                try {
                    String[] split = str.split(Separators.SP);
                    setPreconditionConfirmStatus(split[1], split[2]);
                    return;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new C1887g("Error spliting the \"conf\" attribute into words", e10);
                }
            }
            throw new Exception("The Precondition Attributes is null");
        }
        throw new Exception("The Precondition \"conf\" attribute value is null");
    }

    public void setPreconditionCurr(String str) {
        if (str != null) {
            if (this.preconditionAttributes != null) {
                try {
                    String[] split = str.split(Separators.SP);
                    setPreconditionCurr(split[1], split[2]);
                    return;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new C1887g("Error spliting the \"curr\" attribute into words", e10);
                }
            }
            throw new Exception("The Precondition Attributes is null");
        }
        throw new Exception("The Precondition \"curr\" attribute value is null");
    }

    public void setPreconditionDes(String str) {
        if (str != null) {
            if (this.preconditionAttributes != null) {
                try {
                    String[] split = str.split(Separators.SP);
                    setPreconditionDes(split[1], split[2], split[3]);
                    return;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new C1887g("Error spliting the \"des\" attribute into words", e10);
                }
            }
            throw new Exception("The Precondition Attributes is null");
        }
        throw new Exception("The Precondition \"des\" attribute value is null");
    }

    public void setPreconditions(Vector vector) {
        if (vector != null) {
            this.preconditionAttributes = vector;
            return;
        }
        throw new Exception("Precondition attributes are null");
    }

    public void setPreconditionCurr(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                if (this.preconditionAttributes != null) {
                    int i10 = 0;
                    while (i10 < this.preconditionAttributes.size()) {
                        AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i10);
                        if (attributeField.getAttribute().getName().equals("curr") && attributeField.getValue().indexOf(str) != -1) {
                            if (attributeField.getValue().indexOf(str2) != -1) {
                                break;
                            }
                            attributeField.setValue("qos " + str + Separators.SP + str2);
                            this.preconditionAttributes.setElementAt(attributeField, i10);
                        }
                        i10++;
                    }
                    if (i10 != this.preconditionAttributes.size()) {
                        return;
                    }
                    NameValue nameValue = new NameValue("curr", a.k("qos ", str, Separators.SP, str2));
                    AttributeField attributeField2 = new AttributeField();
                    attributeField2.setAttribute(nameValue);
                    this.preconditionAttributes.add(attributeField2);
                    return;
                }
                throw new Exception("Precondition Attributes is null");
            }
            throw new Exception("The direction-tag is null");
        }
        throw new Exception("The status-type is null");
    }

    public void setPreconditionDes(String str, String str2, String str3) {
        if (str != null) {
            if (str2 == null) {
                throw new Exception("The status-type is null");
            }
            if (str3 != null) {
                if (this.preconditionAttributes != null) {
                    int i10 = 0;
                    while (i10 < this.preconditionAttributes.size()) {
                        AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i10);
                        if (attributeField.getAttribute().getName().equals("des") && attributeField.getValue().indexOf(str2) != -1) {
                            StringBuilder t10 = a.t("qos ", str, Separators.SP, str2, Separators.SP);
                            t10.append(str3);
                            attributeField.setValue(t10.toString());
                            this.preconditionAttributes.setElementAt(attributeField, i10);
                        }
                        i10++;
                    }
                    if (i10 != this.preconditionAttributes.size()) {
                        return;
                    }
                    StringBuilder t11 = a.t("qos ", str, Separators.SP, str2, Separators.SP);
                    t11.append(str3);
                    NameValue nameValue = new NameValue("des", t11.toString());
                    AttributeField attributeField2 = new AttributeField();
                    attributeField2.setAttribute(nameValue);
                    this.preconditionAttributes.add(attributeField2);
                    return;
                }
                throw new Exception("Precondition Attributes is null");
            }
            throw new Exception("The direction-tag is null");
        }
        throw new Exception("The strength-tag is null");
    }

    public void setPreconditionConfirmStatus(String str, String str2) {
        if (str != null && str2.length() != 0) {
            if (str2.length() != 0) {
                if (this.preconditionAttributes != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= this.preconditionAttributes.size()) {
                            break;
                        }
                        AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i10);
                        if (!attributeField.getAttribute().getName().equals("conf") || attributeField.getValue().indexOf(str) == -1) {
                            i10++;
                        } else if (attributeField.getValue().indexOf(str2) == -1) {
                            attributeField.setValue("qos " + str + Separators.SP + str2);
                            this.preconditionAttributes.setElementAt(attributeField, i10);
                        }
                    }
                    if (i10 != this.preconditionAttributes.size()) {
                        return;
                    }
                    NameValue nameValue = new NameValue("conf", a.k("qos ", str, Separators.SP, str2));
                    AttributeField attributeField2 = new AttributeField();
                    attributeField2.setAttribute(nameValue);
                    this.preconditionAttributes.add(attributeField2);
                    return;
                }
                throw new Exception("Precondition Attributes is null");
            }
            throw new Exception("The direction-tag is null");
        }
        throw new Exception("The status-type is null");
    }
}
