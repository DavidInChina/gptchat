package W;

import d1.AbstractC2586u;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l0.AbstractC4309a;
import l0.C4310b;
import l0.C4316h;
import l0.C4317i;
import l8.AbstractC4344b;

/* renamed from: W.f1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1548f1 implements AbstractC2586u {

    /* renamed from: a  reason: collision with root package name */
    public final long f20044a;

    /* renamed from: b  reason: collision with root package name */
    public final Z0.b f20045b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20046c;

    /* renamed from: d  reason: collision with root package name */
    public final wf.n f20047d;

    /* renamed from: e  reason: collision with root package name */
    public final C1561i f20048e;

    /* renamed from: f  reason: collision with root package name */
    public final C1561i f20049f;

    /* renamed from: g  reason: collision with root package name */
    public final r4 f20050g = new r4(AbstractC4309a.f37691b);

    /* renamed from: h  reason: collision with root package name */
    public final r4 f20051h = new r4(AbstractC4309a.f37692c);

    /* renamed from: i  reason: collision with root package name */
    public final C1566j f20052i;

    /* renamed from: j  reason: collision with root package name */
    public final C1566j f20053j;

    /* renamed from: k  reason: collision with root package name */
    public final C1566j f20054k;

    /* renamed from: l  reason: collision with root package name */
    public final s4 f20055l;

    /* renamed from: m  reason: collision with root package name */
    public final s4 f20056m;

    public C1548f1(long j6, Z0.b bVar, C1634w3 c1634w3) {
        int a02 = bVar.a0(L1.f19330a);
        this.f20044a = j6;
        this.f20045b = bVar;
        this.f20046c = a02;
        this.f20047d = c1634w3;
        int a03 = bVar.a0(Z0.f.a(j6));
        C4316h c4316h = C4310b.f37705r0;
        this.f20048e = new C1561i(c4316h, c4316h, a03);
        C4316h c4316h2 = C4310b.f37707t0;
        this.f20049f = new C1561i(c4316h2, c4316h2, a03);
        int a04 = bVar.a0(Z0.f.b(j6));
        C4317i c4317i = C4310b.f37702o0;
        C4317i c4317i2 = C4310b.f37704q0;
        this.f20052i = new C1566j(c4317i, c4317i2, a04);
        this.f20053j = new C1566j(c4317i2, c4317i, a04);
        this.f20054k = new C1566j(C4310b.f37703p0, c4317i, a04);
        this.f20055l = new s4(c4317i, a02);
        this.f20056m = new s4(c4317i2, a02);
    }

    @Override // d1.AbstractC2586u
    public final long a(Z0.j jVar, long j6, Z0.l lVar, long j10) {
        r4 r4Var;
        Object obj;
        int i10;
        s4 s4Var;
        Object obj2;
        int i11;
        M1[] m1Arr = new M1[3];
        m1Arr[0] = this.f20048e;
        m1Arr[1] = this.f20049f;
        int i12 = jVar.f22800a;
        int i13 = jVar.f22801b;
        long c10 = kotlin.jvm.internal.m.c((jVar.b() / 2) + i12, (jVar.a() / 2) + i13);
        int i14 = Z0.i.f22798c;
        int i15 = (int) (j6 >> 32);
        if (((int) (c10 >> 32)) < i15 / 2) {
            r4Var = this.f20050g;
        } else {
            r4Var = this.f20051h;
        }
        m1Arr[2] = r4Var;
        List G02 = AbstractC4344b.G0(m1Arr);
        ArrayList arrayList = new ArrayList(G02.size());
        int size = G02.size();
        int i16 = 0;
        while (i16 < size) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(Integer.valueOf(((M1) G02.get(i16)).a(jVar, j6, (int) (j10 >> 32), lVar)));
            i16++;
            arrayList = arrayList2;
            i12 = i12;
            i15 = i15;
            size = size;
            G02 = G02;
            i13 = i13;
        }
        ArrayList arrayList3 = arrayList;
        int i17 = i15;
        int i18 = i13;
        int i19 = i12;
        int size2 = arrayList3.size();
        int i20 = 0;
        while (true) {
            if (i20 < size2) {
                Object obj3 = arrayList3.get(i20);
                int intValue = ((Number) obj3).intValue();
                if (intValue >= 0 && intValue + ((int) (j10 >> 32)) <= i17) {
                    obj = obj3;
                    break;
                }
                i20++;
            } else {
                obj = null;
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = ((Number) kf.t.o2(arrayList3)).intValue();
        }
        N1[] n1Arr = new N1[4];
        n1Arr[0] = this.f20052i;
        n1Arr[1] = this.f20053j;
        n1Arr[2] = this.f20054k;
        int i21 = (int) (j6 & 4294967295L);
        if (((int) (kotlin.jvm.internal.m.c((jVar.b() / 2) + i19, (jVar.a() / 2) + i18) & 4294967295L)) < i21 / 2) {
            s4Var = this.f20055l;
        } else {
            s4Var = this.f20056m;
        }
        n1Arr[3] = s4Var;
        List G03 = AbstractC4344b.G0(n1Arr);
        ArrayList arrayList4 = new ArrayList(G03.size());
        int size3 = G03.size();
        int i22 = 0;
        while (i22 < size3) {
            arrayList4.add(Integer.valueOf(((N1) G03.get(i22)).a(jVar, j6, (int) (j10 & 4294967295L))));
            i22++;
            i21 = i21;
        }
        int i23 = i21;
        int size4 = arrayList4.size();
        int i24 = 0;
        while (true) {
            if (i24 < size4) {
                obj2 = arrayList4.get(i24);
                int intValue2 = ((Number) obj2).intValue();
                int i25 = this.f20046c;
                if (intValue2 >= i25 && intValue2 + ((int) (j10 & 4294967295L)) <= i23 - i25) {
                    break;
                }
                i24++;
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num2 = (Integer) obj2;
        if (num2 != null) {
            i11 = num2.intValue();
        } else {
            i11 = ((Number) kf.t.o2(arrayList4)).intValue();
        }
        long c11 = kotlin.jvm.internal.m.c(i10, i11);
        this.f20047d.invoke(jVar, Df.H.i(c11, j10));
        return c11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1548f1)) {
            return false;
        }
        C1548f1 c1548f1 = (C1548f1) obj;
        long j6 = c1548f1.f20044a;
        int i10 = Z0.f.f22790c;
        if (this.f20044a == j6 && AbstractC3557B.K(this.f20045b, c1548f1.f20045b) && this.f20046c == c1548f1.f20046c && AbstractC3557B.K(this.f20047d, c1548f1.f20047d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = Z0.f.f22790c;
        long j6 = this.f20044a;
        int hashCode = this.f20045b.hashCode();
        return this.f20047d.hashCode() + ((((hashCode + (((int) (j6 ^ (j6 >>> 32))) * 31)) * 31) + this.f20046c) * 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) Z0.f.c(this.f20044a)) + ", density=" + this.f20045b + ", verticalMargin=" + this.f20046c + ", onPositionCalculated=" + this.f20047d + ')';
    }
}
