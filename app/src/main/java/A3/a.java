package A3;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2084t;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.EnumC2081p;
import androidx.lifecycle.S;
import androidx.lifecycle.Y;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class a implements AbstractC2084t {

    /* renamed from: Y  reason: collision with root package name */
    public final f f637Y;

    public a(f fVar) {
        AbstractC3557B.c0("owner", fVar);
        this.f637Y = fVar;
    }

    @Override // androidx.lifecycle.AbstractC2084t
    public final void b(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        if (enumC2081p == EnumC2081p.ON_CREATE) {
            abstractC2086v.h().g(this);
            f fVar = this.f637Y;
            Bundle a5 = fVar.f().a("androidx.savedstate.Restarter");
            if (a5 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a5.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, a.class.getClassLoader()).asSubclass(b.class);
                        AbstractC3557B.b0("{\n                Class.\u2026class.java)\n            }", asSubclass);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                AbstractC3557B.b0("{\n                constr\u2026wInstance()\n            }", newInstance);
                                b bVar = (b) newInstance;
                                if (fVar instanceof e0) {
                                    d0 e10 = ((e0) fVar).e();
                                    d f6 = fVar.f();
                                    e10.getClass();
                                    LinkedHashMap linkedHashMap = e10.f25359a;
                                    Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                    while (it.hasNext()) {
                                        String str2 = (String) it.next();
                                        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str2);
                                        Y y10 = (Y) linkedHashMap.get(str2);
                                        AbstractC3557B.Z(y10);
                                        S.b(y10, f6, fVar.h());
                                    }
                                    if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                        f6.d();
                                    }
                                } else {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                }
                            } catch (Exception e11) {
                                throw new RuntimeException(R.a.r("Failed to instantiate ", str), e11);
                            }
                        } catch (NoSuchMethodException e12) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e12);
                        }
                    } catch (ClassNotFoundException e13) {
                        throw new RuntimeException(android.gov.nist.core.a.A("Class ", str, " wasn't found"), e13);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
