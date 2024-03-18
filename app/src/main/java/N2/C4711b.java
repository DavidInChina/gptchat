package n2;

import Bg.Y;
import C2.h;
import C2.i;
import E1.B;
import K8.n;
import Mf.AbstractC0993b;
import Mf.AbstractC1000i;
import Mf.b0;
import N7.k;
import N7.m;
import Q1.u;
import S4.o;
import android.content.Context;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import androidx.lifecycle.F;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.gson.reflect.TypeToken;
import f8.e;
import gc.l;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.LinkedBlockingQueue;
import ng.C4836c;
import org.slf4j.ILoggerFactory;
import q1.AbstractC5260f;
import r9.y;
import u7.C5848d;
import y2.RunnableC6514a;
import y2.SurfaceHolder$CallbackC6500C;

/* renamed from: n2.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4711b implements F, i, B, Cg.c, ILoggerFactory {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39600Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f39601Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f39602h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f39603i0;

    public C4711b(int i10) {
        this.f39600Y = i10;
        if (i10 == 5) {
            this.f39602h0 = new Object();
        } else if (i10 != 9) {
            this.f39603i0 = new Object();
            this.f39601Z = true;
        } else {
            this.f39601Z = false;
            this.f39602h0 = new HashMap();
            this.f39603i0 = new LinkedBlockingQueue();
        }
    }

    public static String e(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    @Override // androidx.lifecycle.F
    public final void B(Object obj) {
        this.f39601Z = true;
        o oVar = (o) this.f39603i0;
        oVar.getClass();
        Void r42 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) oVar.f16184Z;
        signInHubActivity.setResult(signInHubActivity.f26796H0, signInHubActivity.f26797I0);
        ((SignInHubActivity) oVar.f16184Z).finish();
    }

    @Override // org.slf4j.ILoggerFactory
    public final synchronized Ei.a a(String str) {
        Gi.c cVar;
        cVar = (Gi.c) ((Map) this.f39602h0).get(str);
        if (cVar == null) {
            cVar = new Gi.c(str, (LinkedBlockingQueue) this.f39603i0, this.f39601Z);
            ((Map) this.f39602h0).put(str, cVar);
        }
        return cVar;
    }

    @Override // E1.B
    public final boolean b(View view) {
        AbstractC2469q0.p(this.f39602h0);
        throw null;
    }

    @Override // Cg.c
    public final boolean d(Y y10, Y y11) {
        boolean z10 = this.f39601Z;
        AbstractC0993b abstractC0993b = (AbstractC0993b) this.f39602h0;
        AbstractC0993b abstractC0993b2 = (AbstractC0993b) this.f39603i0;
        AbstractC3557B.c0("$a", abstractC0993b);
        AbstractC3557B.c0("$b", abstractC0993b2);
        AbstractC3557B.c0("c1", y10);
        AbstractC3557B.c0("c2", y11);
        if (AbstractC3557B.K(y10, y11)) {
            return true;
        }
        AbstractC1000i k10 = y10.k();
        AbstractC1000i k11 = y11.k();
        if ((k10 instanceof b0) && (k11 instanceof b0)) {
            return C4836c.f40338a.b((b0) k10, (b0) k11, z10, new l(abstractC0993b, 7, abstractC0993b2));
        }
        return false;
    }

    /* renamed from: f */
    public final C2.c c(h hVar) {
        Exception e10;
        MediaCodec mediaCodec;
        C2.c cVar;
        String str = hVar.f2540a.f2547a;
        C2.c cVar2 = null;
        try {
            AbstractC5260f.g("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                cVar = new C2.c(mediaCodec, (HandlerThread) ((w8.l) this.f39602h0).get(), (HandlerThread) ((w8.l) this.f39603i0).get(), this.f39601Z);
            } catch (Exception e11) {
                e10 = e11;
            }
        } catch (Exception e12) {
            e10 = e12;
            mediaCodec = null;
        }
        try {
            AbstractC5260f.q();
            C2.c.i(cVar, hVar.f2541b, hVar.f2543d, hVar.f2544e);
            return cVar;
        } catch (Exception e13) {
            e10 = e13;
            cVar2 = cVar;
            if (cVar2 == null) {
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
            } else {
                cVar2.release();
            }
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n g(TypeToken typeToken) {
        n nVar;
        String str;
        n oVar;
        n c5848d;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        AbstractC2469q0.p(((Map) this.f39602h0).get(type));
        AbstractC2469q0.p(((Map) this.f39602h0).get(rawType));
        n nVar2 = null;
        if (EnumSet.class.isAssignableFrom(rawType)) {
            nVar = new o(11, type);
        } else if (rawType == EnumMap.class) {
            nVar = new y7.b(8, type);
        } else {
            nVar = null;
        }
        if (nVar != null) {
            return nVar;
        }
        Ad.l.t0((List) this.f39603i0);
        if (!Modifier.isAbstract(rawType.getModifiers())) {
            try {
                Constructor declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
                y yVar = N8.c.f12745a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e10) {
                    str = "Failed making constructor '" + N8.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage();
                }
                if (str != null) {
                    oVar = new u(str, 7, 0);
                } else {
                    oVar = new o(12, declaredConstructor);
                }
            } catch (NoSuchMethodException unused) {
            }
            if (oVar == null) {
                return oVar;
            }
            if (Collection.class.isAssignableFrom(rawType)) {
                if (SortedSet.class.isAssignableFrom(rawType)) {
                    nVar2 = new C5848d(14);
                } else if (Set.class.isAssignableFrom(rawType)) {
                    nVar2 = new e(15);
                } else if (Queue.class.isAssignableFrom(rawType)) {
                    nVar2 = new C5848d(15);
                } else {
                    nVar2 = new e(16);
                }
            } else if (Map.class.isAssignableFrom(rawType)) {
                if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                    nVar2 = new C5848d(16);
                } else {
                    if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                        c5848d = new e(17);
                    } else if (SortedMap.class.isAssignableFrom(rawType)) {
                        c5848d = new C5848d(17);
                    } else if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                        nVar2 = new e(18);
                    } else {
                        nVar2 = new C5848d(18);
                    }
                    nVar2 = c5848d;
                }
            }
            if (nVar2 != null) {
                return nVar2;
            }
            String e11 = e(rawType);
            if (e11 != null) {
                return new U3.e((Object) this, (Serializable) e11);
            }
            if (this.f39601Z) {
                return new C3636c1(this, rawType, 18);
            }
            return new U3.c(this, "Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.", 19);
        }
        oVar = null;
        if (oVar == null) {
        }
    }

    public final void h(boolean z10) {
        if (this.f39601Z) {
            ((Context) this.f39602h0).unregisterReceiver((RunnableC6514a) this.f39603i0);
            this.f39601Z = false;
        }
    }

    public final void i(k kVar) {
        synchronized (this.f39602h0) {
            try {
                if (((Queue) this.f39603i0) == null) {
                    this.f39603i0 = new ArrayDeque();
                }
                ((Queue) this.f39603i0).add(kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(m mVar) {
        k kVar;
        synchronized (this.f39602h0) {
            if (((Queue) this.f39603i0) != null && !this.f39601Z) {
                this.f39601Z = true;
                while (true) {
                    synchronized (this.f39602h0) {
                        try {
                            kVar = (k) ((Queue) this.f39603i0).poll();
                            if (kVar == null) {
                                this.f39601Z = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    kVar.b(mVar);
                }
            }
        }
    }

    public final String toString() {
        switch (this.f39600Y) {
            case 0:
                return ((o) this.f39603i0).toString();
            case 7:
                return ((Map) this.f39602h0).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [C2.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [C2.b] */
    public C4711b(final int i10, boolean z10) {
        this((C2.b) new w8.l() { // from class: C2.b
            @Override // w8.l
            public final Object get() {
                int i11 = r2;
                int i12 = i10;
                switch (i11) {
                    case 0:
                        return new HandlerThread(c.j(i12, "ExoPlayer:MediaCodecAsyncAdapter:"));
                    default:
                        return new HandlerThread(c.j(i12, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            }
        }, (C2.b) new w8.l() { // from class: C2.b
            @Override // w8.l
            public final Object get() {
                int i11 = r2;
                int i12 = i10;
                switch (i11) {
                    case 0:
                        return new HandlerThread(c.j(i12, "ExoPlayer:MediaCodecAsyncAdapter:"));
                    default:
                        return new HandlerThread(c.j(i12, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            }
        }, z10);
        this.f39600Y = 2;
    }

    public C4711b(AbstractC0993b abstractC0993b, AbstractC0993b abstractC0993b2, boolean z10) {
        this.f39600Y = 8;
        this.f39601Z = z10;
        this.f39602h0 = abstractC0993b;
        this.f39603i0 = abstractC0993b2;
    }

    public C4711b(String str, boolean z10) {
        this.f39600Y = 4;
        this.f39603i0 = "com.google.android.gms";
        this.f39602h0 = str;
        this.f39601Z = z10;
    }

    public C4711b(Context context, Handler handler, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C) {
        this.f39600Y = 1;
        this.f39602h0 = context.getApplicationContext();
        this.f39603i0 = new RunnableC6514a(this, handler, surfaceHolder$CallbackC6500C);
    }

    public C4711b(List list, Map map, boolean z10) {
        this.f39600Y = 7;
        this.f39602h0 = map;
        this.f39601Z = z10;
        this.f39603i0 = list;
    }

    public C4711b(C2.b bVar, C2.b bVar2, boolean z10) {
        this.f39600Y = 2;
        this.f39602h0 = bVar;
        this.f39603i0 = bVar2;
        this.f39601Z = z10;
    }

    public C4711b(o2.b bVar, o oVar) {
        this.f39600Y = 0;
        this.f39601Z = false;
        this.f39602h0 = bVar;
        this.f39603i0 = oVar;
    }
}
