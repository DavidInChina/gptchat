package android.gov.nist.javax.sip.header;

import b.AbstractC2096f;

/* loaded from: classes.dex */
public interface SipRequestLine {
    String getMethod();

    String getSipVersion();

    AbstractC2096f getUri();

    String getVersionMajor();

    String getVersionMinor();

    void setMethod(String str);

    void setSipVersion(String str);

    void setUri(AbstractC2096f abstractC2096f);
}
