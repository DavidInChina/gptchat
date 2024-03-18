package jg;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f36183a;

    /* renamed from: b  reason: collision with root package name */
    public final String f36184b;

    public d(String str, String str2) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("desc", str2);
        this.f36183a = str;
        this.f36184b = str2;
    }

    @Override // jg.f
    public final String a() {
        return this.f36183a + ':' + this.f36184b;
    }

    @Override // jg.f
    public final String b() {
        return this.f36184b;
    }

    @Override // jg.f
    public final String c() {
        return this.f36183a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3557B.K(this.f36183a, dVar.f36183a) && AbstractC3557B.K(this.f36184b, dVar.f36184b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36184b.hashCode() + (this.f36183a.hashCode() * 31);
    }
}
