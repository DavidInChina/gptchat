package ta;

import Z8.AbstractC1809m0;
import Z8.R0;
import wf.AbstractC6216a;

/* renamed from: ta.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5717p extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45988Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f45989Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f45990h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5717p(AbstractC6216a abstractC6216a, wf.k kVar) {
        super(0);
        this.f45988Y = 3;
        this.f45990h0 = abstractC6216a;
        this.f45989Z = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5717p(wf.k kVar, AbstractC6216a abstractC6216a, int i10) {
        super(0);
        this.f45988Y = i10;
        this.f45989Z = kVar;
        this.f45990h0 = abstractC6216a;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f45988Y;
        wf.k kVar = this.f45989Z;
        AbstractC6216a abstractC6216a = this.f45990h0;
        switch (i10) {
            case 0:
                AbstractC1809m0.a().c(R0.f23270c, "camera");
                kVar.invoke(Boolean.FALSE);
                abstractC6216a.mo122invoke();
                return;
            case 1:
                AbstractC1809m0.a().c(R0.f23270c, "photo_library");
                kVar.invoke(Boolean.FALSE);
                abstractC6216a.mo122invoke();
                return;
            case 2:
                kVar.invoke(Boolean.FALSE);
                abstractC6216a.mo122invoke();
                return;
            default:
                abstractC6216a.mo122invoke();
                kVar.invoke(nc.w.f40261a);
                return;
        }
    }
}
