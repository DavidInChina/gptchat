package F;

import java.util.List;
import l0.AbstractC4311c;
import l0.AbstractC4312d;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final p f4978a;

    /* renamed from: b  reason: collision with root package name */
    public final G.J f4979b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4980c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f4981d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ G.J f4982e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4983f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f4984g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AbstractC4311c f4985h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AbstractC4312d f4986i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f4987j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f4988k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f4989l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ long f4990m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ J f4991n;

    public v(long j6, boolean z10, p pVar, G.J j10, int i10, int i11, AbstractC4311c abstractC4311c, AbstractC4312d abstractC4312d, boolean z11, int i12, int i13, long j11, J j12) {
        int i14;
        this.f4981d = z10;
        this.f4982e = j10;
        this.f4983f = i10;
        this.f4984g = i11;
        this.f4985h = abstractC4311c;
        this.f4986i = abstractC4312d;
        this.f4987j = z11;
        this.f4988k = i12;
        this.f4989l = i13;
        this.f4990m = j11;
        this.f4991n = j12;
        this.f4978a = pVar;
        this.f4979b = j10;
        int i15 = Integer.MAX_VALUE;
        if (z10) {
            i14 = Z0.a.h(j6);
        } else {
            i14 = Integer.MAX_VALUE;
        }
        this.f4980c = A7.b.n(0, i14, 0, !z10 ? Z0.a.g(j6) : i15, 5);
    }

    public final A a(int i10) {
        int i11;
        p pVar = this.f4978a;
        Object b10 = pVar.b(i10);
        Object d10 = pVar.d(i10);
        List a5 = ((G.K) this.f4979b).a(i10, this.f4980c);
        if (i10 == this.f4983f - 1) {
            i11 = 0;
        } else {
            i11 = this.f4984g;
        }
        int i12 = i11;
        Z0.l layoutDirection = ((G.K) this.f4982e).f5435Z.getLayoutDirection();
        C0538l c0538l = this.f4991n.f4887q;
        return new A(i10, a5, this.f4981d, this.f4985h, this.f4986i, layoutDirection, this.f4987j, this.f4988k, this.f4989l, i12, this.f4990m, b10, d10, c0538l);
    }
}
