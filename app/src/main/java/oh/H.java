package oh;

import q0.C5251c;

/* loaded from: classes.dex */
public final class H extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f41383Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ I f41384Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(I i10, int i11) {
        super(1);
        this.f41383Y = i11;
        this.f41384Z = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f41383Y;
        I i11 = this.f41384Z;
        switch (i10) {
            case 0:
                return (Boolean) i11.f41389v0.invoke(new C5251c(((C5251c) obj).f43623a));
            default:
                i11.f41392y0.invoke(new Z0.p(((Z0.p) obj).f22815a));
                return jf.y.f36177a;
        }
    }
}
