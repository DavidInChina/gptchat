package android.gov.nist.javax.sdp;

import a.AbstractC1881a;
import a.AbstractC1883c;
import a.AbstractC1884d;
import a.AbstractC1885e;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.gov.nist.javax.sdp.fields.AttributeField;
import android.gov.nist.javax.sdp.fields.BandwidthField;
import android.gov.nist.javax.sdp.fields.ConnectionField;
import android.gov.nist.javax.sdp.fields.InformationField;
import android.gov.nist.javax.sdp.fields.KeyField;
import android.gov.nist.javax.sdp.fields.MediaField;
import android.gov.nist.javax.sdp.fields.PreconditionFields;
import android.gov.nist.javax.sdp.fields.SDPField;
import java.io.Serializable;
import java.util.Vector;

/* loaded from: classes2.dex */
public class MediaDescriptionImpl implements Serializable, Cloneable {
    protected ConnectionField connectionField;
    protected InformationField informationField;
    protected KeyField keyField;
    protected MediaField mediaField;
    protected Vector bandwidthFields = new Vector();
    protected Vector attributeFields = new Vector();
    protected PreconditionFields preconditionFields = new PreconditionFields();

    public void addAttribute(AttributeField attributeField) {
        this.attributeFields.add(attributeField);
    }

    public void addBandwidthField(BandwidthField bandwidthField) {
        this.bandwidthFields.add(bandwidthField);
    }

    public void addDynamicPayloads(Vector vector, Vector vector2) {
        if (vector != null && vector2 != null) {
            if (!vector.isEmpty() && !vector2.isEmpty()) {
                if (vector.size() == vector2.size()) {
                    for (int i10 = 0; i10 < vector.size(); i10++) {
                        setAttribute((String) vector.elementAt(i10), (String) vector2.elementAt(i10));
                    }
                    return;
                }
                throw new Exception(" The vector sizes are unequal");
            }
            throw new Exception(" The vectors are empty");
        }
        throw new Exception(" The vectors are null");
    }

    public String encode() {
        StringBuilder sb2 = new StringBuilder();
        MediaField mediaField = this.mediaField;
        if (mediaField != null) {
            sb2.append(mediaField.encode());
        }
        InformationField informationField = this.informationField;
        if (informationField != null) {
            sb2.append(informationField.encode());
        }
        ConnectionField connectionField = this.connectionField;
        if (connectionField != null) {
            sb2.append(connectionField.encode());
        }
        if (this.bandwidthFields != null) {
            for (int i10 = 0; i10 < this.bandwidthFields.size(); i10++) {
                sb2.append(((SDPField) this.bandwidthFields.elementAt(i10)).encode());
            }
            PreconditionFields preconditionFields = this.preconditionFields;
            if (preconditionFields != null) {
                int preconditionSize = preconditionFields.getPreconditionSize();
                for (int i11 = 0; i11 < preconditionSize; i11++) {
                    sb2.append(((SDPField) this.preconditionFields.getPreconditions().elementAt(i11)).encode());
                }
            }
        }
        KeyField keyField = this.keyField;
        if (keyField != null) {
            sb2.append(keyField.encode());
        }
        if (this.attributeFields != null) {
            for (int i12 = 0; i12 < this.attributeFields.size(); i12++) {
                sb2.append(((SDPField) this.attributeFields.elementAt(i12)).encode());
            }
        }
        return sb2.toString();
    }

    public String getAttribute(String str) {
        if (str != null) {
            for (int i10 = 0; i10 < this.attributeFields.size(); i10++) {
                AttributeField attributeField = (AttributeField) this.attributeFields.elementAt(i10);
                if (str.equals(attributeField.getAttribute().getName())) {
                    return (String) attributeField.getAttribute().getValueAsObject();
                }
            }
            return null;
        }
        throw new NullPointerException("null arg!");
    }

    public Vector getAttributeFields() {
        return this.attributeFields;
    }

    public Vector getAttributes(boolean z10) {
        return this.attributeFields;
    }

    public int getBandwidth(String str) {
        if (str != null) {
            if (this.bandwidthFields == null) {
                return -1;
            }
            for (int i10 = 0; i10 < this.bandwidthFields.size(); i10++) {
                BandwidthField bandwidthField = (BandwidthField) this.bandwidthFields.elementAt(i10);
                String bwtype = bandwidthField.getBwtype();
                if (bwtype != null && bwtype.equals(str)) {
                    return bandwidthField.getBandwidth();
                }
            }
            return -1;
        }
        throw new NullPointerException("null parameter");
    }

