package G9;

import I9.C0787v0;
import cb.C2334C;
import wd.O;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6137Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f6138Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2334C f6139h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, C2334C c2334c, wf.k kVar) {
        super(0);
        this.f6137Y = i10;
        this.f6138Z = kVar;
        this.f6139h0 = c2334c;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f6137Y;
        C2334C c2334c = this.f6139h0;
        wf.k kVar = this.f6138Z;
        switch (i10) {
            case 0:
                kVar.invoke(new O(c2334c.f26438a));
                return;
            case 1:
                kVar.invoke(new O(c2334c.f26438a));
                return;
            case 2:
                kVar.invoke(new C0787v0(c2334c));
                return;
            default:
                kVar.invoke(c2334c);
                return;
        }
    }
}
