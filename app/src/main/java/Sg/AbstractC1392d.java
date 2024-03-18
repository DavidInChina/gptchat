package Sg;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: Sg.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1392d {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f16649a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f16649a = method;
    }
}
