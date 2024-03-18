package zh;

import Ah.a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import yh.l1;

/* renamed from: zh.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6871E extends AbstractC6872F {

    /* renamed from: j0  reason: collision with root package name */
    public final L f52105j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6871E(l1 l1Var, byte[] bArr, Eh.A a5, ArrayList arrayList) {
        super(l1Var, bArr, a5, arrayList);
        K k10 = K.f52113Y;
        this.f52105j0 = k10;
    }

    @Override // zh.AbstractC6872F
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C6871E.class != obj.getClass()) {
            return false;
        }
        if (!this.f52105j0.equals(((C6871E) obj).f52105j0)) {
            return false;
        }
        return true;
    }

    @Override // zh.AbstractC6872F
    public final int hashCode() {
        return this.f52105j0.hashCode() + (super.hashCode() * 31);
    }

    public final C6870D i(ClassLoader classLoader, a0 a0Var) {
        ((K) this.f52105j0).getClass();
        Map b10 = a0Var.b(classLoader, a());
        for (Map.Entry entry : h().entrySet()) {
            ((Eh.A) entry.getValue()).a((Class) b10.get(entry.getKey()));
        }
        HashMap hashMap = new HashMap(b10);
        return new C6870D(this.f52106Y, this.f52107Z, this.f52108h0, this.f52109i0, hashMap);
    }
}
