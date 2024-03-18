package android.gov.nist.javax.sdp.fields;

import R.a;
import a.AbstractC1893m;
import android.gov.nist.core.Separators;
import java.net.URL;

/* loaded from: classes2.dex */
public class URIField extends SDPField implements AbstractC1893m {
    private static final long serialVersionUID = -4322063343955734258L;
    protected URL url;
    protected String urlString;

    public URIField() {
        super(SDPFieldNames.URI_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        if (this.urlString != null) {
            return a.t(new StringBuilder(SDPFieldNames.URI_FIELD), this.urlString, Separators.NEWLINE);
        }
        if (this.url != null) {
            return SDPFieldNames.URI_FIELD + this.url.toString() + Separators.NEWLINE;
        }
        return "";
    }

    public URL get() {
        URL url = this.url;
        if (url != null) {
            return url;
        }
        try {
            URL url2 = new URL(this.urlString);
            this.url = url2;
            return url2;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getURI() {
        return this.urlString;
    }

    public void set(URL url) {
        this.url = url;
        this.urlString = null;
    }

    public void setURI(String str) {
        this.urlString = str;
        this.url = null;
    }
}
