package Je;

import Df.AbstractC0405d;
import Df.w;
import id.AbstractC3557B;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0405d f9097a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f9098b;

    /* renamed from: c  reason: collision with root package name */
    public final w f9099c;

    public a(Type type, AbstractC0405d abstractC0405d, w wVar) {
        AbstractC3557B.c0("type", abstractC0405d);
        this.f9097a = abstractC0405d;
        this.f9098b = type;
        this.f9099c = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3557B.K(this.f9097a, aVar.f9097a) && AbstractC3557B.K(this.f9098b, aVar.f9098b) && AbstractC3557B.K(this.f9099c, aVar.f9099c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f9098b.hashCode() + (this.f9097a.hashCode() * 31)) * 31;
        w wVar = this.f9099c;
        if (wVar == null) {
            i10 = 0;
        } else {
            i10 = wVar.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "TypeInfo(type=" + this.f9097a + ", reifiedType=" + this.f9098b + ", kotlinType=" + this.f9099c + ')';
    }
}
