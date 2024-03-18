package u7;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f46466a = Collections.newSetFromMap(new WeakHashMap());

    public static Set a() {
        Set set = f46466a;
        synchronized (set) {
        }
        return set;
    }
}
