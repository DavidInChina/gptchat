package j;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2084t;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f35810a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f35811b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f35812c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f35813d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final transient HashMap f35814e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f35815f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f35816g = new Bundle();

    public final boolean a(int i10, int i11, Intent intent) {
        AbstractC3873c abstractC3873c;
        String str = (String) this.f35810a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        f fVar = (f) this.f35814e.get(str);
        if (fVar != null && (abstractC3873c = fVar.f35806a) != null && this.f35813d.contains(str)) {
            abstractC3873c.d(fVar.f35807b.v0(intent, i11));
            this.f35813d.remove(str);
            return true;
        }
        this.f35815f.remove(str);
        this.f35816g.putParcelable(str, new C3872b(intent, i11));
        return true;
    }

    public abstract void b(int i10, P4.a aVar, Object obj);

    public final C3875e c(String str, P4.a aVar, AbstractC3873c abstractC3873c) {
        d(str);
        this.f35814e.put(str, new f(abstractC3873c, aVar));
        HashMap hashMap = this.f35815f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            abstractC3873c.d(obj);
        }
        Bundle bundle = this.f35816g;
        C3872b c3872b = (C3872b) bundle.getParcelable(str);
        if (c3872b != null) {
            bundle.remove(str);
            abstractC3873c.d(aVar.v0(c3872b.f35797Z, c3872b.f35796Y));
        }
        return new C3875e(this, str, aVar, 1);
    }

    public final void d(String str) {
        HashMap hashMap = this.f35811b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        Af.d.f840Y.getClass();
        int e10 = Af.d.f841Z.e(2147418112);
        while (true) {
            int i10 = e10 + 65536;
            HashMap hashMap2 = this.f35810a;
            if (hashMap2.containsKey(Integer.valueOf(i10))) {
                Af.d.f840Y.getClass();
                e10 = Af.d.f841Z.e(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i10), str);
                hashMap.put(str, Integer.valueOf(i10));
                return;
            }
        }
    }

    public final void e(String str) {
        Integer num;
        if (!this.f35813d.contains(str) && (num = (Integer) this.f35811b.remove(str)) != null) {
            this.f35810a.remove(num);
        }
        this.f35814e.remove(str);
        HashMap hashMap = this.f35815f;
        if (hashMap.containsKey(str)) {
            StringBuilder s10 = android.gov.nist.core.a.s("Dropping pending result for request ", str, ": ");
            s10.append(hashMap.get(str));
            AbstractC3612c.r("ActivityResultRegistry", s10.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f35816g;
        if (bundle.containsKey(str)) {
            StringBuilder s11 = android.gov.nist.core.a.s("Dropping pending result for request ", str, ": ");
            s11.append(bundle.getParcelable(str));
            AbstractC3612c.r("ActivityResultRegistry", s11.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f35812c;
        g gVar = (g) hashMap2.get(str);
        if (gVar != null) {
            ArrayList arrayList = gVar.f35809b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar.f35808a.g((AbstractC2084t) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
