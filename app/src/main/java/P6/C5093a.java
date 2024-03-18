package p6;

import Lg.n;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Looper;
import android.util.Printer;
import i6.f;
import id.AbstractC3557B;
import java.util.concurrent.TimeUnit;
import o6.C4934m;
import p5.AbstractC5092d;
import r5.d;
import r6.AbstractC5369a;
import r6.C5370b;
import y6.i;

/* renamed from: p6.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5093a implements Printer, i {

    /* renamed from: Y  reason: collision with root package name */
    public final long f42743Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f42744Z;

    /* renamed from: h0  reason: collision with root package name */
    public long f42745h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f42746i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    public AbstractC5092d f42747j0;

    public C5093a(long j6) {
        this.f42743Y = j6;
        this.f42744Z = TimeUnit.MILLISECONDS.toNanos(j6);
    }

    @Override // y6.i
    public final void a(Context context) {
        Looper.getMainLooper().setMessageLogging(null);
    }

    @Override // y6.i
    public final void b(d dVar, Context context) {
        AbstractC3557B.c0("sdkCore", dVar);
        this.f42747j0 = dVar;
        Looper.getMainLooper().setMessageLogging(this);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(C5093a.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy", obj);
        if (this.f42743Y == ((C5093a) obj).f42743Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f42743Y;
        return (int) (j6 ^ (j6 >>> 32));
    }

    @Override // android.util.Printer
    public final void println(String str) {
        AbstractC5092d abstractC5092d;
        AbstractC5369a abstractC5369a;
        if (str != null) {
            long nanoTime = System.nanoTime();
            if (n.I2(str, ">>>>> Dispatching to ", false)) {
                String substring = str.substring(21);
                AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring);
                this.f42746i0 = substring;
                this.f42745h0 = nanoTime;
            } else if (n.I2(str, "<<<<< Finished to ", false)) {
                long j6 = nanoTime - this.f42745h0;
                if (j6 > this.f42744Z && (abstractC5092d = this.f42747j0) != null) {
                    f a5 = i6.b.a(abstractC5092d);
                    if (a5 instanceof AbstractC5369a) {
                        abstractC5369a = (AbstractC5369a) a5;
                    } else {
                        abstractC5369a = null;
                    }
                    if (abstractC5369a != null) {
                        String str2 = this.f42746i0;
                        AbstractC3557B.c0("target", str2);
                        ((C5370b) abstractC5369a).d(new C4934m(j6, str2));
                    }
                }
            }
        }
    }

    public final String toString() {
        return android.gov.nist.core.a.m(new StringBuilder("MainLooperLongTaskStrategy("), this.f42743Y, Separators.RPAREN);
    }
}
