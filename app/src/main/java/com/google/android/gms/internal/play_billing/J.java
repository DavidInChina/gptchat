package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: b  reason: collision with root package name */
    public static volatile J f26851b;

    /* renamed from: a  reason: collision with root package name */
    public final Map f26852a = Collections.emptyMap();

    static {
        new J();
    }

    public static J a() {
        J j6 = f26851b;
        if (j6 != null) {
            return j6;
        }
        synchronized (J.class) {
            try {
                J j10 = f26851b;
                if (j10 != null) {
                    return j10;
                }
                J G02 = N.G0();
                f26851b = G02;
                return G02;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
