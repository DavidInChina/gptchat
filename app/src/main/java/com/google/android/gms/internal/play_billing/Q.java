package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Q extends AbstractC2481x {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C0 zzc = C0.f26832f;

    public Q() {
        this.zza = 0;
    }

    public static Q e(Class cls) {
        Map map = zzb;
        Q q10 = (Q) map.get(cls);
        if (q10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                q10 = (Q) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (q10 == null) {
            q10 = (Q) ((Q) J0.h(cls)).m(6);
            if (q10 != null) {
                map.put(cls, q10);
            } else {
                throw new IllegalStateException();
            }
        }
        return q10;
    }

    public static Q f(Q q10, byte[] bArr, J j6) {
        int length = bArr.length;
        Q q11 = (Q) q10.m(4);
        try {
            AbstractC2486z0 a5 = C2480w0.f26985c.a(q11.getClass());
            a5.g(q11, bArr, 0, length, new A(j6));
            a5.a(q11);
            if (q11.k()) {
                return q11;
            }
            throw new IOException(new B0().getMessage());
        } catch (B0 e10) {
            throw new IOException(e10.getMessage());
        } catch (C2437a0 e11) {
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof C2437a0) {
                throw ((C2437a0) e12.getCause());
            }
            throw new IOException(e12.getMessage(), e12);
        } catch (IndexOutOfBoundsException unused) {
            throw C2437a0.d();
        }
    }

    public static Object g(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static void i(Class cls, Q q10) {
        q10.h();
        zzb.put(cls, q10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2481x
    public final int a(AbstractC2486z0 abstractC2486z0) {
        if (l()) {
            int d10 = abstractC2486z0.d(this);
            if (d10 >= 0) {
                return d10;
            }
            throw new IllegalStateException(android.gov.nist.core.a.e("serialized size must be non-negative, was ", d10));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 == Integer.MAX_VALUE) {
            int d11 = abstractC2486z0.d(this);
            if (d11 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | d11;
                return d11;
            }
            throw new IllegalStateException(android.gov.nist.core.a.e("serialized size must be non-negative, was ", d11));
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2481x
    public final int c() {
        int i10;
        if (l()) {
            i10 = C2480w0.f26985c.a(getClass()).d(this);
            if (i10 < 0) {
                throw new IllegalStateException(android.gov.nist.core.a.e("serialized size must be non-negative, was ", i10));
            }
        } else {
            i10 = this.zzd & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = C2480w0.f26985c.a(getClass()).d(this);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
                } else {
                    throw new IllegalStateException(android.gov.nist.core.a.e("serialized size must be non-negative, was ", i10));
                }
            }
        }
        return i10;
    }

    public final P d() {
        return (P) m(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2480w0.f26985c.a(getClass()).h(this, (Q) obj);
    }

    public final void h() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (!l()) {
            int i10 = this.zza;
            if (i10 == 0) {
                int c10 = C2480w0.f26985c.a(getClass()).c(this);
                this.zza = c10;
                return c10;
            }
            return i10;
        }
        return C2480w0.f26985c.a(getClass()).c(this);
    }

    public final void j() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean k() {
        byte byteValue = ((Byte) m(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b10 = C2480w0.f26985c.a(getClass()).b(this);
        m(2);
        return b10;
    }

    public final boolean l() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object m(int i10);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC2467p0.f26953a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        AbstractC2467p0.c(this, sb2, 0);
        return sb2.toString();
    }
}
