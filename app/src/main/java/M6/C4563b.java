package m6;

import M3.H;
import f8.e;
import id.AbstractC3557B;
import t5.AbstractC5675a;
import t5.AbstractC5676b;
import t5.d;
import u5.g;
import x6.a2;

/* renamed from: m6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4563b implements AbstractC5675a {

    /* renamed from: i0  reason: collision with root package name */
    public static final byte[] f38957i0 = new byte[0];

    /* renamed from: Y  reason: collision with root package name */
    public final R5.b f38958Y;

    /* renamed from: Z  reason: collision with root package name */
    public final R5.b f38959Z;

    /* renamed from: h0  reason: collision with root package name */
    public final g f38960h0;

    public C4563b(U5.b bVar, e eVar, g gVar) {
        this.f38958Y = bVar;
        this.f38959Z = eVar;
        this.f38960h0 = gVar;
    }

    @Override // t5.AbstractC5675a
    public final boolean e(AbstractC5676b abstractC5676b, Object obj) {
        d dVar;
        boolean a5;
        AbstractC3557B.c0("writer", abstractC5676b);
        AbstractC3557B.c0("element", obj);
        byte[] r02 = H.r0(this.f38958Y, obj, this.f38960h0.l());
        if (r02 == null) {
            return false;
        }
        if (obj instanceof a2) {
            a2 a2Var = (a2) obj;
            byte[] r03 = H.r0(this.f38959Z, new n6.e(a2Var.f49248p.f49494d, a2Var.f49240h.f49171a), this.f38960h0.l());
            if (r03 == null) {
                r03 = f38957i0;
            }
            dVar = new d(r02, r03);
        } else {
            dVar = new d(r02);
        }
        synchronized (this) {
            a5 = abstractC5676b.a(dVar);
            if (a5 && (obj instanceof a2)) {
                this.f38960h0.k(r02);
            }
        }
        return a5;
    }
}
