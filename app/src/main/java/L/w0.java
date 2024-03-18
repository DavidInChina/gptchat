package L;

import N0.C1046e;
import java.util.List;

/* loaded from: classes2.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public final C1046e f10339a;

    /* renamed from: b  reason: collision with root package name */
    public final N0.E f10340b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10341c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10342d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10343e;

    /* renamed from: f  reason: collision with root package name */
    public final int f10344f;

    /* renamed from: g  reason: collision with root package name */
    public final Z0.b f10345g;

    /* renamed from: h  reason: collision with root package name */
    public final S0.r f10346h;

    /* renamed from: i  reason: collision with root package name */
    public final List f10347i;

    /* renamed from: j  reason: collision with root package name */
    public N0.k f10348j;

    /* renamed from: k  reason: collision with root package name */
    public Z0.l f10349k;

    public w0(C1046e c1046e, N0.E e10, int i10, int i11, boolean z10, int i12, Z0.b bVar, S0.r rVar, List list) {
        this.f10339a = c1046e;
        this.f10340b = e10;
        this.f10341c = i10;
        this.f10342d = i11;
        this.f10343e = z10;
        this.f10344f = i12;
        this.f10345g = bVar;
        this.f10346h = rVar;
        this.f10347i = list;
        if (i10 > 0) {
            if (i11 > 0) {
                if (i11 <= i10) {
                    return;
                }
                throw new IllegalArgumentException("minLines greater than maxLines".toString());
            }
            throw new IllegalArgumentException("no minLines".toString());
        }
        throw new IllegalArgumentException("no maxLines".toString());
    }

    public final void a(Z0.l lVar) {
        N0.k kVar = this.f10348j;
        if (kVar == null || lVar != this.f10349k || kVar.a()) {
            this.f10349k = lVar;
            kVar = new N0.k(this.f10339a, R4.b.U1(this.f10340b, lVar), this.f10347i, this.f10345g, this.f10346h);
        }
        this.f10348j = kVar;
    }
}
