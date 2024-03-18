package y4;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class n extends e {

    /* renamed from: h  reason: collision with root package name */
    public final D4.k f50743h = new D4.k();

    /* renamed from: i  reason: collision with root package name */
    public final Path f50744i = new Path();

    /* renamed from: j  reason: collision with root package name */
    public List f50745j;

    public n(List list) {
        super(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0245, code lost:
        if (r10 == (r3.size() - 1)) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /* JADX WARN: Type inference failed for: r11v10, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [int] */
    /* JADX WARN: Type inference failed for: r12v10, types: [int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List, java.util.ArrayList] */
    @Override // y4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(J4.a aVar, float f6) {
        boolean z10;
        int i10;
        int i11;
        PointF pointF;
        PointF pointF2;
        int i12;
        int i13;
        D4.k kVar;
        int i14;
        ArrayList arrayList;
        int i15;
        PointF pointF3;
        PointF pointF4;
        int i16;
        int i17;
        n nVar = this;
        D4.k kVar2 = (D4.k) aVar.f8839b;
        D4.k kVar3 = (D4.k) aVar.f8840c;
        if (kVar3 == null) {
            kVar3 = kVar2;
        }
        D4.k kVar4 = nVar.f50743h;
        if (kVar4.f3389b == null) {
            kVar4.f3389b = new PointF();
        }
        boolean z11 = false;
        int i18 = 1;
        if (!kVar2.f3390c && !kVar3.f3390c) {
            z10 = false;
        } else {
            z10 = true;
        }
        kVar4.f3390c = z10;
        ArrayList arrayList2 = kVar2.f3388a;
        int size = arrayList2.size();
        int size2 = kVar3.f3388a.size();
        ArrayList arrayList3 = kVar3.f3388a;
        if (size != size2) {
            I4.b.a("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int min = Math.min(arrayList2.size(), arrayList3.size());
        ArrayList arrayList4 = kVar4.f3388a;
        if (arrayList4.size() < min) {
            for (int size3 = arrayList4.size(); size3 < min; size3++) {
                arrayList4.add(new B4.a());
            }
        } else if (arrayList4.size() > min) {
            for (int size4 = arrayList4.size() - 1; size4 >= min; size4--) {
                arrayList4.remove(arrayList4.size() - 1);
            }
        }
        PointF pointF5 = kVar2.f3389b;
        PointF pointF6 = kVar3.f3389b;
        kVar4.a(I4.f.d(pointF5.x, pointF6.x, f6), I4.f.d(pointF5.y, pointF6.y, f6));
        for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
            B4.a aVar2 = (B4.a) arrayList2.get(size5);
            B4.a aVar3 = (B4.a) arrayList3.get(size5);
            PointF pointF7 = aVar2.f1836a;
            PointF pointF8 = aVar3.f1836a;
            ((B4.a) arrayList4.get(size5)).f1836a.set(I4.f.d(pointF7.x, pointF8.x, f6), I4.f.d(pointF7.y, pointF8.y, f6));
            PointF pointF9 = aVar2.f1837b;
            float f10 = pointF9.x;
            PointF pointF10 = aVar3.f1837b;
            ((B4.a) arrayList4.get(size5)).f1837b.set(I4.f.d(f10, pointF10.x, f6), I4.f.d(pointF9.y, pointF10.y, f6));
            PointF pointF11 = aVar2.f1838c;
            float f11 = pointF11.x;
            PointF pointF12 = aVar3.f1838c;
            ((B4.a) arrayList4.get(size5)).f1838c.set(I4.f.d(f11, pointF12.x, f6), I4.f.d(pointF11.y, pointF12.y, f6));
        }
        List list = nVar.f50745j;
        if (list != null) {
            int size6 = list.size() - 1;
            while (size6 >= 0) {
                x4.p pVar = (x4.p) nVar.f50745j.get(size6);
                pVar.getClass();
                ArrayList arrayList5 = kVar4.f3388a;
                if (arrayList5.size() > 2) {
                    float floatValue = ((Float) pVar.f48878b.d()).floatValue();
                    if (floatValue != 0.0f) {
                        boolean z12 = kVar4.f3390c;
                        int size7 = arrayList5.size() - i18;
                        int i19 = z11;
                        while (size7 >= 0) {
                            B4.a aVar4 = (B4.a) arrayList5.get(size7);
                            B4.a aVar5 = (B4.a) arrayList5.get(x4.p.d(size7 - 1, arrayList5.size()));
                            if (size7 == 0 && !z12) {
                                pointF3 = kVar4.f3389b;
                            } else {
                                pointF3 = aVar5.f1838c;
                            }
                            if (size7 == 0 && !z12) {
                                pointF4 = pointF3;
                            } else {
                                pointF4 = aVar5.f1837b;
                            }
                            PointF pointF13 = aVar4.f1836a;
                            if (!kVar4.f3390c && (size7 == 0 || size7 == arrayList5.size() - i18)) {
                                i16 = i18;
                            } else {
                                i16 = z11;
                            }
                            if (pointF4.equals(pointF3) && pointF13.equals(pointF3) && !i16) {
                                i17 = i19 + 2;
                            } else {
                                int i20 = i19 == true ? 1 : 0;
                                int i21 = i19 == true ? 1 : 0;
                                i17 = i20 + 1;
                            }
                            size7--;
                            i19 = i17;
                        }
                        D4.k kVar5 = pVar.f48879c;
                        if (kVar5 == null || kVar5.f3388a.size() != i19) {
                            ArrayList arrayList6 = new ArrayList((int) i19);
                            for (int i22 = z11; i22 < i19; i22++) {
                                arrayList6.add(new B4.a());
                            }
                            pVar.f48879c = new D4.k(new PointF(0.0f, 0.0f), z11, arrayList6);
                        }
                        D4.k kVar6 = pVar.f48879c;
                        kVar6.f3390c = z12;
                        PointF pointF14 = kVar4.f3389b;
                        kVar6.a(pointF14.x, pointF14.y);
                        ?? r82 = kVar6.f3388a;
                        boolean z13 = kVar4.f3390c;
                        boolean z14 = z11;
                        ?? r11 = z14;
                        ArrayList arrayList7 = arrayList5;
                        int i23 = z14;
                        while (i23 < arrayList7.size()) {
                            B4.a aVar6 = (B4.a) arrayList7.get(i23);
                            B4.a aVar7 = (B4.a) arrayList7.get(x4.p.d(i23 - 1, arrayList7.size()));
                            B4.a aVar8 = (B4.a) arrayList7.get(x4.p.d(i23 - 2, arrayList7.size()));
                            if (i23 == 0 && !z13) {
                                pointF = kVar4.f3389b;
                            } else {
                                pointF = aVar7.f1838c;
                            }
                            if (i23 == 0 && !z13) {
                                pointF2 = pointF;
                            } else {
                                pointF2 = aVar7.f1837b;
                            }
                            PointF pointF15 = aVar6.f1836a;
                            PointF pointF16 = aVar8.f1838c;
                            boolean z15 = z13;
                            if (!kVar4.f3390c) {
                                if (i23 != 0) {
                                    i12 = 1;
                                } else {
                                    i12 = 1;
                                }
                                i13 = i12;
                                if (!pointF2.equals(pointF) && pointF15.equals(pointF) && i13 == 0) {
                                    float f12 = pointF.x;
                                    float f13 = f12 - pointF16.x;
                                    float f14 = pointF.y;
                                    float f15 = f14 - pointF16.y;
                                    PointF pointF17 = aVar6.f1838c;
                                    arrayList = arrayList7;
                                    float f16 = pointF17.x - f12;
                                    float f17 = pointF17.y - f14;
                                    double d10 = f13;
                                    i14 = size6;
                                    i15 = i23;
                                    D4.k kVar7 = kVar4;
                                    float min2 = Math.min(floatValue / ((float) Math.hypot(d10, f15)), 0.5f);
                                    float min3 = Math.min(floatValue / ((float) Math.hypot(f16, f17)), 0.5f);
                                    float f18 = pointF.x;
                                    float d11 = AbstractC6463a.d(pointF16.x, f18, min2, f18);
                                    float f19 = pointF.y;
                                    float d12 = AbstractC6463a.d(pointF16.y, f19, min2, f19);
                                    float d13 = AbstractC6463a.d(pointF17.x, f18, min3, f18);
                                    float d14 = AbstractC6463a.d(pointF17.y, f19, min3, f19);
                                    float f20 = d11 - ((d11 - f18) * 0.5519f);
                                    float f21 = d12 - ((d12 - f19) * 0.5519f);
                                    float f22 = d13 - ((d13 - f18) * 0.5519f);
                                    float f23 = d14 - ((d14 - f19) * 0.5519f);
                                    B4.a aVar9 = (B4.a) r82.get(x4.p.d(r11 - 1, r82.size()));
                                    B4.a aVar10 = (B4.a) r82.get(r11);
                                    kVar = kVar7;
                                    aVar9.f1837b.set(d11, d12);
                                    aVar9.f1838c.set(d11, d12);
                                    if (i15 == 0) {
                                        kVar6.a(d11, d12);
                                    }
                                    aVar10.f1836a.set(f20, f21);
                                    aVar10.f1837b.set(f22, f23);
                                    aVar10.f1838c.set(d13, d14);
                                    ((B4.a) r82.get(r11 + 1)).f1836a.set(d13, d14);
                                    r11 += 2;
                                } else {
                                    i14 = size6;
                                    arrayList = arrayList7;
                                    kVar = kVar4;
                                    i15 = i23;
                                    B4.a aVar11 = (B4.a) r82.get(x4.p.d(r11 - 1, r82.size()));
                                    PointF pointF18 = aVar7.f1837b;
                                    aVar11.f1837b.set(pointF18.x, pointF18.y);
                                    PointF pointF19 = aVar7.f1838c;
                                    aVar11.f1838c.set(pointF19.x, pointF19.y);
                                    PointF pointF20 = aVar6.f1836a;
                                    ((B4.a) r82.get(r11)).f1836a.set(pointF20.x, pointF20.y);
                                    r11++;
                                }
                                int i24 = i15 + 1;
                                z13 = z15;
                                i18 = i12;
                                arrayList7 = arrayList;
                                size6 = i14;
                                kVar4 = kVar;
                                i23 = i24;
                            } else {
                                i12 = 1;
                            }
                            i13 = 0;
                            if (!pointF2.equals(pointF)) {
                            }
                            i14 = size6;
                            arrayList = arrayList7;
                            kVar = kVar4;
                            i15 = i23;
                            B4.a aVar112 = (B4.a) r82.get(x4.p.d(r11 - 1, r82.size()));
                            PointF pointF182 = aVar7.f1837b;
                            aVar112.f1837b.set(pointF182.x, pointF182.y);
                            PointF pointF192 = aVar7.f1838c;
                            aVar112.f1838c.set(pointF192.x, pointF192.y);
                            PointF pointF202 = aVar6.f1836a;
                            ((B4.a) r82.get(r11)).f1836a.set(pointF202.x, pointF202.y);
                            r11++;
                            int i242 = i15 + 1;
                            z13 = z15;
                            i18 = i12;
                            arrayList7 = arrayList;
                            size6 = i14;
                            kVar4 = kVar;
                            i23 = i242;
                        }
                        i10 = size6;
                        i11 = i18;
                        kVar4 = kVar6;
                        size6 = i10 - 1;
                        nVar = this;
                        i18 = i11;
                        z11 = false;
                    }
                }
                i10 = size6;
                i11 = i18;
                size6 = i10 - 1;
                nVar = this;
                i18 = i11;
                z11 = false;
            }
        }
        Path path = this.f50744i;
        path.reset();
        PointF pointF21 = kVar4.f3389b;
        path.moveTo(pointF21.x, pointF21.y);
        PointF pointF22 = I4.f.f8054a;
        pointF22.set(pointF21.x, pointF21.y);
        int i25 = 0;
        while (true) {
            ArrayList arrayList8 = kVar4.f3388a;
            if (i25 >= arrayList8.size()) {
                break;
            }
            B4.a aVar12 = (B4.a) arrayList8.get(i25);
            PointF pointF23 = aVar12.f1836a;
            boolean equals = pointF23.equals(pointF22);
            PointF pointF24 = aVar12.f1837b;
            PointF pointF25 = aVar12.f1838c;
            if (equals && pointF24.equals(pointF25)) {
                path.lineTo(pointF25.x, pointF25.y);
            } else {
                path.cubicTo(pointF23.x, pointF23.y, pointF24.x, pointF24.y, pointF25.x, pointF25.y);
            }
            pointF22.set(pointF25.x, pointF25.y);
            i25++;
        }
        if (kVar4.f3390c) {
            path.close();
        }
        return path;
    }
}
