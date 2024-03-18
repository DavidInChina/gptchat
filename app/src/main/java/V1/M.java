package V1;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class M extends androidx.lifecycle.Y {

    /* renamed from: j  reason: collision with root package name */
    public static final P5.c f18078j = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f18082g;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f18079d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f18080e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f18081f = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public boolean f18083h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f18084i = false;

    public M(boolean z10) {
        this.f18082g = z10;
    }

    @Override // androidx.lifecycle.Y
    public final void c() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f18083h = true;
    }

    public final void e(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v, boolean z10) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC1480v);
        }
        g(abstractComponentCallbacksC1480v.f18289j0, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        M m10 = (M) obj;
        if (this.f18079d.equals(m10.f18079d) && this.f18080e.equals(m10.f18080e) && this.f18081f.equals(m10.f18081f)) {
            return true;
        }
        return false;
    }

    public final void f(String str, boolean z10) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g(str, z10);
    }

    public final void g(String str, boolean z10) {
        HashMap hashMap = this.f18080e;
        M m10 = (M) hashMap.get(str);
        if (m10 != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m10.f18080e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m10.f((String) it.next(), true);
                }
            }
            m10.c();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f18081f;
        androidx.lifecycle.d0 d0Var = (androidx.lifecycle.d0) hashMap2.get(str);
        if (d0Var != null) {
            d0Var.a();
            hashMap2.remove(str);
        }
    }

    public final void h(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        if (this.f18084i) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f18079d.remove(abstractComponentCallbacksC1480v.f18289j0) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC1480v);
        }
    }

    public final int hashCode() {
        int hashCode = this.f18080e.hashCode();
        return this.f18081f.hashCode() + ((hashCode + (this.f18079d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f18079d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f18080e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f18081f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
