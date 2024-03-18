package S4;

import java.util.ArrayList;
import r9.y;

/* loaded from: classes2.dex */
public final class h extends m {

    /* renamed from: j0  reason: collision with root package name */
    public final g f16163j0;

    /* renamed from: k0  reason: collision with root package name */
    public final n f16164k0;

    /* renamed from: l0  reason: collision with root package name */
    public final f f16165l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f16166m0;

    public h(g gVar, n nVar, f fVar, f fVar2, int i10) {
        super(4, 12);
        if (gVar != null) {
            if (fVar == null) {
                throw new NullPointerException("firstItem == null");
            }
            if (fVar2 == null) {
                throw new NullPointerException("lastItem == null");
            }
            if (i10 > 0) {
                this.f16163j0 = gVar;
                this.f16164k0 = nVar;
                this.f16165l0 = fVar;
                this.f16166m0 = i10;
                return;
            }
            throw new IllegalArgumentException("itemCount <= 0");
        }
        throw new NullPointerException("type == null");
    }

    public static void i(n[] nVarArr, l lVar) {
        if (nVarArr != null) {
            if (lVar.f16171f.size() == 0) {
                ArrayList arrayList = new ArrayList(50);
                for (n nVar : nVarArr) {
                    g gVar = null;
                    f fVar = null;
                    f fVar2 = null;
                    int i10 = 0;
                    for (f fVar3 : nVar.c()) {
                        g b10 = fVar3.b();
                        if (b10 != gVar) {
                            if (i10 != 0) {
                                arrayList.add(new h(gVar, nVar, fVar, fVar2, i10));
                            }
                            fVar = fVar3;
                            gVar = b10;
                            i10 = 0;
                        }
                        i10++;
                        fVar2 = fVar3;
                    }
                    if (i10 != 0) {
                        arrayList.add(new h(gVar, nVar, fVar, fVar2, i10));
                    } else if (nVar == lVar) {
                        arrayList.add(new h(lVar));
                    }
                }
                q qVar = new q(g.TYPE_MAP_LIST, arrayList);
                if (!lVar.f16182e) {
                    try {
                        if (qVar.f16174Y <= lVar.f16180c) {
                            lVar.f16171f.add(qVar);
                            return;
                        }
                        throw new IllegalArgumentException("incompatible item alignment");
                    } catch (NullPointerException unused) {
                        throw new NullPointerException("item == null");
                    }
                }
                throw new RuntimeException("already prepared");
            }
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        throw new NullPointerException("sections == null");
    }

    @Override // S4.f
    public final g b() {
        return g.TYPE_MAP_ITEM;
    }

    @Override // S4.m
    public final void h(b bVar, U4.c cVar) {
        int i10;
        g gVar = this.f16163j0;
        int i11 = gVar.f16160Y;
        n nVar = this.f16164k0;
        f fVar = this.f16165l0;
        if (fVar == null) {
            i10 = nVar.b();
        } else {
            i10 = nVar.a(fVar);
        }
        boolean c10 = cVar.c();
        int i12 = this.f16166m0;
        if (c10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[" + Integer.toHexString(e()) + ']');
            sb2.append(' ');
            sb2.append(gVar.f16161Z);
            sb2.append(" map");
            cVar.b(0, sb2.toString());
            cVar.b(2, "  type:   " + y.c1(i11) + " // " + gVar.toString());
            cVar.b(2, "  unused: 0");
            cVar.b(4, "  size:   ".concat(y.d1(i12)));
            cVar.b(4, "  offset: ".concat(y.d1(i10)));
        }
        cVar.e(i11);
        cVar.e(0);
        cVar.d(i12);
        cVar.d(i10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(h.class.getName());
        sb2.append('{');
        sb2.append(this.f16164k0.toString());
        sb2.append(' ');
        return android.gov.nist.core.a.n(sb2, this.f16163j0.f16162h0, '}');
    }

    public h(n nVar) {
        super(4, 12);
        if (nVar != null) {
            this.f16163j0 = g.TYPE_MAP_LIST;
            this.f16164k0 = nVar;
            this.f16165l0 = null;
            this.f16166m0 = 1;
            return;
        }
        throw new NullPointerException("section == null");
    }

    @Override // S4.f
    public final void a(b bVar) {
    }
}
