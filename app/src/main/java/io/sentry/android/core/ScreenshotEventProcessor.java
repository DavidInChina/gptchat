package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import id.AbstractC3557B;
import io.sentry.C3607a;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.Z0;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class ScreenshotEventProcessor implements io.sentry.r {

    /* renamed from: Y  reason: collision with root package name */
    public final SentryAndroidOptions f34027Y;

    /* renamed from: Z  reason: collision with root package name */
    public final B f34028Z;

    /* renamed from: h0  reason: collision with root package name */
    public final io.sentry.android.core.internal.util.d f34029h0 = new io.sentry.android.core.internal.util.d();

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, B b10) {
        Ad.l.Z0("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f34027Y = sentryAndroidOptions;
        this.f34028Z = b10;
        if (sentryAndroidOptions.isAttachScreenshot()) {
            r.f.e(ScreenshotEventProcessor.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0160 A[Catch: all -> 0x0105, TryCatch #2 {all -> 0x0118, blocks: (B:38:0x00a3, B:51:0x0113, B:64:0x016e, B:39:0x00a8, B:41:0x00c9, B:48:0x00fc, B:53:0x0120, B:55:0x012b, B:56:0x0136, B:57:0x0148, B:60:0x0153, B:62:0x0160, B:63:0x016a, B:42:0x00d3, B:44:0x00f1), top: B:73:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016a A[Catch: all -> 0x0105, TRY_LEAVE, TryCatch #2 {all -> 0x0118, blocks: (B:38:0x00a3, B:51:0x0113, B:64:0x016e, B:39:0x00a8, B:41:0x00c9, B:48:0x00fc, B:53:0x0120, B:55:0x012b, B:56:0x0136, B:57:0x0148, B:60:0x0153, B:62:0x0160, B:63:0x016a, B:42:0x00d3, B:44:0x00f1), top: B:73:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Type inference failed for: r10v5, types: [io.sentry.android.core.internal.util.h] */
    @Override // io.sentry.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Z0 a(Z0 z02, C3686u c3686u) {
        Activity activity;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        Bitmap createBitmap;
        final CountDownLatch countDownLatch;
        Bitmap bitmap;
        CountDownLatch countDownLatch2;
        boolean z10;
        C4.c cVar = z02.f33903y0;
        if (cVar != null && !cVar.f2667Y.isEmpty()) {
            SentryAndroidOptions sentryAndroidOptions = this.f34027Y;
            if (!sentryAndroidOptions.isAttachScreenshot()) {
                sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return z02;
            }
            WeakReference weakReference = C.f33952b.f33953a;
            if (weakReference != null) {
                activity = (Activity) weakReference.get();
            } else {
                activity = null;
            }
            if (activity != null && !AbstractC3557B.L1(c3686u)) {
                boolean a5 = this.f34029h0.a();
                sentryAndroidOptions.getBeforeScreenshotCaptureCallback();
                if (a5) {
                    return z02;
                }
                io.sentry.util.thread.a mainThreadChecker = sentryAndroidOptions.getMainThreadChecker();
                io.sentry.H logger = sentryAndroidOptions.getLogger();
                B b10 = this.f34028Z;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    Window window = activity.getWindow();
                    if (window == null) {
                        logger.f(EnumC3642e1.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
                    } else {
                        View peekDecorView = window.peekDecorView();
                        if (peekDecorView == null) {
                            logger.f(EnumC3642e1.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
                        } else {
                            View rootView = peekDecorView.getRootView();
                            if (rootView == null) {
                                logger.f(EnumC3642e1.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
                            } else if (rootView.getWidth() > 0 && rootView.getHeight() > 0) {
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                                    countDownLatch = new CountDownLatch(1);
                                    b10.getClass();
                                } catch (Throwable th2) {
                                    logger.d(EnumC3642e1.ERROR, "Taking screenshot failed.", th2);
                                }
                                if (Build.VERSION.SDK_INT >= 26) {
                                    HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
                                    handlerThread.start();
                                    Handler handler = new Handler(handlerThread.getLooper());
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                    PixelCopy.request(window, createBitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.core.internal.util.h
                                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                        public final void onPixelCopyFinished(int i10) {
                                            boolean z11;
                                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                                            CountDownLatch countDownLatch3 = countDownLatch;
                                            if (i10 == 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            atomicBoolean2.set(z11);
                                            countDownLatch3.countDown();
                                        }
                                    }, handler);
                                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS) && atomicBoolean.get()) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    handlerThread.quit();
                                    if (z10) {
                                        bitmap = createBitmap;
                                        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                                        if (byteArrayOutputStream.size() > 0) {
                                            logger.f(EnumC3642e1.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                        } else {
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            bArr = byteArray;
                                            if (bArr != null) {
                                                return z02;
                                            }
                                            c3686u.f34766c = new C3607a(bArr, "screenshot.png", "image/png");
                                            c3686u.c("android:activity", activity);
                                        }
                                    }
                                    byteArrayOutputStream.close();
                                } else {
                                    Canvas canvas = new Canvas(createBitmap);
                                    if (mainThreadChecker.a()) {
                                        rootView.draw(canvas);
                                        countDownLatch.countDown();
                                        countDownLatch2 = countDownLatch;
                                        bitmap = createBitmap;
                                    } else {
                                        countDownLatch2 = countDownLatch;
                                        bitmap = createBitmap;
                                        activity.runOnUiThread(new M3.u(rootView, canvas, logger, countDownLatch, 6));
                                    }
                                    if (!countDownLatch2.await(1000L, TimeUnit.MILLISECONDS)) {
                                        byteArrayOutputStream.close();
                                    }
                                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                                    if (byteArrayOutputStream.size() > 0) {
                                    }
                                }
                            } else {
                                logger.f(EnumC3642e1.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
                            }
                        }
                    }
                } else {
                    logger.f(EnumC3642e1.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
                }
                bArr = null;
                if (bArr != null) {
                }
            }
        }
        return z02;
    }

    @Override // io.sentry.r
    public final io.sentry.protocol.z h(io.sentry.protocol.z zVar, C3686u c3686u) {
        return zVar;
    }
}
