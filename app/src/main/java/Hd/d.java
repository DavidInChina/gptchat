package Hd;

import Ng.F;
import W.C1550f3;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class d extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7635Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F f7636Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1550f3 f7637h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(F f6, C1550f3 c1550f3, int i10) {
        super(0);
        this.f7635Y = i10;
        this.f7636Z = f6;
        this.f7637h0 = c1550f3;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        F f6 = this.f7636Z;
        int i10 = this.f7635Y;
        C1550f3 c1550f3 = this.f7637h0;
        switch (i10) {
            case 0:
                Ad.l.O0(f6, null, null, new c(c1550f3, null), 3);
                return;
            case 1:
                Ad.l.O0(f6, null, null, new e(c1550f3, null), 3);
                return;
            case 2:
                Ad.l.O0(f6, null, null, new g(c1550f3, null), 3);
                return;
            default:
                Ad.l.O0(f6, null, null, new h(c1550f3, null), 3);
                return;
        }
    }
}
