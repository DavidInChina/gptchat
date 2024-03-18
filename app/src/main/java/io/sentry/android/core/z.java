package io.sentry.android.core;

import Ii.AbstractC0804i;
import Mf.AbstractC1001j;
import android.os.Handler;
import android.os.SystemClock;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import j7.RunnableC3921k;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import jf.C3963m;
import qh.AbstractC5331e;

/* loaded from: classes2.dex */
public class z implements AbstractC5331e {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f34263Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f34264Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f34265h0;

    public z(Cf.g gVar, List[] listArr, Method method) {
        AbstractC3557B.c0("argumentRange", gVar);
        this.f34263Y = gVar;
        this.f34264Z = listArr;
        this.f34265h0 = method;
    }

    public static int b(Nh.q qVar, int i10, int i11) {
        int i12;
        if ((i10 & 4096) != 0 && qVar.f13198c < 49) {
            qVar.j("Synthetic");
            i12 = 6;
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            qVar.j("Signature");
            i12 += 8;
        }
        if ((i10 & 131072) != 0) {
            qVar.j("Deprecated");
            return i12 + 6;
        }
        return i12;
    }

    public static void e(Nh.q qVar, int i10, int i11, I5.h hVar) {
        if ((i10 & 4096) != 0 && qVar.f13198c < 49) {
            hVar.k(qVar.j("Synthetic"));
            hVar.j(0);
        }
        if (i11 != 0) {
            hVar.k(qVar.j("Signature"));
            hVar.j(2);
            hVar.k(i11);
        }
        if ((i10 & 131072) != 0) {
            hVar.k(qVar.j("Deprecated"));
            hVar.j(0);
        }
    }

    public final void a(String str) {
        Long valueOf;
        if (((Ii.k) this.f34265h0) == null) {
            if (!Ii.v.f8689a) {
                Hi.q.a("App Launch", 0);
                Ii.v.f8689a = true;
            }
            Long l10 = (Long) this.f34264Z;
            if (l10 == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(SystemClock.elapsedRealtime() - l10.longValue());
            }
            this.f34265h0 = new Ii.k(SystemClock.uptimeMillis(), SystemClock.elapsedRealtime(), valueOf, str);
        }
    }

    @Override // qh.AbstractC5331e
    public final void accept(File file) {
        try {
            ((Method) this.f34263Y).invoke(null, ((Method) this.f34264Z).invoke(file, new Object[0]), (Set) this.f34265h0);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Cannot access file system permissions", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getTargetException() instanceof UnsupportedOperationException) {
                return;
            }
            throw new IllegalStateException("Cannot invoke file system permissions method", e11.getTargetException());
        }
    }

    public final int c() {
        int i10 = 0;
        for (z zVar = this; zVar != null; zVar = (z) zVar.f34265h0) {
            i10++;
        }
        return i10;
    }

    public final void d() {
        Ii.k kVar = (Ii.k) this.f34265h0;
        if (kVar != null) {
            Long l10 = kVar.f8666f;
            if (l10 != null) {
                if (SystemClock.uptimeMillis() - l10.longValue() > 500) {
                    if (Ii.v.f8689a) {
                        Hi.q.c("App Launch", 0);
                        Ii.v.f8689a = false;
                    }
                    this.f34265h0 = null;
                    return;
                }
            }
            kVar.f8666f = null;
            C3963m c3963m = AbstractC0804i.f8654a;
            RunnableC3921k runnableC3921k = kVar.f8665e;
            ((Handler) c3963m.getValue()).removeCallbacks(runnableC3921k);
            ((Handler) c3963m.getValue()).post(runnableC3921k);
        }
    }

    public z(AbstractC1001j abstractC1001j, List list, z zVar) {
        AbstractC3557B.c0("classifierDescriptor", abstractC1001j);
        AbstractC3557B.c0("arguments", list);
        this.f34263Y = abstractC1001j;
        this.f34265h0 = list;
        this.f34264Z = zVar;
    }

    public /* synthetic */ z(Object obj, Object obj2, Object obj3) {
        this.f34263Y = obj;
        this.f34264Z = obj2;
        this.f34265h0 = obj3;
    }

    public z(Ii.u uVar) {
        this.f34263Y = uVar;
    }

    public z(dg.o oVar, Rf.d dVar) {
        this.f34263Y = oVar;
        this.f34264Z = dVar;
        this.f34265h0 = new ConcurrentHashMap();
    }

    public z(String str) {
        this.f34263Y = str;
    }

    public z(y yVar) {
        this.f34263Y = yVar;
        this.f34264Z = null;
        this.f34265h0 = null;
    }

    public z(y yVar, byte[] bArr) {
        this.f34263Y = yVar;
        this.f34264Z = bArr;
        this.f34265h0 = null;
    }
}
