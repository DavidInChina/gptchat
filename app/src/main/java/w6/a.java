package w6;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a  reason: collision with root package name */
    public double f48028a = Double.NaN;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f48029b = new LinkedHashMap();

    @Override // w6.m
    public final void a(double d10) {
        this.f48028a = d10;
        synchronized (this.f48029b) {
            for (l lVar : this.f48029b.keySet()) {
                c(lVar, d10);
            }
        }
    }

    @Override // w6.m
    public final void b(l lVar) {
        double d10 = this.f48028a;
        synchronized (this.f48029b) {
            this.f48029b.put(lVar, k.f48062e);
        }
        if (!Double.isNaN(d10)) {
            c(lVar, d10);
        }
    }

    public final void c(l lVar, double d10) {
        k kVar = (k) this.f48029b.get(lVar);
        if (kVar == null) {
            kVar = k.f48062e;
        }
        int i10 = kVar.f48063a;
        int i11 = i10 + 1;
        k kVar2 = new k(i11, Math.min(d10, kVar.f48064b), Math.max(d10, kVar.f48065c), ((i10 * kVar.f48066d) + d10) / i11);
        lVar.a(kVar2);
        synchronized (this.f48029b) {
            this.f48029b.put(lVar, kVar2);
        }
    }
}
