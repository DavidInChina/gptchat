package android.gov.nist.javax.sip.message;

import c.AbstractC2262q;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface MultipartMimeContent {
    boolean add(Content content);

    void addContent(Content content);

    int getContentCount();

    AbstractC2262q getContentTypeHeader();

    Iterator<Content> getContents();

    String toString();
}
