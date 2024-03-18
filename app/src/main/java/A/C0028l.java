package A;

/* renamed from: A.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0028l extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f246Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f247Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f248h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0028l(E0.d0 d0Var, int i10, int i11) {
        super(1);
        this.f246Y = i11;
        this.f247Z = d0Var;
        this.f248h0 = i10;
    }

    public final void a(E0.c0 c0Var) {
        E0.d0 d0Var = this.f247Z;
        int i10 = this.f246Y;
        int i11 = this.f248h0;
        switch (i10) {
            case 0:
                int i12 = (-i11) / 2;
                E0.c0.k(c0Var, d0Var, i12 - ((d0Var.f4053Y - d0Var.U()) / 2), i12 - ((d0Var.f4054Z - d0Var.T()) / 2), null, 12);
                return;
            case 1:
                int i13 = i11 / 2;
                E0.c0.d(c0Var, d0Var, i13, i13);
                return;
            default:
                E0.c0.d(c0Var, d0Var, 0, -i11);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f246Y) {
            case 0:
                a((E0.c0) obj);
                return yVar;
            case 1:
                a((E0.c0) obj);
                return yVar;
            default:
                a((E0.c0) obj);
                return yVar;
        }
    }
}
