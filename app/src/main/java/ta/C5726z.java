package ta;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import cb.C2334C;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* renamed from: ta.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5726z extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46030Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2334C f46031Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f46032h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f46033i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f46034j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f46035k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5726z(C2334C c2334c, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f46030Y = i12;
        this.f46031Z = c2334c;
        this.f46032h0 = abstractC6216a;
        this.f46033i0 = abstractC4326r;
        this.f46034j0 = i10;
        this.f46035k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f46030Y;
        int i12 = this.f46034j0;
        switch (i11) {
            case 0:
                AbstractC5685A.d(this.f46031Z, this.f46032h0, this.f46033i0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f46035k0);
                return;
            default:
                int p10 = AbstractC1734s.p(i12 | 1);
                r9.y.N(this.f46031Z, this.f46032h0, this.f46033i0, abstractC1725n, p10, this.f46035k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f46030Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
