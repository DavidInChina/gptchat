package E;

import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class S extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3814Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f3815Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f3816h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f3817i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(int i10, E0.d0 d0Var, int i11) {
        super(1);
        this.f3815Z = i10;
        this.f3816h0 = d0Var;
        this.f3817i0 = i11;
    }

    public final void a(E0.c0 c0Var) {
        int i10 = this.f3814Y;
        int i11 = this.f3817i0;
        int i12 = this.f3815Z;
        E0.d0 d0Var = this.f3816h0;
        switch (i10) {
            case 0:
                E0.c0.d(c0Var, d0Var, i12, i11);
                return;
            default:
                E0.c0.d(c0Var, d0Var, AbstractC4344b.Y0((i12 - d0Var.f4053Y) / 2.0f), AbstractC4344b.Y0((i11 - d0Var.f4054Z) / 2.0f));
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f3814Y) {
            case 0:
                a((E0.c0) obj);
                return yVar;
            default:
                a((E0.c0) obj);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(E0.d0 d0Var, int i10, int i11) {
        super(1);
        this.f3816h0 = d0Var;
        this.f3815Z = i10;
        this.f3817i0 = i11;
    }
}
