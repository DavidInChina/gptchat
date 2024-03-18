package I2;

import java.util.ArrayList;
import java.util.Collections;
import v.C5934c;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: h  reason: collision with root package name */
    public static final C5934c f8014h = new C5934c(18);

    /* renamed from: i  reason: collision with root package name */
    public static final C5934c f8015i = new C5934c(19);

    /* renamed from: a  reason: collision with root package name */
    public final int f8016a;

    /* renamed from: e  reason: collision with root package name */
    public int f8020e;

    /* renamed from: f  reason: collision with root package name */
    public int f8021f;

    /* renamed from: g  reason: collision with root package name */
    public int f8022g;

    /* renamed from: c  reason: collision with root package name */
    public final o[] f8018c = new o[5];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f8017b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public int f8019d = -1;

    public p(int i10) {
        this.f8016a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i10, float f6) {
        o oVar;
        int i11 = this.f8019d;
        ArrayList arrayList = this.f8017b;
        if (i11 != 1) {
            Collections.sort(arrayList, f8014h);
            this.f8019d = 1;
        }
        int i12 = this.f8022g;
        o[] oVarArr = this.f8018c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f8022g = i13;
            oVar = oVarArr[i13];
        } else {
            oVar = new Object();
        }
        int i14 = this.f8020e;
        this.f8020e = i14 + 1;
        oVar.f8011a = i14;
        oVar.f8012b = i10;
        oVar.f8013c = f6;
        arrayList.add(oVar);
        this.f8021f += i10;
        while (true) {
            int i15 = this.f8021f;
            int i16 = this.f8016a;
            if (i15 > i16) {
                int i17 = i15 - i16;
                o oVar2 = (o) arrayList.get(0);
                int i18 = oVar2.f8012b;
                if (i18 <= i17) {
                    this.f8021f -= i18;
                    arrayList.remove(0);
                    int i19 = this.f8022g;
                    if (i19 < 5) {
                        this.f8022g = i19 + 1;
                        oVarArr[i19] = oVar2;
                    }
                } else {
                    oVar2.f8012b = i18 - i17;
                    this.f8021f -= i17;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f8019d;
        ArrayList arrayList = this.f8017b;
        if (i10 != 0) {
            Collections.sort(arrayList, f8015i);
            this.f8019d = 0;
        }
        float f6 = 0.5f * this.f8021f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            o oVar = (o) arrayList.get(i12);
            i11 += oVar.f8012b;
            if (i11 >= f6) {
                return oVar.f8013c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((o) arrayList.get(arrayList.size() - 1)).f8013c;
    }
}
