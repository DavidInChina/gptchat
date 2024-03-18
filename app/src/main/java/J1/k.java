package j1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public m f35989a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f35990b;

    public static long a(f fVar, long j6) {
        m mVar = fVar.f35978d;
        if (mVar instanceof i) {
            return j6;
        }
        ArrayList arrayList = fVar.f35985k;
        int size = arrayList.size();
        long j10 = j6;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f35978d != mVar) {
                    j10 = Math.min(j10, a(fVar2, fVar2.f35980f + j6));
                }
            }
        }
        if (fVar == mVar.f36001i) {
            long j11 = mVar.j();
            f fVar3 = mVar.f36000h;
            long j12 = j6 - j11;
            return Math.min(Math.min(j10, a(fVar3, j12)), j12 - fVar3.f35980f);
        }
        return j10;
    }

    public static long b(f fVar, long j6) {
        m mVar = fVar.f35978d;
        if (mVar instanceof i) {
            return j6;
        }
        ArrayList arrayList = fVar.f35985k;
        int size = arrayList.size();
        long j10 = j6;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f35978d != mVar) {
                    j10 = Math.max(j10, b(fVar2, fVar2.f35980f + j6));
                }
            }
        }
        if (fVar == mVar.f36000h) {
            long j11 = mVar.j();
            f fVar3 = mVar.f36001i;
            long j12 = j6 + j11;
            return Math.max(Math.max(j10, b(fVar3, j12)), j12 - fVar3.f35980f);
        }
        return j10;
    }
}
