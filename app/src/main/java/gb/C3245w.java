package gb;

import fa.C2969F;
import wf.AbstractC6216a;

/* renamed from: gb.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3245w extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31524Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f31525Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2969F f31526h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3245w(wf.k kVar, C2969F c2969f, int i10) {
        super(0);
        this.f31524Y = i10;
        this.f31525Z = kVar;
        this.f31526h0 = c2969f;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f31524Y;
        wf.k kVar = this.f31525Z;
        C2969F c2969f = this.f31526h0;
        switch (i10) {
            case 0:
                kVar.invoke(new Q(c2969f));
                return;
            case 1:
                kVar.invoke(new f0(c2969f));
                return;
            case 2:
                kVar.invoke(new sb.s(c2969f));
                return;
            case 3:
                kVar.invoke(new e0(c2969f));
                return;
            default:
                kVar.invoke(new h0(c2969f));
                return;
        }
    }
}
