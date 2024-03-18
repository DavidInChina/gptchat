package A;

import B0.C0194k;
import B0.EnumC0195l;
import l0.AbstractC4325q;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: A.m0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0031m0 extends AbstractC4325q implements G0.t0 {

    /* renamed from: s0  reason: collision with root package name */
    public D.m f254s0;

    /* renamed from: t0  reason: collision with root package name */
    public D.h f255t0;

    @Override // G0.t0
    public final void A() {
        C0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Type inference failed for: r5v4, types: [D.k, java.lang.Object, D.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A0(AbstractC4825e abstractC4825e) {
        C0023i0 c0023i0;
        int i10;
        D.h hVar;
        C0031m0 c0031m0;
        if (abstractC4825e instanceof C0023i0) {
            c0023i0 = (C0023i0) abstractC4825e;
            int i11 = c0023i0.f220j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0023i0.f220j0 = i11 - Integer.MIN_VALUE;
                Object obj = c0023i0.f218h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0023i0.f220j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        hVar = c0023i0.f217Z;
                        c0031m0 = c0023i0.f216Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (this.f255t0 == null) {
                        ?? obj2 = new Object();
                        D.m mVar = this.f254s0;
                        c0023i0.f216Y = this;
                        c0023i0.f217Z = obj2;
                        c0023i0.f220j0 = 1;
                        if (mVar.b(obj2, c0023i0) == enumC5000a) {
                            return enumC5000a;
                        }
                        c0031m0 = this;
                        hVar = obj2;
                    }
                    return jf.y.f36177a;
                }
                c0031m0.f255t0 = hVar;
                return jf.y.f36177a;
            }
        }
        c0023i0 = new C0023i0(this, abstractC4825e);
        Object obj3 = c0023i0.f218h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0023i0.f220j0;
        if (i10 == 0) {
        }
        c0031m0.f255t0 = hVar;
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B0(AbstractC4825e abstractC4825e) {
        C0025j0 c0025j0;
        int i10;
        C0031m0 c0031m0;
        if (abstractC4825e instanceof C0025j0) {
            c0025j0 = (C0025j0) abstractC4825e;
            int i11 = c0025j0.f225i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0025j0.f225i0 = i11 - Integer.MIN_VALUE;
                Object obj = c0025j0.f223Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0025j0.f225i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c0031m0 = c0025j0.f222Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    D.h hVar = this.f255t0;
                    if (hVar != null) {
                        D.i iVar = new D.i(hVar);
                        D.m mVar = this.f254s0;
                        c0025j0.f222Y = this;
                        c0025j0.f225i0 = 1;
                        if (mVar.b(iVar, c0025j0) == enumC5000a) {
                            return enumC5000a;
                        }
                        c0031m0 = this;
                    }
                    return jf.y.f36177a;
                }
                c0031m0.f255t0 = null;
                return jf.y.f36177a;
            }
        }
        c0025j0 = new C0025j0(this, abstractC4825e);
        Object obj2 = c0025j0.f223Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0025j0.f225i0;
        if (i10 == 0) {
        }
        c0031m0.f255t0 = null;
        return jf.y.f36177a;
    }

    public final void C0() {
        D.h hVar = this.f255t0;
        if (hVar != null) {
            this.f254s0.c(new D.i(hVar));
            this.f255t0 = null;
        }
    }

    @Override // G0.t0
    public final void N() {
        A();
    }

    @Override // G0.t0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // G0.t0
    public final void h0() {
        A();
    }

    @Override // G0.t0
    public final void s(C0194k c0194k, EnumC0195l enumC0195l, long j6) {
        if (enumC0195l == EnumC0195l.f1657Z) {
            int i10 = c0194k.f1655d;
            if (B0.s.a(i10, 4)) {
                Ad.l.O0(p0(), null, null, new C0027k0(this, null), 3);
            } else if (B0.s.a(i10, 5)) {
                Ad.l.O0(p0(), null, null, new C0029l0(this, null), 3);
            }
        }
    }

    @Override // l0.AbstractC4325q
    public final void u0() {
        C0();
    }

    @Override // G0.t0
    public final /* synthetic */ void H() {
    }
}
