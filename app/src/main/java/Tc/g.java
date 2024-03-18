package Tc;

import Z.AbstractC1725n;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17061Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ f f17062Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f17063h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(f fVar, boolean z10, int i10) {
        super(2);
        this.f17061Y = i10;
        this.f17062Z = fVar;
        this.f17063h0 = z10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f17061Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("BaseScaffold");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                K8.d.f0(this.f17062Z, this.f17063h0, a5, abstractC1725n, 8, 4);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("DeprecatedBaseScaffold");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                K8.d.f0(this.f17062Z, this.f17063h0, a10, abstractC1725n, 8, 4);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f17061Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
