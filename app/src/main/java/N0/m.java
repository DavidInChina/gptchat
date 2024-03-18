package N0;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final l f12539a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12540b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12541c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12542d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12543e;

    /* renamed from: f  reason: collision with root package name */
    public final float f12544f;

    /* renamed from: g  reason: collision with root package name */
    public final float f12545g;

    public m(C1042a c1042a, int i10, int i11, int i12, int i13, float f6, float f10) {
        this.f12539a = c1042a;
        this.f12540b = i10;
        this.f12541c = i11;
        this.f12542d = i12;
        this.f12543e = i13;
        this.f12544f = f6;
        this.f12545g = f10;
    }

    public final int a(int i10) {
        int i11 = this.f12541c;
        int i12 = this.f12540b;
        return N.p(i10, i12, i11) - i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (AbstractC3557B.K(this.f12539a, mVar.f12539a) && this.f12540b == mVar.f12540b && this.f12541c == mVar.f12541c && this.f12542d == mVar.f12542d && this.f12543e == mVar.f12543e && Float.compare(this.f12544f, mVar.f12544f) == 0 && Float.compare(this.f12545g, mVar.f12545g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f12545g) + AbstractC6463a.e(this.f12544f, ((((((((this.f12539a.hashCode() * 31) + this.f12540b) * 31) + this.f12541c) * 31) + this.f12542d) * 31) + this.f12543e) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f12539a);
        sb2.append(", startIndex=");
        sb2.append(this.f12540b);
        sb2.append(", endIndex=");
        sb2.append(this.f12541c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f12542d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f12543e);
        sb2.append(", top=");
        sb2.append(this.f12544f);
        sb2.append(", bottom=");
        return AbstractC6463a.k(sb2, this.f12545g, ')');
    }
}
