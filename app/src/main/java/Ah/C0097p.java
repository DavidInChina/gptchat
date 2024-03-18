package Ah;

import java.net.URL;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: Ah.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0097p implements Enumeration {

    /* renamed from: Y  reason: collision with root package name */
    public URL f953Y;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        if (this.f953Y != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        URL url = this.f953Y;
        if (url != null) {
            this.f953Y = null;
            return url;
        }
        throw new NoSuchElementException();
    }
}
