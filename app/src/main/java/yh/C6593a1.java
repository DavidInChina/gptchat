package yh;

import sh.AbstractC5640l;
import yh.l1;

/* renamed from: yh.a1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6593a1 implements AbstractC5640l {

    /* renamed from: a  reason: collision with root package name */
    public final l1.a f50988a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C6596b1 f50989b;

    public C6593a1(C6596b1 c6596b1, l1.a aVar) {
        this.f50989b = c6596b1;
        this.f50988a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6593a1.class != obj.getClass()) {
            return false;
        }
        C6593a1 c6593a1 = (C6593a1) obj;
        if (this.f50988a.equals(c6593a1.f50988a) && this.f50989b.equals(c6593a1.f50989b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f50988a.hashCode();
        return this.f50989b.hashCode() + ((hashCode + (C6593a1.class.hashCode() * 31)) * 31);
    }
}
