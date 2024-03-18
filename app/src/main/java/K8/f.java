package K8;

import I8.E;
import I8.F;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class f implements F, Cloneable {

    /* renamed from: h0  reason: collision with root package name */
    public static final f f9547h0;

    /* renamed from: Y  reason: collision with root package name */
    public List f9548Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f9549Z;

    /* JADX WARN: Type inference failed for: r0v0, types: [K8.f, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f9548Y = Collections.emptyList();
        obj.f9549Z = Collections.emptyList();
        f9547h0 = obj;
    }

    public static boolean c(Class cls) {
        if (!Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    @Override // I8.F
    public final E a(I8.n nVar, TypeToken typeToken) {
        boolean z10;
        boolean z11;
        boolean c10 = c(typeToken.getRawType());
        if (!c10) {
            b(true);
            z10 = false;
        } else {
            z10 = true;
        }
        if (!c10) {
            b(false);
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return null;
        }
        return new e(this, z11, z10, nVar, typeToken);
    }

    public final void b(boolean z10) {
        List list;
        if (z10) {
            list = this.f9548Y;
        } else {
            list = this.f9549Z;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return;
        }
        AbstractC2469q0.p(it.next());
        throw null;
    }

    public final Object clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }
}
