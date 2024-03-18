package s3;

import androidx.lifecycle.d0;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.LinkedHashMap;
import jh.L1;

/* renamed from: s3.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5569t extends androidx.lifecycle.Y implements U {

    /* renamed from: e  reason: collision with root package name */
    public static final L1 f45366e = new L1(2);

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f45367d = new LinkedHashMap();

    @Override // androidx.lifecycle.Y
    public final void c() {
        LinkedHashMap linkedHashMap = this.f45367d;
        for (d0 d0Var : linkedHashMap.values()) {
            d0Var.a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f45367d.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        AbstractC3557B.b0("sb.toString()", sb3);
        return sb3;
    }
}
