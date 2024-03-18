package g;

import V1.AbstractActivityC1483y;
import V1.C1482x;
import android.os.Bundle;
import i.AbstractC3453b;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: g.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3114g implements AbstractC3453b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30950a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC3122o f30951b;

    public /* synthetic */ C3114g(AbstractActivityC3122o abstractActivityC3122o, int i10) {
        this.f30950a = i10;
        this.f30951b = abstractActivityC3122o;
    }

    @Override // i.AbstractC3453b
    public final void a() {
        int i10 = this.f30950a;
        AbstractActivityC3122o abstractActivityC3122o = this.f30951b;
        switch (i10) {
            case 0:
                Bundle a5 = abstractActivityC3122o.f30969j0.f645b.a("android:support:activity-result");
                if (a5 != null) {
                    C3116i c3116i = abstractActivityC3122o.f30976q0;
                    c3116i.getClass();
                    ArrayList<Integer> integerArrayList = a5.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a5.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        c3116i.f35813d = a5.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        Bundle bundle = a5.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = c3116i.f35816g;
                        bundle2.putAll(bundle);
                        for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                            String str = stringArrayList.get(i11);
                            HashMap hashMap = c3116i.f35811b;
                            boolean containsKey = hashMap.containsKey(str);
                            HashMap hashMap2 = c3116i.f35810a;
                            if (containsKey) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i11);
                            num2.intValue();
                            String str2 = stringArrayList.get(i11);
                            hashMap2.put(num2, str2);
                            hashMap.put(str2, num2);
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C1482x c1482x = (C1482x) ((AbstractActivityC1483y) abstractActivityC3122o).f18317y0.f5033Z;
                c1482x.f18311i0.b(c1482x, c1482x, null);
                return;
        }
    }
}
