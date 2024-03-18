package v4;

import android.content.Context;
import df.C2649n;
import id.AbstractC3557B;
import io.sentry.O0;
import io.sentry.Q;
import io.sentry.X0;
import io.sentry.android.core.F;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.y1;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import ji.C4116E;
import livekit.org.webrtc.VideoEncoder;

/* renamed from: v4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC5972b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f47164a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f47165b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f47166c;

    public /* synthetic */ CallableC5972b(Object obj, int i10, Object obj2) {
        this.f47164a = i10;
        this.f47166c = obj;
        this.f47165b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f47164a) {
            case 0:
                return e.b((InputStream) this.f47166c, (String) this.f47165b);
            case 1:
                C4116E J10 = R4.b.J(R4.b.Z1(new ByteArrayInputStream(((String) this.f47165b).getBytes())));
                String[] strArr = H4.a.f7432j0;
                return e.c(new H4.b(J10), (String) this.f47166c, true);
            case 2:
                C2649n c2649n = (C2649n) this.f47166c;
                AbstractC3557B.c0("this$0", c2649n);
                return c2649n.f28284a.setRates((VideoEncoder.RateControlParameters) this.f47165b);
            case 3:
                Q q10 = (Q) this.f47166c;
                y1 y1Var = (y1) this.f47165b;
                Charset charset = X0.f33883d;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, X0.f33883d));
                    q10.n(y1Var, bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 4:
                Q q11 = (Q) this.f47166c;
                O0 o02 = (O0) this.f47165b;
                Charset charset2 = X0.f33883d;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, X0.f33883d));
                    q11.n(o02, bufferedWriter2);
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    bufferedWriter2.close();
                    byteArrayOutputStream2.close();
                    return byteArray2;
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            case 5:
                Q q12 = (Q) this.f47166c;
                io.sentry.clientreport.a aVar = (io.sentry.clientreport.a) this.f47165b;
                Charset charset3 = X0.f33883d;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, X0.f33883d));
                    q12.n(aVar, bufferedWriter3);
                    byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                    bufferedWriter3.close();
                    byteArrayOutputStream3.close();
                    return byteArray3;
                } catch (Throwable th6) {
                    try {
                        byteArrayOutputStream3.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            default:
                Context context = (Context) this.f47166c;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f47165b;
                if (F.f33964h == null) {
                    synchronized (F.class) {
                        try {
                            if (F.f33964h == null) {
                                F.f33964h = new F(context.getApplicationContext(), sentryAndroidOptions);
                            }
                        } finally {
                        }
                    }
                }
                return F.f33964h;
        }
    }
}
