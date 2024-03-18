package u4;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final q4.c f46387a = new q4.c();

    public static final boolean a(q4.j jVar) {
        int ordinal = jVar.f43850i.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (jVar.f43840L.f43769b != null || !(jVar.f43830B instanceof r4.c)) {
                    return false;
                }
            } else {
                throw new RuntimeException();
            }
        }
        return true;
    }

    public static final Drawable b(q4.j jVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable == null) {
            if (num != null) {
                if (num.intValue() == 0) {
                    return null;
                }
                Context context = jVar.f43842a;
                int intValue = num.intValue();
                Drawable u10 = kotlin.jvm.internal.m.u(context, intValue);
                if (u10 != null) {
                    return u10;
                }
                throw new IllegalStateException(android.gov.nist.core.a.e("Invalid resource ID: ", intValue).toString());
            }
            return drawable2;
        }
        return drawable;
    }
}
