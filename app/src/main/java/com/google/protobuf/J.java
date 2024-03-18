package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: b  reason: collision with root package name */
    public static volatile J f27414b;

    /* renamed from: c  reason: collision with root package name */
    public static final J f27415c = new J();

    /* renamed from: a  reason: collision with root package name */
    public final Map f27416a = Collections.emptyMap();

    public static J b() {
        J j6 = f27414b;
        if (j6 == null) {
            synchronized (J.class) {
                try {
                    j6 = f27414b;
                    if (j6 == null) {
                        Class cls = H.f27401a;
                        J j10 = null;
                        if (cls != null) {
                            try {
                                j10 = (J) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                            }
                        }
                        if (j10 == null) {
                            j10 = f27415c;
                        }
                        f27414b = j10;
                        j6 = j10;
                    }
                } finally {
                }
            }
        }
        return j6;
    }

    public final C2491b0 a(int i10, M0 m02) {
        return (C2491b0) this.f27416a.get(new I(i10, m02));
    }
}
