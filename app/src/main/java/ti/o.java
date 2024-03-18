package ti;

/* loaded from: classes2.dex */
public final class o extends yi.a {

    /* renamed from: a  reason: collision with root package name */
    public final wi.q f46309a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f46310b;

    /* renamed from: c  reason: collision with root package name */
    public int f46311c;

    public o(wi.q qVar) {
        this.f46309a = qVar;
    }

    @Override // yi.a
    public final boolean c(wi.a aVar) {
        if (!(aVar instanceof wi.r)) {
            return false;
        }
        if (this.f46310b && this.f46311c == 1) {
            this.f46309a.getClass();
            this.f46310b = false;
        }
        return true;
    }

    @Override // yi.a
    public final wi.a f() {
        return this.f46309a;
    }

    @Override // yi.a
    public final a i(yi.d dVar) {
        f fVar = (f) dVar;
        if (fVar.f46265i) {
            this.f46310b = true;
            this.f46311c = 0;
        } else if (this.f46310b) {
            this.f46311c++;
        }
        return a.a(fVar.f46259c);
    }
}
