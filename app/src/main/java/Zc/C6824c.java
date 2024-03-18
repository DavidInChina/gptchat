package zc;

import Z8.AbstractC1809m0;
import Z8.Y0;
import aa.C1939b;
import ca.EnumC2323o;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* renamed from: zc.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6824c extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f51892Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51893Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6824c(Q q10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51893Z = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6824c c6824c = new C6824c(this.f51893Z, abstractC4825e);
        c6824c.f51892Y = obj;
        return c6824c;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C6824c) create((C1939b) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        C1939b c1939b = (C1939b) this.f51892Y;
        Pc.c a5 = Pc.e.a();
        EnumC2323o enumC2323o = c1939b.f24024d;
        W.F(a5, "find action tool: " + enumC2323o + " => " + c1939b, null, 6);
        nb.d dVar = new nb.d(26, c1939b);
        Q q10 = this.f51893Z;
        q10.l(dVar);
        if (c1939b.f24024d == EnumC2323o.f26406Y) {
            AbstractC1809m0.a().b(Y0.f23293f, kf.w.f37484Y);
            q10.l(C6823b.f51888Z);
        } else {
            q10.l(C6823b.f51889h0);
        }
        return jf.y.f36177a;
    }
}
