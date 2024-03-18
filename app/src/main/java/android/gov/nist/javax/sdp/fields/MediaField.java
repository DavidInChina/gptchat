package android.gov.nist.javax.sdp.fields;

import a.AbstractC1885e;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import java.util.Vector;

/* loaded from: classes.dex */
public class MediaField extends SDPField implements AbstractC1885e {
    protected Vector formats = new Vector();
    protected String media;
    protected int nports;
    protected int port;
    protected String proto;

    public MediaField() {
        super(SDPFieldNames.MEDIA_FIELD);
    }

    private String encodeFormats() {
        StringBuilder sb2 = new StringBuilder(this.formats.size() * 3);
        for (int i10 = 0; i10 < this.formats.size(); i10++) {
            sb2.append(this.formats.elementAt(i10));
            if (i10 < this.formats.size() - 1) {
                sb2.append(Separators.SP);
            }
        }
        return sb2.toString();
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        MediaField mediaField = (MediaField) super.clone();
        Vector vector = this.formats;
        if (vector != null) {
            mediaField.formats = (Vector) vector.clone();
        }
        return mediaField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.media;
        String str2 = SDPFieldNames.MEDIA_FIELD;
        if (str != null) {
            str2 = str2 + this.media.toLowerCase() + Separators.SP + this.port;
        }
        if (this.nports > 1) {
            StringBuilder r10 = a.r(str2, Separators.SLASH);
            r10.append(this.nports);
            str2 = r10.toString();
        }
        if (this.proto != null) {
            StringBuilder r11 = a.r(str2, Separators.SP);
            r11.append(this.proto);
            str2 = r11.toString();
        }
        if (this.formats != null) {
            StringBuilder r12 = a.r(str2, Separators.SP);
            r12.append(encodeFormats());
            str2 = r12.toString();
        }
        return a.g(str2, Separators.NEWLINE);
    }

    public Vector getFormats() {
        return this.formats;
    }

    public String getMedia() {
        return this.media;
    }

    public Vector getMediaFormats(boolean z10) {
        if (!z10 && this.formats.size() == 0) {
            return null;
        }
        return this.formats;
    }

    public int getMediaPort() {
        return getPort();
    }

    @Override // a.AbstractC1885e
    public String getMediaType() {
        return getMedia();
    }

    public int getNports() {
        return this.nports;
    }

    public int getPort() {
        return this.port;
    }

    public int getPortCount() {
        return getNports();
    }

    public String getProto() {
        return this.proto;
    }

    public String getProtocol() {
        return getProto();
    }

    public void setFormats(Vector vector) {
        this.formats = vector;
    }

    public void setMedia(String str) {
        this.media = str;
    }

    public void setMediaFormats(Vector vector) {
        if (vector != null) {
            this.formats = vector;
            return;
        }
        throw new Exception("The mediaFormats is null");
    }

    public void setMediaPort(int i10) {
        if (i10 >= 0) {
            setPort(i10);
            return;
        }
        throw new Exception("The port is < 0");
    }

    public void setMediaType(String str) {
        if (str != null) {
            setMedia(str);
            return;
        }
        throw new Exception("The mediaType is null");
    }

    public void setNports(int i10) {
        this.nports = i10;
    }

    public void setPort(int i10) {
        this.port = i10;
    }

    public void setPortCount(int i10) {
        if (i10 >= 0) {
            setNports(i10);
            return;
        }
        throw new Exception("The port count is < 0");
    }

    public void setProto(String str) {
        this.proto = str;
    }

    public void setProtocol(String str) {
        if (str != null) {
            setProto(str);
            return;
        }
        throw new Exception("The protocol is null");
    }
}
