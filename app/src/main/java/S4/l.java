package S4;

import G0.C0588q;
import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class l extends n {

    /* renamed from: i  reason: collision with root package name */
    public static final C0588q f16170i = new C0588q(4);

    /* renamed from: g  reason: collision with root package name */
    public final int f16172g;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f16171f = new ArrayList(100);

    /* renamed from: h  reason: collision with root package name */
    public int f16173h = -1;

    public l(String str, b bVar, int i10, int i11) {
        super(str, bVar, i10);
        new HashMap(100);
        this.f16172g = i11;
    }

    @Override // S4.n
    public final int a(f fVar) {
        return ((m) fVar).e();
    }

    @Override // S4.n
    public final Collection c() {
        return this.f16171f;
    }

    @Override // S4.n
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f16171f;
            int size = arrayList.size();
            if (i10 >= size) {
                return;
            }
            while (i10 < size) {
                ((m) arrayList.get(i10)).a(this.f16179b);
                i10++;
            }
        }
    }

    @Override // S4.n
    public final int g() {
        f();
        return this.f16173h;
    }

    @Override // S4.n
    public final void i(U4.c cVar) {
        boolean c10 = cVar.c();
        Iterator it = this.f16171f.iterator();
        int i10 = 0;
        boolean z10 = true;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (c10) {
                if (z10) {
                    z10 = false;
                } else {
                    cVar.b(0, Separators.RETURN);
                }
            }
            int i11 = mVar.f16174Y - 1;
            int i12 = (~i11) & (i10 + i11);
            if (i10 != i12) {
                cVar.f(i12 - i10);
                i10 = i12;
            }
            mVar.d(this.f16179b, cVar);
            i10 += mVar.c();
        }
        if (i10 == this.f16173h) {
            return;
        }
        throw new RuntimeException("output size mismatch");
    }

    public final void j() {
        f();
        int f6 = AbstractC6708l.f(this.f16172g);
        ArrayList arrayList = this.f16171f;
        if (f6 != 1) {
            if (f6 == 2) {
                Collections.sort(arrayList);
            }
        } else {
            Collections.sort(arrayList, f16170i);
        }
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            try {
                int f10 = mVar.f(this, i10);
                if (f10 >= i10) {
                    i10 = mVar.c() + f10;
                } else {
                    throw new RuntimeException("bogus place() result for " + mVar);
                }
            } catch (RuntimeException e10) {
                throw N4.a.a("...while placing " + mVar, e10);
            }
        }
        this.f16173h = i10;
    }
}
