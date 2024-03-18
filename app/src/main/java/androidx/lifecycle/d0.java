package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f25359a = new LinkedHashMap();

    public final void a() {
        for (Y y10 : this.f25359a.values()) {
            y10.f25346c = true;
            HashMap hashMap = y10.f25344a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        for (Object obj : y10.f25344a.values()) {
                            Y.b(obj);
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = y10.f25345b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : y10.f25345b) {
                            Y.b(closeable);
                        }
                    } finally {
                    }
                }
                y10.f25345b.clear();
            }
            y10.c();
        }
        this.f25359a.clear();
    }
}
