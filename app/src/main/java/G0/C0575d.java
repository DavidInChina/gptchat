package G0;

import id.AbstractC3557B;
import l0.AbstractC4324p;
import wf.AbstractC6216a;

/* renamed from: G0.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0575d extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5717Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0576e f5718Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0575d(C0576e c0576e, int i10) {
        super(0);
        this.f5717Y = i10;
        this.f5718Z = c0576e;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        C0576e c0576e = this.f5718Z;
        int i10 = this.f5717Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        c0576e.C0();
                        break;
                    default:
                        AbstractC4324p abstractC4324p = c0576e.f5726s0;
                        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer", abstractC4324p);
                        ((F0.d) abstractC4324p).b(c0576e);
                        break;
                }
                return yVar;
            default:
                switch (i10) {
                    case 0:
                        c0576e.C0();
                        break;
                    default:
                        AbstractC4324p abstractC4324p2 = c0576e.f5726s0;
                        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer", abstractC4324p2);
                        ((F0.d) abstractC4324p2).b(c0576e);
                        break;
                }
                return yVar;
        }
    }
}
