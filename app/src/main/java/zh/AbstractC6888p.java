package zh;

import Bh.AbstractC0238c0;
import Bh.Z;

/* renamed from: zh.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6888p extends AbstractC6867A {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0238c0 f52149a;

    /* renamed from: b  reason: collision with root package name */
    public final Fh.w f52150b;

    /* renamed from: c  reason: collision with root package name */
    public final J f52151c;

    public AbstractC6888p(Z z10, Fh.w wVar) {
        I i10 = I.f52111Y;
        this.f52149a = z10;
        this.f52150b = wVar;
        this.f52151c = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC6888p abstractC6888p = (AbstractC6888p) obj;
        if (this.f52149a.equals(abstractC6888p.f52149a) && this.f52150b.equals(abstractC6888p.f52150b) && this.f52151c.equals(abstractC6888p.f52151c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f52149a.hashCode();
        int hashCode2 = this.f52150b.hashCode();
        return this.f52151c.hashCode() + ((hashCode2 + ((hashCode + (getClass().hashCode() * 31)) * 31)) * 31);
    }
}
