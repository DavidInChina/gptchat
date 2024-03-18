package gb;

import wf.AbstractC6216a;

/* renamed from: gb.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3239p extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31497Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f31498Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3237n f31499h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3239p(AbstractC3237n abstractC3237n, wf.k kVar, int i10) {
        super(0);
        this.f31497Y = i10;
        this.f31499h0 = abstractC3237n;
        this.f31498Z = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3239p(wf.k kVar, AbstractC3237n abstractC3237n, int i10) {
        super(0);
        this.f31497Y = i10;
        this.f31498Z = kVar;
        this.f31499h0 = abstractC3237n;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f31497Y;
        wf.k kVar = this.f31498Z;
        AbstractC3237n abstractC3237n = this.f31499h0;
        switch (i10) {
            case 0:
                if (!(abstractC3237n instanceof C3235l)) {
                    return;
                }
                kVar.invoke(abstractC3237n);
                return;
            case 1:
                kVar.invoke(new sb.q((C3235l) abstractC3237n));
                return;
            case 2:
                kVar.invoke(new sb.p((C3235l) abstractC3237n));
                return;
            default:
                if (!(abstractC3237n instanceof C3235l)) {
                    return;
                }
                kVar.invoke(abstractC3237n);
                return;
        }
    }
}
