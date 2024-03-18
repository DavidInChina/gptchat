package fi;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Method f30918a;

    /* renamed from: b  reason: collision with root package name */
    public Method f30919b;

    /* renamed from: c  reason: collision with root package name */
    public Method f30920c;

    public /* synthetic */ i(Method method, Method method2, Method method3) {
        this.f30918a = method;
        this.f30919b = method2;
        this.f30920c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
