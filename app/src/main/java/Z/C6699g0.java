package z;

/* renamed from: z.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6699g0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51260Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f51261Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f51262h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6699g0(Object obj, int i10, Object obj2) {
        super(1);
        this.f51260Y = i10;
        this.f51261Z = obj;
        this.f51262h0 = obj2;
    }

    public final Z.M a(Z.N n10) {
        int i10 = this.f51260Y;
        Object obj = this.f51262h0;
        Object obj2 = this.f51261Z;
        switch (i10) {
            case 1:
                C6676P c6676p = (C6676P) obj2;
                C6671K c6671k = (C6671K) obj;
                c6676p.f51179a.b(c6671k);
                c6676p.f51180b.setValue(Boolean.TRUE);
                return new C6678S(c6676p, 0, c6671k);
            case 2:
                C6729v0 c6729v0 = (C6729v0) obj2;
                C6729v0 c6729v02 = (C6729v0) obj;
                c6729v0.f51392i.add(c6729v02);
                return new C6678S(c6729v0, 1, c6729v02);
            case 3:
                return new C6678S((C6729v0) obj2, 2, (C6715o0) obj);
            default:
                C6729v0 c6729v03 = (C6729v0) obj2;
                C6721r0 c6721r0 = (C6721r0) obj;
                c6729v03.f51391h.add(c6721r0);
                return new C6678S(c6729v03, 3, c6721r0);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f51260Y) {
            case 0:
                C6712n c6712n = (C6712n) obj;
                ((wf.n) this.f51261Z).invoke(c6712n.f51333e.getValue(), ((C6737z0) this.f51262h0).f51417b.invoke(c6712n.f51334f));
                return jf.y.f36177a;
            case 1:
                return a((Z.N) obj);
            case 2:
                return a((Z.N) obj);
            case 3:
                return a((Z.N) obj);
            default:
                return a((Z.N) obj);
        }
    }
}
