package e7;

import U3.u;
import android.content.Context;
import c7.C2303a;
import j7.C3919i;
import j7.C3922l;
import j7.RunnableC3921k;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import m7.AbstractC4565a;

/* loaded from: classes2.dex */
public final class q implements p {

    /* renamed from: e  reason: collision with root package name */
    public static volatile j f29020e;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4565a f29021a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4565a f29022b;

    /* renamed from: c  reason: collision with root package name */
    public final i7.c f29023c;

    /* renamed from: d  reason: collision with root package name */
    public final C3919i f29024d;

    public q(AbstractC4565a abstractC4565a, AbstractC4565a abstractC4565a2, i7.c cVar, C3919i c3919i, C3922l c3922l) {
        this.f29021a = abstractC4565a;
        this.f29022b = abstractC4565a2;
        this.f29023c = cVar;
        this.f29024d = c3919i;
        c3922l.getClass();
        c3922l.f36075a.execute(new RunnableC3921k(0, c3922l));
    }

    public static q a() {
        j jVar = f29020e;
        if (jVar != null) {
            return (q) jVar.f29014k0.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, t7.j] */
    public static void b(Context context) {
        if (f29020e == null) {
            synchronized (q.class) {
                try {
                    if (f29020e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f45780a = context;
                        f29020e = obj.c();
                    }
                } finally {
                }
            }
        }
    }

    public final u c(C2303a c2303a) {
        Set set;
        byte[] bArr;
        if (c2303a instanceof k) {
            c2303a.getClass();
            set = Collections.unmodifiableSet(C2303a.f26328d);
        } else {
            set = Collections.singleton(new b7.b("proto"));
        }
        u a5 = i.a();
        c2303a.getClass();
        a5.O("cct");
        String str = c2303a.f26330a;
        String str2 = c2303a.f26331b;
        if (str2 == null && str == null) {
            bArr = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bArr = android.gov.nist.core.a.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a5.f17493h0 = bArr;
        return new u(set, a5.h(), this, 24);
    }
}
