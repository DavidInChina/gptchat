package fh;

import id.AbstractC3557B;
import jf.C3960j;

/* renamed from: fh.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3079f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f30871a;

    static {
        Object obj;
        int i10;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            AbstractC3557B.b0("getProperty(...)", property);
            obj = Lg.m.W1(property);
        } catch (Throwable th2) {
            obj = com.google.android.gms.internal.play_billing.N.w(th2);
        }
        if (obj instanceof C3960j) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 2097152;
        }
        f30871a = i10;
    }
}
