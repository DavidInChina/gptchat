package H9;

import I9.AbstractC0775p;
import I9.C0779r0;
import I9.C0795z0;
import I9.J0;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class C extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7502Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f7503Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0775p f7504h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(wf.k kVar, AbstractC0775p abstractC0775p, int i10) {
        super(0);
        this.f7502Y = i10;
        this.f7503Z = kVar;
        this.f7504h0 = abstractC0775p;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f7502Y;
        wf.k kVar = this.f7503Z;
        AbstractC0775p abstractC0775p = this.f7504h0;
        switch (i10) {
            case 0:
                kVar.invoke(new j(((J0) abstractC0775p).f8187a));
                return;
            case 1:
                kVar.invoke(new f(((J0) abstractC0775p).f8187a));
                return;
            case 2:
                kVar.invoke(new C0779r0(((J0) abstractC0775p).f8187a));
                return;
            default:
                kVar.invoke(new C0795z0(((J0) abstractC0775p).f8187a));
                return;
        }
    }
}
