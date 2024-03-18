package android.gov.nist.javax.sip.message;

import c.AbstractC2258m;
import c.AbstractC2262q;
import c.AbstractC2268x;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface Content {
    Object getContent();

    AbstractC2258m getContentDispositionHeader();

    AbstractC2262q getContentTypeHeader();

    Iterator<AbstractC2268x> getExtensionHeaders();

    void setContent(Object obj);

    String toString();
}
