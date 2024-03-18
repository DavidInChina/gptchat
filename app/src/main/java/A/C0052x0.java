package A;

import G0.AbstractC0579h;
import H0.AbstractC0701r0;
import android.view.View;
import id.AbstractC3557B;
import q0.C5251c;
import wf.AbstractC6216a;

/* renamed from: A.x0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0052x0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f323Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0056z0 f324Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0052x0(C0056z0 c0056z0, int i10) {
        super(0);
        this.f323Y = i10;
        this.f324Z = c0056z0;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f323Y;
        C0056z0 c0056z0 = this.f324Z;
        switch (i10) {
            case 0:
                return new C5251c(c0056z0.f342G0);
            default:
                View view = c0056z0.f338C0;
                View view2 = (View) AbstractC0579h.p(c0056z0, H0.Z.f6892f);
                c0056z0.f338C0 = view2;
                Z0.b bVar = c0056z0.f339D0;
                Z0.b bVar2 = (Z0.b) AbstractC0579h.p(c0056z0, AbstractC0701r0.f7002e);
                c0056z0.f339D0 = bVar2;
                if (c0056z0.f340E0 == null || !AbstractC3557B.K(view2, view) || !AbstractC3557B.K(bVar2, bVar)) {
                    c0056z0.A0();
                }
                c0056z0.B0();
                return jf.y.f36177a;
        }
    }
}
