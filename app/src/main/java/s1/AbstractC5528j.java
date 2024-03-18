package s1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.RunnableC3115h;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q.r;
import r1.AbstractC5355b;
import w.C6049A;
import w.C6068o;
import z1.AbstractC6748g;
import z1.C6746e;
import z1.C6747f;
import z1.CallableC6745d;
import z1.RunnableC6742a;

/* renamed from: s1.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5528j {

    /* renamed from: a  reason: collision with root package name */
    public static final J0.a f45113a;

    /* renamed from: b  reason: collision with root package name */
    public static final C6068o f45114b;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f45113a = new J0.a(9);
        } else if (i10 >= 28) {
            f45113a = new m();
        } else if (i10 >= 26) {
            f45113a = new m();
        } else {
            if (i10 >= 24) {
                Method method = l.f45122i0;
                if (method == null) {
                    AbstractC3612c.r("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f45113a = new J0.a(9);
                }
            }
            f45113a = new C5529k();
        }
        f45114b = new C6068o(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r3.equals(r5) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, r1.e eVar, Resources resources, int i10, String str, int i11, int i12, AbstractC5355b abstractC5355b, boolean z10) {
        Typeface typeface;
        Typeface typeface2;
        boolean z11;
        int i13;
        Typeface typeface3;
        Handler handler;
        if (eVar instanceof r1.h) {
            r1.h hVar = (r1.h) eVar;
            String str2 = hVar.f44294d;
            typeface = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface2 = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface2 != null) {
                }
            }
            typeface2 = null;
            if (typeface2 != null) {
                if (abstractC5355b != null) {
                    abstractC5355b.b(typeface2);
                }
                return typeface2;
            }
            if (!z10 ? abstractC5355b == null : hVar.f44293c == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                i13 = hVar.f44292b;
            } else {
                i13 = -1;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            F4.a aVar = new F4.a(abstractC5355b);
            r rVar = hVar.f44291a;
            U3.e eVar2 = new U3.e(aVar, handler2);
            if (z11) {
                C6068o c6068o = AbstractC6748g.f51449a;
                String str3 = ((String) rVar.f43542g) + "-" + i12;
                typeface3 = (Typeface) AbstractC6748g.f51449a.b(str3);
                if (typeface3 != null) {
                    ((Handler) eVar2.f17401Z).post(new RunnableC6742a(eVar2, (F4.a) eVar2.f17400Y, typeface3, 0));
                } else if (i13 == -1) {
                    C6747f a5 = AbstractC6748g.a(str3, context, rVar, i12);
                    eVar2.A(a5);
                    typeface = a5.f51447a;
                } else {
                    try {
                        try {
                            try {
                                C6747f c6747f = (C6747f) AbstractC6748g.f51450b.submit(new CallableC6745d(str3, context, rVar, i12, 0)).get(i13, TimeUnit.MILLISECONDS);
                                eVar2.A(c6747f);
                                typeface = c6747f.f51447a;
                            } catch (InterruptedException e10) {
                                throw e10;
                            }
                        } catch (ExecutionException e11) {
                            throw new RuntimeException(e11);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) eVar2.f17401Z).post(new RunnableC3115h(eVar2, (F4.a) eVar2.f17400Y, -3, 4));
                    }
                }
            } else {
                C6068o c6068o2 = AbstractC6748g.f51449a;
                String str4 = ((String) rVar.f43542g) + "-" + i12;
                typeface3 = (Typeface) AbstractC6748g.f51449a.b(str4);
                if (typeface3 != null) {
                    ((Handler) eVar2.f17401Z).post(new RunnableC6742a(eVar2, (F4.a) eVar2.f17400Y, typeface3, 0));
                } else {
                    C6746e c6746e = new C6746e(0, eVar2);
                    synchronized (AbstractC6748g.f51451c) {
                        try {
                            C6049A c6049a = AbstractC6748g.f51452d;
                            ArrayList arrayList = (ArrayList) c6049a.get(str4);
                            if (arrayList != null) {
                                arrayList.add(c6746e);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(c6746e);
                                c6049a.put(str4, arrayList2);
                                CallableC6745d callableC6745d = new CallableC6745d(str4, context, rVar, i12, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC6748g.f51450b;
                                C6746e c6746e2 = new C6746e(1, str4);
                                if (Looper.myLooper() == null) {
                                    handler = new Handler(Looper.getMainLooper());
                                } else {
                                    handler = new Handler();
                                }
                                threadPoolExecutor.execute(new RunnableC6742a(handler, callableC6745d, c6746e2, 2));
                            }
                        } finally {
                        }
                    }
                }
            }
            typeface = typeface3;
        } else {
            typeface = f45113a.F(context, (r1.f) eVar, resources, i12);
            if (abstractC5355b != null) {
                if (typeface != null) {
                    abstractC5355b.b(typeface);
                } else {
                    abstractC5355b.a(-3);
                }
            }
        }
        if (typeface != null) {
            f45114b.c(b(resources, i10, str, i11, i12), typeface);
        }
        return typeface;
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
