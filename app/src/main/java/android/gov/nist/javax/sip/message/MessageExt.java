package android.gov.nist.javax.sip.message;

import c.AbstractC2254i;
import c.AbstractC2255j;
import c.AbstractC2258m;
import c.AbstractC2259n;
import c.AbstractC2260o;
import c.AbstractC2261p;
import c.AbstractC2262q;
import c.AbstractC2265u;
import c.AbstractC2267w;
import c.AbstractC2268x;
import c.d0;
import c.g0;
import d.AbstractC2560a;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public interface MessageExt extends AbstractC2560a {
    /* synthetic */ void addFirst(AbstractC2268x abstractC2268x);

    @Override // d.AbstractC2560a
    /* synthetic */ void addHeader(AbstractC2268x abstractC2268x);

    /* synthetic */ void addLast(AbstractC2268x abstractC2268x);

    /* synthetic */ Object clone();

    Object getApplicationData();

    AbstractC2254i getCSeqHeader();

    AbstractC2255j getCallIdHeader();

    @Override // d.AbstractC2560a
    /* synthetic */ Object getContent();

    /* synthetic */ AbstractC2258m getContentDisposition();

    /* synthetic */ AbstractC2259n getContentEncoding();

    /* synthetic */ AbstractC2260o getContentLanguage();

    /* synthetic */ AbstractC2261p getContentLength();

    AbstractC2261p getContentLengthHeader();

    AbstractC2262q getContentTypeHeader();

    @Override // d.AbstractC2560a
    /* synthetic */ AbstractC2265u getExpires();

    String getFirstLine();

    AbstractC2267w getFromHeader();

    @Override // d.AbstractC2560a
    /* synthetic */ AbstractC2268x getHeader(String str);

    /* synthetic */ ListIterator getHeaderNames();

    @Override // d.AbstractC2560a
    /* synthetic */ ListIterator getHeaders(String str);

    MultipartMimeContent getMultipartMimeContent();

    @Override // d.AbstractC2560a
    /* synthetic */ byte[] getRawContent();

    /* synthetic */ String getSIPVersion();

    d0 getToHeader();

    g0 getTopmostViaHeader();

    /* synthetic */ ListIterator getUnrecognizedHeaders();

    /* synthetic */ void removeContent();

    /* synthetic */ void removeFirst(String str);

    @Override // d.AbstractC2560a
    /* synthetic */ void removeHeader(String str);

    /* synthetic */ void removeLast(String str);

    void setApplicationData(Object obj);

    /* synthetic */ void setContent(Object obj, AbstractC2262q abstractC2262q);

    /* synthetic */ void setContentDisposition(AbstractC2258m abstractC2258m);

    /* synthetic */ void setContentEncoding(AbstractC2259n abstractC2259n);

    /* synthetic */ void setContentLanguage(AbstractC2260o abstractC2260o);

    /* synthetic */ void setContentLength(AbstractC2261p abstractC2261p);

    /* synthetic */ void setExpires(AbstractC2265u abstractC2265u);

    @Override // d.AbstractC2560a
    /* synthetic */ void setHeader(AbstractC2268x abstractC2268x);

    /* synthetic */ void setSIPVersion(String str);
}
