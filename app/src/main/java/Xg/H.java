package xg;

import Mf.AbstractC1000i;
import Mf.a0;
import fg.Q;
import hg.C3430i;
import id.AbstractC3557B;
import kg.C4290b;

/* loaded from: classes2.dex */
public final class H extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f49975Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f49976Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(K k10, int i10) {
        super(1);
        this.f49975Y = i10;
        this.f49976Z = k10;
    }

    public final AbstractC1000i a(int i10) {
        int i11 = this.f49975Y;
        K k10 = this.f49976Z;
        switch (i11) {
            case 0:
                M3.I i12 = k10.f49979a;
                C4290b f12 = R4.b.f1(i12.f11537b, i10);
                Object obj = i12.f11536a;
                if (f12.f37495c) {
                    return ((m) obj).b(f12);
                }
                return R4.b.t0(((m) obj).f50011b, f12);
            default:
                M3.I i13 = k10.f49979a;
                C4290b f13 = R4.b.f1(i13.f11537b, i10);
                if (f13.f37495c) {
                    return null;
                }
                Mf.B b10 = ((m) i13.f11536a).f50011b;
                AbstractC3557B.c0("<this>", b10);
                AbstractC1000i t02 = R4.b.t0(b10, f13);
                if (!(t02 instanceof a0)) {
                    return null;
                }
                return (a0) t02;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f49975Y) {
            case 0:
                return a(((Number) obj).intValue());
            case 1:
                return a(((Number) obj).intValue());
            default:
                Q q10 = (Q) obj;
                AbstractC3557B.c0("it", q10);
                return P4.a.u0(q10, (C3430i) this.f49976Z.f49979a.f11539d);
        }
    }
}
