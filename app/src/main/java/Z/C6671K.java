package z;

import Z.C1724m0;
import Z.l1;
import Z.o1;
import nf.AbstractC4828h;

/* renamed from: z.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6671K implements l1 {

    /* renamed from: Y  reason: collision with root package name */
    public Object f51159Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f51160Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C6737z0 f51161h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C1724m0 f51162i0;

    /* renamed from: j0  reason: collision with root package name */
    public C6711m0 f51163j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f51164k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f51165l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f51166m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ C6676P f51167n0;

    public C6671K(C6676P c6676p, Number number, Number number2, C6737z0 c6737z0, AbstractC6714o abstractC6714o) {
        this.f51167n0 = c6676p;
        this.f51159Y = number;
        this.f51160Z = number2;
        this.f51161h0 = c6737z0;
        this.f51162i0 = AbstractC4828h.Z(number, o1.f22665a);
        this.f51163j0 = new C6711m0(abstractC6714o, c6737z0, this.f51159Y, this.f51160Z, null);
    }

    @Override // Z.l1
    public final Object getValue() {
        return this.f51162i0.getValue();
    }
}
