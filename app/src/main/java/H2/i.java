package H2;

import E2.i0;
import M3.H;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import c1.AbstractC2279d;
import java.util.ArrayList;
import java.util.Map;
import p2.AbstractC5057j;
import p2.m0;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class i extends m0 {

    /* renamed from: B1  reason: collision with root package name */
    public static final String f7249B1 = Integer.toString(1000, 36);

    /* renamed from: C1  reason: collision with root package name */
    public static final String f7250C1 = Integer.toString(1001, 36);

    /* renamed from: D1  reason: collision with root package name */
    public static final String f7251D1 = Integer.toString(1002, 36);

    /* renamed from: E1  reason: collision with root package name */
    public static final String f7252E1 = Integer.toString(1003, 36);

    /* renamed from: F1  reason: collision with root package name */
    public static final String f7253F1 = Integer.toString(1004, 36);

    /* renamed from: G1  reason: collision with root package name */
    public static final String f7254G1 = Integer.toString(1005, 36);

    /* renamed from: H1  reason: collision with root package name */
    public static final String f7255H1 = Integer.toString(1006, 36);

    /* renamed from: I1  reason: collision with root package name */
    public static final String f7256I1 = Integer.toString(1007, 36);

    /* renamed from: J1  reason: collision with root package name */
    public static final String f7257J1 = Integer.toString(1008, 36);

    /* renamed from: K1  reason: collision with root package name */
    public static final String f7258K1 = Integer.toString(1009, 36);

    /* renamed from: L1  reason: collision with root package name */
    public static final String f7259L1 = Integer.toString(1010, 36);

    /* renamed from: M1  reason: collision with root package name */
    public static final String f7260M1 = Integer.toString(1011, 36);
    public static final String N1 = Integer.toString(1012, 36);

    /* renamed from: O1  reason: collision with root package name */
    public static final String f7261O1 = Integer.toString(1013, 36);

    /* renamed from: P1  reason: collision with root package name */
    public static final String f7262P1 = Integer.toString(1014, 36);

    /* renamed from: Q1  reason: collision with root package name */
    public static final String f7263Q1 = Integer.toString(1015, 36);

    /* renamed from: R1  reason: collision with root package name */
    public static final String f7264R1 = Integer.toString(1016, 36);

    /* renamed from: S1  reason: collision with root package name */
    public static final String f7265S1 = Integer.toString(1017, 36);

    /* renamed from: U1  reason: collision with root package name */
    public static final String f7266U1 = Integer.toString(1018, 36);

    /* renamed from: A1  reason: collision with root package name */
    public final SparseBooleanArray f7267A1;

    /* renamed from: k1  reason: collision with root package name */
    public final boolean f7268k1;

    /* renamed from: l1  reason: collision with root package name */
    public final boolean f7269l1;

    /* renamed from: m1  reason: collision with root package name */
    public final boolean f7270m1;

    /* renamed from: n1  reason: collision with root package name */
    public final boolean f7271n1;

    /* renamed from: o1  reason: collision with root package name */
    public final boolean f7272o1;

    /* renamed from: p1  reason: collision with root package name */
    public final boolean f7273p1;

    /* renamed from: q1  reason: collision with root package name */
    public final boolean f7274q1;

    /* renamed from: r1  reason: collision with root package name */
    public final boolean f7275r1;

    /* renamed from: s1  reason: collision with root package name */
    public final boolean f7276s1;

    /* renamed from: t1  reason: collision with root package name */
    public final boolean f7277t1;

    /* renamed from: u1  reason: collision with root package name */
    public final boolean f7278u1;

    /* renamed from: v1  reason: collision with root package name */
    public final boolean f7279v1;

    /* renamed from: w1  reason: collision with root package name */
    public final boolean f7280w1;

    /* renamed from: x1  reason: collision with root package name */
    public final boolean f7281x1;

    /* renamed from: y1  reason: collision with root package name */
    public final boolean f7282y1;

    /* renamed from: z1  reason: collision with root package name */
    public final SparseArray f7283z1;

    static {
        new i(new h());
        int i10 = AbstractC5530A.f45131a;
    }

    public i(h hVar) {
        super(hVar);
        this.f7268k1 = hVar.f7246x;
        this.f7269l1 = hVar.f7247y;
        this.f7270m1 = hVar.f7248z;
        this.f7271n1 = hVar.f7232A;
        this.f7272o1 = hVar.f7233B;
        this.f7273p1 = hVar.f7234C;
        this.f7274q1 = hVar.f7235D;
        this.f7275r1 = hVar.f7236E;
        this.f7276s1 = hVar.f7237F;
        this.f7277t1 = hVar.f7238G;
        this.f7278u1 = hVar.f7239H;
        this.f7279v1 = hVar.f7240I;
        this.f7280w1 = hVar.f7241J;
        this.f7281x1 = hVar.f7242K;
        this.f7282y1 = hVar.f7243L;
        this.f7283z1 = hVar.f7244M;
        this.f7267A1 = hVar.f7245N;
    }

    @Override // p2.m0, p2.AbstractC5057j
    public final Bundle a() {
        Bundle a5 = super.a();
        a5.putBoolean(f7249B1, this.f7268k1);
        a5.putBoolean(f7250C1, this.f7269l1);
        a5.putBoolean(f7251D1, this.f7270m1);
        a5.putBoolean(f7262P1, this.f7271n1);
        a5.putBoolean(f7252E1, this.f7272o1);
        a5.putBoolean(f7253F1, this.f7273p1);
        a5.putBoolean(f7254G1, this.f7274q1);
        a5.putBoolean(f7255H1, this.f7275r1);
        a5.putBoolean(f7263Q1, this.f7276s1);
        a5.putBoolean(f7266U1, this.f7277t1);
        a5.putBoolean(f7264R1, this.f7278u1);
        a5.putBoolean(f7256I1, this.f7279v1);
        a5.putBoolean(f7257J1, this.f7280w1);
        a5.putBoolean(f7258K1, this.f7281x1);
        a5.putBoolean(f7265S1, this.f7282y1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f7283z1;
            if (i10 >= sparseArray2.size()) {
                break;
            }
            int keyAt = sparseArray2.keyAt(i10);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i10)).entrySet()) {
                j jVar = (j) entry.getValue();
                if (jVar != null) {
                    sparseArray.put(arrayList2.size(), jVar);
                }
                arrayList2.add((i0) entry.getKey());
                arrayList.add(Integer.valueOf(keyAt));
            }
            a5.putIntArray(f7259L1, H.y0(arrayList));
            a5.putParcelableArrayList(f7260M1, AbstractC2279d.z(arrayList2));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                sparseArray3.put(sparseArray.keyAt(i11), ((AbstractC5057j) sparseArray.valueAt(i11)).a());
            }
            a5.putSparseParcelableArray(N1, sparseArray3);
            i10++;
        }
        SparseBooleanArray sparseBooleanArray = this.f7267A1;
        int[] iArr = new int[sparseBooleanArray.size()];
        for (int i12 = 0; i12 < sparseBooleanArray.size(); i12++) {
            iArr[i12] = sparseBooleanArray.keyAt(i12);
        }
        a5.putIntArray(f7261O1, iArr);
        return a5;
    }

    @Override // p2.m0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (super.equals(iVar) && this.f7268k1 == iVar.f7268k1 && this.f7269l1 == iVar.f7269l1 && this.f7270m1 == iVar.f7270m1 && this.f7271n1 == iVar.f7271n1 && this.f7272o1 == iVar.f7272o1 && this.f7273p1 == iVar.f7273p1 && this.f7274q1 == iVar.f7274q1 && this.f7275r1 == iVar.f7275r1 && this.f7276s1 == iVar.f7276s1 && this.f7277t1 == iVar.f7277t1 && this.f7278u1 == iVar.f7278u1 && this.f7279v1 == iVar.f7279v1 && this.f7280w1 == iVar.f7280w1 && this.f7281x1 == iVar.f7281x1 && this.f7282y1 == iVar.f7282y1) {
            SparseBooleanArray sparseBooleanArray = this.f7267A1;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = iVar.f7267A1;
            if (sparseBooleanArray2.size() == size) {
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                            break;
                        }
                        i10++;
                    } else {
                        SparseArray sparseArray = this.f7283z1;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = iVar.f7283z1;
                        if (sparseArray2.size() == size2) {
                            for (int i11 = 0; i11 < size2; i11++) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i11);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            i0 i0Var = (i0) entry.getKey();
                                            if (map2.containsKey(i0Var)) {
                                                if (!AbstractC5530A.a(entry.getValue(), map2.get(i0Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p2.m0
    public final int hashCode() {
        return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f7268k1 ? 1 : 0)) * 31) + (this.f7269l1 ? 1 : 0)) * 31) + (this.f7270m1 ? 1 : 0)) * 31) + (this.f7271n1 ? 1 : 0)) * 31) + (this.f7272o1 ? 1 : 0)) * 31) + (this.f7273p1 ? 1 : 0)) * 31) + (this.f7274q1 ? 1 : 0)) * 31) + (this.f7275r1 ? 1 : 0)) * 31) + (this.f7276s1 ? 1 : 0)) * 31) + (this.f7277t1 ? 1 : 0)) * 31) + (this.f7278u1 ? 1 : 0)) * 31) + (this.f7279v1 ? 1 : 0)) * 31) + (this.f7280w1 ? 1 : 0)) * 31) + (this.f7281x1 ? 1 : 0)) * 31) + (this.f7282y1 ? 1 : 0);
    }
}
