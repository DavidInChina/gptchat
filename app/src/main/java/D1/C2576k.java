package d1;

import Z.AbstractC1725n;
import jf.y;

/* renamed from: d1.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2576k extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2576k f27875Z = new C2576k(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2576k f27876h0 = new C2576k(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27877Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2576k(int i10) {
        super(2);
        this.f27877Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f27877Y) {
            case 0:
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                    return;
                }
                return;
            default:
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f27877Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
