package g4;

import E0.AbstractC0454m;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4313e;
import l0.AbstractC4326r;
import r0.C5347k;

/* renamed from: g4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3176d extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f31209Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3188p f31210Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f31211h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4313e f31212i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0454m f31213j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ float f31214k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ C5347k f31215l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ boolean f31216m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f31217n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3176d(AbstractC4326r abstractC4326r, C3188p c3188p, String str, AbstractC4313e abstractC4313e, AbstractC0454m abstractC0454m, float f6, C5347k c5347k, boolean z10, int i10) {
        super(2);
        this.f31209Y = abstractC4326r;
        this.f31210Z = c3188p;
        this.f31211h0 = str;
        this.f31212i0 = abstractC4313e;
        this.f31213j0 = abstractC0454m;
        this.f31214k0 = f6;
        this.f31215l0 = c5347k;
        this.f31216m0 = z10;
        this.f31217n0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f31217n0 | 1);
        C5347k c5347k = this.f31215l0;
        boolean z10 = this.f31216m0;
        A7.b.o(this.f31209Y, this.f31210Z, this.f31211h0, this.f31212i0, this.f31213j0, this.f31214k0, c5347k, z10, (AbstractC1725n) obj, p10);
        return jf.y.f36177a;
    }
}
