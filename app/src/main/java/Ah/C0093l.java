package Ah;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.util.Arrays;

/* renamed from: Ah.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0093l extends URLStreamHandler {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f945a;

    public C0093l(byte[] bArr) {
        this.f945a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0093l.class != obj.getClass()) {
            return false;
        }
        if (Arrays.equals(this.f945a, ((C0093l) obj).f945a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f945a) + (C0093l.class.hashCode() * 31);
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url) {
        return new C0092k(url, new ByteArrayInputStream(this.f945a));
    }
}
