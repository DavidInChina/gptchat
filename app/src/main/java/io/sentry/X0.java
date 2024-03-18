package io.sentry;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import v4.CallableC5972b;

/* loaded from: classes.dex */
public final class X0 {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f33883d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Y0 f33884a;

    /* renamed from: b  reason: collision with root package name */
    public final Callable f33885b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f33886c;

    public X0(Y0 y02, byte[] bArr) {
        this.f33884a = y02;
        this.f33886c = bArr;
        this.f33885b = null;
    }

    public static X0 a(Q q10, io.sentry.clientreport.a aVar) {
        Ad.l.Z0("ISerializer is required.", q10);
        C3636c1 c3636c1 = new C3636c1((Callable) new CallableC5972b(q10, 5, aVar));
        return new X0(new Y0(EnumC3639d1.resolve(aVar), new V0(c3636c1, 10), "application/json", (String) null, (String) null), new V0(c3636c1, 11));
    }

    public static X0 b(Q q10, y1 y1Var) {
        Ad.l.Z0("ISerializer is required.", q10);
        Ad.l.Z0("Session is required.", y1Var);
        C3636c1 c3636c1 = new C3636c1((Callable) new CallableC5972b(q10, 3, y1Var));
        return new X0(new Y0(EnumC3639d1.Session, new V0(c3636c1, 0), "application/json", (String) null, (String) null), new V0(c3636c1, 1));
    }

    public final io.sentry.clientreport.a c(Q q10) {
        Y0 y02 = this.f33884a;
        if (y02 != null && y02.f33890h0 == EnumC3639d1.ClientReport) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(d()), f33883d));
            try {
                io.sentry.clientreport.a aVar = (io.sentry.clientreport.a) q10.e(bufferedReader, io.sentry.clientreport.a.class);
                bufferedReader.close();
                return aVar;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return null;
    }

    public final byte[] d() {
        Callable callable;
        if (this.f33886c == null && (callable = this.f33885b) != null) {
            this.f33886c = (byte[]) callable.call();
        }
        return this.f33886c;
    }

    public X0(Y0 y02, V0 v02) {
        this.f33884a = y02;
        this.f33885b = v02;
        this.f33886c = null;
    }
}
