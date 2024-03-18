package android.gov.nist.javax.sip.message;

import android.gov.nist.core.Separators;
import c.AbstractC2258m;
import c.AbstractC2262q;
import c.AbstractC2268x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ContentImpl implements Content {
    private Object content;
    private AbstractC2258m contentDispositionHeader;
    private AbstractC2262q contentTypeHeader;
    private List<AbstractC2268x> extensionHeaders = new ArrayList();

    public ContentImpl(String str) {
        this.content = str;
    }

    public void addExtensionHeader(AbstractC2268x abstractC2268x) {
        this.extensionHeaders.add(abstractC2268x);
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public Object getContent() {
        return this.content;
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public AbstractC2258m getContentDispositionHeader() {
        return this.contentDispositionHeader;
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public AbstractC2262q getContentTypeHeader() {
        return this.contentTypeHeader;
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public Iterator<AbstractC2268x> getExtensionHeaders() {
        return this.extensionHeaders.iterator();
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public void setContent(Object obj) {
        this.content = obj;
    }

    public void setContentDispositionHeader(AbstractC2258m abstractC2258m) {
        this.contentDispositionHeader = abstractC2258m;
    }

    public void setContentTypeHeader(AbstractC2262q abstractC2262q) {
        this.contentTypeHeader = abstractC2262q;
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        AbstractC2262q abstractC2262q = this.contentTypeHeader;
        if (abstractC2262q != null) {
            sb2.append(abstractC2262q.toString());
        }
        AbstractC2258m abstractC2258m = this.contentDispositionHeader;
        if (abstractC2258m != null) {
            sb2.append(abstractC2258m.toString());
        }
        for (AbstractC2268x abstractC2268x : this.extensionHeaders) {
            sb2.append(abstractC2268x);
        }
        sb2.append(Separators.NEWLINE);
        sb2.append(this.content.toString());
        return sb2.toString();
    }
}
