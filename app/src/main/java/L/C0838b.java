package L;

import W.E1;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* renamed from: L.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0838b extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10094Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f10095Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f10096h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f10097i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f10098j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0838b(long j6, Object obj, wf.n nVar, int i10, int i11) {
        super(2);
        this.f10094Y = i11;
        this.f10095Z = j6;
        this.f10096h0 = obj;
        this.f10098j0 = nVar;
        this.f10097i0 = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f10094Y;
        int i12 = this.f10097i0;
        Object obj = this.f10098j0;
        Object obj2 = this.f10096h0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                AbstractC0844e.a(this.f10095Z, (AbstractC4326r) obj2, (wf.n) obj, abstractC1725n, p10);
                return;
            case 1:
                int p11 = AbstractC1734s.p(i12 | 1);
                U.f.b((U.n) obj, this.f10095Z, (AbstractC4326r) obj2, abstractC1725n, p11);
                return;
            case 2:
                int p12 = AbstractC1734s.p(i12 | 1);
                E1.c(this.f10095Z, (X.J) obj2, (wf.n) obj, abstractC1725n, p12);
                return;
            default:
                int p13 = AbstractC1734s.p(i12 | 1);
                r9.y.s(this.f10095Z, (N0.E) obj2, (wf.n) obj, abstractC1725n, p13);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f10094Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0838b(U.n nVar, long j6, AbstractC4326r abstractC4326r, int i10) {
        super(2);
        this.f10094Y = 1;
        this.f10098j0 = nVar;
        this.f10095Z = j6;
        this.f10096h0 = abstractC4326r;
        this.f10097i0 = i10;
    }
}
