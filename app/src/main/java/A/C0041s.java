package A;

import t0.AbstractC5646e;

/* renamed from: A.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0041s extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0041s f289Z = new C0041s(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0041s f290h0 = new C0041s(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C0041s f291i0 = new C0041s(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C0041s f292j0 = new C0041s(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C0041s f293k0 = new C0041s(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f294Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0041s(int i10) {
        super(1);
        this.f294Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f294Y) {
            case 0:
                ((G0.J) ((AbstractC5646e) obj)).a();
                return yVar;
            case 1:
                E0.c0 c0Var = (E0.c0) obj;
                return yVar;
            case 2:
                ((Number) obj).longValue();
                return yVar;
            case 3:
                L0.f fVar = L0.f.f10376d;
                Df.v[] vVarArr = L0.t.f10472a;
                L0.u uVar = L0.r.f10448d;
                Df.v vVar = L0.t.f10472a[1];
                uVar.a((L0.v) obj, fVar);
                return yVar;
            default:
                return new Z0(((Number) obj).intValue());
        }
    }
}
