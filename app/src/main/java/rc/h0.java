package rc;

import Qg.r0;
import Qg.s0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wc.C6161c;
import wd.K0;
import wd.p0;

/* loaded from: classes2.dex */
public final class h0 implements xd.j {

    /* renamed from: a  reason: collision with root package name */
    public final j0 f44882a;

    /* renamed from: b  reason: collision with root package name */
    public final nd.l f44883b;

    /* renamed from: c  reason: collision with root package name */
    public final C6161c f44884c;

    /* renamed from: d  reason: collision with root package name */
    public final r0 f44885d;

    /* renamed from: e  reason: collision with root package name */
    public final r0 f44886e;

    public h0(j0 j0Var, nd.l lVar, C6161c c6161c, ld.p pVar) {
        this.f44882a = j0Var;
        this.f44883b = lVar;
        this.f44884c = c6161c;
        r0 b10 = s0.b(0, 0, null, 7);
        this.f44885d = b10;
        this.f44886e = b10;
        Ad.l.O0(pVar, null, null, new f0(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        g0 g0Var;
        Object obj;
        int i10;
        Vc.r rVar;
        h0 h0Var;
        Vc.x xVar;
        Object obj2;
        if (abstractC4825e instanceof g0) {
            g0Var = (g0) abstractC4825e;
            int i11 = g0Var.f44878i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                g0Var.f44878i0 = i11 - Integer.MIN_VALUE;
                obj = g0Var.f44876Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = g0Var.f44878i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    rVar = (Vc.r) g0Var.f44875Y;
                                    com.google.android.gms.internal.play_billing.N.B0(obj);
                                    x8.W.W(Pc.e.a(), "Error fetching profile", rVar.f18561a, null, 4);
                                    return jf.y.f36177a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return jf.y.f36177a;
                        }
                        h0Var = (h0) g0Var.f44875Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        xVar = (Vc.x) obj;
                        if (!(xVar instanceof Vc.w)) {
                            j0 j0Var = h0Var.f44882a;
                            nb.d dVar = new nb.d(23, (K0) ((Vc.w) xVar).f18565a);
                            g0Var.f44875Y = null;
                            g0Var.f44878i0 = 3;
                            if (j0Var.b(dVar, g0Var) == enumC5000a) {
                                return enumC5000a;
                            }
                        } else if (xVar instanceof Vc.r) {
                            Vc.r rVar2 = (Vc.r) xVar;
                            r0 r0Var = h0Var.f44885d;
                            if (!(rVar2 instanceof Vc.w)) {
                                if (rVar2 instanceof Vc.q) {
                                    obj2 = p0.f48449a;
                                } else if (rVar2 instanceof Vc.r) {
                                    rVar2.getClass();
                                    obj2 = Vc.x.a(rVar2);
                                } else {
                                    throw new RuntimeException();
                                }
                                g0Var.f44875Y = rVar2;
                                g0Var.f44878i0 = 4;
                                if (r0Var.c(obj2, g0Var) == enumC5000a) {
                                    return enumC5000a;
                                }
                                rVar = rVar2;
                                x8.W.W(Pc.e.a(), "Error fetching profile", rVar.f18561a, null, 4);
                            } else {
                                ((Vc.w) rVar2).getClass();
                                throw new RuntimeException();
                            }
                        } else if (!(xVar instanceof Vc.q)) {
                            throw new RuntimeException();
                        }
                        return jf.y.f36177a;
                    }
                    h0Var = (h0) g0Var.f44875Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    g0Var.f44875Y = this;
                    g0Var.f44878i0 = 1;
                    obj = ((b9.o) this.f44883b).a(g0Var);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    h0Var = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    C6161c c6161c = h0Var.f44884c;
                    g0Var.f44875Y = h0Var;
                    g0Var.f44878i0 = 2;
                    obj = c6161c.a(g0Var);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    xVar = (Vc.x) obj;
                    if (!(xVar instanceof Vc.w)) {
                    }
                }
                return jf.y.f36177a;
            }
        }
        g0Var = new g0(this, abstractC4825e);
        obj = g0Var.f44876Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = g0Var.f44878i0;
        if (i10 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return jf.y.f36177a;
    }
}
