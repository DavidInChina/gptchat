package I9;

import N0.C1046e;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8159Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f8160Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f8161h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f8162i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f8163j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f8164k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ CharSequence f8165l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(CharSequence charSequence, AbstractC4326r abstractC4326r, int i10, int i11, int i12, int i13, int i14) {
        super(2);
        this.f8159Y = i14;
        this.f8165l0 = charSequence;
        this.f8160Z = abstractC4326r;
        this.f8161h0 = i10;
        this.f8162i0 = i11;
        this.f8163j0 = i12;
        this.f8164k0 = i13;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f8159Y;
        int i12 = this.f8163j0;
        CharSequence charSequence = this.f8165l0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                L4.a.T((String) charSequence, this.f8160Z, this.f8161h0, this.f8162i0, abstractC1725n, p10, this.f8164k0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                L4.a.S((C1046e) charSequence, this.f8160Z, this.f8161h0, this.f8162i0, abstractC1725n, p11, this.f8164k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8159Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
