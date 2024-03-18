package o3;

import g3.AbstractC3162e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import s2.AbstractC5530A;
import v.C5934c;

/* renamed from: o3.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4914j implements AbstractC3162e {

    /* renamed from: Y  reason: collision with root package name */
    public final List f40573Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long[] f40574Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long[] f40575h0;

    public C4914j(ArrayList arrayList) {
        this.f40573Y = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f40574Z = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C4907c c4907c = (C4907c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f40574Z;
            jArr[i11] = c4907c.f40547b;
            jArr[i11 + 1] = c4907c.f40548c;
        }
        long[] jArr2 = this.f40574Z;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f40575h0 = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // g3.AbstractC3162e
    public final int a(long j6) {
        long[] jArr = this.f40575h0;
        int b10 = AbstractC5530A.b(jArr, j6, false);
        if (b10 >= jArr.length) {
            return -1;
        }
        return b10;
    }

    @Override // g3.AbstractC3162e
    public final long b(int i10) {
        boolean z10;
        boolean z11 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        long[] jArr = this.f40575h0;
        if (i10 < jArr.length) {
            z11 = true;
        }
        Gi.e.l(z11);
        return jArr[i10];
    }

    @Override // g3.AbstractC3162e
    public final List c(long j6) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = this.f40573Y;
            if (i10 >= list.size()) {
                break;
            }
            int i11 = i10 * 2;
            long[] jArr = this.f40574Z;
            if (jArr[i11] <= j6 && j6 < jArr[i11 + 1]) {
                C4907c c4907c = (C4907c) list.get(i10);
                r2.b bVar = c4907c.f40546a;
                if (bVar.f44359j0 == -3.4028235E38f) {
                    arrayList2.add(c4907c);
                } else {
                    arrayList.add(bVar);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new C5934c(23));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            r2.b bVar2 = ((C4907c) arrayList2.get(i12)).f40546a;
            arrayList.add(new r2.b(bVar2.f44355Y, bVar2.f44356Z, bVar2.f44357h0, bVar2.f44358i0, (-1) - i12, 1, bVar2.f44361l0, bVar2.f44362m0, bVar2.f44363n0, bVar2.f44368s0, bVar2.f44369t0, bVar2.f44364o0, bVar2.f44365p0, bVar2.f44366q0, bVar2.f44367r0, bVar2.f44370u0, bVar2.f44371v0));
        }
        return arrayList;
    }

    @Override // g3.AbstractC3162e
    public final int d() {
        return this.f40575h0.length;
    }
}
