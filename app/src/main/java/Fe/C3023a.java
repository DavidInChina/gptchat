package fe;

import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;

/* renamed from: fe.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3023a {

    /* renamed from: a  reason: collision with root package name */
    public final String f30240a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30241b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30242c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30243d;

    /* renamed from: e  reason: collision with root package name */
    public final List f30244e;

    /* renamed from: f  reason: collision with root package name */
    public final C3026d f30245f;

    /* renamed from: g  reason: collision with root package name */
    public final List f30246g;

    public C3023a(String str, String str2, String str3, String str4, List list, C3026d c3026d, List list2) {
        this.f30240a = str;
        this.f30241b = str2;
        this.f30242c = str3;
        this.f30243d = str4;
        this.f30244e = list;
        this.f30245f = c3026d;
        this.f30246g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3023a)) {
            return false;
        }
        C3023a c3023a = (C3023a) obj;
        if (AbstractC3557B.K(this.f30240a, c3023a.f30240a) && AbstractC3557B.K(this.f30241b, c3023a.f30241b) && AbstractC3557B.K(this.f30242c, c3023a.f30242c) && AbstractC3557B.K(this.f30243d, c3023a.f30243d) && AbstractC3557B.K(this.f30244e, c3023a.f30244e) && AbstractC3557B.K(this.f30245f, c3023a.f30245f) && AbstractC3557B.K(this.f30246g, c3023a.f30246g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f30242c, E9.f.v(this.f30241b, this.f30240a.hashCode() * 31, 31), 31);
        int i11 = 0;
        String str = this.f30243d;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f30244e, (v10 + i10) * 31, 31);
        C3026d c3026d = this.f30245f;
        if (c3026d != null) {
            i11 = c3026d.f30249a.hashCode();
        }
        return this.f30246g.hashCode() + ((s10 + i11) * 31);
    }

    public final String toString() {
        return "Artifact(groupId=" + this.f30240a + ", artifactId=" + this.f30241b + ", version=" + this.f30242c + ", name=" + this.f30243d + ", spdxLicenses=" + this.f30244e + ", scm=" + this.f30245f + ", unknownLicenses=" + this.f30246g + ')';
    }
}
