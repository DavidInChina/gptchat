package g;

import V1.AbstractActivityC1483y;
import V1.K;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.EnumC2081p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: g.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3113f implements A3.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30948a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f30949b;

    public /* synthetic */ C3113f(int i10, Object obj) {
        this.f30948a = i10;
        this.f30949b = obj;
    }

    @Override // A3.c
    public final Bundle a() {
        ArrayList<? extends Parcelable> arrayList;
        int i10 = this.f30948a;
        Object obj = this.f30949b;
        switch (i10) {
            case 0:
                AbstractActivityC3122o abstractActivityC3122o = (AbstractActivityC3122o) obj;
                abstractActivityC3122o.getClass();
                Bundle bundle = new Bundle();
                C3116i c3116i = abstractActivityC3122o.f30976q0;
                c3116i.getClass();
                HashMap hashMap = c3116i.f35811b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c3116i.f35813d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c3116i.f35816g.clone());
                return bundle;
            case 1:
                Map b10 = ((i0.m) obj).b();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : b10.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list instanceof ArrayList) {
                        arrayList = (ArrayList) list;
                    } else {
                        arrayList = new ArrayList<>(list);
                    }
                    bundle2.putParcelableArrayList(str, arrayList);
                }
                return bundle2;
            case 2:
                AbstractActivityC1483y abstractActivityC1483y = (AbstractActivityC1483y) obj;
                int i11 = AbstractActivityC1483y.f18313D0;
                do {
                } while (AbstractActivityC1483y.m(abstractActivityC1483y.f18317y0.e()));
                abstractActivityC1483y.f18318z0.k(EnumC2081p.ON_STOP);
                return new Bundle();
            default:
                return ((K) obj).U();
        }
    }
}
