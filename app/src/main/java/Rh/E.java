package Rh;

/* loaded from: classes2.dex */
public final class E extends F implements G {

    /* renamed from: Y  reason: collision with root package name */
    public final G f15615Y;

    /* renamed from: Z  reason: collision with root package name */
    public C4.g f15616Z;

    public E(G g10) {
        this.f15615Y = g10;
    }

    @Override // Rh.F, Ph.a
    public final Ph.a a() {
        return new E(this);
    }

    @Override // Rh.F, Ph.a
    public final void b(char c10) {
        W w10;
        if (c10 != 'F') {
            if (c10 != 'S') {
                if (c10 != 'V') {
                    if (c10 != 'Z') {
                        if (c10 != 'I') {
                            if (c10 != 'J') {
                                switch (c10) {
                                    case 'B':
                                        w10 = W.f15746h0;
                                        break;
                                    case 'C':
                                        w10 = W.f15748j0;
                                        break;
                                    case 'D':
                                        w10 = W.f15752n0;
                                        break;
                                    default:
                                        W w11 = W.f15745Z;
                                        throw new IllegalArgumentException("Not a valid primitive type descriptor: " + c10);
                                }
                            } else {
                                w10 = W.f15750l0;
                            }
                        } else {
                            w10 = W.f15749k0;
                        }
                    } else {
                        w10 = W.f15745Z;
                    }
                } else {
                    w10 = W.f15753o0;
                }
            } else {
                w10 = W.f15747i0;
            }
        } else {
            w10 = W.f15751m0;
        }
        this.f15615Y.d(w10);
    }

    @Override // Rh.G
    public final void d(AbstractC1337y0 abstractC1337y0) {
        this.f15615Y.d(new N(abstractC1337y0));
    }

    @Override // Rh.F, Ph.a
    public final void e(String str) {
        this.f15616Z = new D(str);
    }

    @Override // Rh.F, Ph.a
    public final void f() {
        this.f15615Y.d(this.f15616Z.c());
    }

    @Override // Rh.F, Ph.a
    public final void i(String str) {
        this.f15616Z = new C(str, this.f15616Z);
    }

    @Override // Rh.F, Ph.a
    public final Ph.a o(char c10) {
        if (c10 != '+') {
            if (c10 != '-') {
                if (c10 == '=') {
                    C4.g gVar = this.f15616Z;
                    gVar.getClass();
                    return new E(new B(gVar, 0));
                }
                throw new IllegalArgumentException("Unknown wildcard: " + c10);
            }
            C4.g gVar2 = this.f15616Z;
            gVar2.getClass();
            return new E(new y7.b(21, gVar2));
        }
        C4.g gVar3 = this.f15616Z;
        gVar3.getClass();
        return new E(new B(gVar3, 1));
    }

    @Override // Rh.F, Ph.a
    public final void p() {
        C4.g gVar = this.f15616Z;
        gVar.f2681Z.add(EnumC1300f0.f15840Y);
    }

    @Override // Rh.F, Ph.a
    public final void q(String str) {
        this.f15615Y.d(new C1296d0(str));
    }
}
