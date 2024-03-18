package Uf;

import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final I f17720a;

    /* renamed from: b  reason: collision with root package name */
    public final I f17721b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f17722c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17723d;

    public B(I i10, I i11) {
        kf.w wVar = kf.w.f37484Y;
        this.f17720a = i10;
        this.f17721b = i11;
        this.f17722c = wVar;
        boolean z10 = false;
        R4.b.D1(new A(0, this));
        I i12 = I.f17765Z;
        if (i10 == i12 && i11 == i12) {
            z10 = true;
        }
        this.f17723d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        if (this.f17720a == b10.f17720a && this.f17721b == b10.f17721b && AbstractC3557B.K(this.f17722c, b10.f17722c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f17720a.hashCode() * 31;
        I i11 = this.f17721b;
        if (i11 == null) {
            i10 = 0;
        } else {
            i10 = i11.hashCode();
        }
        return this.f17722c.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f17720a + ", migrationLevel=" + this.f17721b + ", userDefinedLevelForSpecificAnnotation=" + this.f17722c + ')';
    }
}
