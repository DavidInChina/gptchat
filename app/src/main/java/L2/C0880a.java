package L2;

import android.gov.nist.core.Separators;

/* renamed from: L2.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0880a {

    /* renamed from: a  reason: collision with root package name */
    public final int f10547a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10548b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10549c;

    public /* synthetic */ C0880a(int i10, int i11, String str) {
        this.f10547a = i10;
        this.f10548b = i11;
        this.f10549c = str;
    }

    public static C0880a a(s2.u uVar) {
        String str;
        uVar.G(2);
        int u10 = uVar.u();
        int i10 = u10 >> 1;
        int u11 = ((uVar.u() >> 3) & 31) | ((u10 & 1) << 5);
        if (i10 != 4 && i10 != 5 && i10 != 7) {
            if (i10 == 8) {
                str = "hev1";
            } else if (i10 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(str2);
        sb2.append(i10);
        if (u11 >= 10) {
            str2 = Separators.DOT;
        }
        sb2.append(str2);
        sb2.append(u11);
        return new C0880a(i10, u11, sb2.toString());
    }
}
