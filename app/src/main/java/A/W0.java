package A;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class W0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f130Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Z0 f131Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W0(Z0 z02, int i10) {
        super(0);
        this.f130Y = i10;
        this.f131Z = z02;
    }

    public final Boolean a() {
        int i10 = this.f130Y;
        boolean z10 = false;
        Z0 z02 = this.f131Z;
        switch (i10) {
            case 2:
                if (z02.f151a.h() > 0) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                if (z02.f151a.h() < z02.f154d.h()) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Z0 z02 = this.f131Z;
        int i10 = this.f130Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Float.valueOf(z02.f151a.h());
                    default:
                        return Float.valueOf(z02.f154d.h());
                }
            case 1:
                switch (i10) {
                    case 0:
                        return Float.valueOf(z02.f151a.h());
                    default:
                        return Float.valueOf(z02.f154d.h());
                }
            case 2:
                return a();
            default:
                return a();
        }
    }
}
