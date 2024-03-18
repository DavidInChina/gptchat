package mb;

import android.net.Uri;
import id.AbstractC3557B;
import java.util.Collections;
import java.util.Map;
import v2.AbstractC5969h;

/* renamed from: mb.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4588a implements AbstractC5969h {

    /* renamed from: a  reason: collision with root package name */
    public final w2.e f39051a;

    public C4588a(w2.e eVar) {
        this.f39051a = eVar;
    }

    @Override // v2.AbstractC5969h
    public final long a(v2.l lVar) {
        AbstractC3557B.c0("dataSpec", lVar);
        v2.k a5 = lVar.a();
        a5.f47092i = lVar.f47103i & 4;
        return this.f39051a.a(a5.a());
    }

    @Override // v2.AbstractC5969h
    public final void close() {
        this.f39051a.close();
    }

    @Override // v2.AbstractC5969h
    public final void g(v2.F f6) {
        AbstractC3557B.c0("transferListener", f6);
        this.f39051a.g(f6);
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        return this.f39051a.f47671i;
    }

    @Override // v2.AbstractC5969h
    public final Map j() {
        return Collections.emptyMap();
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        AbstractC3557B.c0("buffer", bArr);
        return this.f39051a.read(bArr, i10, i11);
    }
}
