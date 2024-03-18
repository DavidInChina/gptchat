package Uf;

import id.AbstractC3557B;
import kg.C4294f;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a  reason: collision with root package name */
    public final String f17773a;

    /* renamed from: b  reason: collision with root package name */
    public final C4294f f17774b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17775c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17776d;

    /* renamed from: e  reason: collision with root package name */
    public final String f17777e;

    public M(String str, C4294f c4294f, String str2, String str3) {
        AbstractC3557B.c0("classInternalName", str);
        this.f17773a = str;
        this.f17774b = c4294f;
        this.f17775c = str2;
        this.f17776d = str3;
        String str4 = c4294f + '(' + str2 + ')' + str3;
        AbstractC3557B.c0("jvmDescriptor", str4);
        this.f17777e = str + '.' + str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        if (AbstractC3557B.K(this.f17773a, m10.f17773a) && AbstractC3557B.K(this.f17774b, m10.f17774b) && AbstractC3557B.K(this.f17775c, m10.f17775c) && AbstractC3557B.K(this.f17776d, m10.f17776d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f17774b.hashCode();
        return this.f17776d.hashCode() + E9.f.v(this.f17775c, (hashCode + (this.f17773a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NameAndSignature(classInternalName=");
        sb2.append(this.f17773a);
        sb2.append(", name=");
        sb2.append(this.f17774b);
        sb2.append(", parameters=");
        sb2.append(this.f17775c);
        sb2.append(", returnType=");
        return android.gov.nist.core.a.n(sb2, this.f17776d, ')');
    }
}
