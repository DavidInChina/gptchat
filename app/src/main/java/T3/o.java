package t3;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kf.AbstractC4268D;
import kf.C4288m;
import l8.AbstractC4344b;
import s3.C5545H;
import s3.C5562l;
import s3.C5563m;
import s3.W;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public static final o f45702Y = new kotlin.jvm.internal.o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Bundle bundle;
        i0.d dVar = (i0.d) obj;
        C5545H c5545h = (C5545H) obj2;
        c5545h.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : AbstractC4268D.l1(c5545h.f45361v.f45279a).entrySet()) {
            String str = (String) entry.getKey();
            ((W) entry.getValue()).getClass();
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        C4288m c4288m = c5545h.f45346g;
        if (!c4288m.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[c4288m.f37476h0];
            Iterator<E> it = c4288m.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new C5563m((C5562l) it.next());
                i10++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = c5545h.f45352m;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i11 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                iArr[i11] = ((Number) entry2.getKey()).intValue();
                arrayList2.add((String) entry2.getValue());
                i11++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = c5545h.f45353n;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                C4288m c4288m2 = (C4288m) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[c4288m2.f37476h0];
                Iterator it2 = c4288m2.iterator();
                int i12 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        parcelableArr2[i12] = (C5563m) next;
                        i12 = i13;
                    } else {
                        AbstractC4344b.d1();
                        throw null;
                    }
                }
                bundle.putParcelableArray(R.a.r("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (c5545h.f45345f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", c5545h.f45345f);
        }
        return bundle;
    }
}
