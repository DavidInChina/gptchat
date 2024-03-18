package L0;

import id.AbstractC3557B;
import jf.AbstractC3953c;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f10368a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC3953c f10369b;

    public a(String str, AbstractC3953c abstractC3953c) {
        this.f10368a = str;
        this.f10369b = abstractC3953c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3557B.K(this.f10368a, aVar.f10368a) && AbstractC3557B.K(this.f10369b, aVar.f10369b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f10368a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        AbstractC3953c abstractC3953c = this.f10369b;
        if (abstractC3953c != null) {
            i11 = abstractC3953c.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f10368a + ", action=" + this.f10369b + ')';
    }
}
