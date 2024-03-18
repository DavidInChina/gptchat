package A3;

import android.os.Bundle;
import androidx.lifecycle.C2078m;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m.C4530j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public boolean f639b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f640c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f641d;

    /* renamed from: e  reason: collision with root package name */
    public C4530j f642e;

    /* renamed from: a  reason: collision with root package name */
    public final s.g f638a = new s.g();

    /* renamed from: f  reason: collision with root package name */
    public boolean f643f = true;

    public final Bundle a(String str) {
        Bundle bundle;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        if (this.f641d) {
            Bundle bundle2 = this.f640c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.f640c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f640c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f640c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c b() {
        Map.Entry entry;
        c cVar;
        Iterator it = this.f638a.iterator();
        do {
            s.e eVar = (s.e) it;
            if (eVar.hasNext()) {
                entry = (Map.Entry) eVar.next();
                AbstractC3557B.b0("components", entry);
                cVar = (c) entry.getValue();
            } else {
                return null;
            }
        } while (!AbstractC3557B.K((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return cVar;
    }

    public final void c(String str, c cVar) {
        Object obj;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC3557B.c0("provider", cVar);
        s.g gVar = this.f638a;
        s.c f6 = gVar.f(str);
        if (f6 != null) {
            obj = f6.f45004Z;
        } else {
            s.c cVar2 = new s.c(str, cVar);
            gVar.f45015i0++;
            s.c cVar3 = gVar.f45013Z;
            if (cVar3 == null) {
                gVar.f45012Y = cVar2;
                gVar.f45013Z = cVar2;
            } else {
                cVar3.f45005h0 = cVar2;
                cVar2.f45006i0 = cVar3;
                gVar.f45013Z = cVar2;
            }
            obj = null;
        }
        if (((c) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    public final void d() {
        if (this.f643f) {
            C4530j c4530j = this.f642e;
            if (c4530j == null) {
                c4530j = new C4530j(this);
            }
            this.f642e = c4530j;
            try {
                C2078m.class.getDeclaredConstructor(new Class[0]);
                C4530j c4530j2 = this.f642e;
                if (c4530j2 != null) {
                    ((Set) c4530j2.f38775b).add(C2078m.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + C2078m.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
