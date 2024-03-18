package A;

import q0.C5251c;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class O extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f97Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ P f98Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(P p10, int i10) {
        super(1);
        this.f97Y = i10;
        this.f98Z = p10;
    }

    public final void a(long j6) {
        int i10 = this.f97Y;
        P p10 = this.f98Z;
        switch (i10) {
            case 0:
                AbstractC6216a abstractC6216a = p10.f101B0;
                if (abstractC6216a != null) {
                    abstractC6216a.mo122invoke();
                    return;
                }
                return;
            case 1:
                AbstractC6216a abstractC6216a2 = p10.f100A0;
                if (abstractC6216a2 != null) {
                    abstractC6216a2.mo122invoke();
                    return;
                }
                return;
            default:
                if (p10.f193u0) {
                    p10.f195w0.mo122invoke();
                    return;
                }
                return;
        }
    }

    @Override // wf.k
    public final /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f97Y) {
            case 0:
                a(((C5251c) obj).f43623a);
                return yVar;
            case 1:
                a(((C5251c) obj).f43623a);
                return yVar;
            default:
                a(((C5251c) obj).f43623a);
                return yVar;
        }
    }
}
