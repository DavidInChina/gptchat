package V;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f17970a;

    /* renamed from: b  reason: collision with root package name */
    public Map f17971b;

    public s(int i10) {
        if (i10 != 1) {
            this.f17970a = new LinkedHashMap();
            this.f17971b = new LinkedHashMap();
            return;
        }
        this.f17970a = new HashMap();
    }

    public final synchronized Map a() {
        try {
            if (this.f17971b == null) {
                this.f17971b = Collections.unmodifiableMap(new HashMap(this.f17970a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f17971b;
    }
}
