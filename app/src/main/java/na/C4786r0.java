package na;

import Tc.C1415a;
import wf.AbstractC6216a;
import ya.AbstractC6563k;
import ya.AbstractC6572t;
import ya.C6562j;
import ya.C6567o;
import ya.C6568p;

/* renamed from: na.r0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4786r0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40100Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6572t f40101Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6563k f40102h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f40103i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4786r0(AbstractC6572t abstractC6572t, AbstractC6563k abstractC6563k, Tc.f fVar, int i10) {
        super(0);
        this.f40100Y = i10;
        this.f40101Z = abstractC6572t;
        this.f40102h0 = abstractC6563k;
        this.f40103i0 = fVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f40100Y;
        Tc.f fVar = this.f40103i0;
        AbstractC6572t abstractC6572t = this.f40101Z;
        AbstractC6563k abstractC6563k = this.f40102h0;
        switch (i10) {
            case 0:
                abstractC6572t.j(new C6568p(((C6562j) abstractC6563k).f50866a));
                fVar.getClass();
                Ad.l.O0(fVar.f17060e, null, null, new C1415a(fVar, null), 3);
                return;
            default:
                abstractC6572t.j(new C6567o(((C6562j) abstractC6563k).f50866a));
                fVar.getClass();
                Ad.l.O0(fVar.f17060e, null, null, new C1415a(fVar, null), 3);
                return;
        }
    }
}
