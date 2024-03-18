package U5;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class b implements R5.b {

    /* renamed from: Y  reason: collision with root package name */
    public final a f17499Y;

    /* renamed from: Z  reason: collision with root package name */
    public final R5.b f17500Z;

    public b(a aVar, R5.b bVar) {
        this.f17499Y = aVar;
        this.f17500Z = bVar;
    }

    @Override // R5.b
    public final String e(Object obj) {
        AbstractC3557B.c0("model", obj);
        Object k10 = this.f17499Y.k(obj);
        if (k10 == null) {
            return null;
        }
        return this.f17500Z.e(k10);
    }
}
