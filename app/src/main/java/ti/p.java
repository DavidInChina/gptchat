package ti;

import wi.s;
import wi.u;

/* loaded from: classes2.dex */
public final class p extends yi.a {

    /* renamed from: a  reason: collision with root package name */
    public final wi.r f46312a = new s();

    /* renamed from: b  reason: collision with root package name */
    public final int f46313b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f46314c;

    /* JADX WARN: Type inference failed for: r0v0, types: [wi.s, wi.r] */
    public p(int i10) {
        this.f46313b = i10;
    }

    @Override // yi.a
    public final boolean c(wi.a aVar) {
        if (this.f46314c) {
            wi.a aVar2 = (wi.a) this.f46312a.f48608a;
            if (aVar2 instanceof wi.q) {
                ((wi.q) aVar2).getClass();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // yi.a
    public final wi.a f() {
        return this.f46312a;
    }

    @Override // yi.a
    public final boolean g() {
        return true;
    }

    @Override // yi.a
    public final a i(yi.d dVar) {
        f fVar = (f) dVar;
        boolean z10 = false;
        if (fVar.f46265i) {
            if (this.f46312a.f48609b == null) {
                return null;
            }
            wi.a f6 = fVar.h().f();
            if ((f6 instanceof u) || (f6 instanceof wi.r)) {
                z10 = true;
            }
            this.f46314c = z10;
            return a.a(fVar.f46262f);
        }
        int i10 = fVar.f46264h;
        int i11 = this.f46313b;
        if (i10 < i11) {
            return null;
        }
        return new a(-1, fVar.f46260d + i11, false);
    }
}
