package Cd;

import aa.C1939b;
import ha.C3357J;
import id.AbstractC3557B;
import jf.C3959i;
import q0.C5251c;

/* loaded from: classes.dex */
public final class F extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2998Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ J f2999Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(J j6, int i10) {
        super(1);
        this.f2998Y = i10;
        this.f2999Z = j6;
    }

    public final void a(C3959i c3959i) {
        int i10 = this.f2998Y;
        J j6 = this.f2999Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("action", c3959i);
                Object obj = c3959i.f36156Z;
                j6.j(new C0332q((C1939b) c3959i.f36155Y, (ha.K) obj));
                j6.j(new C0334t(obj instanceof C3357J));
                return;
            default:
                AbstractC3557B.c0("action", c3959i);
                j6.j(new C0332q((C1939b) c3959i.f36155Y, (ha.K) c3959i.f36156Z));
                j6.j(new C0334t(false));
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f2998Y) {
            case 0:
                a((C3959i) obj);
                return yVar;
            case 1:
                long j6 = ((C5251c) obj).f43623a;
                this.f2999Z.j(C0337w.f3074a);
                return yVar;
            default:
                a((C3959i) obj);
                return yVar;
        }
    }
}
