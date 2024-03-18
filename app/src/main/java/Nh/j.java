package Nh;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f13090a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13091b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13092c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13093d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13094e;

    public j(int i10, String str, String str2, String str3, boolean z10) {
        this.f13090a = i10;
        this.f13091b = str;
        this.f13092c = str2;
        this.f13093d = str3;
        this.f13094e = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f13090a == jVar.f13090a && this.f13094e == jVar.f13094e && this.f13091b.equals(jVar.f13091b) && this.f13092c.equals(jVar.f13092c) && this.f13093d.equals(jVar.f13093d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f13094e) {
            i10 = 64;
        } else {
            i10 = 0;
        }
        return (this.f13093d.hashCode() * this.f13092c.hashCode() * this.f13091b.hashCode()) + this.f13090a + i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13091b);
        sb2.append('.');
        sb2.append(this.f13092c);
        sb2.append(this.f13093d);
        sb2.append(" (");
        sb2.append(this.f13090a);
        if (this.f13094e) {
            str = " itf";
        } else {
            str = "";
        }
        return android.gov.nist.core.a.n(sb2, str, ')');
    }
}
