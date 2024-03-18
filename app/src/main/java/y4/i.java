package y4;

import android.gov.nist.core.Separators;
import android.graphics.PointF;
import java.util.List;
import r9.y;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class i extends k {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f50734h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f50735i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i10, List list) {
        super(list);
        this.f50734h = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    D4.c cVar = (D4.c) ((J4.a) list.get(i12)).f8839b;
                    if (cVar != null) {
                        i11 = Math.max(i11, cVar.f3346b.length);
                    }
                }
                this.f50735i = new D4.c(new float[i11], new int[i11]);
                return;
            }
            super(list);
            this.f50735i = new J4.b(1.0f, 1.0f);
            return;
        }
        super(list);
        this.f50735i = new PointF();
    }

    @Override // y4.e
    public final Object e(J4.a aVar, float f6) {
        Object obj;
        Object obj2 = aVar.f8839b;
        int i10 = this.f50734h;
        Object obj3 = this.f50735i;
        switch (i10) {
            case 0:
                D4.c cVar = (D4.c) obj3;
                D4.c cVar2 = (D4.c) obj2;
                D4.c cVar3 = (D4.c) aVar.f8840c;
                cVar.getClass();
                if (cVar2.equals(cVar3)) {
                    cVar.a(cVar2);
                } else if (f6 <= 0.0f) {
                    cVar.a(cVar2);
                } else if (f6 >= 1.0f) {
                    cVar.a(cVar3);
                } else {
                    int[] iArr = cVar2.f3346b;
                    int length = iArr.length;
                    int[] iArr2 = cVar3.f3346b;
                    if (length == iArr2.length) {
                        int i11 = 0;
                        while (true) {
                            int length2 = iArr.length;
                            int[] iArr3 = cVar.f3346b;
                            float[] fArr = cVar.f3345a;
                            if (i11 < length2) {
                                fArr[i11] = I4.f.d(cVar2.f3345a[i11], cVar3.f3345a[i11], f6);
                                iArr3[i11] = y.g0(f6, iArr[i11], iArr2[i11]);
                                i11++;
                            } else {
                                for (int length3 = iArr.length; length3 < fArr.length; length3++) {
                                    fArr[length3] = fArr[iArr.length - 1];
                                    iArr3[length3] = iArr3[iArr.length - 1];
                                }
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb2.append(iArr.length);
                        sb2.append(" vs ");
                        throw new IllegalArgumentException(android.gov.nist.core.a.l(sb2, iArr2.length, Separators.RPAREN));
                    }
                }
                return cVar;
            case 1:
                return h(aVar, f6, f6);
            default:
                if (obj2 != null && (obj = aVar.f8840c) != null) {
                    J4.b bVar = (J4.b) obj2;
                    J4.b bVar2 = (J4.b) obj;
                    J4.b bVar3 = (J4.b) obj3;
                    float d10 = I4.f.d(bVar.f8854a, bVar2.f8854a, f6);
                    float d11 = I4.f.d(bVar.f8855b, bVar2.f8855b, f6);
                    bVar3.f8854a = d10;
                    bVar3.f8855b = d11;
                    return bVar3;
                }
                throw new IllegalStateException("Missing values for keyframe.");
        }
    }

    @Override // y4.e
    public final /* bridge */ /* synthetic */ Object f(J4.a aVar, float f6, float f10, float f11) {
        switch (this.f50734h) {
            case 1:
                return h(aVar, f10, f11);
            default:
                super.f(aVar, f6, f10, f11);
                throw null;
        }
    }

    public final PointF h(J4.a aVar, float f6, float f10) {
        Object obj;
        Object obj2 = aVar.f8839b;
        if (obj2 != null && (obj = aVar.f8840c) != null) {
            PointF pointF = (PointF) obj2;
            PointF pointF2 = (PointF) obj;
            PointF pointF3 = (PointF) this.f50735i;
            float f11 = pointF.x;
            float d10 = AbstractC6463a.d(pointF2.x, f11, f6, f11);
            float f12 = pointF.y;
            pointF3.set(d10, AbstractC6463a.d(pointF2.y, f12, f10, f12));
            return pointF3;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
