package Z1;

import dh.C2700f0;
import hg.C3431j;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractMap f23111a;

    public t0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                this.f23111a = new LinkedHashMap();
                return;
            } else {
                this.f23111a = new ConcurrentHashMap(16);
                return;
            }
        }
        this.f23111a = new LinkedHashMap();
    }

    public static String b(int i10, int i11, String str) {
        return i10 + '-' + i11 + '-' + str;
    }

    public final Object a(SerialDescriptor serialDescriptor, C3431j c3431j, C2700f0 c2700f0) {
        Object obj;
        AbstractC3557B.c0("descriptor", serialDescriptor);
        AbstractMap abstractMap = this.f23111a;
        Map map = (Map) abstractMap.get(serialDescriptor);
        Object obj2 = null;
        if (map != null) {
            obj = map.get(c3431j);
        } else {
            obj = null;
        }
        if (obj != null) {
            obj2 = obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        Object mo122invoke = c2700f0.mo122invoke();
        Object obj3 = abstractMap.get(serialDescriptor);
        if (obj3 == null) {
            obj3 = new ConcurrentHashMap(2);
            abstractMap.put(serialDescriptor, obj3);
        }
        ((Map) obj3).put(c3431j, mo122invoke);
        return mo122invoke;
    }
}
