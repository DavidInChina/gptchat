package k3;

import M3.H;
import android.gov.nist.core.Separators;
import android.graphics.Color;
import k6.AbstractC4194d;
import s2.p;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f36988a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36989b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f36990c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f36991d;

    /* renamed from: e  reason: collision with root package name */
    public final float f36992e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f36993f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f36994g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f36995h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f36996i;

    /* renamed from: j  reason: collision with root package name */
    public final int f36997j;

    public e(String str, int i10, Integer num, Integer num2, float f6, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f36988a = str;
        this.f36989b = i10;
        this.f36990c = num;
        this.f36991d = num2;
        this.f36992e = f6;
        this.f36993f = z10;
        this.f36994g = z11;
        this.f36995h = z12;
        this.f36996i = z13;
        this.f36997j = i11;
    }

    public static int a(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC4194d.C("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e10) {
            p.h("SsaStyle", "Failed to parse boolean value: '" + str + Separators.QUOTE, e10);
            return false;
        }
    }

    public static Integer c(String str) {
        long j6;
        boolean z10;
        try {
            if (str.startsWith("&H")) {
                j6 = Long.parseLong(str.substring(2), 16);
            } else {
                j6 = Long.parseLong(str);
            }
            if (j6 <= 4294967295L) {
                z10 = true;
            } else {
                z10 = false;
            }
            Gi.e.l(z10);
            int E10 = H.E(((j6 >> 24) & 255) ^ 255);
            int E11 = H.E((j6 >> 16) & 255);
            return Integer.valueOf(Color.argb(E10, H.E(j6 & 255), H.E((j6 >> 8) & 255), E11));
        } catch (IllegalArgumentException e10) {
            p.h("SsaStyle", "Failed to parse color expression: '" + str + Separators.QUOTE, e10);
            return null;
        }
    }
}
