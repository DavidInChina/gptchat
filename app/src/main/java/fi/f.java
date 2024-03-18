package fi;

import id.AbstractC3557B;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements n {

    /* renamed from: f  reason: collision with root package name */
    public static final B3.a f30910f = new B3.a();

    /* renamed from: a  reason: collision with root package name */
    public final Class f30911a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f30912b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f30913c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f30914d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f30915e;

    public f(Class cls) {
        this.f30911a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC3557B.b0("sslSocketClass.getDeclar\u2026:class.javaPrimitiveType)", declaredMethod);
        this.f30912b = declaredMethod;
        this.f30913c = cls.getMethod("setHostname", String.class);
        this.f30914d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f30915e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // fi.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f30911a.isInstance(sSLSocket);
    }

    @Override // fi.n
    public final boolean b() {
        switch (ei.c.f29487e.f36264Y) {
            case 27:
                return ei.c.f29488f;
            default:
                return ei.k.f29508e;
        }
    }

    @Override // fi.n
    public final String c(SSLSocket sSLSocket) {
        if (!this.f30911a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f30914d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, Lg.a.f11131a);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && AbstractC3557B.K(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // fi.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3557B.c0("protocols", list);
        if (this.f30911a.isInstance(sSLSocket)) {
            try {
                this.f30912b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f30913c.invoke(sSLSocket, str);
                }
                Method method = this.f30915e;
                ei.m mVar = ei.m.f29511a;
                method.invoke(sSLSocket, ei.l.e(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
