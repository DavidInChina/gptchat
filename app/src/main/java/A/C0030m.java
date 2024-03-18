package A;

/* renamed from: A.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0030m extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0030m f251Z = new C0030m(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0030m f252h0 = new C0030m(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f253Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0030m(int i10) {
        super(3);
        this.f253Y = i10;
    }

    public final E0.O a(E0.P p10, E0.M m10, long j6) {
        kf.w wVar = kf.w.f37484Y;
        switch (this.f253Y) {
            case 0:
                E0.d0 o10 = m10.o(j6);
                int a02 = p10.a0(M.f91a * 2);
                int U10 = o10.U() - a02;
                if (U10 < 0) {
                    U10 = 0;
                }
                int T = o10.T() - a02;
                if (T < 0) {
                    T = 0;
                }
                return p10.j0(U10, T, wVar, new C0028l(o10, a02, 0));
            default:
                E0.d0 o11 = m10.o(j6);
                int a03 = p10.a0(M.f91a * 2);
                return p10.j0(o11.f4053Y + a03, o11.f4054Z + a03, wVar, new C0028l(o11, a03, 1));
        }
    }

    @Override // wf.o
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f253Y) {
            case 0:
                return a((E0.P) obj, (E0.M) obj2, ((Z0.a) obj3).f22782a);
            default:
                return a((E0.P) obj, (E0.M) obj2, ((Z0.a) obj3).f22782a);
        }
    }
}
