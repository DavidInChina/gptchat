package W;

import id.AbstractC3557B;

/* renamed from: W.a3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1525a3 {

    /* renamed from: a  reason: collision with root package name */
    public final K.a f19904a;

    /* renamed from: b  reason: collision with root package name */
    public final K.a f19905b;

    /* renamed from: c  reason: collision with root package name */
    public final K.a f19906c;

    /* renamed from: d  reason: collision with root package name */
    public final K.a f19907d;

    /* renamed from: e  reason: collision with root package name */
    public final K.a f19908e;

    public C1525a3() {
        K.e eVar = Z2.f19878a;
        K.e eVar2 = Z2.f19879b;
        K.e eVar3 = Z2.f19880c;
        K.e eVar4 = Z2.f19881d;
        K.e eVar5 = Z2.f19882e;
        this.f19904a = eVar;
        this.f19905b = eVar2;
        this.f19906c = eVar3;
        this.f19907d = eVar4;
        this.f19908e = eVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1525a3)) {
            return false;
        }
        C1525a3 c1525a3 = (C1525a3) obj;
        if (AbstractC3557B.K(this.f19904a, c1525a3.f19904a) && AbstractC3557B.K(this.f19905b, c1525a3.f19905b) && AbstractC3557B.K(this.f19906c, c1525a3.f19906c) && AbstractC3557B.K(this.f19907d, c1525a3.f19907d) && AbstractC3557B.K(this.f19908e, c1525a3.f19908e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f19905b.hashCode();
        int hashCode2 = this.f19906c.hashCode();
        int hashCode3 = this.f19907d.hashCode();
        return this.f19908e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f19904a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f19904a + ", small=" + this.f19905b + ", medium=" + this.f19906c + ", large=" + this.f19907d + ", extraLarge=" + this.f19908e + ')';
    }
}
