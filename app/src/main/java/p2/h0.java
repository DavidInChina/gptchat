package p2;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class h0 implements AbstractC5057j {

    /* renamed from: k0  reason: collision with root package name */
    public static final String f42069k0 = Integer.toString(0, 36);

    /* renamed from: l0  reason: collision with root package name */
    public static final String f42070l0 = Integer.toString(1, 36);

    /* renamed from: m0  reason: collision with root package name */
    public static final Y f42071m0 = new Y(6);

    /* renamed from: Y  reason: collision with root package name */
    public final int f42072Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f42073Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f42074h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C5065s[] f42075i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f42076j0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public h0(String str, C5065s... c5065sArr) {
        boolean z10;
        if (c5065sArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        this.f42073Z = str;
        this.f42075i0 = c5065sArr;
        this.f42072Y = c5065sArr.length;
        int f6 = N.f(c5065sArr[0].f42319q0);
        this.f42074h0 = f6 == -1 ? N.f(c5065sArr[0].f42318p0) : f6;
        String str2 = c5065sArr[0].f42310h0;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i10 = c5065sArr[0].f42312j0 | 16384;
        for (int i11 = 1; i11 < c5065sArr.length; i11++) {
            String str3 = c5065sArr[i11].f42310h0;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b("languages", i11, c5065sArr[0].f42310h0, c5065sArr[i11].f42310h0);
                return;
            } else if (i10 != (c5065sArr[i11].f42312j0 | 16384)) {
                b("role flags", i11, Integer.toBinaryString(c5065sArr[0].f42312j0), Integer.toBinaryString(c5065sArr[i11].f42312j0));
                return;
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder t10 = android.gov.nist.core.a.t("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        t10.append(str3);
        t10.append("' (track ");
        t10.append(i10);
        t10.append(Separators.RPAREN);
        s2.p.d("TrackGroup", "", new IllegalStateException(t10.toString()));
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        C5065s[] c5065sArr = this.f42075i0;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(c5065sArr.length);
        for (C5065s c5065s : c5065sArr) {
            arrayList.add(c5065s.e(true));
        }
        bundle.putParcelableArrayList(f42069k0, arrayList);
        bundle.putString(f42070l0, this.f42073Z);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f42073Z.equals(h0Var.f42073Z) && Arrays.equals(this.f42075i0, h0Var.f42075i0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f42076j0 == 0) {
            this.f42076j0 = E9.f.v(this.f42073Z, 527, 31) + Arrays.hashCode(this.f42075i0);
        }
        return this.f42076j0;
    }
}
