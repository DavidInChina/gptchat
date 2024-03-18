package N0;

import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final C1046e f12467a;

    /* renamed from: b  reason: collision with root package name */
    public final E f12468b;

    /* renamed from: c  reason: collision with root package name */
    public final List f12469c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12470d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12471e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12472f;

    /* renamed from: g  reason: collision with root package name */
    public final Z0.b f12473g;

    /* renamed from: h  reason: collision with root package name */
    public final Z0.l f12474h;

    /* renamed from: i  reason: collision with root package name */
    public final S0.r f12475i;

    /* renamed from: j  reason: collision with root package name */
    public final long f12476j;

    public B(C1046e c1046e, E e10, List list, int i10, boolean z10, int i11, Z0.b bVar, Z0.l lVar, S0.r rVar, long j6) {
        this.f12467a = c1046e;
        this.f12468b = e10;
        this.f12469c = list;
        this.f12470d = i10;
        this.f12471e = z10;
        this.f12472f = i11;
        this.f12473g = bVar;
        this.f12474h = lVar;
        this.f12475i = rVar;
        this.f12476j = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        if (AbstractC3557B.K(this.f12467a, b10.f12467a) && AbstractC3557B.K(this.f12468b, b10.f12468b) && AbstractC3557B.K(this.f12469c, b10.f12469c) && this.f12470d == b10.f12470d && this.f12471e == b10.f12471e && AbstractC3557B.D0(this.f12472f, b10.f12472f) && AbstractC3557B.K(this.f12473g, b10.f12473g) && this.f12474h == b10.f12474h && AbstractC3557B.K(this.f12475i, b10.f12475i) && Z0.a.b(this.f12476j, b10.f12476j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f12468b.hashCode();
        int s10 = (AbstractC4194d.s(this.f12469c, (hashCode + (this.f12467a.hashCode() * 31)) * 31, 31) + this.f12470d) * 31;
        if (this.f12471e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode2 = this.f12473g.hashCode();
        int hashCode3 = this.f12474h.hashCode();
        int hashCode4 = this.f12475i.hashCode();
        long j6 = this.f12476j;
        return ((int) ((j6 >>> 32) ^ j6)) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((((s10 + i10) * 31) + this.f12472f) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f12467a) + ", style=" + this.f12468b + ", placeholders=" + this.f12469c + ", maxLines=" + this.f12470d + ", softWrap=" + this.f12471e + ", overflow=" + ((Object) AbstractC3557B.E2(this.f12472f)) + ", density=" + this.f12473g + ", layoutDirection=" + this.f12474h + ", fontFamilyResolver=" + this.f12475i + ", constraints=" + ((Object) Z0.a.k(this.f12476j)) + ')';
    }
}
