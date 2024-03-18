package dh;

import ah.AbstractC1991b;
import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28495Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC2690a0 f28496Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1991b f28497h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f28498i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(AbstractC2690a0 abstractC2690a0, AbstractC1991b abstractC1991b, Object obj, int i10) {
        super(0);
        this.f28495Y = i10;
        this.f28496Z = abstractC2690a0;
        this.f28497h0 = abstractC1991b;
        this.f28498i0 = obj;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f28495Y;
        AbstractC2690a0 abstractC2690a0 = this.f28496Z;
        AbstractC1991b abstractC1991b = this.f28497h0;
        switch (i10) {
            case 0:
                if (!abstractC1991b.getDescriptor().c() && !abstractC2690a0.s()) {
                    return null;
                }
                abstractC2690a0.getClass();
                return abstractC2690a0.g(abstractC1991b);
            default:
                abstractC2690a0.getClass();
                AbstractC3557B.c0("deserializer", abstractC1991b);
                return abstractC2690a0.g(abstractC1991b);
        }
    }
}
