package A;

import k6.AbstractC4194d;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class S0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f108Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f109Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S0(int i10, int i11) {
        super(0);
        this.f108Y = i11;
        this.f109Z = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f108Y;
        int i11 = this.f109Z;
        switch (i10) {
            case 0:
                return new Z0(i11);
            case 1:
                return AbstractC4194d.v("too many tags were added, ", i11, " had to be discarded.");
            default:
                Hi.q.c("Tap Interaction", i11);
                return jf.y.f36177a;
        }
    }
}
