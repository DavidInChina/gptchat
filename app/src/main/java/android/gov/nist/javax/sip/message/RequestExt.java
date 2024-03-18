package android.gov.nist.javax.sip.message;

import b.AbstractC2096f;
import c.AbstractC2258m;
import c.AbstractC2259n;
import c.AbstractC2260o;
import c.AbstractC2261p;
import c.AbstractC2262q;
import c.AbstractC2265u;
import c.AbstractC2268x;
import d.AbstractC2561b;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public interface RequestExt extends AbstractC2561b, MessageExt {
    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void addFirst(AbstractC2268x abstractC2268x);

    @Override // d.AbstractC2560a
    /* synthetic */ void addHeader(AbstractC2268x abstractC2268x);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void addLast(AbstractC2268x abstractC2268x);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ Object clone();

    @Override // d.AbstractC2560a
    /* synthetic */ Object getContent();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ AbstractC2258m getContentDisposition();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ AbstractC2259n getContentEncoding();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ AbstractC2260o getContentLanguage();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ AbstractC2261p getContentLength();

    @Override // d.AbstractC2560a
    /* synthetic */ AbstractC2265u getExpires();

    @Override // d.AbstractC2560a
    /* synthetic */ AbstractC2268x getHeader(String str);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ ListIterator getHeaderNames();

    @Override // d.AbstractC2560a
    /* synthetic */ ListIterator getHeaders(String str);

    @Override // d.AbstractC2561b
    /* synthetic */ String getMethod();

    @Override // d.AbstractC2560a
    /* synthetic */ byte[] getRawContent();

    @Override // d.AbstractC2561b
    /* synthetic */ AbstractC2096f getRequestURI();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ String getSIPVersion();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ ListIterator getUnrecognizedHeaders();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void removeContent();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void removeFirst(String str);

    @Override // d.AbstractC2560a
    /* synthetic */ void removeHeader(String str);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void removeLast(String str);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setContent(Object obj, AbstractC2262q abstractC2262q);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setContentDisposition(AbstractC2258m abstractC2258m);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setContentEncoding(AbstractC2259n abstractC2259n);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setContentLanguage(AbstractC2260o abstractC2260o);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setContentLength(AbstractC2261p abstractC2261p);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setExpires(AbstractC2265u abstractC2265u);

    @Override // d.AbstractC2560a
    /* synthetic */ void setHeader(AbstractC2268x abstractC2268x);

    /* synthetic */ void setMethod(String str);

    /* synthetic */ void setRequestURI(AbstractC2096f abstractC2096f);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setSIPVersion(String str);
}
