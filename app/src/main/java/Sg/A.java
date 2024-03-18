package Sg;

import M3.H;
import com.google.android.gms.internal.play_billing.N;
import jf.C3961k;
import pf.AbstractC5154a;

/* loaded from: classes2.dex */
public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f16630a = 0;

    static {
        Object obj;
        Object obj2;
        Exception exc = new Exception();
        String simpleName = H.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            obj = AbstractC5154a.class.getCanonicalName();
        } catch (Throwable th2) {
            obj = N.w(th2);
        }
        if (C3961k.a(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) obj;
        try {
            obj2 = A.class.getCanonicalName();
        } catch (Throwable th3) {
            obj2 = N.w(th3);
        }
        if (C3961k.a(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) obj2;
    }
}
