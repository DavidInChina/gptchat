package io.sentry.instrumentation.file;

import android.gov.nist.core.Separators;
import io.sentry.C1;
import io.sentry.C3636c1;
import io.sentry.S;
import io.sentry.r1;
import io.sentry.s1;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final S f34371a;

    /* renamed from: b  reason: collision with root package name */
    public final File f34372b;

    /* renamed from: c  reason: collision with root package name */
    public final r1 f34373c;

    /* renamed from: d  reason: collision with root package name */
    public C1 f34374d = C1.OK;

    /* renamed from: e  reason: collision with root package name */
    public long f34375e;

    /* renamed from: f  reason: collision with root package name */
    public final s1 f34376f;

    public b(S s10, File file, r1 r1Var) {
        this.f34371a = s10;
        this.f34372b = file;
        this.f34373c = r1Var;
        this.f34376f = new s1(r1Var);
        C3636c1.l().a("FileIO");
    }

    public final void a(Closeable closeable) {
        try {
            try {
                closeable.close();
            } catch (IOException e10) {
                this.f34374d = C1.INTERNAL_ERROR;
                S s10 = this.f34371a;
                if (s10 != null) {
                    s10.o(e10);
                }
                throw e10;
            }
        } finally {
            b();
        }
    }

    public final void b() {
        String str;
        Object obj;
        S s10 = this.f34371a;
        if (s10 != null) {
            long j6 = this.f34375e;
            Charset charset = io.sentry.util.e.f34777a;
            if (-1000 < j6 && j6 < 1000) {
                str = j6 + " B";
            } else {
                StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("kMGTPE");
                while (true) {
                    if (j6 > -999950 && j6 < 999950) {
                        break;
                    }
                    j6 /= 1000;
                    stringCharacterIterator.next();
                }
                str = String.format(Locale.ROOT, "%.1f %cB", Double.valueOf(j6 / 1000.0d), Character.valueOf(stringCharacterIterator.current()));
            }
            r1 r1Var = this.f34373c;
            File file = this.f34372b;
            if (file != null) {
                s10.m(file.getName() + " (" + str + Separators.RPAREN);
                if (io.sentry.util.d.f34775a || r1Var.isSendDefaultPii()) {
                    s10.e("file.path", file.getAbsolutePath());
                }
            } else {
                s10.m(str);
            }
            s10.e("file.size", Long.valueOf(this.f34375e));
            boolean a5 = r1Var.getMainThreadChecker().a();
            s10.e("blocked_main_thread", Boolean.valueOf(a5));
            if (a5) {
                s1 s1Var = this.f34376f;
                s1Var.getClass();
                ArrayList b10 = s1Var.b(new Exception().getStackTrace(), false);
                if (b10 == null) {
                    obj = Collections.emptyList();
                } else {
                    ArrayList K10 = P4.a.K(b10, new A9.a(26));
                    if (!K10.isEmpty()) {
                        obj = K10;
                    } else {
                        obj = P4.a.K(b10, new A9.a(27));
                    }
                }
                s10.e("call_stack", obj);
            }
            s10.j(this.f34374d);
        }
    }

    public final Object c(a aVar) {
        try {
            Object call = aVar.call();
            if (call instanceof Integer) {
                int intValue = ((Integer) call).intValue();
                if (intValue != -1) {
                    this.f34375e += intValue;
                }
            } else if (call instanceof Long) {
                long longValue = ((Long) call).longValue();
                if (longValue != -1) {
                    this.f34375e += longValue;
                }
            }
            return call;
        } catch (IOException e10) {
            this.f34374d = C1.INTERNAL_ERROR;
            S s10 = this.f34371a;
            if (s10 != null) {
                s10.o(e10);
            }
            throw e10;
        }
    }
}
