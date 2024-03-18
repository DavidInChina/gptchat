package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import u0.AbstractC5824b;
import v0.C5953f;
import w9.AbstractC6146c;
import z.C6684Y;

/* renamed from: W.q1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1603q1 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20324Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f20325Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f20326h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f20327i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f20328j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f20329k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f20330l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1603q1(Object obj, String str, AbstractC4326r abstractC4326r, long j6, int i10, int i11, int i12) {
        super(2);
        this.f20324Y = i12;
        this.f20330l0 = obj;
        this.f20325Z = str;
        this.f20326h0 = abstractC4326r;
        this.f20327i0 = j6;
        this.f20328j0 = i10;
        this.f20329k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f20324Y;
        int i12 = this.f20328j0;
        Object obj = this.f20325Z;
        Object obj2 = this.f20330l0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                AbstractC1607r1.b((C5953f) obj2, (String) obj, this.f20326h0, this.f20327i0, abstractC1725n, p10, this.f20329k0);
                return;
            case 1:
                int p11 = AbstractC1734s.p(i12 | 1);
                AbstractC1607r1.a((AbstractC5824b) obj2, (String) obj, this.f20326h0, this.f20327i0, abstractC1725n, p11, this.f20329k0);
                return;
            default:
                int p12 = AbstractC1734s.p(i12 | 1);
                AbstractC4326r abstractC4326r = this.f20326h0;
                int i13 = this.f20329k0;
                AbstractC6146c.a((C6684Y) obj2, this.f20327i0, abstractC4326r, (wf.o) obj, abstractC1725n, p12, i13);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f20324Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1603q1(C6684Y c6684y, long j6, AbstractC4326r abstractC4326r, wf.o oVar, int i10, int i11) {
        super(2);
        this.f20324Y = 2;
        this.f20330l0 = c6684y;
        this.f20327i0 = j6;
        this.f20326h0 = abstractC4326r;
        this.f20325Z = oVar;
        this.f20328j0 = i10;
        this.f20329k0 = i11;
    }
}
