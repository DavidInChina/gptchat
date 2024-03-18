package hh;

import android.util.Log;
import id.AbstractC3557B;

/* renamed from: hh.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3435c implements Ki.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3435c f32349a = new Object();

    public void a(String str) {
        AbstractC3557B.d0("message", str);
        if (str.length() < 4000) {
            Log.d("LeakCanary", str);
            return;
        }
        for (String str2 : Kg.m.p1(Lg.n.q2(str))) {
            Log.d("LeakCanary", str2);
        }
    }
}
