package mb;

import E2.C0492y;
import Qg.r0;
import com.google.android.gms.internal.play_billing.N;
import jf.C3959i;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p2.e0;
import p2.g0;
import pf.AbstractC5163j;
import s2.AbstractC5530A;
import y2.C6504G;
import y2.d0;

/* renamed from: mb.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4601n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39075Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f39076Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4603p f39077h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4601n(C4603p c4603p, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39077h0 = c4603p;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4601n c4601n = new C4601n(this.f39077h0, abstractC4825e);
        c4601n.f39076Z = obj;
        return c4601n;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4601n) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a9 -> B:7:0x0013). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ng.F f6;
        Ng.F f10;
        long j6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39075Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    f6 = (Ng.F) this.f39076Z;
                    N.B0(obj);
                    f10 = f6;
                    if (!Ad.l.F0(f10)) {
                        C4603p c4603p = this.f39077h0;
                        long k10 = c4603p.f39085g.k();
                        C6504G c6504g = c4603p.f39085g;
                        c6504g.E();
                        if (c6504g.r()) {
                            d0 d0Var = c6504g.f50360W;
                            C0492y c0492y = d0Var.f50537b;
                            Object obj2 = c0492y.f4420a;
                            g0 g0Var = d0Var.f50536a;
                            e0 e0Var = c6504g.f50375n;
                            g0Var.i(obj2, e0Var);
                            j6 = AbstractC5530A.L(e0Var.b(c0492y.f4421b, c0492y.f4422c));
                        } else {
                            g0 m10 = c6504g.m();
                            if (m10.r()) {
                                j6 = -9223372036854775807L;
                            } else {
                                j6 = AbstractC5530A.L(m10.o(c6504g.i(), c6504g.f42062a, 0L).f42058s0);
                            }
                        }
                        r0 r0Var = c4603p.f39082d;
                        C3959i c3959i = new C3959i(new Long(k10), new Long(j6));
                        this.f39076Z = f10;
                        this.f39075Y = 1;
                        if (r0Var.c(c3959i, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        f6 = f10;
                        this.f39076Z = f6;
                        this.f39075Y = 2;
                        if (R4.b.p0(300L, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        f10 = f6;
                        if (!Ad.l.F0(f10)) {
                            return jf.y.f36177a;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f6 = (Ng.F) this.f39076Z;
                N.B0(obj);
                this.f39076Z = f6;
                this.f39075Y = 2;
                if (R4.b.p0(300L, this) == enumC5000a) {
                }
                f10 = f6;
                if (!Ad.l.F0(f10)) {
                }
            }
        } else {
            N.B0(obj);
            f10 = (Ng.F) this.f39076Z;
            if (!Ad.l.F0(f10)) {
            }
        }
    }
}
