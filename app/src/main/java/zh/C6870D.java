package zh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import yh.l1;

/* renamed from: zh.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6870D extends AbstractC6872F {

    /* renamed from: j0  reason: collision with root package name */
    public final Map f52104j0;

    public C6870D(l1 l1Var, byte[] bArr, Eh.A a5, List list, HashMap hashMap) {
        super(l1Var, bArr, a5, list);
        this.f52104j0 = hashMap;
    }

    @Override // zh.AbstractC6872F
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C6870D.class != obj.getClass()) {
            return false;
        }
        if (!this.f52104j0.equals(((C6870D) obj).f52104j0)) {
            return false;
        }
        return true;
    }

    @Override // zh.AbstractC6872F
    public final int hashCode() {
        return this.f52104j0.hashCode() + (super.hashCode() * 31);
    }
}
