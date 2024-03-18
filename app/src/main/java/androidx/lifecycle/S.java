package androidx.lifecycle;

import V1.C1478t;
import android.os.Bundle;
import id.AbstractC3557B;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import jh.L1;
import l2.C4333d;

/* loaded from: classes2.dex */
public abstract class S {

    /* renamed from: a  reason: collision with root package name */
    public static final Z f25325a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Z f25326b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final Z f25327c = new Object();

    public S() {
        new AtomicReference();
    }

    public static final void b(Y y10, A3.d dVar, S s10) {
        Object obj;
        AbstractC3557B.c0("registry", dVar);
        AbstractC3557B.c0("lifecycle", s10);
        HashMap hashMap = y10.f25344a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = y10.f25344a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        Q q10 = (Q) obj;
        if (q10 != null && !q10.f25324h0) {
            q10.a(dVar, s10);
            h(dVar, s10);
        }
    }

    public static final Q c(A3.d dVar, S s10, String str, Bundle bundle) {
        Bundle a5 = dVar.a(str);
        Class[] clsArr = P.f25307f;
        Q q10 = new Q(str, P5.c.w(a5, bundle));
        q10.a(dVar, s10);
        h(dVar, s10);
        return q10;
    }

    public static final P d(C4333d c4333d) {
        T t10;
        Bundle bundle;
        Z z10 = f25325a;
        LinkedHashMap linkedHashMap = c4333d.f37739a;
        A3.f fVar = (A3.f) linkedHashMap.get(z10);
        if (fVar != null) {
            e0 e0Var = (e0) linkedHashMap.get(f25326b);
            if (e0Var != null) {
                Bundle bundle2 = (Bundle) linkedHashMap.get(f25327c);
                String str = (String) linkedHashMap.get(Z.f25348Z);
                if (str != null) {
                    A3.c b10 = fVar.f().b();
                    if (b10 instanceof T) {
                        t10 = (T) b10;
                    } else {
                        t10 = null;
                    }
                    if (t10 != null) {
                        LinkedHashMap linkedHashMap2 = ((U) new U3.u(e0Var, new L1(0)).m(U.class, "androidx.lifecycle.internal.SavedStateHandlesVM")).f25332d;
                        P p10 = (P) linkedHashMap2.get(str);
                        if (p10 == null) {
                            Class[] clsArr = P.f25307f;
                            t10.b();
                            Bundle bundle3 = t10.f25330c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = t10.f25330c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = t10.f25330c;
                            if (bundle5 != null && bundle5.isEmpty()) {
                                t10.f25330c = null;
                            }
                            P w10 = P5.c.w(bundle, bundle2);
                            linkedHashMap2.put(str, w10);
                            return w10;
                        }
                        return p10;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void e(A3.f fVar) {
        AbstractC3557B.c0("<this>", fVar);
        EnumC2082q f6 = fVar.h().f();
        if (f6 != EnumC2082q.f25376Z && f6 != EnumC2082q.f25377h0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (fVar.f().b() == null) {
            T t10 = new T(fVar.f(), (e0) fVar);
            fVar.f().c("androidx.lifecycle.internal.SavedStateHandlesProvider", t10);
            fVar.h().a(new C1478t(t10));
        }
    }

    public static void h(A3.d dVar, S s10) {
        EnumC2082q f6 = s10.f();
        if (f6 != EnumC2082q.f25376Z && !f6.a(EnumC2082q.f25378i0)) {
            s10.a(new C2074i(s10, 1, dVar));
        } else {
            dVar.d();
        }
    }

    public abstract void a(AbstractC2085u abstractC2085u);

    public abstract EnumC2082q f();

    public abstract void g(AbstractC2085u abstractC2085u);
}
