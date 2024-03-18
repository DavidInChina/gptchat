package Rc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6190g0;

@AbstractC1998i
/* loaded from: classes.dex */
public final class i {
    public static final h Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f15396a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15397b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15398c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15399d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15400e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15401f;

    /* renamed from: g  reason: collision with root package name */
    public final String f15402g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15403h;

    /* renamed from: i  reason: collision with root package name */
    public final String f15404i;

    public i(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (15 == (i10 & 15)) {
            this.f15396a = str;
            this.f15397b = str2;
            this.f15398c = str3;
            this.f15399d = str4;
            if ((i10 & 16) == 0) {
                this.f15400e = null;
            } else {
                this.f15400e = str5;
            }
            if ((i10 & 32) == 0) {
                this.f15401f = null;
            } else {
                this.f15401f = str6;
            }
            if ((i10 & 64) == 0) {
                this.f15402g = null;
            } else {
                this.f15402g = str7;
            }
            if ((i10 & 128) == 0) {
                this.f15403h = null;
            } else {
                this.f15403h = str8;
            }
            if ((i10 & 256) == 0) {
                this.f15404i = null;
                return;
            } else {
                this.f15404i = str9;
                return;
            }
        }
        R4.b.e2(i10, 15, g.f15395b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!AbstractC3557B.K(this.f15396a, iVar.f15396a) || !AbstractC3557B.K(this.f15397b, iVar.f15397b) || !AbstractC3557B.K(this.f15398c, iVar.f15398c) || !AbstractC3557B.K(this.f15399d, iVar.f15399d)) {
            return false;
        }
        String str = this.f15400e;
        String str2 = iVar.f15400e;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        String str3 = this.f15401f;
        String str4 = iVar.f15401f;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        String str5 = this.f15402g;
        String str6 = iVar.f15402g;
        if (str5 != null ? !(str6 != null && AbstractC3557B.K(str5, str6)) : str6 != null) {
            return false;
        }
        String str7 = this.f15403h;
        String str8 = iVar.f15403h;
        if (str7 != null ? !(str8 != null && AbstractC3557B.K(str7, str8)) : str8 != null) {
            return false;
        }
        String str9 = this.f15404i;
        String str10 = iVar.f15404i;
        if (str9 != null ? str10 != null && AbstractC3557B.K(str9, str10) : str10 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int v10 = E9.f.v(this.f15399d, E9.f.v(this.f15398c, E9.f.v(this.f15397b, this.f15396a.hashCode() * 31, 31), 31), 31);
        int i14 = 0;
        String str = this.f15400e;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i15 = (v10 + i10) * 31;
        String str2 = this.f15401f;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f15402g;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f15403h;
        if (str4 == null) {
            i13 = 0;
        } else {
            i13 = str4.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        String str5 = this.f15404i;
        if (str5 != null) {
            i14 = str5.hashCode();
        }
        return i18 + i14;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String b10 = C6190g0.b(this.f15399d);
        String str5 = "null";
        String str6 = this.f15400e;
        if (str6 == null) {
            str = str5;
        } else {
            str = C6190g0.b(str6);
        }
        String str7 = this.f15401f;
        if (str7 == null) {
            str2 = str5;
        } else {
            str2 = C6190g0.b(str7);
        }
        String str8 = this.f15402g;
        if (str8 == null) {
            str3 = str5;
        } else {
            str3 = C6190g0.b(str8);
        }
        String str9 = this.f15403h;
        if (str9 == null) {
            str4 = str5;
        } else {
            str4 = C6190g0.b(str9);
        }
        String str10 = this.f15404i;
        if (str10 != null) {
            str5 = C6190g0.b(str10);
        }
        StringBuilder sb2 = new StringBuilder("ModelsResponseCategory(category=");
        sb2.append(this.f15396a);
        sb2.append(", humanCategoryName=");
        sb2.append(this.f15397b);
        sb2.append(", subscriptionLevel=");
        android.gov.nist.core.a.y(sb2, this.f15398c, ", defaultModel=", b10, ", browsingModel=");
        android.gov.nist.core.a.y(sb2, str, ", codeInterpreterModel=", str2, ", pluginsModel=");
        android.gov.nist.core.a.y(sb2, str3, ", multimodalModel=", str4, ", dalleModel=");
        return R.a.t(sb2, str5, Separators.RPAREN);
    }
}
