package r9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* renamed from: r9.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5391h extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44559Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f44560Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f44561h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f44562i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f44563j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f44564k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f44565l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5391h(String str, boolean z10, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, int i10, int i11) {
        super(2);
        this.f44562i0 = str;
        this.f44563j0 = z10;
        this.f44560Z = abstractC6216a;
        this.f44561h0 = abstractC4326r;
        this.f44564k0 = i10;
        this.f44565l0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f44559Y;
        int i12 = this.f44564k0;
        switch (i11) {
            case 0:
                Ad.l.d(AbstractC1734s.p(i12 | 1), this.f44565l0, abstractC1725n, this.f44561h0, this.f44562i0, this.f44560Z, this.f44563j0);
                return;
            default:
                A7.b.x(AbstractC1734s.p(i12 | 1), this.f44565l0, abstractC1725n, this.f44561h0, this.f44562i0, this.f44560Z, this.f44563j0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f44559Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5391h(AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, String str, boolean z10, int i10, int i11) {
        super(2);
        this.f44560Z = abstractC6216a;
        this.f44561h0 = abstractC4326r;
        this.f44562i0 = str;
        this.f44563j0 = z10;
        this.f44564k0 = i10;
        this.f44565l0 = i11;
    }
}