    public Vector getBandwidths(boolean z10) {
        return this.bandwidthFields;
    }

    public AbstractC1881a getConnection() {
        return this.connectionField;
    }

    public ConnectionField getConnectionField() {
        return this.connectionField;
    }

    public String getDuplexity() {
        for (int i10 = 0; i10 < this.attributeFields.size(); i10++) {
            AttributeField attributeField = (AttributeField) this.attributeFields.elementAt(i10);
            if (attributeField.getAttribute().getName().equalsIgnoreCase("sendrecv") || attributeField.getAttribute().getName().equalsIgnoreCase("recvonly") || attributeField.getAttribute().getName().equalsIgnoreCase("sendonly") || attributeField.getAttribute().getName().equalsIgnoreCase("inactive")) {
                return attributeField.getAttribute().getName();
            }
        }
        return null;
    }

    public AbstractC1883c getInfo() {
        InformationField informationField = getInformationField();
        if (informationField == null) {
            return null;
        }
        return informationField;
    }

    public InformationField getInformationField() {
        return this.informationField;
    }

    public AbstractC1884d getKey() {
        KeyField keyField = this.keyField;
        if (keyField == null) {
            return null;
        }
        return keyField;
    }

    public KeyField getKeyField() {
        return this.keyField;
    }

    public AbstractC1885e getMedia() {
        return this.mediaField;
    }

    public MediaField getMediaField() {
        return this.mediaField;
    }

    public Vector getMimeParameters() {
        String attribute = getAttribute("rate");
        String attribute2 = getAttribute("ptime");
        String attribute3 = getAttribute("maxptime");
        String attribute4 = getAttribute("ftmp");
        Vector vector = new Vector();
        vector.addElement(attribute);
        vector.addElement(attribute2);
        vector.addElement(attribute3);
        vector.addElement(attribute4);
        return vector;
    }

    public Vector getMimeTypes() {
        String str;
        MediaField mediaField = (MediaField) getMedia();
        String mediaType = mediaField.getMediaType();
        String protocol = mediaField.getProtocol();
        Vector mediaFormats = mediaField.getMediaFormats(false);
        Vector vector = new Vector();
        for (int i10 = 0; i10 < mediaFormats.size(); i10++) {
            if (protocol.equals("RTP/AVP")) {
                if (getAttribute("rtpmap") != null) {
                    str = a.j(mediaType, Separators.SLASH, protocol);
                } else {
                    str = null;
                }
            } else {
                str = a.j(mediaType, Separators.SLASH, protocol);
            }
            vector.addElement(str);
        }
        return vector;
    }

    public Vector getPreconditionFields() {
        return this.preconditionFields.getPreconditions();
    }

