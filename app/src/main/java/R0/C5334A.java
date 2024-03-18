package r0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;
import q0.C5251c;
import q0.C5254f;

/* renamed from: r0.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5334A extends J {

    /* renamed from: c  reason: collision with root package name */
    public final List f44162c;

    /* renamed from: d  reason: collision with root package name */
    public final List f44163d;

    /* renamed from: e  reason: collision with root package name */
    public final long f44164e;

    /* renamed from: f  reason: collision with root package name */
    public final long f44165f;

    /* renamed from: g  reason: collision with root package name */
    public final int f44166g;

    public C5334A(List list, ArrayList arrayList, long j6, long j10, int i10) {
        this.f44162c = list;
        this.f44163d = arrayList;
        this.f44164e = j6;
        this.f44165f = j10;
        this.f44166g = i10;
    }

    @Override // r0.J
    public final Shader b(long j6) {
        float f6;
        float f10;
        float f11;
        float f12;
        List list;
        int i10;
        int[] iArr;
        List list2;
        float[] fArr;
        float f13;
        float f14;
        float f15;
        Shader.TileMode tileMode;
        int i11;
        long j10 = this.f44164e;
        if (C5251c.d(j10) == Float.POSITIVE_INFINITY) {
            f6 = C5254f.d(j6);
        } else {
            f6 = C5251c.d(j10);
        }
        if (C5251c.e(j10) == Float.POSITIVE_INFINITY) {
            f10 = C5254f.b(j6);
        } else {
            f10 = C5251c.e(j10);
        }
        long j11 = this.f44165f;
        if (C5251c.d(j11) == Float.POSITIVE_INFINITY) {
            f11 = C5254f.d(j6);
        } else {
            f11 = C5251c.d(j11);
        }
        if (C5251c.e(j11) == Float.POSITIVE_INFINITY) {
            f12 = C5254f.b(j6);
        } else {
            f12 = C5251c.e(j11);
        }
        long r10 = R4.b.r(f6, f10);
        long r11 = R4.b.r(f11, f12);
        List list3 = this.f44162c;
        List list4 = this.f44163d;
        if (list4 == null) {
            if (list3.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list3.size() != list4.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            list = list3;
            i10 = 0;
        } else {
            int u02 = AbstractC4344b.u0(list3);
            int i12 = 1;
            i10 = 0;
            while (i12 < u02) {
                List list5 = list3;
                if (r.d(((r) list3.get(i12)).f44265a) == 0.0f) {
                    i10++;
                }
                i12++;
                list3 = list5;
            }
            list = list3;
        }
        float d10 = C5251c.d(r10);
        float e10 = C5251c.e(r10);
        float d11 = C5251c.d(r11);
        float e11 = C5251c.e(r11);
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr2 = new int[size];
            int i13 = 0;
            while (true) {
                list2 = list;
                if (i13 >= size) {
                    break;
                }
                iArr2[i13] = androidx.compose.ui.graphics.a.s(((r) list2.get(i13)).f44265a);
                i13++;
                list = list2;
            }
            iArr = iArr2;
        } else {
            list2 = list;
            int[] iArr3 = new int[list2.size() + i10];
            int u03 = AbstractC4344b.u0(list2);
            int size2 = list2.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size2; i15++) {
                long j12 = ((r) list2.get(i15)).f44265a;
                if (r.d(j12) == 0.0f) {
                    if (i15 == 0) {
                        i11 = i14 + 1;
                        iArr3[i14] = androidx.compose.ui.graphics.a.s(r.b(((r) list2.get(1)).f44265a, 0.0f));
                    } else if (i15 == u03) {
                        i11 = i14 + 1;
                        iArr3[i14] = androidx.compose.ui.graphics.a.s(r.b(((r) list2.get(i15 - 1)).f44265a, 0.0f));
                    } else {
                        int i16 = i14 + 1;
                        iArr3[i14] = androidx.compose.ui.graphics.a.s(r.b(((r) list2.get(i15 - 1)).f44265a, 0.0f));
                        i14 += 2;
                        iArr3[i16] = androidx.compose.ui.graphics.a.s(r.b(((r) list2.get(i15 + 1)).f44265a, 0.0f));
                    }
                    i14 = i11;
                } else {
                    iArr3[i14] = androidx.compose.ui.graphics.a.s(j12);
                    i14++;
                }
            }
            iArr = iArr3;
        }
        if (i10 == 0) {
            if (list4 != null) {
                fArr = kf.t.I2(list4);
            } else {
                fArr = null;
            }
        } else {
            fArr = new float[list2.size() + i10];
            if (list4 != null) {
                f13 = ((Number) list4.get(0)).floatValue();
            } else {
                f13 = 0.0f;
            }
            fArr[0] = f13;
            int u04 = AbstractC4344b.u0(list2);
            int i17 = 1;
            for (int i18 = 1; i18 < u04; i18++) {
                long j13 = ((r) list2.get(i18)).f44265a;
                if (list4 != null) {
                    f15 = ((Number) list4.get(i18)).floatValue();
                } else {
                    f15 = i18 / AbstractC4344b.u0(list2);
                }
                int i19 = i17 + 1;
                fArr[i17] = f15;
                if (r.d(j13) == 0.0f) {
                    i17 += 2;
                    fArr[i19] = f15;
                } else {
                    i17 = i19;
                }
            }
            if (list4 != null) {
                f14 = ((Number) list4.get(AbstractC4344b.u0(list2))).floatValue();
            } else {
                f14 = 1.0f;
            }
            fArr[i17] = f14;
        }
        float[] fArr2 = fArr;
        int i20 = this.f44166g;
        if (G.h(i20, 0)) {
            tileMode = Shader.TileMode.CLAMP;
        } else if (G.h(i20, 1)) {
            tileMode = Shader.TileMode.REPEAT;
        } else if (G.h(i20, 2)) {
            tileMode = Shader.TileMode.MIRROR;
        } else if (G.h(i20, 3)) {
            if (Build.VERSION.SDK_INT >= 31) {
                tileMode = O.f44224a.b();
            } else {
                tileMode = Shader.TileMode.CLAMP;
            }
        } else {
            tileMode = Shader.TileMode.CLAMP;
        }
        return new LinearGradient(d10, e10, d11, e11, iArr, fArr2, tileMode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5334A)) {
            return false;
        }
        C5334A c5334a = (C5334A) obj;
        if (AbstractC3557B.K(this.f44162c, c5334a.f44162c) && AbstractC3557B.K(this.f44163d, c5334a.f44163d) && C5251c.b(this.f44164e, c5334a.f44164e) && C5251c.b(this.f44165f, c5334a.f44165f) && G.h(this.f44166g, c5334a.f44166g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f44162c.hashCode() * 31;
        List list = this.f44163d;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        int f6 = C5251c.f(this.f44164e);
        return ((C5251c.f(this.f44165f) + ((f6 + ((hashCode + i10) * 31)) * 31)) * 31) + this.f44166g;
    }

    public final String toString() {
        long j6;
        String str;
        long j10;
        String str2;
        String str3 = "";
        if (R4.b.v1(this.f44164e)) {
            str = "start=" + ((Object) C5251c.j(j6)) + ", ";
        } else {
            str = str3;
        }
        if (R4.b.v1(this.f44165f)) {
            str3 = "end=" + ((Object) C5251c.j(j10)) + ", ";
        }
        StringBuilder sb2 = new StringBuilder("LinearGradient(colors=");
        sb2.append(this.f44162c);
        sb2.append(", stops=");
        sb2.append(this.f44163d);
        sb2.append(", ");
        sb2.append(str);
        sb2.append(str3);
        sb2.append("tileMode=");
        int i10 = this.f44166g;
        if (G.h(i10, 0)) {
            str2 = "Clamp";
        } else if (G.h(i10, 1)) {
            str2 = "Repeated";
        } else if (G.h(i10, 2)) {
            str2 = "Mirror";
        } else if (G.h(i10, 3)) {
            str2 = "Decal";
        } else {
            str2 = "Unknown";
        }
        sb2.append((Object) str2);
        sb2.append(')');
        return sb2.toString();
    }
}
