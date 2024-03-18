package jg;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f36185a;

    /* renamed from: b  reason: collision with root package name */
    public final String f36186b;

    public e(String str, String str2) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("desc", str2);
        this.f36185a = str;
        this.f36186b = str2;
    }

    @Override // jg.f
    public final String a() {
        return this.f36185a + this.f36186b;
    }

    @Override // jg.f
    public final String b() {
        return this.f36186b;
    }

    @Override // jg.f
    public final String c() {
        return this.f36185a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3557B.K(this.f36185a, eVar.f36185a) && AbstractC3557B.K(this.f36186b, eVar.f36186b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36186b.hashCode() + (this.f36185a.hashCode() * 31);
    }
}
