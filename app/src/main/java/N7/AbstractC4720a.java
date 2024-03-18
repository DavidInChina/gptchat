package n7;

import android.util.SparseArray;
import b7.c;
import java.util.HashMap;

/* renamed from: n7.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4720a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray f39649a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f39650b;

    static {
        HashMap hashMap = new HashMap();
        f39650b = hashMap;
        hashMap.put(c.f25648Y, 0);
        hashMap.put(c.f25649Z, 1);
        hashMap.put(c.f25650h0, 2);
        for (c cVar : hashMap.keySet()) {
            f39649a.append(((Integer) f39650b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f39650b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i10) {
        c cVar = (c) f39649a.get(i10);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Unknown Priority for value ", i10));
    }
}
