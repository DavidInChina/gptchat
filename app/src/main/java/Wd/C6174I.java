package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: wd.I  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6174I implements AbstractC6211y {
    public static final C6173H Companion = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer[] f48341f = {P4.a.E("com.openai.types.ImageOperationType", Z.values()), null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final Z f48342a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48343b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48344c;

    /* renamed from: d  reason: collision with root package name */
    public final String f48345d;

    /* renamed from: e  reason: collision with root package name */
    public final String f48346e;

    public C6174I(Z z10, String str, String str2, String str3, String str4) {
        AbstractC3557B.c0("type", z10);
        this.f48342a = z10;
        this.f48343b = str;
        this.f48344c = str2;
        this.f48345d = str3;
        this.f48346e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6174I)) {
            return false;
        }
        C6174I c6174i = (C6174I) obj;
        if (this.f48342a != c6174i.f48342a) {
            return false;
        }
        String str = this.f48343b;
        String str2 = c6174i.f48343b;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        String str3 = this.f48344c;
        String str4 = c6174i.f48344c;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f48345d, c6174i.f48345d) && AbstractC3557B.K(this.f48346e, c6174i.f48346e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = this.f48342a.hashCode() * 31;
        int i13 = 0;
        String str = this.f48343b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = (hashCode + i10) * 31;
        String str2 = this.f48344c;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.f48345d;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        String str4 = this.f48346e;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }

    public final String toString() {
        String str;
        String str2 = "null";
        String str3 = this.f48343b;
        if (str3 == null) {
            str = str2;
        } else {
            str = C6209w.a(str3);
        }
        String str4 = this.f48344c;
        if (str4 != null) {
            str2 = C6209w.a(str4);
        }
        StringBuilder sb2 = new StringBuilder("DalleOperationAssetPointer(type=");
        sb2.append(this.f48342a);
        sb2.append(", originalAssetPointer=");
        sb2.append(str);
        sb2.append(", maskAssetPointer=");
        sb2.append(str2);
        sb2.append(", originalGenId=");
        sb2.append(this.f48345d);
        sb2.append(", inPaintingImage=");
        return R.a.t(sb2, this.f48346e, Separators.RPAREN);
    }

    public C6174I(int i10, Z z10, String str, String str2, String str3, String str4) {
        this.f48342a = (i10 & 1) == 0 ? Z.f48378Z : z10;
        if ((i10 & 2) == 0) {
            this.f48343b = null;
        } else {
            this.f48343b = str;
        }
        if ((i10 & 4) == 0) {
            this.f48344c = null;
        } else {
            this.f48344c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f48345d = null;
        } else {
            this.f48345d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f48346e = null;
        } else {
            this.f48346e = str4;
        }
    }
}
