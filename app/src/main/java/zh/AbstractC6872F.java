package zh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import k6.AbstractC4194d;
import yh.l1;

/* renamed from: zh.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6872F implements G {

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f52106Y;

    /* renamed from: Z  reason: collision with root package name */
    public final byte[] f52107Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Eh.A f52108h0;

    /* renamed from: i0  reason: collision with root package name */
    public final List f52109i0;

    public AbstractC6872F(l1 l1Var, byte[] bArr, Eh.A a5, List list) {
        this.f52106Y = l1Var;
        this.f52107Z = bArr;
        this.f52108h0 = a5;
        this.f52109i0 = list;
    }

    @Override // zh.AbstractC6878f
    public final AbstractC6877e G(String str) {
        if (this.f52106Y.getName().equals(str)) {
            return new C6875c(this.f52107Z);
        }
        for (G g10 : this.f52109i0) {
            AbstractC6877e G10 = ((AbstractC6872F) g10).G(str);
            if (G10.b()) {
                return G10;
            }
        }
        return new C6876d(str);
    }

    public final LinkedHashMap a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.f52106Y, this.f52107Z);
        for (G g10 : this.f52109i0) {
            linkedHashMap.putAll(((AbstractC6872F) g10).a());
        }
        return linkedHashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC6872F abstractC6872F = (AbstractC6872F) obj;
        if (this.f52106Y.equals(abstractC6872F.f52106Y) && Arrays.equals(this.f52107Z, abstractC6872F.f52107Z) && this.f52108h0.equals(abstractC6872F.f52108h0) && this.f52109i0.equals(abstractC6872F.f52109i0)) {
            return true;
        }
        return false;
    }

    public final HashMap h() {
        HashMap hashMap = new HashMap();
        for (G g10 : this.f52109i0) {
            hashMap.putAll(((AbstractC6872F) g10).h());
        }
        hashMap.put(this.f52106Y, this.f52108h0);
        return hashMap;
    }

    public int hashCode() {
        int t10 = AbstractC4194d.t(this.f52106Y, getClass().hashCode() * 31, 31);
        int hashCode = this.f52108h0.hashCode();
        return this.f52109i0.hashCode() + ((hashCode + ((Arrays.hashCode(this.f52107Z) + t10) * 31)) * 31);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
