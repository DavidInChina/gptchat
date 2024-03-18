package fh;

import ah.C2004o;
import bh.C2222l;
import bh.C2224n;
import dh.C2700f0;
import eh.AbstractC2904d;
import eh.AbstractC2923w;
import eh.C2909i;
import hg.C3431j;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kf.AbstractC4268D;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: fh.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3096w {

    /* renamed from: a  reason: collision with root package name */
    public static final C3431j f30899a = new C3431j(17);

    /* renamed from: b  reason: collision with root package name */
    public static final C3431j f30900b = new C3431j(17);

    public static final void a(LinkedHashMap linkedHashMap, SerialDescriptor serialDescriptor, String str, int i10) {
        String str2;
        if (AbstractC3557B.K(serialDescriptor.e(), C2222l.f26014a)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i10));
            return;
        }
        throw new C2004o("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.g(i10) + " is already one of the names for " + str2 + ' ' + serialDescriptor.g(((Number) AbstractC4268D.Z0(str, linkedHashMap)).intValue()) + " in " + serialDescriptor, 1);
    }

    public static final Map b(SerialDescriptor serialDescriptor, AbstractC2904d abstractC2904d) {
        AbstractC3557B.c0("<this>", abstractC2904d);
        AbstractC3557B.c0("descriptor", serialDescriptor);
        return (Map) abstractC2904d.f29418c.a(serialDescriptor, f30899a, new C2700f0(serialDescriptor, 1, abstractC2904d));
    }

    public static final String c(SerialDescriptor serialDescriptor, AbstractC2904d abstractC2904d, int i10) {
        AbstractC3557B.c0("<this>", serialDescriptor);
        AbstractC3557B.c0("json", abstractC2904d);
        AbstractC2923w g10 = g(serialDescriptor, abstractC2904d);
        if (g10 == null) {
            return serialDescriptor.g(i10);
        }
        return ((String[]) abstractC2904d.f29418c.a(serialDescriptor, f30900b, new C2700f0(serialDescriptor, 2, g10)))[i10];
    }

    public static final int d(SerialDescriptor serialDescriptor, AbstractC2904d abstractC2904d, String str) {
        AbstractC3557B.c0("<this>", serialDescriptor);
        AbstractC3557B.c0("json", abstractC2904d);
        AbstractC3557B.c0("name", str);
        C2909i c2909i = abstractC2904d.f29416a;
        if (c2909i.f29454n && AbstractC3557B.K(serialDescriptor.e(), C2222l.f26014a)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC3557B.b0("toLowerCase(...)", lowerCase);
            return f(serialDescriptor, abstractC2904d, lowerCase);
        } else if (g(serialDescriptor, abstractC2904d) != null) {
            return f(serialDescriptor, abstractC2904d, str);
        } else {
            int d10 = serialDescriptor.d(str);
            if (d10 != -3) {
                return d10;
            }
            if (!c2909i.f29452l) {
                return d10;
            }
            return f(serialDescriptor, abstractC2904d, str);
        }
    }

    public static final int e(SerialDescriptor serialDescriptor, AbstractC2904d abstractC2904d, String str, String str2) {
        AbstractC3557B.c0("<this>", serialDescriptor);
        AbstractC3557B.c0("json", abstractC2904d);
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("suffix", str2);
        int d10 = d(serialDescriptor, abstractC2904d, str);
        if (d10 != -3) {
            return d10;
        }
        throw new IllegalArgumentException(serialDescriptor.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final int f(SerialDescriptor serialDescriptor, AbstractC2904d abstractC2904d, String str) {
        Integer num = (Integer) b(serialDescriptor, abstractC2904d).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final AbstractC2923w g(SerialDescriptor serialDescriptor, AbstractC2904d abstractC2904d) {
        AbstractC3557B.c0("<this>", serialDescriptor);
        AbstractC3557B.c0("json", abstractC2904d);
        if (AbstractC3557B.K(serialDescriptor.e(), C2224n.f26015a)) {
            return abstractC2904d.f29416a.f29453m;
        }
        return null;
    }
}
