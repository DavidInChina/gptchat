package v2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class D implements AbstractC5969h {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5969h f47041a;

    /* renamed from: b  reason: collision with root package name */
    public long f47042b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f47043c = Uri.EMPTY;

    /* renamed from: d  reason: collision with root package name */
    public Map f47044d = Collections.emptyMap();

    public D(AbstractC5969h abstractC5969h) {
        abstractC5969h.getClass();
        this.f47041a = abstractC5969h;
    }

    @Override // v2.AbstractC5969h
    public final long a(l lVar) {
        this.f47043c = lVar.f47095a;
        this.f47044d = Collections.emptyMap();
        AbstractC5969h abstractC5969h = this.f47041a;
        long a5 = abstractC5969h.a(lVar);
        Uri uri = abstractC5969h.getUri();
        uri.getClass();
        this.f47043c = uri;
        this.f47044d = abstractC5969h.j();
        return a5;
    }

    @Override // v2.AbstractC5969h
    public final void close() {
        this.f47041a.close();
    }

    @Override // v2.AbstractC5969h
    public final void g(F f6) {
        f6.getClass();
        this.f47041a.g(f6);
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        return this.f47041a.getUri();
    }

    @Override // v2.AbstractC5969h
    public final Map j() {
        return this.f47041a.j();
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f47041a.read(bArr, i10, i11);
        if (read != -1) {
            this.f47042b += read;
        }
        return read;
    }
}
