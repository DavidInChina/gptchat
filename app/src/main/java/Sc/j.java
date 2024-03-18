package Sc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import wd.C6190g0;
import wd.EnumC6212z;

@AbstractC1998i
/* loaded from: classes.dex */
public final class j {
    public static final i Companion = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final KSerializer[] f16520j = {P4.a.E("com.openai.types.CategoryType", EnumC6212z.values()), null, P4.a.E("com.openai.models.model.Models.SubscriptionLevel", v.values()), null, null, null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final EnumC6212z f16521a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16522b;

    /* renamed from: c  reason: collision with root package name */
    public final v f16523c;

    /* renamed from: d  reason: collision with root package name */
    public final String f16524d;

    /* renamed from: e  reason: collision with root package name */
    public final String f16525e;

    /* renamed from: f  reason: collision with root package name */
    public final String f16526f;

    /* renamed from: g  reason: collision with root package name */
    public final String f16527g;

    /* renamed from: h  reason: collision with root package name */
    public final String f16528h;

    /* renamed from: i  reason: collision with root package name */
    public final String f16529i;

    public j(int i10, EnumC6212z enumC6212z, String str, v vVar, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (15 != (i10 & 15)) {
            R4.b.e2(i10, 15, h.f16519b);
            throw null;
        }
        this.f16521a = enumC6212z;
        this.f16522b = str;
        this.f16523c = vVar;
        this.f16524d = str2;
        if ((i10 & 16) == 0) {
            this.f16525e = null;
        } else {
            this.f16525e = str3;
        }
        if ((i10 & 32) == 0) {
            this.f16526f = null;
        } else {
            this.f16526f = str4;
        }
        if ((i10 & 64) == 0) {
            this.f16527g = null;
        } else {
            this.f16527g = str5;
        }
        if ((i10 & 128) == 0) {
            this.f16528h = null;
        } else {
            this.f16528h = str6;
        }
        if ((i10 & 256) == 0) {
            this.f16529i = null;
        } else {
            this.f16529i = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f16521a != jVar.f16521a || !AbstractC3557B.K(this.f16522b, jVar.f16522b) || this.f16523c != jVar.f16523c || !AbstractC3557B.K(this.f16524d, jVar.f16524d)) {
            return false;
        }
        String str = this.f16525e;
        String str2 = jVar.f16525e;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        String str3 = this.f16526f;
        String str4 = jVar.f16526f;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        String str5 = this.f16527g;
        String str6 = jVar.f16527g;
        if (str5 != null ? !(str6 != null && AbstractC3557B.K(str5, str6)) : str6 != null) {
            return false;
        }
        String str7 = this.f16528h;
        String str8 = jVar.f16528h;
        if (str7 != null ? !(str8 != null && AbstractC3557B.K(str7, str8)) : str8 != null) {
            return false;
        }
        String str9 = this.f16529i;
        String str10 = jVar.f16529i;
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
        int v10 = E9.f.v(this.f16524d, (this.f16523c.hashCode() + E9.f.v(this.f16522b, this.f16521a.hashCode() * 31, 31)) * 31, 31);
        int i14 = 0;
        String str = this.f16525e;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i15 = (v10 + i10) * 31;
        String str2 = this.f16526f;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f16527g;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f16528h;
        if (str4 == null) {
            i13 = 0;
        } else {
            i13 = str4.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        String str5 = this.f16529i;
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
        String b10 = C6190g0.b(this.f16524d);
        String str5 = "null";
        String str6 = this.f16525e;
        if (str6 == null) {
            str = str5;
        } else {
            str = C6190g0.b(str6);
        }
        String str7 = this.f16526f;
        if (str7 == null) {
            str2 = str5;
        } else {
            str2 = C6190g0.b(str7);
        }
        String str8 = this.f16527g;
        if (str8 == null) {
            str3 = str5;
        } else {
            str3 = C6190g0.b(str8);
        }
        String str9 = this.f16528h;
        if (str9 == null) {
            str4 = str5;
        } else {
            str4 = C6190g0.b(str9);
        }
        String str10 = this.f16529i;
        if (str10 != null) {
            str5 = C6190g0.b(str10);
        }
        StringBuilder sb2 = new StringBuilder("Category(category=");
        sb2.append(this.f16521a);
        sb2.append(", humanCategoryName=");
        sb2.append(this.f16522b);
        sb2.append(", subscriptionLevel=");
        sb2.append(this.f16523c);
        sb2.append(", defaultModel=");
        sb2.append(b10);
        sb2.append(", browsingModel=");
        android.gov.nist.core.a.y(sb2, str, ", codeInterpreterModel=", str2, ", pluginsModel=");
        android.gov.nist.core.a.y(sb2, str3, ", multimodalModel=", str4, ", dalleModel=");
        return R.a.t(sb2, str5, Separators.RPAREN);
    }

    public /* synthetic */ j(EnumC6212z enumC6212z, String str, v vVar, String str2) {
        this(enumC6212z, str, vVar, str2, null, null, null, null, null);
    }

    public j(EnumC6212z enumC6212z, String str, v vVar, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC3557B.c0("humanCategoryName", str);
        AbstractC3557B.c0("defaultModel", str2);
        this.f16521a = enumC6212z;
        this.f16522b = str;
        this.f16523c = vVar;
        this.f16524d = str2;
        this.f16525e = str3;
        this.f16526f = str4;
        this.f16527g = str5;
        this.f16528h = str6;
        this.f16529i = str7;
    }
}
