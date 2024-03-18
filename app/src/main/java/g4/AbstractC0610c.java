package G4;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.util.List;
import v4.C5971a;

/* renamed from: G4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0610c {

    /* renamed from: a  reason: collision with root package name */
    public static final U3.c f5998a = U3.c.y("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b  reason: collision with root package name */
    public static final U3.c f5999b = U3.c.y("k");

    /* JADX WARN: Code restructure failed: missing block: B:71:0x018e, code lost:
        if (r0.f8855b == 1.0f) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4.e a(H4.b bVar, C5971a c5971a) {
        Object[] objArr;
        C4.c cVar;
        C4.f fVar;
        C4.a aVar;
        C4.b bVar2;
        C4.b bVar3;
        C4.b bVar4;
        C4.b bVar5;
        List list;
        C4.b bVar6;
        C4.b bVar7;
        boolean z10;
        boolean z11 = false;
        if (bVar.P() == 3) {
            objArr = 1;
        } else {
            objArr = null;
        }
        if (objArr != null) {
            bVar.h();
        }
        C4.b bVar8 = null;
        C4.b bVar9 = null;
        C4.c cVar2 = null;
        C4.f fVar2 = null;
        C4.a aVar2 = null;
        C4.b bVar10 = null;
        C4.a aVar3 = null;
        C4.b bVar11 = null;
        C4.b bVar12 = null;
        while (bVar.m()) {
            switch (bVar.V(f5998a)) {
                case 0:
                    bVar5 = bVar9;
                    bVar.h();
                    while (bVar.m()) {
                        if (bVar.V(f5999b) != 0) {
                            bVar.a0();
                            bVar.d0();
                        } else {
                            cVar2 = AbstractC0608a.a(bVar, c5971a);
                        }
                    }
                    bVar.j();
                    bVar9 = bVar5;
                    z11 = false;
                    break;
                case 1:
                    fVar2 = AbstractC0608a.b(bVar, c5971a);
                    z11 = false;
                    break;
                case 2:
                    bVar5 = bVar9;
                    aVar2 = new C4.a(4, s.a(bVar, c5971a, 1.0f, C.f5986Y, z11));
                    bVar9 = bVar5;
                    z11 = false;
                    break;
                case 3:
                    c5971a.a("Lottie doesn't support 3D layers.");
                    C4.b d02 = M3.H.d0(bVar, c5971a, z11);
                    list = d02.f2681Z;
                    if (!list.isEmpty()) {
                        bVar7 = d02;
                        bVar6 = bVar9;
                        list.add(new J4.a(c5971a, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(c5971a.f47160m)));
                    } else {
                        bVar7 = d02;
                        bVar6 = bVar9;
                        if (((J4.a) list.get(z11 ? 1 : 0)).f8839b == null) {
                            z10 = false;
                            list.set(0, new J4.a(c5971a, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(c5971a.f47160m)));
                            z11 = z10;
                            bVar8 = bVar7;
                            bVar9 = bVar6;
                            break;
                        }
                    }
                    z10 = false;
                    z11 = z10;
                    bVar8 = bVar7;
                    bVar9 = bVar6;
                case 4:
                    C4.b d022 = M3.H.d0(bVar, c5971a, z11);
                    list = d022.f2681Z;
                    if (!list.isEmpty()) {
                    }
                    z10 = false;
                    z11 = z10;
                    bVar8 = bVar7;
                    bVar9 = bVar6;
                    break;
                case 5:
                    aVar3 = M3.H.e0(bVar, c5971a);
                    break;
                case 6:
                    bVar11 = M3.H.d0(bVar, c5971a, z11);
                    break;
                case 7:
                    bVar12 = M3.H.d0(bVar, c5971a, z11);
                    break;
                case 8:
                    bVar10 = M3.H.d0(bVar, c5971a, z11);
                    break;
                case 9:
                    bVar9 = M3.H.d0(bVar, c5971a, z11);
                    break;
                default:
                    bVar.a0();
                    bVar.d0();
                    break;
            }
        }
        C4.b bVar13 = bVar9;
        if (objArr != null) {
            bVar.j();
        }
        if (cVar2 != null && (!cVar2.r() || !((PointF) ((J4.a) cVar2.f2667Y.get(0)).f8839b).equals(0.0f, 0.0f))) {
            cVar = cVar2;
        } else {
            cVar = null;
        }
        if (fVar2 != null && ((fVar2 instanceof C4.d) || !fVar2.r() || !((PointF) ((J4.a) fVar2.t().get(0)).f8839b).equals(0.0f, 0.0f))) {
            fVar = fVar2;
        } else {
            fVar = null;
        }
        if (bVar8 == null || (bVar8.r() && ((Float) ((J4.a) bVar8.f2681Z.get(0)).f8839b).floatValue() == 0.0f)) {
            bVar8 = null;
        }
        if (aVar2 != null) {
            if (aVar2.r()) {
                J4.b bVar14 = (J4.b) ((J4.a) aVar2.f2681Z.get(0)).f8839b;
                if (bVar14.f8854a == 1.0f) {
                }
            }
            aVar = aVar2;
            if (bVar10 == null && (!bVar10.r() || ((Float) ((J4.a) bVar10.f2681Z.get(0)).f8839b).floatValue() != 0.0f)) {
                bVar2 = bVar10;
                bVar3 = bVar13;
            } else {
                bVar3 = bVar13;
                bVar2 = null;
            }
            if (bVar3 == null && (!bVar3.r() || ((Float) ((J4.a) bVar3.f2681Z.get(0)).f8839b).floatValue() != 0.0f)) {
                bVar4 = bVar3;
            } else {
                bVar4 = null;
            }
            return new C4.e(cVar, fVar, aVar, bVar8, aVar3, bVar11, bVar12, bVar2, bVar4);
        }
        aVar = null;
        if (bVar10 == null) {
        }
        bVar3 = bVar13;
        bVar2 = null;
        if (bVar3 == null) {
        }
        bVar4 = null;
        return new C4.e(cVar, fVar, aVar, bVar8, aVar3, bVar11, bVar12, bVar2, bVar4);
    }
}
