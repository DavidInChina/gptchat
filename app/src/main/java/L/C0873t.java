package L;

import N0.C1046e;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import java.util.Map;
import l0.AbstractC4326r;
import nf.AbstractC4828h;

/* renamed from: L.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0873t extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10291Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1046e f10292Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f10293h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f10294i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f10295j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ boolean f10296k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f10297l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f10298m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f10299n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ Object f10300o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ Object f10301p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0873t(C1046e c1046e, AbstractC4326r abstractC4326r, N0.E e10, boolean z10, int i10, int i11, wf.k kVar, wf.k kVar2, int i12, int i13) {
        super(2);
        this.f10292Z = c1046e;
        this.f10293h0 = abstractC4326r;
        this.f10300o0 = e10;
        this.f10296k0 = z10;
        this.f10295j0 = i10;
        this.f10297l0 = i11;
        this.f10294i0 = kVar;
        this.f10301p0 = kVar2;
        this.f10298m0 = i12;
        this.f10299n0 = i13;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f10291Y;
        int i12 = this.f10298m0;
        Object obj = this.f10301p0;
        Object obj2 = this.f10300o0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                int i13 = this.f10295j0;
                AbstractC4828h.e(this.f10292Z, this.f10293h0, (N0.E) obj2, this.f10296k0, i13, this.f10297l0, this.f10294i0, (wf.k) obj, abstractC1725n, p10, this.f10299n0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                int i14 = this.f10295j0;
                int i15 = this.f10299n0;
                S8.L.b((S8.M) obj2, this.f10292Z, this.f10293h0, this.f10294i0, i14, this.f10296k0, this.f10297l0, (Map) obj, abstractC1725n, p11, i15);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f10291Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0873t(S8.M m10, C1046e c1046e, AbstractC4326r abstractC4326r, wf.k kVar, int i10, boolean z10, int i11, Map map, int i12, int i13) {
        super(2);
        this.f10300o0 = m10;
        this.f10292Z = c1046e;
        this.f10293h0 = abstractC4326r;
        this.f10294i0 = kVar;
        this.f10295j0 = i10;
        this.f10296k0 = z10;
        this.f10297l0 = i11;
        this.f10301p0 = map;
        this.f10298m0 = i12;
        this.f10299n0 = i13;
    }
}
