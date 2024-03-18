package mh;

import A.B0;
import G0.AbstractC0579h;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: mh.M  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4668M extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39417Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4670O f39418Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f39419h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4668M(C4670O c4670o, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39418Z = c4670o;
        this.f39419h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4668M(this.f39418Z, this.f39419h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4668M) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39417Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C4670O c4670o = this.f39418Z;
            if (c4670o.f39423u0.l()) {
                c4670o.f39424v0.c();
                C4686p c4686p = c4670o.f39423u0;
                this.f39417Y = 1;
                if (c4686p.n(this) == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                C4686p c4686p2 = c4670o.f39423u0;
                Z0.b bVar = AbstractC0579h.A(c4670o).f24859w0;
                this.f39417Y = 2;
                c4686p2.getClass();
                long j6 = this.f39419h0;
                float b10 = Z0.p.b(j6);
                if (!Float.isInfinite(b10) && !Float.isNaN(b10)) {
                    float c10 = Z0.p.c(j6);
                    if (!Float.isInfinite(c10) && !Float.isNaN(c10)) {
                        C4674d g10 = c4686p2.g();
                        AbstractC3557B.Z(g10);
                        Object a5 = c4686p2.f39497q.a(B0.f14Y, new C4680j(g10, j6, bVar, c4686p2, null), this);
                        if (a5 != enumC5000a) {
                            a5 = yVar;
                        }
                        if (a5 == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                }
                throw new IllegalStateException(R.a.r("Invalid velocity = ", Z0.p.f(j6)).toString());
            }
        }
        return yVar;
    }
}
