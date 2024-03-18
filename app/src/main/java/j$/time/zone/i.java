package j$.time.zone;

import j$.time.DateTimeException;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList f35200a;

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f35201b = new ConcurrentHashMap(512, 0.75f, 2);

    /* renamed from: c  reason: collision with root package name */
    private static volatile Set f35202c;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f35200a = copyOnWriteArrayList;
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new g(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static Set a() {
        return f35202c;
    }

    public static ZoneRules b(String str, boolean z10) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f35201b;
        i iVar = (i) concurrentHashMap.get(str);
        if (iVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new DateTimeException("No time-zone data files registered");
            }
            throw new DateTimeException("Unknown time-zone ID: " + str);
        }
        return iVar.c(str);
    }

    public static void e(i iVar) {
        Objects.requireNonNull(iVar, "provider");
        synchronized (i.class) {
            try {
                for (String str : iVar.d()) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((i) f35201b.putIfAbsent(str, iVar)) != null) {
                        throw new DateTimeException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
                    }
                }
                f35202c = Collections.unmodifiableSet(new HashSet(f35201b.keySet()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f35200a.add(iVar);
    }

    protected abstract ZoneRules c(String str);

    protected abstract Set d();
}
