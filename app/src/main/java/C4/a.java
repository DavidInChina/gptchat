package C4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y4.i;
import y4.n;

/* loaded from: classes2.dex */
public final class a extends g {

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f2666h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, List list) {
        super(list);
        this.f2666h0 = i10;
    }

    @Override // C4.f
    public final y4.e s() {
        int i10 = this.f2666h0;
        List list = this.f2681Z;
        switch (i10) {
            case 0:
                return new y4.e(list);
            case 1:
                return new i(0, list);
            case 2:
                return new y4.e(list);
            case 3:
                return new i(1, list);
            case 4:
                return new i(2, list);
            case 5:
                return new n(list);
            default:
                return new y4.e(list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ArrayList arrayList) {
        super(arrayList);
        this.f2666h0 = 1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            J4.a aVar = (J4.a) arrayList.get(i10);
            D4.c cVar = (D4.c) aVar.f8839b;
            D4.c cVar2 = (D4.c) aVar.f8840c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f3345a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f3345a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f6 = Float.NaN;
                    int i11 = 0;
                    for (int i12 = 0; i12 < length2; i12++) {
                        float f10 = fArr3[i12];
                        if (f10 != f6) {
                            fArr3[i11] = f10;
                            i11++;
                            f6 = fArr3[i12];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i11);
                    aVar = new J4.a(cVar.b(copyOfRange), cVar2.b(copyOfRange));
                }
            }
            arrayList.set(i10, aVar);
        }
    }
}
