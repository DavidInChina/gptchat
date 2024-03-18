package gb;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import fa.EnumC2971H;
import l0.AbstractC4326r;

/* renamed from: gb.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3243u extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ EnumC2971H f31517Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f31518Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f31519h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f31520i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f31521j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3243u(EnumC2971H enumC2971H, int i10, AbstractC4326r abstractC4326r, int i11, int i12) {
        super(2);
        this.f31517Y = enumC2971H;
        this.f31518Z = i10;
        this.f31519h0 = abstractC4326r;
        this.f31520i0 = i11;
        this.f31521j0 = i12;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f31520i0 | 1);
        AbstractC4326r abstractC4326r = this.f31519h0;
        D.d(this.f31517Y, this.f31518Z, abstractC4326r, (AbstractC1725n) obj, p10, this.f31521j0);
        return jf.y.f36177a;
    }
}
