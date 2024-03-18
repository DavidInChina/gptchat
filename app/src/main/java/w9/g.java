package w9;

import Kg.k;
import Kg.p;
import Z0.l;
import android.gov.nist.core.Separators;
import d1.AbstractC2586u;
import id.AbstractC3557B;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import wf.n;

/* loaded from: classes2.dex */
public final class g implements AbstractC2586u {

    /* renamed from: a  reason: collision with root package name */
    public final long f48251a;

    /* renamed from: b  reason: collision with root package name */
    public final Z0.b f48252b;

    /* renamed from: c  reason: collision with root package name */
    public final n f48253c;

    public g(long j6, Z0.b bVar, n nVar) {
        AbstractC3557B.c0("density", bVar);
        AbstractC3557B.c0("onPositionCalculated", nVar);
        this.f48251a = j6;
        this.f48252b = bVar;
        this.f48253c = nVar;
    }

    @Override // d1.AbstractC2586u
    public final long a(Z0.j jVar, long j6, l lVar, long j10) {
        k kVar;
        Object obj;
        Object obj2;
        AbstractC3557B.c0("anchorBounds", jVar);
        AbstractC3557B.c0("layoutDirection", lVar);
        int i10 = Z0.i.f22798c;
        long j11 = this.f48251a;
        int i11 = jVar.f22800a + ((int) (j11 >> 32));
        int i12 = jVar.f22801b + ((int) (j11 & 4294967295L));
        int a02 = this.f48252b.a0(h.f48254a);
        int i13 = (int) (j10 >> 32);
        int i14 = i11 - i13;
        int i15 = (int) (j6 >> 32);
        int i16 = i15 - i13;
        if (lVar == l.f22805Y) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(i11);
            numArr[1] = Integer.valueOf(i14);
            if (i11 < 0) {
                i16 = 0;
            }
            numArr[2] = Integer.valueOf(i16);
            kVar = p.e1(numArr);
        } else {
            Integer[] numArr2 = new Integer[3];
            numArr2[0] = Integer.valueOf(i14);
            numArr2[1] = Integer.valueOf(i11);
            if (i11 <= i15) {
                i16 = 0;
            }
            numArr2[2] = Integer.valueOf(i16);
            kVar = p.e1(numArr2);
        }
        Iterator it = kVar.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                int intValue = ((Number) obj).intValue();
                if (intValue >= 0 && intValue + i13 <= i15) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i14 = num.intValue();
        }
        int i17 = (int) (j10 & 4294967295L);
        int i18 = i12 - i17;
        int i19 = (int) (j6 & 4294967295L);
        Iterator it2 = p.e1(Integer.valueOf(Math.max(i12, a02)), Integer.valueOf(i18), Integer.valueOf(i12 - (i17 / 2)), Integer.valueOf((i19 - i17) - a02)).iterator();
        while (true) {
            if (it2.hasNext()) {
                Object next = it2.next();
                int intValue2 = ((Number) next).intValue();
                if (intValue2 >= a02 && intValue2 + i17 <= i19 - a02) {
                    obj2 = next;
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num2 = (Integer) obj2;
        if (num2 != null) {
            i18 = num2.intValue();
        }
        this.f48253c.invoke(jVar, new Z0.j(i14, i18, i13 + i14, i17 + i18));
        return m.c(i14, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (Z0.i.a(this.f48251a, gVar.f48251a) && AbstractC3557B.K(this.f48252b, gVar.f48252b) && AbstractC3557B.K(this.f48253c, gVar.f48253c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = Z0.i.f22798c;
        long j6 = this.f48251a;
        int hashCode = this.f48252b.hashCode();
        return this.f48253c.hashCode() + ((hashCode + (((int) (j6 ^ (j6 >>> 32))) * 31)) * 31);
    }

    public final String toString() {
        String b10 = Z0.i.b(this.f48251a);
        return "PopupMenuPositionProvider(positionOffset=" + b10 + ", density=" + this.f48252b + ", onPositionCalculated=" + this.f48253c + Separators.RPAREN;
    }
}
