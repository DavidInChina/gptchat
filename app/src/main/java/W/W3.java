package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class W3 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19803Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f19804Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f19805h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f19806i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f19807j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f19808k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(long j6, N0.E e10, wf.n nVar, int i10, int i11) {
        super(2);
        this.f19804Z = j6;
        this.f19807j0 = e10;
        this.f19808k0 = nVar;
        this.f19805h0 = i10;
        this.f19806i0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f19803Y;
        int i12 = this.f19805h0;
        Object obj = this.f19808k0;
        Object obj2 = this.f19807j0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                int i13 = this.f19806i0;
                X3.b(this.f19804Z, (N0.E) obj2, (wf.n) obj, abstractC1725n, p10, i13);
                return;
            default:
                Bi.c.o((String) obj2, (AbstractC4326r) obj, this.f19804Z, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f19806i0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19803Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(String str, AbstractC4326r abstractC4326r, long j6, int i10, int i11) {
        super(2);
        this.f19807j0 = str;
        this.f19808k0 = abstractC4326r;
        this.f19804Z = j6;
        this.f19805h0 = i10;
        this.f19806i0 = i11;
    }
}
