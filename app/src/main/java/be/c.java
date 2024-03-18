package be;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class c extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final c f25941Z = new c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final c f25942h0 = new c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final c f25943i0 = new c(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final c f25944j0 = new c(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final c f25945k0 = new c(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final c f25946l0 = new c(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final c f25947m0 = new c(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final c f25948n0 = new c(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final c f25949o0 = new c(8);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25950Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(0);
        this.f25950Y = i10;
    }

    public final Handler a() {
        switch (this.f25950Y) {
            case 0:
                HandlerThread handlerThread = new HandlerThread("frame_metrics");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            default:
                return new Handler(Looper.getMainLooper());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:89)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:459)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:51)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final java.lang.Class c() {
        /*
            r6 = this;
            int r0 = r6.f25950Y
            r1 = 0
            switch(r0) {
                case 3: goto L48;
                case 4: goto L6;
                case 5: goto L3a;
                default: goto L6;
            }
        L6:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r0 < r2) goto Lf
            java.lang.String r2 = "com.android.internal.policy.DecorView"
            goto L18
        Lf:
            r2 = 23
            if (r0 != r2) goto L16
            java.lang.String r2 = "com.android.internal.policy.PhoneWindow$DecorView"
            goto L18
        L16:
            java.lang.String r2 = "com.android.internal.policy.impl.PhoneWindow$DecorView"
        L18:
            java.lang.Class r1 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1d
            goto L39
        L1d:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unexpected exception loading "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " on API "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = "WindowSpy"
            android.util.Log.d(r2, r0, r3)
        L39:
            return r1
        L3a:
            java.lang.String r0 = "android.view.WindowManagerGlobal"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L41
            goto L47
        L41:
            r0 = move-exception
            java.lang.String r2 = "WindowManagerSpy"
            io.sentry.android.core.AbstractC3612c.t(r2, r0)
        L47:
            return r1
        L48:
            java.lang.Class<androidx.appcompat.view.WindowCallbackWrapper> r0 = androidx.appcompat.view.WindowCallbackWrapper.class
            goto L52
        L4b:
            java.lang.String r0 = "android.support.v7.view.WindowCallbackWrapper"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L51
        L51:
            r0 = r1
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.c.c():java.lang.Class");
    }

    public final Field e() {
        String str;
        switch (this.f25950Y) {
            case 2:
                Class cls = (Class) i.f25961i0.getValue();
                if (cls == null) {
                    return null;
                }
                try {
                    Field declaredField = cls.getDeclaredField("mWrapped");
                    declaredField.setAccessible(true);
                    return declaredField;
                } catch (Throwable unused) {
                    return null;
                }
            case 3:
            default:
                Class cls2 = (Class) k.f25970a.getValue();
                if (cls2 == null) {
                    return null;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    str = "mWindow";
                } else {
                    str = "this$0";
                }
                try {
                    Field declaredField2 = cls2.getDeclaredField(str);
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException e10) {
                    Log.d("WindowSpy", "Unexpected exception retrieving " + cls2 + '#' + str + " on API " + i10, e10);
                    return null;
                }
            case 4:
                Class cls3 = (Class) j.f25967a.getValue();
                if (cls3 == null) {
                    return null;
                }
                Field declaredField3 = cls3.getDeclaredField("mViews");
                declaredField3.setAccessible(true);
                return declaredField3;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f25950Y) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return e();
            case 3:
                return c();
            case 4:
                return e();
            case 5:
                return c();
            case 6:
                Class cls = (Class) j.f25967a.getValue();
                if (cls == null) {
                    return null;
                }
                return cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            case 7:
                return c();
            default:
                return e();
        }
    }
}