    public boolean hasAttribute(String str) {
        for (int i10 = 0; i10 < this.attributeFields.size(); i10++) {
            if (((AttributeField) this.attributeFields.elementAt(i10)).getAttribute().getName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void removeAttribute(String str) {
        if (str != null) {
            int i10 = 0;
            while (i10 < this.attributeFields.size() && !((AttributeField) this.attributeFields.elementAt(i10)).getAttribute().getName().equals(str)) {
                i10++;
            }
            if (i10 < this.attributeFields.size()) {
                this.attributeFields.removeElementAt(i10);
                return;
            }
            return;
        }
        throw new NullPointerException("null arg!");
    }

    public void removeBandwidth(String str) {
        String bwtype;
        if (str != null) {
            int i10 = 0;
            while (i10 < this.bandwidthFields.size() && ((bwtype = ((BandwidthField) this.bandwidthFields.elementAt(i10)).getBwtype()) == null || !bwtype.equals(str))) {
                i10++;
            }
            if (i10 < this.bandwidthFields.size()) {
                this.bandwidthFields.removeElementAt(i10);
                return;
            }
            return;
        }
        throw new NullPointerException("null bandwidth type");
    }

    public void setAttribute(String str, String str2) {
        if (str != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.attributeFields.size()) {
                    break;
                }
                AttributeField attributeField = (AttributeField) this.attributeFields.elementAt(i10);
                if (attributeField.getAttribute().getName().equals(str)) {
                    attributeField.getAttribute().setValueAsObject(str2);
                    break;
                }
                i10++;
            }
            if (i10 == this.attributeFields.size()) {
                AttributeField attributeField2 = new AttributeField();
                attributeField2.setAttribute(new NameValue(str, str2));
                this.attributeFields.add(attributeField2);
                return;
            }
            return;
        }
        throw new Exception("The parameters are null");
    }

    public void setAttributeFields(Vector vector) {
        this.attributeFields = vector;
    }

    public void setAttributes(Vector vector) {
        this.attributeFields = vector;
    }

    public void setBandwidth(String str, int i10) {
        if (str != null) {
            int i11 = 0;
            while (true) {
                if (i11 < this.bandwidthFields.size()) {
                    BandwidthField bandwidthField = (BandwidthField) this.bandwidthFields.elementAt(i11);
                    String bwtype = bandwidthField.getBwtype();
                    if (bwtype != null && bwtype.equals(str)) {
                        bandwidthField.setBandwidth(i10);
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            if (i11 == this.bandwidthFields.size()) {
                BandwidthField bandwidthField2 = new BandwidthField();
                bandwidthField2.setType(str);
                bandwidthField2.setValue(i10);
                this.bandwidthFields.add(bandwidthField2);
                return;
            }
            return;
        }
        throw new Exception("The name is null");
    }

    public void setBandwidths(Vector vector) {
        if (vector != null) {
            this.bandwidthFields = vector;
            return;
        }
        throw new Exception("The vector bandwidths is null");
    }

    public void setConnection(AbstractC1881a abstractC1881a) {
        if (abstractC1881a != null) {
            if (abstractC1881a instanceof ConnectionField) {
                this.connectionField = (ConnectionField) abstractC1881a;
                return;
            }
            throw new Exception("bad implementation");
        }
        throw new Exception("The conn is null");
    }

    public void setConnectionField(ConnectionField connectionField) {
        this.connectionField = connectionField;
    }

    public void setDuplexity(String str) {
        if (str != null) {
            int i10 = 0;
            while (i10 < this.attributeFields.size()) {
                AttributeField attributeField = (AttributeField) this.attributeFields.elementAt(i10);
                if (!attributeField.getAttribute().getName().equalsIgnoreCase("sendrecv") && !attributeField.getAttribute().getName().equalsIgnoreCase("recvonly") && !attributeField.getAttribute().getName().equalsIgnoreCase("sendonly") && !attributeField.getAttribute().getName().equalsIgnoreCase("inactive")) {
                    i10++;
                } else {
                    attributeField.setAttribute(new NameValue(str, null));
                    return;
                }
            }
            if (i10 == this.attributeFields.size()) {
                AttributeField attributeField2 = new AttributeField();
                attributeField2.setAttribute(new NameValue(str, null));
                this.attributeFields.add(attributeField2);
                return;
            }
            return;
        }
        throw new NullPointerException("Null arg");
    }

    public void setInfo(AbstractC1883c abstractC1883c) {
        if (abstractC1883c != null) {
            if (abstractC1883c instanceof InformationField) {
                this.informationField = (InformationField) abstractC1883c;
                return;
            }
            throw new Exception("A informationField parameter is required");
        }
        throw new Exception("The info is null");
    }

    public void setInformationField(InformationField informationField) {
        this.informationField = informationField;
    }

    public void setKey(AbstractC1884d abstractC1884d) {
        if (abstractC1884d != null) {
            if (abstractC1884d instanceof KeyField) {
                setKeyField((KeyField) abstractC1884d);
                return;
            }
            throw new Exception("A keyField parameter is required");
        }
        throw new Exception("The key is null");
    }

    public void setKeyField(KeyField keyField) {
        this.keyField = keyField;
    }

    public void setMedia(AbstractC1885e abstractC1885e) {
        if (abstractC1885e != null) {
            if (abstractC1885e instanceof MediaField) {
                this.mediaField = (MediaField) abstractC1885e;
                return;
            }
            throw new Exception("A mediaField parameter is required");
        }
        throw new Exception("The media is null");
    }

    public void setMediaField(MediaField mediaField) {
        this.mediaField = mediaField;
    }

    public void setPreconditionFields(Vector vector) {
        this.preconditionFields.setPreconditions(vector);
    }

    public void setPreconditions(PreconditionFields preconditionFields) {
        this.preconditionFields = preconditionFields;
    }

    public String toString() {
        return encode();
    }
}
