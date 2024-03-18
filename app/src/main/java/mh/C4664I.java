package mh;

import A.B0;
import E0.j0;
import id.AbstractC3557B;
import jh.L1;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5251c;

/* renamed from: mh.I  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4664I extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39408Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4670O f39409Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f39410h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4664I(C4670O c4670o, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39409Z = c4670o;
        this.f39410h0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4664I(this.f39409Z, this.f39410h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4664I) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
        if (r2 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
        if (r2 == r1) goto L29;
     */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C4674d g10;
        boolean z10;
        C4671a d10;
        C4672b c4672b;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39408Y;
        Object obj3 = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C4686p c4686p = this.f39409Z.f39423u0;
            this.f39408Y = 1;
            C4671a d11 = c4686p.d();
            if (d11 != null && (g10 = c4686p.g()) != null) {
                r rVar = c4686p.j().f39506d;
                AbstractC3557B.c0("range", rVar);
                long j6 = d11.f39433a;
                long b10 = L1.m(j6, rVar).b();
                float max = Math.max(j0.a(b10), j0.b(b10));
                float a5 = j0.a(j6);
                float f6 = g10.f39438b;
                long a10 = androidx.compose.ui.layout.a.a(a5 * f6, j0.b(j6) * f6);
                if (max - Math.max(j0.a(a10), j0.b(a10)) < 0.01f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = true ^ z10;
                C4674d g11 = c4686p.g();
                if (g11 != null && (d10 = c4686p.d()) != null) {
                    float f10 = g11.f39438b;
                    long j10 = d10.f39433a;
                    C4672b c4672b2 = new C4672b(j10, f10);
                    if (z11) {
                        c4672b = L1.m(j10, c4686p.j().f39506d);
                    } else {
                        c4672b = L1.n(j10, c4686p.j().f39506d);
                    }
                    long j11 = C5251c.f43619b;
                    long j12 = g11.f39437a;
                    long j13 = this.f39410h0;
                    obj2 = c4686p.f39497q.a(B0.f15Z, new C4684n(c4672b2, c4672b, g11, c4686p.b(c4686p.m(j12, j13, j11, c4672b2, c4672b), c4672b), c4686p, j13, null), this);
                }
                obj2 = obj3;
            }
            obj2 = obj3;
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj3;
    }
}
