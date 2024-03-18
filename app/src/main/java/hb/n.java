package hb;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32114Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f32115Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ t f32116h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(wf.k kVar, t tVar, int i10) {
        super(0);
        this.f32114Y = i10;
        this.f32115Z = kVar;
        this.f32116h0 = tVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f32114Y;
        wf.k kVar = this.f32115Z;
        t tVar = this.f32116h0;
        switch (i10) {
            case 0:
                kVar.invoke(new h(!tVar.f32137i));
                return;
            default:
                kVar.invoke(new f(!tVar.f32130b));
                return;
        }
    }
}
