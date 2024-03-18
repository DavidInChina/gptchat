package B;

import q0.C5251c;

/* renamed from: B.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0169v extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0169v f1527Z = new C0169v(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0169v f1528h0 = new C0169v(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C0169v f1529i0 = new C0169v(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C0169v f1530j0 = new C0169v(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C0169v f1531k0 = new C0169v(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C0169v f1532l0 = new C0169v(5);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1533Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0169v(int i10) {
        super(1);
        this.f1533Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f1533Y;
        switch (i10) {
            case 0:
                return Boolean.TRUE;
            case 1:
                long j6 = ((C5251c) obj).f43623a;
                return yVar;
            case 2:
                long j10 = ((C5251c) obj).f43623a;
                return yVar;
            case 3:
                long j11 = ((C5251c) obj).f43623a;
                return yVar;
            case 4:
                B0.u uVar = (B0.u) obj;
                switch (i10) {
                    case 4:
                        return Boolean.TRUE;
                    default:
                        return Boolean.valueOf(!B0.s.b(uVar.f1678i, 2));
                }
            default:
                B0.u uVar2 = (B0.u) obj;
                switch (i10) {
                    case 4:
                        return Boolean.TRUE;
                    default:
                        return Boolean.valueOf(!B0.s.b(uVar2.f1678i, 2));
                }
        }
    }
}
