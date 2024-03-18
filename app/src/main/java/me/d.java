package Me;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class d extends h {

    /* renamed from: m0  reason: collision with root package name */
    public static final d f12028m0 = new d(Ne.c.f12798l, 0, Ne.c.f12797k);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Ne.c cVar, long j6, Oe.g gVar) {
        super(cVar, j6, gVar);
        AbstractC3557B.c0("head", cVar);
        AbstractC3557B.c0("pool", gVar);
        if (!this.f12039l0) {
            this.f12039l0 = true;
        }
    }

    public final d V() {
        Ne.c k10 = k();
        Ne.c h10 = k10.h();
        Ne.c i10 = k10.i();
        if (i10 != null) {
            Ne.c cVar = h10;
            while (true) {
                Ne.c h11 = i10.h();
                cVar.m(h11);
                i10 = i10.i();
                if (i10 == null) {
                    break;
                }
                cVar = h11;
            }
        }
        return new d(h10, m(), this.f12033Y);
    }

    public final String toString() {
        return "ByteReadPacket[" + hashCode() + ']';
    }
}
