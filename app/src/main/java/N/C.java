package N;

import q0.C5251c;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class C extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12193Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ f0 f12194Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(f0 f0Var, int i10) {
        super(0);
        this.f12193Y = i10;
        this.f12194Z = f0Var;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        long j6;
        long j10;
        jf.y yVar = jf.y.f36177a;
        f0 f0Var = this.f12194Z;
        int i10 = this.f12193Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        C5251c c5251c = (C5251c) f0Var.f12328n.getValue();
                        if (c5251c != null) {
                            j6 = c5251c.f43623a;
                            break;
                        } else {
                            j6 = C5251c.f43621d;
                            break;
                        }
                    default:
                        C5251c c5251c2 = (C5251c) f0Var.f12329o.getValue();
                        if (c5251c2 != null) {
                            j6 = c5251c2.f43623a;
                            break;
                        } else {
                            j6 = C5251c.f43621d;
                            break;
                        }
                }
                return new C5251c(j6);
            case 1:
                switch (i10) {
                    case 0:
                        C5251c c5251c3 = (C5251c) f0Var.f12328n.getValue();
                        if (c5251c3 != null) {
                            j10 = c5251c3.f43623a;
                            break;
                        } else {
                            j10 = C5251c.f43621d;
                            break;
                        }
                    default:
                        C5251c c5251c4 = (C5251c) f0Var.f12329o.getValue();
                        if (c5251c4 != null) {
                            j10 = c5251c4.f43623a;
                            break;
                        } else {
                            j10 = C5251c.f43621d;
                            break;
                        }
                }
                return new C5251c(j10);
            case 2:
                switch (i10) {
                    case 2:
                        f0Var.k(true);
                        f0Var.f12330p.setValue(null);
                        f0Var.f12331q.setValue(null);
                        break;
                    default:
                        f0Var.h();
                        break;
                }
                return yVar;
            default:
                switch (i10) {
                    case 2:
                        f0Var.k(true);
                        f0Var.f12330p.setValue(null);
                        f0Var.f12331q.setValue(null);
                        break;
                    default:
                        f0Var.h();
                        break;
                }
                return yVar;
        }
    }
}
