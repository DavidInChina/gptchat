package E2;

import h.C3276b;
import p2.C5072z;
import s2.AbstractC5530A;
import v2.AbstractC5968g;

/* loaded from: classes.dex */
public final class P implements AbstractC0491x {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5968g f4215a;

    /* renamed from: b  reason: collision with root package name */
    public final C3276b f4216b;

    /* renamed from: c  reason: collision with root package name */
    public B2.i f4217c;

    /* renamed from: d  reason: collision with root package name */
    public R4.a f4218d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4219e = 1048576;

    /* JADX WARN: Type inference failed for: r1v1, types: [R4.a, java.lang.Object] */
    public P(AbstractC5968g abstractC5968g, L2.t tVar) {
        C3276b c3276b = new C3276b(13, tVar);
        B2.i iVar = new B2.i();
        ?? obj = new Object();
        this.f4215a = abstractC5968g;
        this.f4216b = c3276b;
        this.f4217c = iVar;
        this.f4218d = obj;
    }

    @Override // E2.AbstractC0491x
    public final AbstractC0491x a(B2.i iVar) {
        if (iVar != null) {
            this.f4217c = iVar;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // E2.AbstractC0491x
    public final AbstractC0469a b(p2.H h10) {
        B2.q qVar;
        h10.f41808Z.getClass();
        AbstractC5968g abstractC5968g = this.f4215a;
        C3276b c3276b = this.f4216b;
        B2.i iVar = this.f4217c;
        iVar.getClass();
        h10.f41808Z.getClass();
        C5072z c5072z = h10.f41808Z.f41762h0;
        if (c5072z != null && AbstractC5530A.f45131a >= 18) {
            synchronized (iVar.f1804a) {
                try {
                    if (!AbstractC5530A.a(c5072z, iVar.f1805b)) {
                        iVar.f1805b = c5072z;
                        iVar.f1806c = B2.i.a(c5072z);
                    }
                    qVar = iVar.f1806c;
                    qVar.getClass();
                } finally {
                }
            }
        } else {
            qVar = B2.q.f1817c;
        }
        return new Q(h10, abstractC5968g, c3276b, qVar, this.f4218d, this.f4219e);
    }

    @Override // E2.AbstractC0491x
    public final AbstractC0491x c(R4.a aVar) {
        if (aVar != null) {
            this.f4218d = aVar;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
