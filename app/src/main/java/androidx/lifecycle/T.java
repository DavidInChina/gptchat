package androidx.lifecycle;

import android.os.Bundle;
import id.AbstractC3557B;
import java.util.Map;
import jf.C3963m;

/* loaded from: classes2.dex */
public final class T implements A3.c {

    /* renamed from: a  reason: collision with root package name */
    public final A3.d f25328a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f25329b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f25330c;

    /* renamed from: d  reason: collision with root package name */
    public final C3963m f25331d;

    public T(A3.d dVar, e0 e0Var) {
        AbstractC3557B.c0("savedStateRegistry", dVar);
        AbstractC3557B.c0("viewModelStoreOwner", e0Var);
        this.f25328a = dVar;
        this.f25331d = R4.b.D1(new X0.b(6, e0Var));
    }

    @Override // A3.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f25330c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((U) this.f25331d.getValue()).f25332d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a5 = ((P) entry.getValue()).f25312e.a();
            if (!AbstractC3557B.K(a5, Bundle.EMPTY)) {
                bundle.putBundle(str, a5);
            }
        }
        this.f25329b = false;
        return bundle;
    }

    public final void b() {
        if (!this.f25329b) {
            Bundle a5 = this.f25328a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f25330c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (a5 != null) {
                bundle.putAll(a5);
            }
            this.f25330c = bundle;
            this.f25329b = true;
            U u10 = (U) this.f25331d.getValue();
        }
    }
}
