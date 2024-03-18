package X1;

import Qg.AbstractC1206i;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import jf.y;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21755Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f21756Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f21757h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f21758i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f21759j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f21760k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f21761l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f21762m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AbstractC1206i abstractC1206i, Ld.c cVar, Ld.c cVar2, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f21755Y = 2;
        this.f21760k0 = abstractC1206i;
        this.f21756Z = cVar;
        this.f21761l0 = cVar2;
        this.f21762m0 = abstractC4326r;
        this.f21757h0 = i10;
        this.f21758i0 = i11;
        this.f21759j0 = i12;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f21755Y;
        int i12 = this.f21758i0;
        Object obj = this.f21762m0;
        Object obj2 = this.f21761l0;
        Object obj3 = this.f21756Z;
        Object obj4 = this.f21760k0;
        switch (i11) {
            case 0:
                AbstractC2469q0.p(obj);
                P4.a.e((p) obj4, (String) obj3, (m) obj2, this.f21757h0, abstractC1725n, i12 | 1, this.f21759j0);
                return;
            case 1:
                K8.d.P((AbstractC4326r) obj4, (wf.k) obj2, (AbstractC6216a) obj, (String) obj3, this.f21757h0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f21759j0);
                return;
            default:
                Ad.l.z((AbstractC1206i) obj4, (Ld.c) obj3, (Ld.c) obj2, (AbstractC4326r) obj, this.f21757h0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f21759j0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f21755Y) {
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
    public o(p pVar, String str, m mVar, int i10, int i11, int i12) {
        super(2);
        this.f21755Y = 0;
        this.f21760k0 = pVar;
        this.f21756Z = str;
        this.f21761l0 = mVar;
        this.f21757h0 = i10;
        this.f21762m0 = null;
        this.f21758i0 = i11;
        this.f21759j0 = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AbstractC4326r abstractC4326r, wf.k kVar, AbstractC6216a abstractC6216a, String str, int i10, int i11, int i12) {
        super(2);
        this.f21755Y = 1;
        this.f21760k0 = abstractC4326r;
        this.f21761l0 = kVar;
        this.f21762m0 = abstractC6216a;
        this.f21756Z = str;
        this.f21757h0 = i10;
        this.f21758i0 = i11;
        this.f21759j0 = i12;
    }
}
