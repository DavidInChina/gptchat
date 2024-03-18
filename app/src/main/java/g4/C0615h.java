package G4;

import android.graphics.PointF;
import z.AbstractC6708l;

/* renamed from: G4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615h implements J {

    /* renamed from: Y  reason: collision with root package name */
    public static final C0615h f6005Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final U3.c f6006Z = U3.c.y("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    /* JADX WARN: Type inference failed for: r0v0, types: [B4.b, java.lang.Object] */
    @Override // G4.J
    public final Object c(H4.a aVar, float f6) {
        String str;
        aVar.h();
        String str2 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = true;
        int i13 = 3;
        String str3 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (aVar.m()) {
            switch (aVar.V(f6006Z)) {
                case 0:
                    str2 = aVar.O();
                    continue;
                case 1:
                    str = str2;
                    str3 = aVar.O();
                    break;
                case 2:
                    str = str2;
                    f10 = (float) aVar.r();
                    break;
                case 3:
                    str = str2;
                    int F10 = aVar.F();
                    if (F10 <= 2 && F10 >= 0) {
                        i13 = AbstractC6708l.h(3)[F10];
                        break;
                    } else {
                        i13 = 3;
                        break;
                    }
                case 4:
                    i10 = aVar.F();
                    continue;
                case 5:
                    f11 = (float) aVar.r();
                    continue;
                case 6:
                    f12 = (float) aVar.r();
                    continue;
                case 7:
                    i11 = q.a(aVar);
                    continue;
                case 8:
                    i12 = q.a(aVar);
                    continue;
                case 9:
                    f13 = (float) aVar.r();
                    continue;
                case 10:
                    z10 = aVar.p();
                    continue;
                case 11:
                    aVar.a();
                    pointF = new PointF(((float) aVar.r()) * f6, ((float) aVar.r()) * f6);
                    aVar.i();
                    continue;
                case 12:
                    aVar.a();
                    str = str2;
                    pointF2 = new PointF(((float) aVar.r()) * f6, ((float) aVar.r()) * f6);
                    aVar.i();
                    break;
                default:
                    aVar.a0();
                    aVar.d0();
                    continue;
            }
            str2 = str;
        }
        aVar.j();
        ?? obj = new Object();
        obj.f1839a = str2;
        obj.f1840b = str3;
        obj.f1841c = f10;
        obj.f1842d = i13;
        obj.f1843e = i10;
        obj.f1844f = f11;
        obj.f1845g = f12;
        obj.f1846h = i11;
        obj.f1847i = i12;
        obj.f1848j = f13;
        obj.f1849k = z10;
        obj.f1850l = pointF;
        obj.f1851m = pointF2;
        return obj;
    }
}
