package N;

import java.util.Map;
import jf.C3959i;

/* loaded from: classes.dex */
public final class p0 implements Q {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12390a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12391b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12392c;

    /* renamed from: d  reason: collision with root package name */
    public final C1034s f12393d;

    /* renamed from: e  reason: collision with root package name */
    public final C1033q f12394e;

    public p0(boolean z10, int i10, int i11, C1034s c1034s, C1033q c1033q) {
        this.f12390a = z10;
        this.f12391b = i10;
        this.f12392c = i11;
        this.f12393d = c1034s;
        this.f12394e = c1033q;
    }

    @Override // N.Q
    public final boolean a() {
        return this.f12390a;
    }

    @Override // N.Q
    public final C1033q b() {
        return this.f12394e;
    }

    @Override // N.Q
    public final C1034s c() {
        return this.f12393d;
    }

    @Override // N.Q
    public final C1033q d() {
        return this.f12394e;
    }

    @Override // N.Q
    public final boolean e(Q q10) {
        if (this.f12393d != null && q10 != null && (q10 instanceof p0)) {
            p0 p0Var = (p0) q10;
            if (this.f12390a == p0Var.f12390a) {
                C1033q c1033q = this.f12394e;
                c1033q.getClass();
                C1033q c1033q2 = p0Var.f12394e;
                if (c1033q.f12395a == c1033q2.f12395a && c1033q.f12397c == c1033q2.f12397c && c1033q.f12398d == c1033q2.f12398d) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // N.Q
    public final int f() {
        return this.f12392c;
    }

    @Override // N.Q
    public final C1033q g() {
        return this.f12394e;
    }

    @Override // N.Q
    public final int h() {
        return this.f12394e.b();
    }

    @Override // N.Q
    public final Map i(C1034s c1034s) {
        boolean z10 = c1034s.f12410c;
        r rVar = c1034s.f12409b;
        r rVar2 = c1034s.f12408a;
        if ((z10 && rVar2.f12404b >= rVar.f12404b) || (!z10 && rVar2.f12404b <= rVar.f12404b)) {
            return P4.a.o0(new C3959i(Long.valueOf(this.f12394e.f12395a), c1034s));
        }
        throw new IllegalStateException(("unexpectedly miss-crossed selection: " + c1034s).toString());
    }

    @Override // N.Q
    public final C1033q j() {
        return this.f12394e;
    }

    @Override // N.Q
    public final int k() {
        return this.f12391b;
    }

    @Override // N.Q
    public final int l() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SingleSelectionLayout(isStartHandle=");
        sb2.append(this.f12390a);
        sb2.append(", crossed=");
        C1033q c1033q = this.f12394e;
        sb2.append(E9.f.T(c1033q.b()));
        sb2.append(", info=\n\t");
        sb2.append(c1033q);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // N.Q
    public final void m(wf.k kVar) {
    }
}
