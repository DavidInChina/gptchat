package Og;

import Ng.C;
import Ng.D;
import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import nf.AbstractC4821a;
import nf.AbstractC4831k;

/* loaded from: classes.dex */
public final class b extends AbstractC4821a implements D {
    private volatile Object _preHandler = this;

    public b() {
        super(C.f12863Y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (java.lang.reflect.Modifier.isStatic(r5.getModifiers()) != false) goto L14;
     */
    @Override // Ng.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleException(AbstractC4831k abstractC4831k, Throwable th2) {
        Method method;
        Object obj;
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 28) {
            Object obj2 = this._preHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (obj2 != this) {
                method = (Method) obj2;
            } else {
                try {
                    method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
                    if (Modifier.isPublic(method.getModifiers())) {
                    }
                } catch (Throwable unused) {
                }
                method = null;
                this._preHandler = method;
            }
            if (method != null) {
                obj = method.invoke(null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
        }
    }
}
