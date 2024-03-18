package f9;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import ld.C4428a;
import nd.C4812a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* renamed from: f9.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2950b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC2949a f29769Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f29770Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f29771h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C2954f f29772i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ ld.p f29773j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2950b(C2954f c2954f, ld.p pVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29772i0 = c2954f;
        this.f29773j0 = pVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C2950b c2950b = new C2950b(this.f29772i0, this.f29773j0, abstractC4825e);
        c2950b.f29771h0 = obj;
        return c2950b;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2950b) create((C4812a) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [k5.F, java.lang.Object] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        AbstractC2949a abstractC2949a;
        C4812a c4812a;
        AbstractC2949a abstractC2949a2;
        String str;
        C4812a c4812a2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29770Z;
        C2954f c2954f = this.f29772i0;
        if (i10 != 0) {
            if (i10 == 1) {
                abstractC2949a2 = this.f29769Y;
                c4812a = (C4812a) this.f29771h0;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            c4812a = (C4812a) this.f29771h0;
            abstractC2949a = (AbstractC2949a) c2954f.f29786d.f14881Y.getValue();
            if (abstractC2949a != null && (c4812a2 = ((C2962n) abstractC2949a).f29823a) != null) {
                str = c4812a2.f40276c;
            } else {
                str = null;
            }
            if (!AbstractC3557B.K(str, c4812a.f40276c)) {
                if (abstractC2949a != null) {
                    this.f29771h0 = c4812a;
                    this.f29769Y = abstractC2949a;
                    this.f29770Z = 1;
                    if (C2954f.a(c2954f, abstractC2949a, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    abstractC2949a2 = abstractC2949a;
                }
                C4812a c4812a3 = c4812a;
                W.M(c2954f.f29784b, "Creating new AccountUserComponent for " + c4812a3, null, 6);
                C4428a c4428a = new C4428a(this.f29773j0);
                C2960l c2960l = c2954f.f29783a;
                c2960l.getClass();
                c4812a3.getClass();
                C2962n c2962n = new C2962n(c2960l.f29797a, c2960l.f29798b, new Object(), new Ii.q(4), c4812a3, c4428a);
                Bi.c.P(abstractC2949a, c2962n);
                c2954f.f29785c.setValue(c2962n);
            }
            return jf.y.f36177a;
        }
        abstractC2949a = abstractC2949a2;
        C4812a c4812a32 = c4812a;
        W.M(c2954f.f29784b, "Creating new AccountUserComponent for " + c4812a32, null, 6);
        C4428a c4428a2 = new C4428a(this.f29773j0);
        C2960l c2960l2 = c2954f.f29783a;
        c2960l2.getClass();
        c4812a32.getClass();
        C2962n c2962n2 = new C2962n(c2960l2.f29797a, c2960l2.f29798b, new Object(), new Ii.q(4), c4812a32, c4428a2);
        Bi.c.P(abstractC2949a, c2962n2);
        c2954f.f29785c.setValue(c2962n2);
        return jf.y.f36177a;
    }
}
