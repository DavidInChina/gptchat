package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import l2.C4333d;

/* loaded from: classes2.dex */
public final class V extends c0 implements b0 {

    /* renamed from: Y  reason: collision with root package name */
    public final Application f25333Y;

    /* renamed from: Z  reason: collision with root package name */
    public final a0 f25334Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Bundle f25335h0;

    /* renamed from: i0  reason: collision with root package name */
    public final S f25336i0;

    /* renamed from: j0  reason: collision with root package name */
    public final A3.d f25337j0;

    public V(Application application, A3.f fVar, Bundle bundle) {
        a0 a0Var;
        AbstractC3557B.c0("owner", fVar);
        this.f25337j0 = fVar.f();
        this.f25336i0 = fVar.h();
        this.f25335h0 = bundle;
        this.f25333Y = application;
        if (application != null) {
            if (a0.f25353j0 == null) {
                a0.f25353j0 = new a0(application);
            }
            a0Var = a0.f25353j0;
            AbstractC3557B.Z(a0Var);
        } else {
            a0Var = new a0(null);
        }
        this.f25334Z = a0Var;
    }

    @Override // androidx.lifecycle.c0
    public final void a(Y y10) {
        S s10 = this.f25336i0;
        if (s10 != null) {
            A3.d dVar = this.f25337j0;
            AbstractC3557B.Z(dVar);
            S.b(y10, dVar, s10);
        }
    }

    @Override // androidx.lifecycle.b0
    public final Y b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, androidx.lifecycle.Z] */
    public final Y c(Class cls, String str) {
        Constructor constructor;
        Y y10;
        S s10 = this.f25336i0;
        if (s10 != null) {
            boolean isAssignableFrom = AbstractC2067b.class.isAssignableFrom(cls);
            Application application = this.f25333Y;
            if (isAssignableFrom && application != null) {
                constructor = W.a(cls, W.f25338a);
            } else {
                constructor = W.a(cls, W.f25339b);
            }
            if (constructor == null) {
                if (application != null) {
                    return this.f25334Z.b(cls);
                }
                if (Z.f25349h0 == null) {
                    Z.f25349h0 = new Object();
                }
                Z z10 = Z.f25349h0;
                AbstractC3557B.Z(z10);
                return z10.b(cls);
            }
            A3.d dVar = this.f25337j0;
            AbstractC3557B.Z(dVar);
            Q c10 = S.c(dVar, s10, str, this.f25335h0);
            P p10 = c10.f25323Z;
            if (isAssignableFrom && application != null) {
                y10 = W.b(cls, constructor, application, p10);
            } else {
                y10 = W.b(cls, constructor, p10);
            }
            y10.d("androidx.lifecycle.savedstate.vm.tag", c10);
            return y10;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.b0
    public final Y d(Class cls, C4333d c4333d) {
        Constructor constructor;
        Z z10 = Z.f25348Z;
        LinkedHashMap linkedHashMap = c4333d.f37739a;
        String str = (String) linkedHashMap.get(z10);
        if (str != null) {
            if (linkedHashMap.get(S.f25325a) != null && linkedHashMap.get(S.f25326b) != null) {
                Application application = (Application) linkedHashMap.get(Z.f25347Y);
                boolean isAssignableFrom = AbstractC2067b.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    constructor = W.a(cls, W.f25338a);
                } else {
                    constructor = W.a(cls, W.f25339b);
                }
                if (constructor == null) {
                    return this.f25334Z.d(cls, c4333d);
                }
                if (isAssignableFrom && application != null) {
                    return W.b(cls, constructor, application, S.d(c4333d));
                }
                return W.b(cls, constructor, S.d(c4333d));
            } else if (this.f25336i0 != null) {
                return c(cls, str);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }
}
