package d;

import c.AbstractC2265u;
import c.AbstractC2268x;
import java.io.Serializable;
import java.util.ListIterator;

/* renamed from: d.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface AbstractC2560a extends Cloneable, Serializable {
    void addHeader(AbstractC2268x abstractC2268x);

    Object getContent();

    AbstractC2265u getExpires();

    AbstractC2268x getHeader(String str);

    ListIterator getHeaders(String str);

    byte[] getRawContent();

    void removeHeader(String str);

    void setHeader(AbstractC2268x abstractC2268x);
}
