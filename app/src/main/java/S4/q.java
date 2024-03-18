package S4;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import r9.y;

/* loaded from: classes2.dex */
public final class q extends m {

    /* renamed from: j0  reason: collision with root package name */
    public final g f16185j0;

    /* renamed from: k0  reason: collision with root package name */
    public final List f16186k0;

    public q(g gVar, ArrayList arrayList) {
        super(i(arrayList), i(arrayList) + (((m) arrayList.get(0)).c() * arrayList.size()));
        if (gVar != null) {
            this.f16186k0 = arrayList;
            this.f16185j0 = gVar;
            return;
        }
        throw new NullPointerException("itemType == null");
    }

    public static int i(ArrayList arrayList) {
        try {
            return Math.max(4, ((m) arrayList.get(0)).f16174Y);
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    @Override // S4.f
    public final void a(b bVar) {
        for (m mVar : this.f16186k0) {
            mVar.a(bVar);
        }
    }

    @Override // S4.f
    public final g b() {
        return this.f16185j0;
    }

    @Override // S4.m
    public final void g(n nVar, int i10) {
        int i11 = i10 + this.f16174Y;
        int i12 = -1;
        boolean z10 = true;
        int i13 = -1;
        for (m mVar : this.f16186k0) {
            int c10 = mVar.c();
            int i14 = mVar.f16174Y;
            if (z10) {
                z10 = false;
                i12 = c10;
                i13 = i14;
            } else if (c10 == i12) {
                if (i14 != i13) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            } else {
                throw new UnsupportedOperationException("item size mismatch");
            }
            i11 = mVar.f(nVar, i11) + c10;
        }
    }

    @Override // S4.m
    public final void h(b bVar, U4.c cVar) {
        List<m> list = this.f16186k0;
        int size = list.size();
        if (cVar.c()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[" + Integer.toHexString(e()) + ']');
            sb2.append(Separators.SP);
            sb2.append(this.f16185j0.f16162h0);
            cVar.b(0, sb2.toString());
            cVar.b(4, "  size: ".concat(y.d1(size)));
        }
        cVar.d(size);
        for (m mVar : list) {
            mVar.d(bVar, cVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(q.class.getName());
        sb2.append(this.f16186k0);
        return sb2.toString();
    }
}
