package androidx.lifecycle;

import Qg.l0;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jf.C3959i;
import kf.AbstractC4268D;

/* loaded from: classes2.dex */
public final class P {

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f25307f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f25308a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f25309b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f25310c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f25311d;

    /* renamed from: e  reason: collision with root package name */
    public final O f25312e;

    public P(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f25308a = linkedHashMap;
        this.f25309b = new LinkedHashMap();
        this.f25310c = new LinkedHashMap();
        this.f25311d = new LinkedHashMap();
        this.f25312e = new O(this, 1);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(P p10) {
        AbstractC3557B.c0("this$0", p10);
        for (Map.Entry entry : AbstractC4268D.l1(p10.f25309b).entrySet()) {
            p10.c((String) entry.getKey(), ((A3.c) entry.getValue()).a());
        }
        LinkedHashMap linkedHashMap = p10.f25308a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return R4.b.L(new C3959i("keys", arrayList), new C3959i(DiagnosticsEntry.Histogram.VALUES_KEY, arrayList2));
    }

    public final Object b(String str) {
        LinkedHashMap linkedHashMap = this.f25308a;
        try {
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            AbstractC2469q0.p(this.f25310c.remove(str));
            this.f25311d.remove(str);
            return null;
        }
    }

    public final void c(String str, Object obj) {
        E e10;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        if (obj != null) {
            Class[] clsArr = f25307f;
            for (int i10 = 0; i10 < 29; i10++) {
                Class cls = clsArr[i10];
                AbstractC3557B.Z(cls);
                if (!cls.isInstance(obj)) {
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.f25310c.get(str);
        if (obj2 instanceof E) {
            e10 = (E) obj2;
        } else {
            e10 = null;
        }
        if (e10 != null) {
            e10.i(obj);
        } else {
            this.f25308a.put(str, obj);
        }
        l0 l0Var = (l0) this.f25311d.get(str);
        if (l0Var != null) {
            l0Var.setValue(obj);
        }
    }

    public P() {
        this.f25308a = new LinkedHashMap();
        this.f25309b = new LinkedHashMap();
        this.f25310c = new LinkedHashMap();
        this.f25311d = new LinkedHashMap();
        this.f25312e = new O(this, 0);
    }
}
