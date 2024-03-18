package r9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import u0.AbstractC5824b;
import v0.C5953f;

/* renamed from: r9.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5378A extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44472Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f44473Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f44474h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f44475i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f44476j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ long f44477k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f44478l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ int f44479m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ Object f44480n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5378A(String str, wf.n nVar, Object obj, long j6, AbstractC4326r abstractC4326r, long j10, int i10, int i11, int i12) {
        super(2);
        this.f44472Y = i12;
        this.f44473Z = str;
        this.f44474h0 = nVar;
        this.f44480n0 = obj;
        this.f44475i0 = j6;
        this.f44476j0 = abstractC4326r;
        this.f44477k0 = j10;
        this.f44478l0 = i10;
        this.f44479m0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f44472Y;
        int i12 = this.f44478l0;
        Object obj = this.f44480n0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                L4.a.m(this.f44473Z, this.f44474h0, (C5953f) obj, this.f44475i0, this.f44476j0, this.f44477k0, abstractC1725n, p10, this.f44479m0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                long j6 = this.f44475i0;
                int i13 = this.f44479m0;
                L4.a.l(this.f44473Z, this.f44474h0, (AbstractC5824b) obj, j6, this.f44476j0, this.f44477k0, abstractC1725n, p11, i13);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f44472Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
